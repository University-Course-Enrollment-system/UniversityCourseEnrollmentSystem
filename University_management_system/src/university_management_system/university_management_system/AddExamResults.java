
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class AddExamResults extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddExamResults
     */
    fillCombo fc = new fillCombo();
    ResultTb rt = new ResultTb();
    ResultSet rs = null;
    public AddExamResults() {
        initComponents();
        cmb_stid.addItem(" ");
        fc.fillStrItems(cmb_stid,"SELECT * FROM `student`",1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        txt_exammark = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cmb_stid = new javax.swing.JComboBox();
        cmb_subid = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        lbl_asignmarks = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_presentage = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbl_finalmark = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_grade = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Exam Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 36))); // NOI18N

        jLabel6.setText("Exam Marks :");

        jLabel2.setText("Assignment marks:");

        jLabel1.setText("Subject ID :");

        jLabel5.setText("Student ID :");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_16x16.gif"))); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cmb_stid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_stidActionPerformed(evt);
            }
        });

        cmb_subid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_subidActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Submit>>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbl_asignmarks.setText(" ");

        jLabel3.setText("Presentage marks for Exam(100%) :");

        txt_presentage.setText(" ");

        jLabel4.setText(" Total marks for subject :");

        lbl_finalmark.setText(" ");

        jLabel9.setText(" Grade :");

        lbl_grade.setText(" ");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_Student-id-24_103850.png"))); // NOI18N
        jButton3.setText("Send Mail");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save-icon.png"))); // NOI18N
        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_grade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_subid, javax.swing.GroupLayout.Alignment.LEADING, 0, 72, Short.MAX_VALUE)
                            .addComponent(cmb_stid, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_exammark)
                            .addComponent(lbl_asignmarks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_presentage)
                            .addComponent(lbl_finalmark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmb_stid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cmb_subid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(lbl_asignmarks, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_exammark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_presentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_finalmark, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>     
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //Startpg st = new Startpg();
        //st.setVisible(true);
        //st.pack();
        //st.setLocationRelativeTo(null);
        this.dispose();
    } 

     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(txt_exammark.getText().equals("")){
         lbl_grade.setText("F");
        }
        if(lbl_asignmarks.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Assignment mark has been not added");
        }
        if(txt_presentage.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Presentage has been not added");
        }
        
        else{
        
        int xmmark = Integer.parseInt(txt_exammark.getText());
        int ptage = Integer.parseInt(txt_presentage.getText());
        int assignmark = Integer.parseInt(lbl_asignmarks.getText());
        int finalmark =(int)((double)xmmark*((double)ptage/100.0)+ (double)assignmark*(1.0-(double)ptage/100.0));
        System.out.println(finalmark);
        
        lbl_finalmark.setText(Integer.toString(finalmark));
        if(finalmark>=85){
          lbl_grade.setText("A+");
        }
        else if(finalmark>=80){
          lbl_grade.setText("A");
        }
        else if(finalmark>=75){
          lbl_grade.setText("A-");
        }
        else if(finalmark>=70){
          lbl_grade.setText("B+");
        }
        else if(finalmark>=65){
          lbl_grade.setText("B");
        }
        else if(finalmark>=60){
          lbl_grade.setText("B-");
        }
        else if(finalmark>=55){
          lbl_grade.setText("C+");
        }
        else if(finalmark>=50){
          lbl_grade.setText("C");
        }
        else if(finalmark>=45){
          lbl_grade.setText("C-");
        }
        else if(finalmark>=40){
          lbl_grade.setText("D+");
        }
        else if(finalmark>=50){
          lbl_grade.setText("D");
        }
        else if(finalmark>=45){
          lbl_grade.setText("D-");
        }
        else{
          lbl_grade.setText("E");
        }
        }
    }     

     private void cmb_stidActionPerformed(java.awt.event.ActionEvent evt) {                                         
      String stid =cmb_stid.getSelectedItem().toString();
      cmb_subid.removeAllItems();
      fc.fillStrItems(cmb_subid,"SELECT * FROM `stsub` WHERE `studentid` = ?", 2, 1, stid);
    }      

     private void cmb_subidActionPerformed(java.awt.event.ActionEvent evt) {                                          
       String stid =cmb_stid.getSelectedItem().toString();
       String subid =cmb_subid.getSelectedItem().toString();
       lbl_asignmarks.setText("");
       rt.fillbl(stid, subid, lbl_asignmarks);
       
    }          

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       String stid =cmb_stid.getSelectedItem().toString();
       String subid =cmb_subid.getSelectedItem().toString(); 
       int assignmark = Integer.parseInt(lbl_asignmarks.getText());
       int xmmark = Integer.parseInt(txt_exammark.getText());
       int ptage = Integer.parseInt(txt_presentage.getText());
       int finalmark = Integer.parseInt(lbl_finalmark.getText());
       String fingrade = lbl_grade.getText();
       rt.AddUpdateExamTb('i', stid,subid,assignmark,xmmark,ptage,finalmark,fingrade);
    }    

                             


    // Variables declaration - do not modify                     
    private javax.swing.JComboBox cmb_stid;
    private javax.swing.JComboBox cmb_subid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_asignmarks;
    private javax.swing.JLabel lbl_finalmark;
    private javax.swing.JLabel lbl_grade;
    private javax.swing.JTextField txt_exammark;
    private javax.swing.JTextField txt_presentage;
    // End of variables declaration                   
}
