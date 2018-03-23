package myprediction;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Kmxd
  extends JFrame
{
  private JPanel arffPanel;
  private JTextField attrListField;
  private JLabel attrListLbl;
  private JTextField attrNumField;
  private JLabel attrNumLbl;
  private JLabel attrStatusLbl;
  private JButton btnClearArff;
  private JButton btnClearJ48;
  private JButton btnInputDlg;
  private JButton btnOpenArff;
  private JButton btnOpenJ48;
  private JButton exitBtn;
  private JTextField j48AttrListField;
  private JLabel j48AttrListLbl;
  private JTextField j48AttrNumField;
  private JLabel j48AttrNumLbl;
  private JTextField j48FileField;
  private JLabel j48FileLbl;
  private JPanel j48Panel;
  private JLabel relationLbl;
  private JTextField relationNameField;
  static String jFileName;
  static String aFileName;
  
  public Kmxd()
  {
    setTitle(defaultTitle);
    this.attributesMatch = false;
    initComponents();
  }
  
  private void initComponents()
  {
    this.arffPanel = new JPanel();
    this.relationNameField = new JTextField();
    this.attrNumField = new JTextField();
    this.attrListField = new JTextField();
    this.relationLbl = new JLabel();
    this.attrNumLbl = new JLabel();
    this.attrListLbl = new JLabel();
    this.btnOpenArff = new JButton();
    this.btnClearArff = new JButton();
    this.j48Panel = new JPanel();
    this.j48FileLbl = new JLabel();
    this.j48AttrNumLbl = new JLabel();
    this.j48AttrListLbl = new JLabel();
    this.j48FileField = new JTextField();
    this.j48AttrNumField = new JTextField();
    this.j48AttrListField = new JTextField();
    this.btnOpenJ48 = new JButton();
    this.btnClearJ48 = new JButton();
    this.attrStatusLbl = new JLabel();
    this.exitBtn = new JButton();
    this.btnInputDlg = new JButton();
     getContentPane().setBackground(Color.lightGray);
    setDefaultCloseOperation(3);
    
    this.arffPanel.setBorder(BorderFactory.createTitledBorder("Arff File Selection"));
    
    this.relationNameField.setEditable(false);
    this.relationNameField.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Kmxd.this.relationNameFieldActionPerformed(evt);
      }
    });
    this.attrNumField.setEditable(false);
    this.attrNumField.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Kmxd.this.attrNumFieldActionPerformed(evt);
      }
    });
    this.attrListField.setEditable(false);
    
    this.relationLbl.setText("Relation:");
    
    this.attrNumLbl.setText("No. of attributes:");
    
    this.attrListLbl.setText("Attributes: ");
    
    this.btnOpenArff.setText("Open");
    openArffFile();
    this.btnOpenJ48.setEnabled(false);
    /*this.btnOpenArff.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Kmxd.this.btnOpenArffActionPerformed(evt);
      }
    });*/
    this.btnClearArff.setText("Clear");
    this.btnClearArff.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Kmxd.this.btnClearArffActionPerformed(evt);
      }
    });
    GroupLayout arffPanelLayout = new GroupLayout(this.arffPanel);
    this.arffPanel.setLayout(arffPanelLayout);
  
    arffPanelLayout.setHorizontalGroup(arffPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(arffPanelLayout.createSequentialGroup().addGroup(arffPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(arffPanelLayout.createSequentialGroup().addContainerGap().addComponent(this.attrNumLbl).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.attrNumField, -2, 46, -2).addGap(0, 0, 32767)).addGroup(arffPanelLayout.createSequentialGroup().addGap(51, 51, 51).addComponent(this.relationLbl).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.relationNameField, -2, 200, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 1024, 32767)).addGroup(arffPanelLayout.createSequentialGroup().addGap(35, 35, 35).addGroup(arffPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.btnOpenArff).addComponent(this.attrListLbl)).addGroup(arffPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(arffPanelLayout.createSequentialGroup().addGap(4, 4, 4).addComponent(this.attrListField)).addGroup(arffPanelLayout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.btnClearArff).addGap(0, 0, 32767))))).addContainerGap()));
    
    arffPanelLayout.setVerticalGroup(arffPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(arffPanelLayout.createSequentialGroup().addContainerGap().addGroup(arffPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.relationNameField, GroupLayout.Alignment.TRAILING, -2, -1, -2).addComponent(this.relationLbl, GroupLayout.Alignment.TRAILING)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(arffPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.attrNumField, -2, -1, -2).addComponent(this.attrNumLbl)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(arffPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.attrListField, -2, -1, -2).addComponent(this.attrListLbl)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(arffPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.btnOpenArff).addComponent(this.btnClearArff))));
    
    this.j48Panel.setBorder(BorderFactory.createTitledBorder("J48 File Selector"));
    
    this.j48FileLbl.setText("J48 File:");
    
    this.j48AttrNumLbl.setText("No. of attributes:");
    
    this.j48AttrListLbl.setText("Attributes");
    
    this.btnOpenJ48.setText("Open");
    this.btnOpenJ48.setToolTipText("Open J48 output file");
    this.btnOpenJ48.setEnabled(false);
    try{
         openJ48File();
          this.btnOpenJ48.setEnabled(false);
    }catch(Exception e){
        e.printStackTrace();
    }
    
   /* this.btnOpenJ48.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Kmxd.this.btnOpenJ48ActionPerformed(evt);
      }
    });*/
    this.btnClearJ48.setText("Clear");
    this.btnClearJ48.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Kmxd.this.btnClearJ48ActionPerformed(evt);
      }
    });
    this.attrStatusLbl.setIcon(new ImageIcon(getClass().getResource("/myprediction/question-30028_40.png")));
    
    GroupLayout j48PanelLayout = new GroupLayout(this.j48Panel);
    this.j48Panel.setLayout(j48PanelLayout);
    j48PanelLayout.setHorizontalGroup(j48PanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(j48PanelLayout.createSequentialGroup().addContainerGap().addGroup(j48PanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.btnOpenJ48).addComponent(this.j48AttrListLbl).addComponent(this.j48AttrNumLbl).addComponent(this.j48FileLbl)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(j48PanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.j48AttrListField).addGroup(j48PanelLayout.createSequentialGroup().addGroup(j48PanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.j48FileField, -2, 168, -2).addComponent(this.j48AttrNumField, -2, 40, -2).addGroup(j48PanelLayout.createSequentialGroup().addComponent(this.btnClearJ48).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.attrStatusLbl))).addGap(0, 1044, 32767))).addContainerGap()));
    
    j48PanelLayout.setVerticalGroup(j48PanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(j48PanelLayout.createSequentialGroup().addContainerGap().addGroup(j48PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.j48FileLbl).addComponent(this.j48FileField, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(j48PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.j48AttrNumLbl).addComponent(this.j48AttrNumField, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(j48PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.j48AttrListLbl).addComponent(this.j48AttrListField, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(j48PanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.attrStatusLbl, GroupLayout.Alignment.TRAILING).addGroup(j48PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.btnOpenJ48).addComponent(this.btnClearJ48))).addContainerGap(22, 32767)));
    
    this.exitBtn.setText("Exit");
    this.exitBtn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Kmxd.this.exitBtnActionPerformed(evt);
      }
    });
    this.btnInputDlg.setText("Input Instance");
    this.btnInputDlg.setEnabled(false);
   //
   
   
   
   
   // Kmxd.this.btnInputDlgActionPerformed(ActionEvent ev);
    
    
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3, 3));
    ArrayList<UserInputInterface> panelList = new ArrayList();
     System.out.println("Size : " + jh.attributes.size());
    for (int c = 0; c <= jh.attributes.size() - 1; c++)
    {
      String s = (String)jh.attributes.get(c);
       System.out.println("STring11111111 : " + s);
      ArffAttribute atr = ah.getAttribute(s);
     
      switch (atr.dataType)
      {
      case NUMERIC: 
        UserNumericInput uni = new UserNumericInput(atr);
        panelList.add(uni);
        panel.add(uni);
        break;
      case NOMINAL: 
        UserNominalInput uni2 = new UserNominalInput(atr);
        panelList.add(uni2);
        panel.add(uni2);
      }
    }
    int response = JOptionPane.showConfirmDialog(this, panel, "Test Instance", 2, -1);
   if(JOptionPane.CANCEL_OPTION!=0){
     dispose();
      ExpertFrame fm=new ExpertFrame();
      fm.setVisible(true);
       
   }
   
   
    System.out.println("Response: " + response);
    if (response != 0) {
      return;
    }
    ArrayList<String> inst = new ArrayList();
    for (UserInputInterface u : panelList)
    {
      String v = u.getAtrValue();
    //   System.out.println("hhhh: " + response);
      String n = u.getAtrName();
    //   System.out.println("iii: " + response);
      ArffAttribute.DataTypes dt = u.getDataType();
      switch (dt)
      {
      case NOMINAL: 
        if (!v.equals("none")) {
          inst.add(n + " = " + v);
        }
        break;
      case NUMERIC: 
      case DATE: 
      case STRING: 
        if (!v.equals("")) {
          inst.add(n + " = " + v);
        }
        break;
      default: 
        throw new UnsupportedOperationException("Unknown DataType: " + dt);
      }
    }
    System.out.println("inst: " + inst.toString());
    if (inst.isEmpty())
    {
      JOptionPane.showMessageDialog(this, "No attributes selected.", "Input Error", 0);
     
      return;
    }
    String classification = null;
    for (J48Rule rule : jh.rules) {
      if (rule.isContainedBy(inst))
      {
        classification = rule.classification;
        break;
      }
    }
    if (classification == null) {
      JOptionPane.showMessageDialog(this, "Not classified", "No Rule Match", 2);
 
    } else {
      JOptionPane.showMessageDialog(this, (String)jh.attributes.get(jh.attributes.size() - 1) + ": " + classification, "Rule Match", 1);
   //  int confirmed = JOptionPane.showConfirmDialog(this, (String)jh.attributes.get(jh.attributes.size() - 1) + ": " + classification,"Rule Match",1);
   
    }
    
    
    
    
    
    
    /*this.btnInputDlg.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Kmxd.this.btnInputDlgActionPerformed(evt);
      }
    });*/
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.arffPanel, -1, -1, 32767).addComponent(this.j48Panel, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.exitBtn).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.btnInputDlg).addGap(0, 0, 32767))).addContainerGap()));
    
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.arffPanel, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.j48Panel, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.exitBtn).addComponent(this.btnInputDlg)).addContainerGap(151, 32767)));
    
    pack();
  }
  public void showDialog(){
   
        dispose();
        ExpertFrame fm=new ExpertFrame();
        fm.setVisible(true);
                
    }
  private void btnOpenArffActionPerformed(ActionEvent evt)
  {
    openArffFile();
    this.btnOpenJ48.setEnabled(false);
  }
  
  private void exitBtnActionPerformed(ActionEvent evt)
  {
    System.exit(0);
    ExpertFrame fm=new ExpertFrame();
    fm.setVisible(true);
  }
  
