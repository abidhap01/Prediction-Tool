/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprediction;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author achintyadwivedi
 */
public class Kmxd_new extends javax.swing.JFrame {

    /**
     * Creates new form Kmxd_new
     */
    public Kmxd_new() {
        initComponents();
         
        getContentPane().setBackground(Color.lightGray);
        // JFrame.setDefaultLookAndFeelDecorated(true);
            //   UIManager.put("InternalFrame.activeTitleBackground", new javax.swing.plaf.ColorUIResource(Color.red ));
           

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        regionBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        incomeBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        DieselBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        GasBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        RoadBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        CarBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        VehiclesPeopleBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        VehiclePerKBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        PMRangeBox = new javax.swing.JComboBox<>();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Test Instance");
        setFont(new java.awt.Font("Al Bayan", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Region");

        regionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "East Asia & Pacific", "Europe & Central Asia", "Latin America & Caribbean", "Middle East & North Africa", "North America", "South Asia", "Sub-Saharan Africa", "West Bank and Gaza" }));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("IncomeGroup");

        incomeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High income: nonOECD", "High income: OECD", "Low income", "Lower middle income", "Upper middle income" }));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Diesel_Consumption");

        DieselBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "000-100", "100-200", "200-300", "400-500", "600-700", "800-900", "900-1000" }));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Gasoline_Consumption");

        GasBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "000-100", "100-200", "200-300", "400-500", "600-700", "800-900", "900-1000" }));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("Road_Density");

        RoadBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "000-100", "100-200", "200-300", "400-500", "600-700", "800-900", "900-1000" }));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("Cars_Per_K_People\t");

        CarBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "000-100", "100-200", "200-300", "400-500", "600-700", "800-900", "900-1000" }));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setText("Vehicles_Per_K_People");

        VehiclesPeopleBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "000-100", "100-200", "200-300", "400-500", "600-700", "800-900", "900-1000" }));
        VehiclesPeopleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehiclesPeopleBoxActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("Vehicles_Per_KM");

        VehiclePerKBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "000-050", "050-100", "100-150", "150-200", "200-250", "250-300", "300-350", "350-400", "350-400", "400-450", "450-500" }));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setText("PM2.5_RANGE");

        PMRangeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00-10", "10-20", "20-30", "30-40", "40-50" }));
        PMRangeBox.setPreferredSize(new java.awt.Dimension(120, 27));

        cancelButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        cancelButton.setText("CANCEL");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        okButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RoadBox, 0, 170, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(43, 43, 43)
                                .addComponent(regionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VehiclesPeopleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(incomeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GasBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VehiclePerKBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(DieselBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CarBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PMRangeBox, 0, 0, Short.MAX_VALUE)))))
                    .addComponent(okButton))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(regionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(incomeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(DieselBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RoadBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(GasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CarBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(VehiclesPeopleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(VehiclePerKBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(PMRangeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
        IntermediateFrame fm=new IntermediateFrame();
        fm.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        int carValue=0,
                dieselValue=0,
                PMValue=0,
                gasValue=0,
                roadValue=0,
                gvehperValue=0,
                vehpeopleValue=0;
        String region= regionBox.getSelectedItem().toString();
       String income = incomeBox.getSelectedItem().toString();
       String car = CarBox.getSelectedItem().toString();
       if(car.equals("000-100")){
            carValue = 50;
       }else if(car.equals("100-200")){
            carValue = 150;
       }else if(car.equals("200-300")){
            carValue = 250;
       }else if(car.equals("300-400")){
            carValue = 350;
       }else if(car.equals("400-500")){
            carValue = 450;
       }else if(car.equals("500-600")){
            carValue = 550;
       }else if(car.equals("600-700")){
            carValue = 650;
       }else if(car.equals("700-800")){
            carValue = 750;
       }else if(car.equals("800-900")){
            carValue = 850;
       }else if(car.equals("900-1000")){
            carValue = 950;
       }
        
       String diesel= DieselBox.getSelectedItem().toString();
        if(diesel.equals("000-100")){
           dieselValue = 50;
       }else if(diesel.equals("100-200")){
            dieselValue = 150;
       }else if(diesel.equals("200-300")){
            dieselValue = 250;
       }else if(diesel.equals("300-400")){
            dieselValue = 350;
       }else if(diesel.equals("400-500")){
            dieselValue = 450;
       }else if(diesel.equals("500-600")){
            dieselValue = 550;
       }else if(diesel.equals("600-700")){
            dieselValue = 650;
       }else if(diesel.equals("700-800")){
            dieselValue = 750;
       }else if(diesel.equals("800-900")){
            dieselValue = 850;
       }else if(diesel.equals("900-1000")){
            dieselValue = 950;
       }
        
       
       String PMrange =  PMRangeBox.getSelectedItem().toString();
       if(PMrange.equals("00-10")){
           PMValue = 5;
       }else if(PMrange.equals("10-20")){
           PMValue = 15;
       }else if(PMrange.equals("20-30")){
           PMValue = 25;
       }else if(PMrange.equals("30-40")){
           PMValue = 35;
       }else if(PMrange.equals("40-50")){
           PMValue = 45;
       }
       // double PMValue = Double.parseDouble(PMrange);
       String gas =   GasBox.getSelectedItem().toString();
       if(gas.equals("000-100")){
           gasValue = 50;
       }else if(gas.equals("100-200")){
           gasValue = 150;
       }else if(gas.equals("200-300")){
           gasValue = 250;
       }else if(gas.equals("300-400")){
           gasValue = 350;
       }else if(gas.equals("400-500")){
           gasValue = 450;
       }else if(gas.equals("500-600")){
           gasValue = 550;
       }else if(gas.equals("600-700")){
           gasValue = 650;
       }else if(gas.equals("700-800")){
           gasValue = 750;
       }else if(gas.equals("800-900")){
           gasValue = 850;
       }else if(gas.equals("900-1000")){
           gasValue = 950;
       }
     //   double gasValue = Double.parseDouble(gas);
       String road =  RoadBox.getSelectedItem().toString();
       if(road.equals("000-100")){
           roadValue = 50;
       }else if(road.equals("000-100")){
           roadValue = 50;
       }else if(road.equals("100-200")){
           roadValue = 150;
       }else if(road.equals("200-300")){
           roadValue = 250;
       }else if(road.equals("300-400")){
           roadValue = 350;
       }else if(road.equals("400-500")){
           roadValue = 450;
       }else if(road.equals("500-600")){
           roadValue = 550;
       }else if(road.equals("600-700")){
           roadValue = 650;
       }else if(road.equals("700-800")){
           roadValue = 750;
       }else if(road.equals("800-900")){
           roadValue = 850;
       }else if(road.equals("900-1000")){
           roadValue = 950;
       }
       
   //     double roadValue = Double.parseDouble(road);
        
       String vehper=  VehiclePerKBox.getSelectedItem().toString();
       if(vehper.equals("00-10")){
           gvehperValue = 10;
       }else if(vehper.equals("10-20")){
           gvehperValue = 20;
       }else if(vehper.equals("20-30")){
           gvehperValue = 30;
       }else if(vehper.equals("30-40")){
           gvehperValue = 40;
       }else if(vehper.equals("40-50")){
           gvehperValue = 50;
       }
    //    double gvehperValue = Double.parseDouble(vehper);
       String vehpeople=VehiclesPeopleBox.getSelectedItem().toString();
       if(vehpeople.equals("000-100")){
           vehpeopleValue = 50;
       } if(vehpeople.equals("100-200")){
           vehpeopleValue = 150;
       } if(vehpeople.equals("200-300")){
           vehpeopleValue = 250;
       } if(vehpeople.equals("300-400")){
           vehpeopleValue = 350;
       } if(vehpeople.equals("400-5000")){
           vehpeopleValue = 450;
       } if(vehpeople.equals("500-600")){
           vehpeopleValue = 550;
       } if(vehpeople.equals("600-700")){
           vehpeopleValue = 650;
       } if(vehpeople.equals("700-800")){
           vehpeopleValue = 750;
       } if(vehpeople.equals("800-900")){
           vehpeopleValue = 850;
       } if(vehpeople.equals("900-1000")){
           vehpeopleValue = 950;
       }
    //    double vehpeople = Double.parseDouble(vehpeople);
       
       if(region.equals("East Asia & Pacific")){
           if(gasValue <=427.7){
               if(income.equals("High income: nonOECD")){
               JOptionPane.showMessageDialog(this, "(18.43-21.755] Moderate", "Rule Match", -1);
           }else if(income.equals("High income: OECD")){
                 JOptionPane.showMessageDialog(this, "(21.755-inf] moderate-potential", "Rule Match", -1);
           }else if(income.equals("Low income")){
                 JOptionPane.showMessageDialog(this, "(18.43-21.755] Moderate", "Rule Match", -1);
           }else if(income.equals("Lower middle income")){
                 JOptionPane.showMessageDialog(this, "(11.98-15.12] Moderate", "Rule Match", -1);
           }else if(income.equals("Upper middle income")){
               if(dieselValue<= 114.38){
                   JOptionPane.showMessageDialog(this, "(21.755-inf) moderate-potential", "Rule Match", -1);
               }else{
                    JOptionPane.showMessageDialog(this, "(11.98-15.12] Moderate", "Rule Match", -1);
               }
                 
           }
               
           }else{
                JOptionPane.showMessageDialog(this, "(-inf-5.845] verygood", "Rule Match", -1);
           }
           }else if(region.equals("Europe & Central Asia")){
               if(gvehperValue<= 35.96){
                   if(income.equals("High income: nonOECD")){
                      JOptionPane.showMessageDialog(this, "(5.845-11.98] Good", "Rule Match", -1); 
                   }else if(income.equals("High income: OECD")){
                       if(roadValue<= 56.21){
                            JOptionPane.showMessageDialog(this, "(-inf-5.845] verygood", "Rule Match", -1);
                       }else{
                           if(dieselValue<= 326.59){
                              JOptionPane.showMessageDialog(this, "(-inf-5.845] verygood", "Rule Match", -1); 
                           }else{
                               if(roadValue<= 180.48){
                                   JOptionPane.showMessageDialog(this, "(5.845-11.98] Good", "Rule Match", -1);
                               }else{
                                    JOptionPane.showMessageDialog(this, "(15.12-18.43] Moderate", "Rule Match", -1);
                               }
                           }
                       }
                       
                   }else if(income.equals("Low income")){
                        JOptionPane.showMessageDialog(this, "(5.845-11.98] Good", "Rule Match", -1);
                   }else if(income.equals("Lower middle income")){
                       JOptionPane.showMessageDialog(this, "(15.12-18.43] Moderate", "Rule Match", -1);
                   }else if(income.equals("Upper middle income")){
                        if(roadValue <= 44.33){
                            if(vehpeopleValue <= 219.2){
                                 JOptionPane.showMessageDialog(this, "(11.98-15.12] Moderate", "Rule Match", -1);
                            }else{
                                 JOptionPane.showMessageDialog(this, "(5.845-11.98] Good", "Rule Match", -1); 
                            }
                       } else{
                            if(gvehperValue <= 24.12){
                                 JOptionPane.showMessageDialog(this, "(18.43-21.755] Moderate", "Rule Match", -1);
                            }else{
                                 JOptionPane.showMessageDialog(this, "(15.12-18.43] Moderate", "Rule Match", -1); 
                            }
                        }
                   }
                   
               }else{
                   if(roadValue<= 214.51){
                       if(income.equals("High income: nonOECD")){
                           if(dieselValue<= 269.78){
                               JOptionPane.showMessageDialog(this, "((11.98-15.12] Moderate", "Rule Match", -1); 
                           }else{
                                JOptionPane.showMessageDialog(this, "(18.43-21.755 ]Moderate", "Rule Match", -1); 
                           }
                       }else if(income.equals("High income: OECD")){
                           if(carValue<= 529.33){
                               if(dieselValue<= 341.82){
                                   if(dieselValue<= 222.09){
                                       JOptionPane.showMessageDialog(this, "(18.43-21.755] Moderate", "Rule Match", -1);
                                   }else{
                                       if(roadValue <= 173.89){
                                           if(dieselValue<= 246.57){
                                              JOptionPane.showMessageDialog(this, "(15.12-18.43] Moderate", "Rule Match", -1);  
                                           }else{
                                                JOptionPane.showMessageDialog(this, "(11.98-15.12] Moderate", "Rule Match", -1); 
                                           }
                                       }else{
                                            JOptionPane.showMessageDialog(this, " (15.12-18.43] Moderate", "Rule Match", -1);
                                         
                                       }
                                     
                                   }
                               }else{
                                   JOptionPane.showMessageDialog(this, " (11.98-15.12] Moderate", "Rule Match", -1);
                               }
                           }else{
                                JOptionPane.showMessageDialog(this, " (-inf-5.845] verygood", "Rule Match", -1);
                           }
                           
                       }else if(income.equals("Low income")){
                            JOptionPane.showMessageDialog(this, "(11.98-15.12]Moderate", "Rule Match", -1);
                       }else if(income.equals("Lower middle income")){
                           JOptionPane.showMessageDialog(this, "(11.98-15.12] Moderate", "Rule Match", -1);
                       }else if(income.equals("Upper middle income")){
                           if(gasValue<= 118.83){
                               JOptionPane.showMessageDialog(this, "(15.12-18.43] Moderate", "Rule Match", -1); 
                           }else{
                                JOptionPane.showMessageDialog(this, "(11.98-15.12] Moderate", "Rule Match", -1); 
                           }
                       }
                   }else{
                       JOptionPane.showMessageDialog(this, "(18.43-21.755] Moderate", "Rule Match", -1);  
                   }
               }
               
           }else if(region.equals("Latin America & Caribbean")){
               if(gasValue<= 223.27){
                   if(income.equals("High income: nonOECD")){
                       JOptionPane.showMessageDialog(this, "5.845-11.98] Good", "Rule Match", -1);
                   }else if(income.equals("High income: OECD")){
                       JOptionPane.showMessageDialog(this, "(5.845-11.98] Good", "Rule Match", -1);
                   }else if(income.equals("Low income")){
                       JOptionPane.showMessageDialog(this, "(5.845-11.98] Good", "Rule Match", -1);
                   }else if(income.equals("Lower middle income")){
                       if(roadValue<= 16.03){
                            JOptionPane.showMessageDialog(this, "(5.845-11.98] Good", "Rule Match", -1);
                       }else{
                           JOptionPane.showMessageDialog(this, "(-inf-5.845] verygood", "Rule Match", -1); 
                       }
                       
                   }else if(income.equals("Upper middle income")){
                       if(roadValue <= 46.87){
                           if(gasValue<= 55.97){
                              JOptionPane.showMessageDialog(this, "(5.845-11.98] Good", "Rule Match", -1);  
                           }else{
                               JOptionPane.showMessageDialog(this, "(-inf-5.845] verygood", "Rule Match", -1);
                           }
                       }else{
                           JOptionPane.showMessageDialog(this, "(5.845-11.98] Good", "Rule Match", -1); 
                       }
                   }
               }else{
                   JOptionPane.showMessageDialog(this, "(15.12-18.43] Moderate", "Rule Match", -1);  
               }
           }else if(region.equals("Middle East & North Africa")){
               if(gasValue<= 51.98){
                    JOptionPane.showMessageDialog(this, "(18.43-21.755] Moderate", "Rule Match", -1); 
               }else{
                   JOptionPane.showMessageDialog(this, "(21.755-inf) moderate-potential damage", "Rule Match", -1);
               }
               
           }else if(region.equals("North America")){
                JOptionPane.showMessageDialog(this, "(11.98-15.12]Moderate", "Rule Match", -1);
           }else if(region.equals("South Asia")){
                JOptionPane.showMessageDialog(this, "(21.755-inf) moderate-potential damage", "Rule Match", -1);
           }else if(region.equals("Sub-Saharan Africa")){
               
               if(income.equals("High income: nonOECD")){
                     JOptionPane.showMessageDialog(this, "(-inf-5.845] verygood", "Rule Match", -1);
               }else if(income.equals("High income: OECD")){
                     JOptionPane.showMessageDialog(this, "(-inf-5.845] verygood", "Rule Match", -1);
               }else if(income.equals("Low incomeD")){
                     JOptionPane.showMessageDialog(this, "(-inf-5.845] verygood", "Rule Match", -1);
               }else if(income.equals("Lower middle income")){
                     JOptionPane.showMessageDialog(this, "(15.12-18.43 ]Moderate", "Rule Match", -1);
               }else if(income.equals("Upper middle income")){
                     JOptionPane.showMessageDialog(this, "(-inf-5.845] verygood", "Rule Match", -1);
               }
           }else if(region.equals("West Bank and Gaza")){
                JOptionPane.showMessageDialog(this, "(-inf-5.845] verygood", "Rule Match", -1);
           }
          
      showDialog(JOptionPane.YES_OPTION);
    }//GEN-LAST:event_okButtonActionPerformed
public void showDialog(int i){
    if(i==0){
        dispose();
        IntermediateFrame fm=new IntermediateFrame();
        fm.setVisible(true);
                
    }
}
    private void VehiclesPeopleBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehiclesPeopleBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VehiclesPeopleBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
       
      
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kmxd_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kmxd_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kmxd_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kmxd_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kmxd_new().setVisible(true);
              }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CarBox;
    private javax.swing.JComboBox<String> DieselBox;
    private javax.swing.JComboBox<String> GasBox;
    private javax.swing.JComboBox<String> PMRangeBox;
    private javax.swing.JComboBox<String> RoadBox;
    private javax.swing.JComboBox<String> VehiclePerKBox;
    private javax.swing.JComboBox<String> VehiclesPeopleBox;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> incomeBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton okButton;
    private javax.swing.JComboBox<String> regionBox;
    // End of variables declaration//GEN-END:variables
}