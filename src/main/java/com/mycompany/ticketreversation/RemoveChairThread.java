/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketreversation;

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
public class RemoveChairThread extends Thread {
    /*
    هذا الثريد يستعمل في عملية الحجز لحذف عدد التذاكر المحجوزة
    من عدد التذاكر الكلية                
    */
    private String hall;
    private  String movie_name;
    private String date;
    private int num_of_ticket;
    public  RemoveChairThread(String hall,String movie_name,String date,int num_of_ticket){
        this.hall=hall;
        this.date=date;
        this.movie_name=movie_name;
        this.num_of_ticket=num_of_ticket;
    }
     @Override
    public void run(){
         try {
             File f=new File("Cinema\\"+hall+"\\"+movie_name+"\\"+date+".txt");
             //قراءة عدد التذاكر الكلي
             Scanner in = new Scanner(new FileReader(f));
             int n = in.nextInt();
             in.close();
             //التأكد ان عدد التذاكر المحجوزة اقل او يساوي عدد التذاكر الكلي
             if(num_of_ticket<=n)
             {
                 n = n - num_of_ticket;
                 PrintWriter pw = new PrintWriter(f);
                 pw.print(n);
                 pw.flush();
                 pw.close();
             }
             
         } catch (FileNotFoundException ex) {
             Logger.getLogger(RemoveChairThread.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}
