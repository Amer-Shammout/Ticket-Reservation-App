/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketreversation;

import java.io.File;

import java.io.FileNotFoundException;

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
public class Movie {

    private static int count;
    private int movie_id;
    private String name;

    private String genre;
    private String hall;
    private List<String> showTimes;

    public Movie(String name, String date, String type, String hall) {
        try {
            File f = new File("ID.txt");
            Scanner in = new Scanner(f);
            count = in.nextInt();
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        } 
        this.showTimes = Arrays.asList(date.split(" "));
        this.hall = hall;
        this.genre = type;
        this.name = name;
        count++;
        this.movie_id = count;
    }

    //تابع لاضافة الافلام ونستفاد منه في صفحة الأدمن
    public void addData() {
        try {
            //مجلد الفيلم
            File f = new File("Cinema\\" + hall + "\\" + name);
            f.mkdir();
            //الملف النصي لمعلومات الفيلم
            File f1 = new File("Cinema\\" + hall + "\\" + name + "\\Info.txt");
            PrintWriter pw = new PrintWriter(f1);
            //كتابة معلومات الفيلم في الملف
            pw.println("ID : " + movie_id);

            pw.println("Genre : " + genre);

            pw.flush();
            pw.close();

            for (String string : showTimes) {
                //ملف نصي ب اسم وقت العرض
                File f2 = new File("Cinema\\" + hall + "\\" + name + "\\" + string + ".txt");
                PrintWriter pw1 = new PrintWriter(f2);
                //طباعة عدد التذاكر في ملف وقت العرض
                pw1.println(100);
                pw1.flush();
                pw1.close();

            }

        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            PrintWriter fw = new PrintWriter("ID.txt");
            //عداد يمثل رقم الحجز
            fw.println(count);
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
