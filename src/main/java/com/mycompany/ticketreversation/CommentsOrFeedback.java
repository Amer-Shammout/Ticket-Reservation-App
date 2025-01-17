/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ticketreversation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class CommentsOrFeedback extends javax.swing.JFrame {

    /**
     * Creates new form CommentsOrFeedback
     */
    public CommentsOrFeedback() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Bu = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        userComment = new javax.swing.JTextField();
        rateCB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        reviewsArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        movie = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CommentsOrReviews");
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton1.setText("Home");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(78, 57, 42, 21);

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton3.setText("Cancellation");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(485, 57, 100, 21);

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton4.setText("Account");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(665, 60, 70, 15);
        jPanel3.add(jLabel3);
        jLabel3.setBounds(545, 51, 0, 0);
        jPanel3.add(jLabel5);
        jLabel5.setBounds(304, 46, 0, 0);
        jPanel3.add(jLabel2);
        jLabel2.setBounds(714, 51, 0, 0);

        jLabel1.setIcon(new javax.swing.ImageIcon("Photos\\Un Choosen Home.png")); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(87, 30, 25, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon("Photos\\Un Choosen Ticket.png")); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(245, 27, 30, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("Photos\\Un Choosen Cancellation.png")); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(518, 27, 30, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("Photos\\Un Choosen Account.png")); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(686, 29, 27, 27);

        jButton9.setBackground(new java.awt.Color(255, 102, 102));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton9.setText("Ticketing");
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(228, 57, 64, 21);

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setIcon(new javax.swing.ImageIcon("Photos\\Choosen Review.png")); // NOI18N
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(365, 20, 50, 50);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 800, 92);

        Bu.setBackground(new java.awt.Color(255, 102, 102));
        Bu.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Bu.setForeground(new java.awt.Color(255, 255, 255));
        Bu.setText("Add Comment");
        Bu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuActionPerformed(evt);
            }
        });
        jPanel1.add(Bu);
        Bu.setBounds(80, 340, 169, 34);

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel8.setText("Reviews");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(390, 170, 80, 23);

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel9.setText("Rate From 5");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(80, 280, 120, 23);

        userComment.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        userComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCommentActionPerformed(evt);
            }
        });
        jPanel1.add(userComment);
        userComment.setBounds(80, 250, 230, 25);

        rateCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1/5", "2/5", "3/5", "4/5", "5/5" }));
        jPanel1.add(rateCB);
        rateCB.setBounds(80, 300, 230, 22);

        reviewsArea.setEditable(false);
        reviewsArea.setBackground(new java.awt.Color(255, 255, 255));
        reviewsArea.setColumns(20);
        reviewsArea.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        reviewsArea.setRows(5);
        jScrollPane1.setViewportView(reviewsArea);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(390, 200, 370, 170);

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel10.setText("Comment");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(80, 230, 80, 23);

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel11.setText("Movie Name");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(80, 180, 110, 23);

        movie.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        movie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieActionPerformed(evt);
            }
        });
        jPanel1.add(movie);
        movie.setBounds(80, 200, 230, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//زر الهوم
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home home = new Home();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
//زر واجهة الغاء الحجز
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CancellationFrame cancellationFrame = new CancellationFrame();
        cancellationFrame.setVisible(true);
        cancellationFrame.pack();
        cancellationFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
//زر الحساب
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
        //منطق ظهور معلومات الحجوزات في حساب المستخدم
           AccountFrame accountFrame = new AccountFrame();
            
            Ticketing ticketing = new Ticketing();
            ticketing.displayAccountInfo();
        //الوصول للملف النصي للحساب وقراءة المعلومات منه
            File f = new File("Account\\account.txt");
            Scanner in1 = new Scanner(new FileReader(f));
            while (in1.hasNextLine()) {
                AccountFrame.AccountInfo.append(in1.nextLine()+"\n");
            }
            in1.close();
            //تفريغ الملف حتى لا تتكرر البيانات نفسها اكثر من مرة 
            PrintWriter pw = new PrintWriter(f);
            pw.print("");
            pw.close();
            //منطق ظهور الاسم الكامل للمستخدم في صفحة الحساب
            Scanner in = new Scanner(new FileReader("Users\\"+TicketReversation.u.getUsername()+"\\Info.txt"));
            in.nextLine();
            String s = in.nextLine().substring(9);
            in.close();
            //كتابة الاسم الكامل في صفحة الحساب
            accountFrame.fn.setText(s);
            accountFrame.setVisible(true);
            accountFrame.pack();
            accountFrame.setLocationRelativeTo(null);
            this.dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CancellationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
//زر واجهة الحجز
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        TicketingFrame ticketing = new TicketingFrame();
        ticketing.setVisible(true);
        ticketing.pack();
        ticketing.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void userCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userCommentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userCommentActionPerformed
//زر إضافة التعليق
    private void BuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuActionPerformed
       //الوصول لملف معلومات المستخدم
        File f = new File("Users\\"+TicketReversation.u.getUsername()+"\\Info.txt");
        try {     
            Scanner in = new Scanner(new FileReader(f));
            in.nextLine();
            //قراءة الاسم الكامل للمستخدم
            String fullName = in.nextLine().substring(9);
            in.close();
            //الفيلم المدخل من المستخدم
            String Movie = movie.getText();
            //التعليق المدخل من قبل المستخدم
            String comment = userComment.getText();
            //التقييم المدخل من قبل المستخدم
            String rate = (String)rateCB.getSelectedItem();
            //ملف التعليقات
            File f1 = new File("Comments\\Review.txt");
            PrintWriter pw = new PrintWriter(new FileWriter(f1,true));
            //لضمان عدم ادخال الرموز او الأرقام
            boolean flag = false;
            for (int i = 0; i < comment.length(); i++) {
                if((int)comment.charAt(i)<65 || (int)comment.charAt(i)>122 || ((int)comment.charAt(i)>90 && (int)comment.charAt(i)<97))
                {
                    if((int)comment.charAt(i)!=32)
                    {
                        flag = true;
                    }
                }
            }
            //لضمان أن اسم الفيلم المدخل صحيح
            boolean flag1 = true;
            File f2 = new File("Cinema\\1\\"+Movie);
            File f3 = new File("Cinema\\2\\"+Movie);
            File f4 = new File("Cinema\\3\\"+Movie);
           if(f2.exists() || f3.exists() || f4.exists())
           {
               flag1 = false;
           }
            if(flag)
            {
                JOptionPane.showMessageDialog(null, "The Comment Must Have Only Litters ❌");
            }
            else if(flag1)
            {
              JOptionPane.showMessageDialog(null, "There Is Error In Entered Movie Name ❌");  
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Thanks For Your Feedback!");
                //ظهور التعليق في المكان المخصص
                reviewsArea.append(fullName+" : I Rate  " +Movie+" "+rate+" ,"+comment+"\n");
                //Reset
                movie.setText("");
                userComment.setText("");
                rateCB.setSelectedIndex(0);
                //حفظ التعليق في الملف المخصص
                pw.println(fullName+" : I Rate  " +Movie+" "+rate+" ,"+comment);
                pw.flush();
                pw.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CommentsOrFeedback.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CommentsOrFeedback.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BuActionPerformed

    private void movieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movieActionPerformed

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
            java.util.logging.Logger.getLogger(CommentsOrFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommentsOrFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommentsOrFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommentsOrFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommentsOrFeedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField movie;
    private javax.swing.JComboBox<String> rateCB;
    public javax.swing.JTextArea reviewsArea;
    private javax.swing.JTextField userComment;
    // End of variables declaration//GEN-END:variables
}
