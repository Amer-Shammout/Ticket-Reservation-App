/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketreversation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author dell
 */
public class SignupLogic {
    /*
     * في هذا الكلاس يوجد منطق عملية انشاء الحساب
     */
    private String fullname;
    private String pass;
    private String usname;

    public SignupLogic(User us) {
        this.fullname = us.getFullName();
        this.pass = us.getPassword();
        this.usname = us.getUsername();
    }

    // تابع لاضافة و تخزين معلومات المستخدم في الملفات
    public void addData() {
        File f = new File("Users\\" + usname);
        f.mkdir();
        try {
            FileWriter fw = new FileWriter(f + "\\Info.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Password:" + pass);

            bw.newLine();
            bw.write("FullName:" + fullname);
            bw.flush();
            bw.close();
        } catch (IOException ex) {
            System.out.println("ERROR ❌");
        }
    }
}
