/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketreversation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class Ticketing {

    private Cinema c;
    private String userName;
    private String movieName;
    private String showTime;
    private String hall;
    private int numOfTicket;
    private String numOfReverse;

    //ملف رقم الحجز
    File f1;
    //ملف وقت العرض
    File f2;

    public Ticketing(String userName, String movieName, String showTime, String hall, int numOfTicket) {
        this.userName = userName;
        this.movieName = movieName;
        this.showTime = showTime;
        this.hall = hall;
        this.numOfTicket = numOfTicket;
    }

    public Ticketing(String userName, String numOfReverse, File f1, File f2) {
        this.userName = userName;
        this.numOfReverse = numOfReverse;
        this.f1 = f1;
        this.f2 = f2;
    }

    //تابع لعرض الافلام المتاحة
    public void displayAvailableSeats(String hallNum) {
        c = new Cinema(hallNum);
        c.getMovies();
    }

    // تابع لحجز التذاكر 
    public void reserveTicket() {
        AddTicketThread addTicketThread = new AddTicketThread(userName, movieName, showTime, hall, numOfTicket);
        RemoveChairThread removeChairThread = new RemoveChairThread(hall, movieName, showTime, numOfTicket);
        try {
            addTicketThread.start();
            addTicketThread.join();
            removeChairThread.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ticketing.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Ticketing() {
    }
    //تابع لالغاء الحجز

    public void cancelReservation() {
        try {
            RemoveTicketThread removeTicketThread = new RemoveTicketThread(f1);
            AddChairThread addChairThread = new AddChairThread(f2, numOfReverse);
            addChairThread.start();
            addChairThread.join();
            removeTicketThread.start();

        } catch (InterruptedException ex) {
            Logger.getLogger(Ticketing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void displayAccountInfo() {
        PrintWriter pw = null;
        try {
            //Users->userName
            File f = new File("Users\\" + TicketReversation.u.getUsername());
            //قائمة لتخزين حجوزات المستخدم
            List<String> Movies_In_User_Account;
            Movies_In_User_Account = Arrays.asList(f.list());
            //ملف مؤقت لتخزين معلومات الحساب من حجوزات
            File f3 = new File("Account\\account.txt");
            pw = new PrintWriter(new FileWriter(f3, true));
            for (int i = 0; i < Movies_In_User_Account.size() - 1; i++) {
                //Users->user_name->num_of_revrese
                File f4 = new File("Users\\" + TicketReversation.u.getUsername() + "\\" + Movies_In_User_Account.get(i));
                if (f4.length() == 0) {
                    //Do No Thing
                } else {
                    //كتابة رقم الحجز في ملف معلومات الحساب المؤقت على سطر
                    pw.println("Reservation Number : " + Movies_In_User_Account.get(i).replace(".txt", ""));
                    //قراءة معلومات الحجز
                    Scanner in = new Scanner(new FileReader(f4));
                    in.useDelimiter(",");
                    String movie_name = in.next();
                    String Hall = in.next();
                    String show_time = in.next();
                    String seatNumber = in.next();
                    in.close();
                    //كتابة معلومات الحجز على سطر
                    pw.println(movie_name + " In Hall " + Hall + " At " + show_time + " On Seat #" + seatNumber);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Ticketing.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
    }

}
