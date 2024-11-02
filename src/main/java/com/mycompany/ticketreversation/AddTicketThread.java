/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketreversation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AddTicketThread extends  Thread{
    private int num_of_reverse  ;//read number and ++it
    private String movie_name;
    private  String date;
    private String hall;
    private int num_of_ticket;
    private String user;
    private static int count;
    private Ticket t;
    public AddTicketThread(String user,String name,String date,String hall,int num){
        //ملف ارقام الحجز
         File f = new File("ReverseTicket.txt"); 
        try {
           
            Scanner in = new Scanner(f);
            count = in.nextInt();
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        } 

        this.hall=hall;
        this.date=date;
        this.num_of_ticket=num;
        this.movie_name=name;
        this.user=user;

    }
    @Override
    public void run(){
        //اضافة الحجوزات الى حساب المستخدم
        try{
            for (int i = 0; i < num_of_ticket; i++) {      
            this.num_of_reverse = count;
            count++;
            File f=new File("Users\\"+user+"\\"+num_of_reverse+".txt");
             f.createNewFile();
        
            PrintWriter pw=new PrintWriter(new FileWriter(f, true));
            
            t = new Ticket();
            //توليد رقم الكرسي
            int seatNum = t.generateSeatNumber();
            
            pw.println(movie_name+","+hall+","+date+","+seatNum+",");
            
            pw.println(Ticket.ticketPrice*num_of_ticket);
            

            pw.flush();
            pw.close();
            //كتابة رقم الحجز الجديد في ملف أرقام الحجز
            File f1 = new File("ReverseTicket.txt"); 
            PrintWriter p = new PrintWriter(f1);
            p.print(count);
            p.flush();
            p.close();
        }
            
        }
        catch (IOException e){
            System.out.print("dsnv");
        }
    }
    
    
}
