/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tailor_project_final;

import java.awt.Component;
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
public class Item_Master extends javax.swing.JInternalFrame {

    /**
     * Creates new form Item_Master
     */
    public Item_Master() {
        initComponents();
        Fillcombo();
    }
    public void clear(){
        itmnum.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        itmnum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rmale = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();

        setTitle("Adding Measurement to Items");
        setPreferredSize(new java.awt.Dimension(600, 480));
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
        jLabel5.setText("Item Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Item Number");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setMaximumRowCount(20);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----Select-----" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        itmnum.setEditable(false);
        itmnum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Gender");

        buttonGroup1.add(rmale);
        rmale.setSelected(true);
        rmale.setText("Male");
        rmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Add Measurement");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Measurement List");

        jScrollPane1.setViewportView(list);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(Date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(54, 54, 54)
                        .addComponent(Time)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(94, 94, 94)
                                    .addComponent(jLabel6)
                                    .addGap(41, 41, 41)
                                    .addComponent(itmnum, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rmale)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButton2)
                                    .addGap(136, 136, 136)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(58, 58, 58)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(182, 182, 182)))
                        .addContainerGap(15, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Date)
                    .addComponent(jLabel3)
                    .addComponent(Time))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(itmnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(rmale)
                            .addComponent(jRadioButton2)
                            .addComponent(jButton1))
                        .addGap(93, 93, 93)
                        .addComponent(jLabel4)
                        .addContainerGap(128, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        setBounds(450, 150, 648, 468);
    }// </editor-fold>//GEN-END:initComponents

    private void rmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rmaleActionPerformed

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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
                String s=jComboBox1.getSelectedItem().toString();
        try{
           String itemid,rbutton;
            //System.out.println(no);
            java.sql.Connection Connect;
                Connect = Myjava.Myconnection.myconn();
                           

                    PreparedStatement pt = Connect.prepareStatement("select * from item_entry Where Item_Name = ?");
                    pt.setString(1,s);
                    ResultSet rs = pt.executeQuery();
                    rs.next();
                    
                    itemid = rs.getString("Item_ID"); 
                    
                             
                    rbutton = rs.getString("Gender");
                                       
                   // pri = rs.getString("Price");
                    itmnum.setText(itemid);
                    
                    if(rbutton.equals("Male"))
                    {
                        rmale.setSelected(true);
                    }
                    else
                    {
                        jRadioButton2.setSelected(true);
                    }
                    DefaultListModel m=new DefaultListModel();
                       String s1=jComboBox1.getSelectedItem().toString();

                        try{
                          PreparedStatement pts = Connect.prepareStatement("select * from Item_Mas Where item_name = ?");
                          pts.setString(1,s1);

                          ResultSet rs1 = pts.executeQuery();

                        while(rs1.next()){

                             String itname=rs1.getString("measurement_list");
                             m.addElement(itname);
                    }
                        list.setModel(m);
                        }catch(Exception e){
                                         JOptionPane.showMessageDialog(this," NULL");

                        }
                    
                    
                    
                     pt.close();
                    Connect.close();
                   
        
            
        }catch(Exception e){
             JOptionPane.showMessageDialog(this," empty");

        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TO ADD EXTRAA MESUREMENT LIST TO THE ITEMS
                String measurement_name,itnum,itname,rbutton;
                Component c =(Component)evt.getSource();
        String mesurement_name = JOptionPane.showInputDialog(c,"Measurement Name");
         
               itnum=itmnum.getText().trim();
               String s=jComboBox1.getSelectedItem().toString();
               if (rmale.isSelected())
               {
                   rbutton="Male";
               }else
               {
                   rbutton="Female";
               }
               try
                    {
                   java.sql.Connection Connect;
                   Connect = Myjava.Myconnection.myconn();
                   PreparedStatement pt = Connect.prepareStatement("Insert into Item_Mas (item_ID,item_name,gender,measurement_list)Values(?,?,?,?)");
                   pt.setString(1,itnum);
                   pt.setString(2,s);
                   pt.setString(3,rbutton);
                   pt.setString(4,mesurement_name);
                   
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
    }//GEN-LAST:event_jButton1ActionPerformed
private void Fillcombo(){
        try{
            java.sql.Connection Connect;
                   Connect = Myjava.Myconnection.myconn();
                   PreparedStatement pt = Connect.prepareStatement("select * from item_entry");
                    ResultSet rs = pt.executeQuery();
                    while(rs.next()){
                        String itname=rs.getString("Item_Name");
                        jComboBox1.addItem(itname);
                    }
                    pt.close();
                    Connect.close();
                   
        }catch(Exception e){
                            JOptionPane.showMessageDialog(this," DB IS EMPTY");

                }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Time;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField itmnum;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList list;
    private javax.swing.JRadioButton rmale;
    // End of variables declaration//GEN-END:variables
}
