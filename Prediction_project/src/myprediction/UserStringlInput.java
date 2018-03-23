package myprediction;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;

public class UserStringlInput
  extends JPanel
{
  private JLabel jLabel1;
  private JTextField jTextField1;
  
  public UserStringlInput()
  {
    initComponents();
  }
  
  private void initComponents()
  {
    this.jLabel1 = new JLabel();
    this.jTextField1 = new JTextField();
    
    this.jLabel1.setText("jLabel1");
    
    this.jTextField1.setText("jTextField1");
    
    GroupLayout layout = new GroupLayout(this);
    setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jTextField1, -2, -1, -2).addContainerGap(15, 32767)));
    
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jTextField1, -2, -1, -2)).addContainerGap(-1, 32767)));
  }
}
