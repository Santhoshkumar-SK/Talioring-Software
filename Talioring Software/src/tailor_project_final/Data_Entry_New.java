/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tailor_project_final;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author PRADEEPRAJ
 */
public class Data_Entry_New extends javax.swing.JInternalFrame {

    /**
     * Creates new form Data_Entry_New
     */
    public Data_Entry_New() {
        initComponents();
        Fillcombo();
    }
    public void clear(){
        mes.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //----TO FILLING THE COMBO BOX-------
     private void Fillcombo(){
        try{

           String rb;
               if(Customer_Registration.RCustMale.isSelected())
               {
                   rb="Male";
               }else
               {
                   rb="Female";
               }
                 
                   java.sql.Connection Connect;
                   Connect = Myjava.Myconnection.myconn();
                 
                    
                   PreparedStatement pt = Connect.prepareStatement("select * from item_entry where Gender = ? ");
                   pt.setString(1,rb);
                   ResultSet rs = pt.executeQuery();
                    while(rs.next()){
                        String itname=rs.getString("Item_Name");
                        jComboBox1.addItem(itname);
                    }
                    pt.close();
                    Connect.close();
        
                   
        }catch(Exception e){
                            JOptionPane.showMessageDialog(this,"null");
                            System.out.println(e.getMessage());

                }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Custid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        custname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        rcustmale = new javax.swing.JRadioButton();
        rcustfemale = new javax.swing.JRadioButton();
        Ddate = new com.toedter.calendar.JDateChooser();
        status = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        mes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();

        setTitle("Data Entry For New Customer");
        setPreferredSize(new java.awt.Dimension(815, 600));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Date");

        Date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Date.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Time");

        Time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Time.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Customer ID");

        Custid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Customer Name");

        custname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Delivery Date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Status");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Items");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Quantity");

        quantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonGroup1.add(rcustmale);
        rcustmale.setSelected(true);
        rcustmale.setText("Male");

        buttonGroup1.add(rcustfemale);
        rcustfemale.setText("Female");

        status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        status.setText("Urgent");
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Measurement");

        jList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(jList2);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Custid)
                                .addComponent(quantity)
                                .addComponent(status)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rcustmale)
                                    .addGap(18, 18, 18)
                                    .addComponent(rcustfemale)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(custname, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Ddate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(131, 131, 131))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Date)
                    .addComponent(jLabel3)
                    .addComponent(Time))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Custid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(custname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(rcustmale)
                        .addComponent(rcustfemale))
                    .addComponent(jLabel6)
                    .addComponent(Ddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(status)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(113, 113, 113))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TO FILL UP THE DATE AND TIME
         Date date = new Date();
        SimpleDateFormat sdf;
        SimpleDateFormat sdt;
        sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
        Date.setText(sdf.format(date));
        sdt = new SimpleDateFormat(" hh:mm:ss");
        Time.setText(sdt.format(date));
        Custid.setText(Customer_Registration.CustId.getText());
        custname.setText(Customer_Registration.CustName.getText());
        if(Customer_Registration.RCustMale.isSelected())
            rcustmale.setSelected(true);
         else
            rcustfemale.setSelected(true);
                   

           
       
    }//GEN-LAST:event_formInternalFrameOpened
            DefaultListModel m1=new DefaultListModel();

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //------TO FILL THE JLIST
             String id = Custid.getText().trim();
        String s1=jComboBox1.getSelectedItem().toString();
      // String custname=cusname.getText().trim();
        String mesur = jList1.getSelectedValue().toString();
        String m = mes.getText();
        try
                    {
                   java.sql.Connection Connect;
                   Connect = Myjava.Myconnection.myconn();
                   PreparedStatement pt = Connect.prepareStatement("Insert into Cust_Data_Entry (Cust_ID,item_name,Measurement_List,Measurement)Values(?,?,?,?)");
                   pt.setString(1,id);
                   pt.setString(2,s1);
                   pt.setString(3,mesur);
                   pt.setString(4,m);
                  
                   int x = pt.executeUpdate();
                   
                   
                   if(x > 0)
                    {
                            JOptionPane.showMessageDialog(this,"inserted");
                            
                
                    }else
                    {
                             JOptionPane.showMessageDialog(this," Not inserted");
                    }
                    pt.close();
                    Connect.close(); 
                   
                    }
               catch(Exception e)
                    {
                         System.out.println(e.getMessage());  
                    }
        String s,f,o;
        s=(String) jList1.getSelectedValue();
        f=mes.getText();
        o=" : ";
       m1.addElement(s+"    :   "+f);
      
       jList2.setModel(m1);
       clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         DefaultListModel m=new DefaultListModel();
        
             String s1=jComboBox1.getSelectedItem().toString();

            try{
                         java.sql.Connection Connect;
                Connect = Myjava.Myconnection.myconn();
             PreparedStatement pt1 = Connect.prepareStatement("select * from Item_Mas Where item_name = ?");
                          pt1.setString(1,s1);

                          ResultSet rs1 = pt1.executeQuery();

                        while(rs1.next()){

                             String itname=rs1.getString("measurement_list");
                             m.addElement(itname);
                         }
                        jList1.setModel(m);
                        
                       //String f =jList1.getSelectedValue().toString();
                             

             // System.out.println(f);
                         pt1.close();
                    Connect.close();
             
            }catch(Exception e){
                      JOptionPane.showMessageDialog(this,"ERROR");
                      
              System.out.println(e.getMessage());

               }
            String custid,custnam,rbutton,itm,mesname,mesurement,orDate,st;
               custid=Custid.getText().trim();
               custnam=custname.getText().trim();
               if (rcustmale.isSelected())
               {
                   rbutton="Male";
               }else
               {
                   rbutton="Female";
               }
              itm=jComboBox1.getSelectedItem().toString();
             SimpleDateFormat sdf =new SimpleDateFormat("dd-MMM-yy");
              String strDate =sdf.format(Ddate.getDate());
              orDate = new java.text.SimpleDateFormat("dd-MMM-yy").format(new Date());
               if(status.isSelected()){
                   st="urgent";
                   //System.out.println(st);
               }
               else{
                   st="not";
                   //System.out.println(st);
               }
              String qn=quantity.getText();
               try
                    {
                   java.sql.Connection Connect;
                   Connect = Myjava.Myconnection.myconn();
                   PreparedStatement pt = Connect.prepareStatement("Insert into Status (Cust_ID,Cust_Name,Cust_Gen,Item,Order_Date,Delivery_Date,status,Quantity)Values(?,?,?,?,?,?,?,?)");
                   pt.setString(1,custid);
                   pt.setString(2,custnam);
                   pt.setString(3,rbutton);
                   pt.setString(4,itm);
                   pt.setString(5,orDate);
                   pt.setString(6,strDate);
                  pt.setString(7,st);
                  pt.setString(8,qn);
                   int x = pt.executeUpdate();
                   
                   
                   if(x > 0)
                    {
                            JOptionPane.showMessageDialog(this,"inserted");
                            
                
                    }else
                    {
                             JOptionPane.showMessageDialog(this," Not inserted");
                    }
                    pt.close();
                    Connect.close(); 
                   
                    }
               catch(Exception e)
                    {
                         System.out.println(e.getMessage());  
                    }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Custid;
    private javax.swing.JLabel Date;
    private com.toedter.calendar.JDateChooser Ddate;
    private javax.swing.JLabel Time;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField custname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField quantity;
    private javax.swing.JRadioButton rcustfemale;
    private javax.swing.JRadioButton rcustmale;
    private javax.swing.JCheckBox status;
    // End of variables declaration//GEN-END:variables
}
