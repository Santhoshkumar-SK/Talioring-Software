/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tailor_project_final;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PRADEEPRAJ
 */
public class Delivery extends javax.swing.JInternalFrame {
    DefaultTableModel dm;
    /**
     * Creates new form Delivery
     */
    public Delivery() {
        initComponents();
        CreateColumn();
        CreateRows();
    }
    private void CreateColumn(){
        dm=(DefaultTableModel) jTable1.getModel();
        dm.addColumn("CUSTOMER ID");
        dm.addColumn("CUSTOMER NAME");
        dm.addColumn("ITEM");
        dm.addColumn("ORDER DATE");
        dm.addColumn("DELIVERY DATE");
        dm.addColumn("QUANTITY");
        dm.addColumn("PRICE");
        //dm.addColumn("DELIVERY DATE");
    }
    private void CreateRows(){
        try{
                         java.sql.Connection Connect;
                Connect = Myjava.Myconnection.myconn();
                    PreparedStatement pt = Connect.prepareStatement("select * from Delivery");
                   // pt.setString(1,custid.trim());
                    ResultSet rs = pt.executeQuery();
                    while(rs.next()){
                    
                   String custid = rs.getString("Cust_ID"); 
                   String nme = rs.getString("Cust_Name");
                   String itm = rs.getString("Item");
                   String orddt = rs.getString("Order_Date");
                   String dl = rs.getString("Delivery_Date");
                  String qn  = rs.getString("Quantity");
                  String pr = rs.getString("Price");
                  String[] rowdata ={custid,nme,itm,orddt,dl,qn,pr};
                 dm.addRow(rowdata);
                    
                    }
                    
                    pt.close();
                    Connect.close();
            }catch(Exception e){
                      JOptionPane.showMessageDialog(this,"ERROR OCCURS");
                      
              System.out.println(e.getMessage());

               }
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Date = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setTitle("Items That Are Ready To Deliver");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1068, 693));
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

        Date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Date.setText("Date");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Date");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Time");

        Time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Time.setText("Time");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Customer Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Total Quantity");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Items");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Total Price");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setText("Deliver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(410, 410, 410))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Time)
                    .addComponent(jLabel3)
                    .addComponent(Date)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        setBounds(0, 0, 1084, 732);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // report generation
                Document doc =new Document();

       try{
        String path="";
        JFileChooser j=new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x=j.showSaveDialog(this);
        if(x==JFileChooser.APPROVE_OPTION){
            path=j.getSelectedFile().getPath();
        }
        //Document doc =new Document();
        PdfWriter.getInstance(doc,new FileOutputStream(path+"abc.pdf"));
        doc.open();
        //String s="hii";
        Paragraph p= new Paragraph("Bill");
        doc.add(p);
       
       }catch(Exception e){
           System.out.println(e);
       }    
       doc.close();
       //deleting from the table
        String s = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
         
        try{
            java.sql.Connection Connect;
             Connect = Myjava.Myconnection.myconn();
             PreparedStatement pt = Connect.prepareStatement("delete from Delivery where Cust_ID = ?");
             pt.setString(1,s);
             // ResultSet rs1 = pt.executeQuery();
             JOptionPane.showMessageDialog(this,"FINALLY DELIVERED TO CUSTOMER");
             pt.execute();
             pt.close();
             Connect.close();
        }catch(Exception e){
            System.out.println(e);
        }
         dm=(DefaultTableModel) jTable1.getModel();
         dm.setRowCount(0);
        CreateRows();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TO FILL THE DATE AND TIME
         Date date = new Date();
        SimpleDateFormat sdf;
        SimpleDateFormat sdt;
        sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
        Date.setText(sdf.format(date));
        sdt = new SimpleDateFormat(" hh:mm:ss");
        Time.setText(sdt.format(date));
    }//GEN-LAST:event_formInternalFrameOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        String s = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
                 String tqn,tpr;
         DefaultListModel m=new DefaultListModel();
         String[] s1 = new String[9999999];
          String[] s2 = new String[9999999];
         int[] Q = new int[9999999];
          int[] Q1 = new int[9999999];
         int i=0,count=0,sum=0,sum1=0;
        try{
             java.sql.Connection Connect;
                Connect = Myjava.Myconnection.myconn();
             PreparedStatement pt = Connect.prepareStatement("select * from Delivery Where Cust_ID = ?");
                          pt.setString(1,s);
                          ResultSet rs = pt.executeQuery();
                          rs.next();
                          String nme = rs.getString("Cust_Name");
                          
                          jTextField1.setText(nme);
                     
                          pt.close();
                          PreparedStatement pt1 = Connect.prepareStatement("select * from Delivery Where Cust_ID = ?");
                          pt1.setString(1,s);
                          ResultSet rs1 = pt1.executeQuery();
                          //fill th details in the table
                          while(rs1.next()){
                          String itm = rs1.getString("Item");
                          s1[i] = rs1.getString("Quantity");
                          s2[i]=rs1.getString("Price");
                          i++;
                          count++;
                          m.addElement(itm);
                          }
                          jList1.setModel(m);
                          
                          for(i=0;i<count;i++){
                              //to add the total quantity and total price
                               Q[i] = Integer.parseInt(s1[i]);
                               sum=sum+Q[i];
                               Q1[i] = Integer.parseInt(s2[i]);
                               sum1=sum1+Q1[i];
                          }
                          //System.out.print(sum);
                          tqn = Integer.toString(sum);
                          tpr = Integer.toString(sum1);
                          jTextField2.setText(tqn);
                          jTextField3.setText(tpr);
                          pt1.close();
                          pt.close();
              
                          Connect.close();
                         
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"404 Error found");
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Time;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
