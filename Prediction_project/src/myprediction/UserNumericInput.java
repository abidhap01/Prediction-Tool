package myprediction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DecimalFormat;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.JTextComponent;
import javax.swing.text.NumberFormatter;

public class UserNumericInput
  extends JPanel
  implements UserInputInterface
{
  InputVerifier verifier;
  private JFormattedTextField jFormattedTextField1;
  private JLabel jLabel1;
  
  public UserNumericInput(ArffAttribute atr)
  {
    this.verifier = new InputVerifier()
    {
      public boolean verify(JComponent input)
      {
        JTextComponent source = (JTextComponent)input;
        String value = source.getText();
        double d=0;
        if (!value.isEmpty()) {
          try
          {
            d = Double.parseDouble(value);
          }
          catch (NumberFormatException nfe)
          {
             
            JOptionPane.showMessageDialog(source, "Not a number", "Error", 0);
            return false;
          }
        }
        return true;
      }
    };
    initComponents();
    this.jLabel1.setText(atr.name);
  }
  
  public String getAtrValue()
  {
    return this.jFormattedTextField1.getText();
  }
  
  public String getAtrName()
  {
    return this.jLabel1.getText();
  }
  
  private void initComponents()
  {
    this.jLabel1 = new JLabel();
    this.jFormattedTextField1 = new JFormattedTextField();
    
    this.jLabel1.setText("jLabel1");
    
    this.jFormattedTextField1.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter(new DecimalFormat("###0.###"))));
    this.jFormattedTextField1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        UserNumericInput.this.jFormattedTextField1ActionPerformed(evt);
      }
    });
    this.jFormattedTextField1.addPropertyChangeListener(new PropertyChangeListener()
    {
      public void propertyChange(PropertyChangeEvent evt)
      {
        UserNumericInput.this.jFormattedTextField1PropertyChange(evt);
      }
    });
    GroupLayout layout = new GroupLayout(this);
    setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jFormattedTextField1, -2, 83, -2).addContainerGap(-1, 32767)));
    
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jFormattedTextField1, -2, -1, -2)).addContainerGap(-1, 32767)));
  }
  
  private void jFormattedTextField1ActionPerformed(ActionEvent evt) {}
  
  private void jFormattedTextField1PropertyChange(PropertyChangeEvent evt)
  {
    this.jFormattedTextField1.setInputVerifier(this.verifier);
  }
  
  public ArffAttribute.DataTypes getDataType()
  {
    return ArffAttribute.DataTypes.NUMERIC;
  }
}
