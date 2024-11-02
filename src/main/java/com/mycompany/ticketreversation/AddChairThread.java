/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketreversation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class AddChairThread extends Thread {
  // هذا الثريد يستعمل في عملية الغاء الحجز لاعادة الكرسي الى الكراسي الكلية
  private File f; // Cinema->MovieName->Showtime

  public AddChairThread(File f, String numOfReverse) {
    this.f = f;
  }

  @Override
  public void run() {
    try {

      Scanner in1 = new Scanner(f);
      // اضافة الكرسي المحجوز الى عدد الكراسي الكلية
      int y = in1.nextInt() + 1;
      // كتابة عددالكراسي بعد الاضافة
      PrintWriter pw = new PrintWriter(f);
      pw.print(y);

      pw.flush();
      in1.close();
      pw.close();

    } catch (FileNotFoundException ex) {
      Logger.getLogger(AddChairThread.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
