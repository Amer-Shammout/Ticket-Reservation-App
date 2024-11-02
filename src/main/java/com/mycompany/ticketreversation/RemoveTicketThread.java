/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketreversation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class RemoveTicketThread extends Thread {
    /*
     * هذا الثريد يستخدم في عملية الغاءالحجز لحذف معلومات التذاكر المحجوزة من حساب
     * المستخدم
     */
    // Users->username->reserveNum.txt
    private File f;

    public RemoveTicketThread(File f) {
        this.f = f;
    }

    @Override
    public void run() {

        try {
            PrintWriter pw = new PrintWriter(f);
            pw.print("");
            pw.flush();
            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(RemoveTicketThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