private void btnClearArffActionPerformed(ActionEvent evt)
  {
    this.relationNameField.setText("");
    this.attrNumField.setText("");
    this.attrListField.setText("");
    ah = null;
    this.btnOpenJ48.setEnabled(false);
  }
  
  private void attrNumFieldActionPerformed(ActionEvent evt) {}
  
  private void relationNameFieldActionPerformed(ActionEvent evt) {}
  
  private void btnOpenJ48ActionPerformed(ActionEvent evt)
  {
    try
    {
      openJ48File();
    }
    catch (Exception ex)
    {
      Logger.getLogger(Kmxd.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  private void btnClearJ48ActionPerformed(ActionEvent evt)
  {
    this.j48FileField.setText("");
    this.j48AttrNumField.setText("");
    this.j48AttrListField.setText("");
    jh = null;
    this.attrStatusLbl.setIcon(new ImageIcon(getClass().getResource("/myprediction/question-30028_40.png")));
    this.btnInputDlg.setEnabled(false);
  }
  
 /* private void btnInputDlgActionPerformed(ActionEvent evt)
  {
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3, 3));
    ArrayList<UserInputInterface> panelList = new ArrayList();
    for (int c = 0; c < jh.attributes.size() - 1; c++)
    {
      String s = (String)jh.attributes.get(c);
      ArffAttribute atr = ah.getAttribute(s);
      switch (atr.dataType)
      {
      case NUMERIC: 
        UserNumericInput uni = new UserNumericInput(atr);
        panelList.add(uni);
        panel.add(uni);
        break;
      case NOMINAL: 
        UserNominalInput uni2 = new UserNominalInput(atr);
        panelList.add(uni2);
        panel.add(uni2);
      }
    }
    int response = JOptionPane.showConfirmDialog(this, panel, "Test Instance", 2, -1);
    
    System.out.println("Response: " + response);
    if (response != 0) {
      return;
    }
    ArrayList<String> inst = new ArrayList();
    for (UserInputInterface u : panelList)
    {
      String v = u.getAtrValue();
      String n = u.getAtrName();
      ArffAttribute.DataTypes dt = u.getDataType();
      switch (dt)
      {
      case NOMINAL: 
        if (!v.equals("none")) {
          inst.add(n + " = " + v);
        }
        break;
      case NUMERIC: 
      case DATE: 
      case STRING: 
        if (!v.equals("")) {
          inst.add(n + " = " + v);
        }
        break;
      default: 
        throw new UnsupportedOperationException("Unknown DataType: " + dt);
      }
    }
    System.out.println("inst: " + inst.toString());
    if (inst.isEmpty())
    {
      JOptionPane.showMessageDialog(this, "No attributes selected.", "Input Error", 0);
      return;
    }
    String classification = null;
    for (J48Rule rule : jh.rules) {
      if (rule.isContainedBy(inst))
      {
        classification = rule.classification;
        break;
      }
    }
    if (classification == null) {
      JOptionPane.showMessageDialog(this, "Not classified", "No Rule Match", 2);
    } else {
      JOptionPane.showMessageDialog(this, (String)jh.attributes.get(jh.attributes.size() - 1) + ": " + classification, "Rule Match", 1);
    }
  }
  */
  protected void openArffFile()
  {
   // JFileChooser fc = new JFileChooser(currentDirectory);
     
   // fc.setFileFilter(new FileNameExtensionFilter("ARFF Files", new String[] { "arff" }));
    
   int returnVal = 0;
  
    if (returnVal == 0)
    {
      String arffFilePath = "/Users/achintyadwivedi/NetBeansProjects/MyProject/src/myprediction/FinalData2.arff";
      System.out.println("You chose to open this file: " + arffFilePath);
      
      btnClearArffActionPerformed(null);
      try
      {
        ah = new ArffHandler(arffFilePath);
        
        this.relationNameField.setText(ah.getRelationName());
        this.attrNumField.setText("" + ah.attributes.size());
        this.attrListField.setText(ah.getAttrAsList());
        repaint();
        System.out.println("Attribute Count: " + ah.attributes.size());
        System.out.println("Instance Count: " + ah.getNInst());
        System.out.println("Attributes: ");
        for (int c = 0; c < ah.attributes.size(); c++)
        {
          System.out.print(((ArffAttribute)ah.attributes.get(c)).name);
          System.out.println("\t" + ((ArffAttribute)ah.attributes.get(c)).dataType);
        }
        File newFile = new File(arffFilePath);
        setTitle(defaultTitle + " - " + newFile.getName());
       // currentDirectory = fc.getCurrentDirectory();
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
     // repaint();
    }
  }
  
  protected void openJ48File()
    throws Exception
  {
    //JFileChooser fc = new JFileChooser(currentDirectory);
    
   // fc.setFileFilter(new FileNameExtensionFilter("Text Files", new String[] { "txt" }));
    int returnVal = 0;
    if (returnVal == 0)
    {
      String j48FilePath = "/Users/achintyadwivedi/NetBeansProjects/MyProject/src/myprediction/FinalData2J48RulesV2.txt";
      System.out.println("You chose to open this file: " + j48FilePath);
      
      btnClearJ48ActionPerformed(null);
      try
      {
        jh = new J48Handler(j48FilePath);
        if (jh.status)
        {
          this.j48FileField.setText(jh.getFileName());
          this.j48AttrNumField.setText("" + jh.attributes.size());
          
          this.j48AttrListField.setText(jh.getAttrAsList());
          repaint();
           System.out.println("size 48FilePat " + jh.attributes.size());
          File newFile = new File(j48FilePath);
          setTitle(defaultTitle + " - " + newFile.getName());
        //  currentDirectory = fc.getCurrentDirectory();
        }
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
      if (!jh.status)
      {
        this.attrStatusLbl.setIcon(new ImageIcon(getClass().getResource("/myprediction/warning-24841_40.png")));
        this.btnInputDlg.setEnabled(false);
      }
      else
      {
        this.attrStatusLbl.setIcon(new ImageIcon(getClass().getResource("/myprediction/check-303401_40.png")));
        this.btnInputDlg.setEnabled(false);
      }
      //repaint();
    }
  }
  
  public static void main(String[] args)
  {
    try
    {
        
      for (UIManager.LookAndFeelInfo info :UIManager.getInstalledLookAndFeels() ) {
        if ("Nimbus".equals(info.getName()))
        {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      Logger.getLogger(Kmxd.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(Kmxd.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(Kmxd.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(Kmxd.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        Kmxd me = new Kmxd();
        me.setExtendedState(6);
        me.setVisible(false);
      }
    });
  }
  
  static File currentDirectory = new File(System.getProperty("user.dir"));
  static ArffHandler ah;
  static J48Handler jh;
  static String defaultTitle = "KMXD Rule Tool";
  boolean attributesMatch;
}
