/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentData;

import com.sun.glass.events.KeyEvent;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;





/**
 *
 * @author oscar
 */
public class StudentData extends javax.swing.JFrame {
    
    private static final String USERNAME="root";
    private static final String PASSWORD="root";
    private static final String CONN_STRING="jdbc:mysql://localhost:8889/Student";
    
    
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs=null;
        DefaultTableModel model = new DefaultTableModel();
     

    /**
     * Creates new form StudentData
     * @throws java.sql.SQLException
     */
    public StudentData() throws SQLException {
        initComponents();
        
        
        
         Object col[] = {"StudentID", "CourseCode", "Math", "English","Biology", "Computing", "Chemistry", "Physics", "AddMath", "Business","TotalScore", "Average", "Ranking"};
         model.setColumnIdentifiers(col);
         jTable1.setModel(model);
         
         
//       conn = StudentData.ConnectDb();
                 
        
         
        try {
                conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
                System.out.println("Connected");
                updateTable(); 
                
        }catch (SQLException e){
                System.err.println(e);
                }
        
        
    }
    
//    public static Connection ConnectDb(){
//        
//        
//        
//    }

    public void promptUser(){
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtTranscripts = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtStudentID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtLastName = new javax.swing.JTextField();
        jComboCourseCode = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtTotalScore = new javax.swing.JTextField();
        jtxtAvg = new javax.swing.JTextField();
        jtxtRanking = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtMath = new javax.swing.JTextField();
        jtxtEng = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtBio = new javax.swing.JTextField();
        jtxtComp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtChem = new javax.swing.JTextField();
        jtxtPhys = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtxtAddMath = new javax.swing.JTextField();
        jtxtBusiness = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnAddStudent = new javax.swing.JButton();
        jbtnTranscript = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(125, 175, 207));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 131), 9), "Transcript", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtTranscripts.setColumns(20);
        jtxtTranscripts.setRows(5);
        jScrollPane2.setViewportView(jtxtTranscripts);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 430, 410));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 470, 470));

        jPanel1.setBackground(new java.awt.Color(125, 175, 207));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 131), 9), "Student Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Student_ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jtxtStudentID.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel1.add(jtxtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 130, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("FirstName:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jtxtFirstName.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel1.add(jtxtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 130, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("LastName:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jtxtLastName.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel1.add(jtxtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 130, -1));

        jComboCourseCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboCourseCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 120, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("Course Code:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setText("Average:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("Ranking");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jtxtTotalScore.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel1.add(jtxtTotalScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 130, -1));

        jtxtAvg.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel1.add(jtxtAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 130, -1));

        jtxtRanking.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel1.add(jtxtRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 130, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setText("Total Score:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setText("Math:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jtxtMath.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jtxtMath.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtMathKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtMath, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 130, -1));

        jtxtEng.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jtxtEng.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtEngKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtEng, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 130, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setText("English:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel10.setText("Biology:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        jtxtBio.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jtxtBio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtBioKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtBio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 130, -1));

        jtxtComp.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jtxtComp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCompKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 130, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel11.setText("Computing");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel12.setText("Chemistry:");
        jLabel12.setToolTipText("");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jtxtChem.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jtxtChem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtChemKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtChem, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 130, -1));

        jtxtPhys.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jtxtPhys.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPhysKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtPhys, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 130, -1));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel13.setText("Physics:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel14.setText("Add Math:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jtxtAddMath.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jtxtAddMath.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtAddMathKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtAddMath, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 130, -1));

        jtxtBusiness.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jtxtBusiness.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtBusinessKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtBusiness, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 130, -1));

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel15.setText("Business:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 750, 470));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student_ID", "Course_Code", "Math", "English", "Biology", "Computing", "Chemistry", "Physics", "Add Math", "Business", "Total_score", "Average", "Ranking"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1250, 180));

        jbtnAddStudent.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jbtnAddStudent.setText("Add Student");
        jbtnAddStudent.setToolTipText("");
        jbtnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddStudentActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 120, -1));

        jbtnTranscript.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jbtnTranscript.setText("Transcript");
        jbtnTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTranscriptActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnTranscript, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 680, 120, -1));

        jbtnPrint.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 680, 120, -1));

        jbtnReset.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 680, 120, -1));

        jbtnExit.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 680, 140, -1));

        jbtnDelete.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 680, 120, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTranscriptActionPerformed

        jtxtTranscripts.append("Student Result Recording System\n"
                +"=====================================\n"
                +"Student ID:\t\t" + jtxtStudentID.getText()
                + "\nMath:\t\t" + jtxtMath.getText()
                + "\nEnglish:\t\t" + jtxtEng.getText()
                + "\nBiology:\t\t" + jtxtBio.getText()
                + "\nComputing:\t\t" + jtxtComp.getText()
                + "\nChemistry:\t\t" + jtxtChem.getText()
                + "\nPhysics:\t\t" + jtxtPhys.getText()
                + "\nAdd Math:\t\t" + jtxtAddMath.getText()
                + "\nBusiness:\t\t" + jtxtBusiness.getText()
                + "\n====================================="
                + "\nTotal Score:\t\t" + jtxtTotalScore.getText()
                + "\nAverage:\t\t" + jtxtAvg.getText()
                + "\nRanking:\t\t" + jtxtRanking.getText()+"\n"
                          
        );
        
    }//GEN-LAST:event_jbtnTranscriptActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.getContentPane().setBackground(new java.awt.Color(176,225,230));
        
    }//GEN-LAST:event_formWindowActivated

    private void jtxtMathKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtMathKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber)) 
