package myprediction;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;

public class UserNominalInput
  extends JPanel
  implements UserInputInterface
{
  private JComboBox jComboBox1;
  private JLabel jLabel1;
  
  public UserNominalInput(ArffAttribute atr)
  {
    initComponents();
    
    this.jLabel1.setText(atr.name);
    this.jComboBox1.removeAllItems();
    this.jComboBox1.addItem("none");
    for (String s : atr.nominals) {
      this.jComboBox1.addItem(s);
    }
  }
  
  public String getAtrValue()
  {
    return (String)this.jComboBox1.getSelectedItem();
  }
  
  public String getAtrName()
  {
    return this.jLabel1.getText();
  }
  
  private void initComponents()
  {
    this.jLabel1 = new JLabel();
    this.jComboBox1 = new JComboBox();
    
    this.jLabel1.setText("jLabel1");
    
    this.jComboBox1.setModel(new DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    
    GroupLayout layout = new GroupLayout(this);
    setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jComboBox1, -2, -1, -2).addContainerGap(-1, 32767)));
    
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jComboBox1, -2, -1, -2)).addContainerGap(-1, 32767)));
  }
  
  public ArffAttribute.DataTypes getDataType()
  {
    return ArffAttribute.DataTypes.NOMINAL;
  }
}
