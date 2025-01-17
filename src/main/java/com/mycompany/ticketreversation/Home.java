/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ticketreversation;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        hall1 = new javax.swing.JButton();
        hall2 = new javax.swing.JButton();
        hall3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        moviesArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        CategoriesCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 3, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Home");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(76, 57, 45, 21);

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton2.setText("Ticketing");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(228, 57, 64, 21);

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
        jButton3.setBounds(490, 57, 85, 21);

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
        jButton4.setBounds(671, 60, 58, 15);
        jPanel3.add(jLabel3);
        jLabel3.setBounds(545, 51, 0, 0);
        jPanel3.add(jLabel5);
        jLabel5.setBounds(304, 46, 0, 0);
        jPanel3.add(jLabel2);
        jLabel2.setBounds(714, 51, 0, 0);

        jLabel1.setIcon(new javax.swing.ImageIcon("Photos\\Choosen Home.png")); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(87, 27, 25, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon("Photos\\Un Choosen Ticket.png")); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(245, 27, 30, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("Photos\\Un Choosen Cancellation.png")); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(518, 27, 30, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("Photos\\Un Choosen Account.png")); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(686, 29, 27, 27);

        jButton6.setBackground(new java.awt.Color(255, 102, 102));
        jButton6.setIcon(new javax.swing.ImageIcon("Photos\\Un Choosen Review.png")); // NOI18N
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(365, 20, 50, 50);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 800, 92);

        hall1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        hall1.setText("Hall 1");
        hall1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hall1ActionPerformed(evt);
            }
        });
        jPanel1.add(hall1);
        hall1.setBounds(60, 130, 80, 40);

        hall2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        hall2.setText("Hall 2");
        hall2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hall2ActionPerformed(evt);
            }
        });
        jPanel1.add(hall2);
        hall2.setBounds(350, 130, 80, 40);

        hall3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        hall3.setText("Hall 3");
        hall3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hall3ActionPerformed(evt);
            }
        });
        jPanel1.add(hall3);
        hall3.setBounds(659, 130, 80, 40);

        moviesArea.setEditable(false);
        moviesArea.setColumns(20);
        moviesArea.setFont(new java.awt.Font("Segoe UI Black", 1, 50)); // NOI18N
        moviesArea.setForeground(new java.awt.Color(255, 102, 102));
        moviesArea.setRows(5);
        moviesArea.setText("               \n               Welcome!");
        moviesArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        moviesArea.setSelectionColor(new java.awt.Color(51, 204, 255));
        jScrollPane2.setViewportView(moviesArea);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(60, 180, 680, 220);

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setText("copyright © Ticket Reversation App all rights reserved");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(246, 433, 318, 20);

        CategoriesCB.setBackground(new java.awt.Color(255, 102, 102));
        CategoriesCB.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        CategoriesCB.setForeground(new java.awt.Color(255, 255, 255));
        CategoriesCB.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "All", "Action", "Comedy", "Romantic", "Horror", "Scientefic-Fiction", "Drama" }));
        CategoriesCB.setToolTipText("");
        CategoriesCB.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        CategoriesCB.setName("Categories"); // NOI18N
        CategoriesCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriesCBActionPerformed(evt);
            }
        });
        jPanel1.add(CategoriesCB);
        CategoriesCB.setBounds(60, 92, 680, 25);
        CategoriesCB.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     // زر الهوم

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton1ActionPerformed
     // زر الحجز

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        TicketingFrame ticketingFrame = new TicketingFrame();
        ticketingFrame.setVisible(true);
        ticketingFrame.pack();
        ticketingFrame.setLocationRelativeTo(null);
        this.dispose();
    }// GEN-LAST:event_jButton2ActionPerformed
     // رز إلغاء الحجز

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        CancellationFrame cancellationFrame = new CancellationFrame();
        cancellationFrame.setVisible(true);
        cancellationFrame.pack();
        cancellationFrame.setLocationRelativeTo(null);
        this.dispose();
    }// GEN-LAST:event_jButton3ActionPerformed
     // زر الحساب

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        try {
            // منطق ظهور معلومات الحجوزات في حساب المستخدم
            AccountFrame accountFrame = new AccountFrame();

            Ticketing ticketing = new Ticketing();
            ticketing.displayAccountInfo();
            // الوصول للملف النصي للحساب وقراءة المعلومات منه
            File f = new File("Account\\account.txt");
            Scanner in1 = new Scanner(new FileReader(f));
            while (in1.hasNextLine()) {
                AccountFrame.AccountInfo.append(in1.nextLine() + "\n");
            }
            in1.close();
            // تفريغ الملف حتى لا تتكرر البيانات نفسها اكثر من مرة
            PrintWriter pw = new PrintWriter(f);
            pw.print("");
            pw.close();
            // منطق ظهور الاسم الكامل للمستخدم في صفحة الحساب
            Scanner in = new Scanner(new FileReader("Users\\" + TicketReversation.u.getUsername() + "\\Info.txt"));
            in.nextLine();
            String s = in.nextLine().substring(9);
            in.close();
            // كتابة الاسم الكامل في صفحة الحساب
            accountFrame.fn.setText(s);
            accountFrame.setVisible(true);
            accountFrame.pack();
            accountFrame.setLocationRelativeTo(null);
            this.dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CancellationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_jButton4ActionPerformed
     // زر القاعة الثانية

    private void hall2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_hall2ActionPerformed
        // تعديل لون الزر عند الضغط عليه
        hall2.setBackground(new Color(255, 102, 102));
        hall2.setForeground(new Color(255, 255, 255));
        hall1.setBackground(new Color(255, 255, 255));
        hall1.setForeground(new Color(0, 0, 0));
        hall3.setBackground(new Color(255, 255, 255));
        hall3.setForeground(new Color(0, 0, 0));
        // home2.txt
        File f = new File("Home\\home2.txt");
        // منطق عرض الافلام الموجودة في القاعة للمستخدم
        Ticketing ticketing = new Ticketing();
        ticketing.displayAvailableSeats("2");
        try {
            moviesArea.setText("");
            moviesArea.setFont(new Font("Consolas", BOLD, 16));
            moviesArea.setForeground(new Color(0, 0, 0));
            Scanner in = new Scanner(new FileReader("Home\\" + "home2.txt"));
            while (in.hasNextLine()) {
                String s = in.nextLine();

                moviesArea.append(s + "\n");
                moviesArea.append("\n");
            }
            in.close();
            // تفريغ الملف بعد الانتهاء منعا من تكرار المعلومات
            PrintWriter pw = new PrintWriter(f);
            pw.write("");
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }// GEN-LAST:event_hall2ActionPerformed
     // زر القاعة الاولى

    private void hall1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_hall1ActionPerformed
        hall1.setBackground(new Color(255, 102, 102));
        hall1.setForeground(new Color(255, 255, 255));
        hall2.setBackground(new Color(255, 255, 255));
        hall2.setForeground(new Color(0, 0, 0));
        hall3.setBackground(new Color(255, 255, 255));
        hall3.setForeground(new Color(0, 0, 0));
        File f = new File("Home\\home1.txt");

        Ticketing ticketing = new Ticketing();
        ticketing.displayAvailableSeats("1");
        try {

            moviesArea.setText("");
            moviesArea.setFont(new Font("Consolas", BOLD, 16));
            moviesArea.setForeground(new Color(0, 0, 0));
            Scanner in = new Scanner(new FileReader("Home\\" + "home1.txt"));
            while (in.hasNextLine()) {
                String s = in.nextLine();

                moviesArea.append(s + "\n");
                moviesArea.append("\n");
            }
            in.close();
            PrintWriter pw = new PrintWriter(f);
            pw.write("");
            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }// GEN-LAST:event_hall1ActionPerformed
     // زر القاعة الثالثة

    private void hall3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_hall3ActionPerformed
        hall3.setBackground(new Color(255, 102, 102));
        hall3.setForeground(new Color(255, 255, 255));
        hall2.setBackground(new Color(255, 255, 255));
        hall2.setForeground(new Color(0, 0, 0));
        hall1.setBackground(new Color(255, 255, 255));
        hall1.setForeground(new Color(0, 0, 0));
        File f = new File("Home\\home3.txt");

        Ticketing ticketing = new Ticketing();
        ticketing.displayAvailableSeats("3");
        try {
            moviesArea.setText("");
            moviesArea.setFont(new Font("Consolas", BOLD, 16));
            moviesArea.setForeground(new Color(0, 0, 0));
            Scanner in = new Scanner(new FileReader("Home\\" + "home3.txt"));
            while (in.hasNextLine()) {
                String s = in.nextLine();

                moviesArea.append(s + "\n");
                moviesArea.append("\n");
            }
            in.close();
            PrintWriter pw = new PrintWriter(f);
            pw.write("");
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }// GEN-LAST:event_hall3ActionPerformed
     // زر واجهة التعليقات

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
        CommentsOrFeedback commentsOrFeedback = new CommentsOrFeedback();
        try {
            // ملف التعليقات
            File f = new File("Comments\\Review.txt");
            Scanner in = new Scanner(new FileReader(f));
            // ظهور التعليقات في المنطقة المخصصة
            while (in.hasNextLine()) {
                commentsOrFeedback.reviewsArea.append(in.nextLine() + "\n");
            }
            in.close();

            commentsOrFeedback.setVisible(true);
            commentsOrFeedback.pack();
            commentsOrFeedback.setLocationRelativeTo(null);
            this.dispose();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccountFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_jButton6ActionPerformed
     // كومبو بوكس التصنيفات

    private void CategoriesCBActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CategoriesCBActionPerformed
        Cinema cinema = new Cinema();
        // في حال اخترنا أحد التصنيفات
        if (!((String) CategoriesCB.getSelectedItem()).equals("All")) {
            // أمور بصرية
            hall3.setBackground(new Color(255, 255, 255));
            hall3.setForeground(new Color(0, 0, 0));
            hall2.setBackground(new Color(255, 255, 255));
            hall2.setForeground(new Color(0, 0, 0));
            hall1.setBackground(new Color(255, 255, 255));
            hall1.setForeground(new Color(0, 0, 0));
            // تعطيل أزرار القاعات
            hall3.setEnabled(false);
            hall2.setEnabled(false);
            hall1.setEnabled(false);
            // تنسيق العرض
            moviesArea.setFont(new Font("Consolas", BOLD, 18));
            moviesArea.setForeground(new Color(0, 0, 0));
            moviesArea.setText("");
            try {
                // استدعاء التابع المستخدم في التصنيفات
                cinema.speceficGenre((String) CategoriesCB.getSelectedItem());
                // الوصول لملف النوع المطلوب
                File f = new File("Categories\\" + (String) CategoriesCB.getSelectedItem() + ".txt");
                Scanner in = new Scanner(new FileReader(f));
                // حالة عدم وجود أفلام من النوع المختار
                if (!in.hasNextLine()) {
                    moviesArea.setFont(new java.awt.Font("Segoe UI Black", 1, 50)); // NOI18N
                    moviesArea.setForeground(new java.awt.Color(255, 102, 102));
                    moviesArea.setRows(5);
                    moviesArea.setText("               \n           Coming Soon!");
                } else {
                    while (in.hasNextLine()) {
                        moviesArea.append(in.nextLine() + "\n");
                    }
                    in.close();
                    PrintWriter pw = new PrintWriter(f);
                    pw.print("");
                    pw.close();
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // في حالة اختيار->all
        else {
            // تشغيل أزرارالقاعات
            hall3.setEnabled(true);
            hall2.setEnabled(true);
            hall1.setEnabled(true);
            moviesArea.setFont(new java.awt.Font("Segoe UI Black", 1, 50)); // NOI18N
            moviesArea.setForeground(new java.awt.Color(255, 102, 102));
            moviesArea.setRows(5);
            moviesArea.setText("               \n               Welcome!");

        }

    }// GEN-LAST:event_CategoriesCBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CategoriesCB;
    private javax.swing.JButton hall1;
    private javax.swing.JButton hall2;
    private javax.swing.JButton hall3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea moviesArea;
    // End of variables declaration//GEN-END:variables
}