//            || (iNumber == KeyEvent.VK_BACK_SPACE)
            || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
    }
    }//GEN-LAST:event_jtxtMathKeyTyped

    private void jtxtEngKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEngKeyTyped
        // TODO add your handling code here:
            char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber)) 
//            || (iNumber == KeyEvent.VK_BACK_SPACE)
            || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
    }
    }//GEN-LAST:event_jtxtEngKeyTyped

    private void jtxtBioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBioKeyTyped
        // TODO add your handling code here:
            char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber)) 
//            || (iNumber == KeyEvent.VK_BACK_SPACE)
            || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
    }
    }//GEN-LAST:event_jtxtBioKeyTyped

    private void jtxtCompKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCompKeyTyped
        // TODO add your handling code here:
            char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber)) 
//            || (iNumber == KeyEvent.VK_BACK_SPACE)
            || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
    }
    }//GEN-LAST:event_jtxtCompKeyTyped

    private void jtxtChemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtChemKeyTyped
        // TODO add your handling code here:
            char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber)) 
//            || (iNumber == KeyEvent.VK_BACK_SPACE)
            || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
    }
    }//GEN-LAST:event_jtxtChemKeyTyped

    private void jtxtPhysKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPhysKeyTyped
        // TODO add your handling code here:
            char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber)) 
//            || (iNumber == KeyEvent.VK_BACK_SPACE)
            || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
    }
    }//GEN-LAST:event_jtxtPhysKeyTyped

    private void jtxtBusinessKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBusinessKeyTyped
        // TODO add your handling code here:
            char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber)) 
//            || (iNumber == KeyEvent.VK_BACK_SPACE)
            || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
    }
    }//GEN-LAST:event_jtxtBusinessKeyTyped

    private void jtxtAddMathKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtAddMathKeyTyped
        // TODO add your handling code here:
            char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber)) 
//            || (iNumber == KeyEvent.VK_BACK_SPACE)
            || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
    }
    }//GEN-LAST:event_jtxtAddMathKeyTyped

   private JFrame frame;
    
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Student Result System",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        // TODO add your handling code here:
        JTextField temp = null;
        for(Component c:jPanel1.getComponents()){
            if(c.getClass().toString().contains("javax.swing.JTextField")){
                temp=(JTextField)c;
                temp.setText(null);
            }
        }
        
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddStudentActionPerformed
        
            double[] R = new double[14];
            R[0] = Double.parseDouble(jtxtMath.getText());
            R[1] = Double.parseDouble(jtxtEng.getText());
            R[2] = Double.parseDouble(jtxtBio.getText());
            R[3] = Double.parseDouble(jtxtComp.getText());
            R[4] = Double.parseDouble(jtxtChem.getText());
            R[5] = Double.parseDouble(jtxtPhys.getText());
            R[6] = Double.parseDouble(jtxtAddMath.getText());
            R[7] = Double.parseDouble(jtxtBusiness.getText());
        
            R[8] = (R[0] + R[1] + R[2] + R[3] + R[4] + R[5] + R[6] + R[7]) / 8;
            R[9] = R[0] + R[1] + R[2] + R[3] + R[4] + R[5] + R[6] + R[7];
            
            String Average = String.format("%.0f", R[8]);
            jtxtAvg.setText(Average);
            
            String TotalScore = String.format("%.0f", R[9]);
            jtxtTotalScore.setText(TotalScore);
            
            if(R[9] >= 700){
                jtxtRanking.setText("1st");
                
            }else if (R[9] >= 600 ) {
                jtxtRanking.setText("2i");
                
            }else if (R[9] >= 500 ) {
                jtxtRanking.setText("2ii");
            }else if (R[9] >= 400 ) {
                jtxtRanking.setText("3rd");
            }else if (R[9] >= 300 ){
                jtxtRanking.setText("CoHE");
                
            }else if (R[9] >= 200 ){
                
                jtxtRanking.setText("Fail");
            }
            
            
            
            
    //==========================DATABase===================================
            
        String sql="INSERT INTO Student(StudentID, CourseCode, Math, English, Biology, Computing, Chemistry, Physics, AddMath, Business, "
                + "TotalScore, Average, Ranking)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            
            pst = conn.prepareStatement(sql);
            pst.setString(1, jtxtStudentID.getText());
            pst.setString(2, (String) jComboCourseCode.getSelectedItem());
            pst.setString(3, jtxtMath.getText());
            pst.setString(4, jtxtEng.getText());
            pst.setString(5, jtxtBio.getText());
            pst.setString(6, jtxtComp.getText());
            pst.setString(7, jtxtChem.getText());
            pst.setString(8, jtxtPhys.getText());
            pst.setString(9, jtxtAddMath.getText());
            pst.setString(10, jtxtBusiness.getText());
            pst.setString(11, jtxtTotalScore.getText());
            pst.setString(12, jtxtAvg.getText());
            pst.setString(13, jtxtRanking.getText());
            
            pst.execute();
                JOptionPane.showMessageDialog(null, "System Update Completed");
            
            rs.close();
            pst.close();
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e);
        }
        updateTable();
        
    }//GEN-LAST:event_jbtnAddStudentActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==-1){
            if(jTable1.getRowCount()==0){
                
                JOptionPane.showMessageDialog(null, "No data to delete",
                        "Student Result System", JOptionPane.OK_OPTION);
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Select a row to delete", 
                        "Student Result System", JOptionPane.OK_OPTION);
                
            }
            
        }else{
            
            model.removeRow(jTable1.getSelectedRow());
            
        }
        
        
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
        
        MessageFormat header = new MessageFormat("Printing in progress");
            MessageFormat footer = new MessageFormat("Page {0, number, integer}");
            
            try{
                
                jTable1.print(JTable.PrintMode.NORMAL,header, footer);
                
            }catch (java.awt.print.PrinterException e){
                System.err.format("No Printer found", e.getMessage());
            }
        
        
    }//GEN-LAST:event_jbtnPrintActionPerformed

    public void updateTable(){
        
//        conn = StudentData.ConnectDB();
        if(conn != null){
            
        
        String sql="Select StudentID, CourseCode, Math, English,Biology, Computing, Chemistry, Physics, AddMath, Business,TotalScore, Average, Ranking from Student";
        
        try{
            
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Object[] columnData = new Object[13];
            
            while (rs.next()){
                columnData [0] = rs.getString("StudentID");
                columnData [1] = rs.getString("CourseCode");
                columnData [2] = rs.getString("Math");
                columnData [3] = rs.getString("English");
                columnData [4] = rs.getString("Biology");
                columnData [5] = rs.getString("Computing");
                columnData [6] = rs.getString("Chemistry");
                columnData [7] = rs.getString("Physics");
                columnData [8] = rs.getString("AddMath");
                columnData [9] = rs.getString("Business");
                columnData [10] = rs.getString("TotalScore");
                columnData [11] = rs.getString("Average");
                columnData [12] = rs.getString("Ranking");
                model.addRow(columnData);
                
                
                
            }
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e);
        }
        
         }
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException{
        // TODO code application logic here
     
        
        
        
        
        
        
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
            java.util.logging.Logger.getLogger(StudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new StudentData().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboCourseCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAddStudent;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTranscript;
    private javax.swing.JTextField jtxtAddMath;
    private javax.swing.JTextField jtxtAvg;
    private javax.swing.JTextField jtxtBio;
    private javax.swing.JTextField jtxtBusiness;
    private javax.swing.JTextField jtxtChem;
    private javax.swing.JTextField jtxtComp;
    private javax.swing.JTextField jtxtEng;
    private javax.swing.JTextField jtxtFirstName;
    private javax.swing.JTextField jtxtLastName;
    private javax.swing.JTextField jtxtMath;
    private javax.swing.JTextField jtxtPhys;
    private javax.swing.JTextField jtxtRanking;
    private javax.swing.JTextField jtxtStudentID;
    private javax.swing.JTextField jtxtTotalScore;
    private javax.swing.JTextArea jtxtTranscripts;
    // End of variables declaration//GEN-END:variables

   
}
