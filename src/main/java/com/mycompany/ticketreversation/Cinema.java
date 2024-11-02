/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketreversation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class Cinema {

    private String hall;
    private List<String> Movies_InHall;
    private List<String> Info_For_Each_Movies;
    private String t;

    public Cinema(String hall) {
        this.hall = hall;
    }

    public Cinema() {
    }

    /*
     * نستخدم هذا التابع للعرض على صفحة الهوم حيث
     * يكتب معلومات الافلام الموجودة في قاعة محددة في ملف مؤقت
     * /
     */
    public void getMovies() {

        try {
            // مجلد القاعة
            File f = new File("Cinema\\" + hall);
            // يعيد قائمة باسماءالافلام الموجودة في مجلد القاعة
            Movies_InHall = Arrays.asList(f.list());
            for (int i = 0; i < Movies_InHall.size(); i++) {
                // مجلد الفيلم
                File f1 = new File("Cinema\\" + hall + "\\" + Movies_InHall.get(i));
                // يعيد ملف معلومات الفيلم و اوقات العرض
                Info_For_Each_Movies = Arrays.asList(f1.list());
                // عكس القائمة حتى يكون ملف المعلومات في الانديكس صفر
                Collections.reverse(Info_For_Each_Movies);
                for (int j = 0; j < Info_For_Each_Movies.size(); j++) {
                    // لقراءة نوع الفيلم من الملف
                    if (j == 0) {
                        File f4 = new File(
                                "Cinema\\" + hall + "\\" + Movies_InHall.get(i) + "\\" + Info_For_Each_Movies.get(j));
                        Scanner in1 = new Scanner(f4);

                        in1.nextLine();
                        // نوع الفيلم
                        t = in1.nextLine().substring(7);
                        in1.close();
                    } else {
                        // لكتابة معلومات الافلام الموجودة في القاعة في ملف الهوم المؤقت
                        File f3 = new File("home\\home" + hall + ".txt");
                        PrintWriter pw = new PrintWriter(new FileWriter(f3, true));
                        // الملف النصي لوقت العرض
                        File f4 = new File(
                                "Cinema\\" + hall + "\\" + Movies_InHall.get(i) + "\\" + Info_For_Each_Movies.get(j));
                        Scanner in2 = new Scanner(f4);
                        // عدد تذاكر الفيلم
                        int d = in2.nextInt();
                        // كتابة المعلومات في ملف الهوم المؤقت
                        pw.println(Movies_InHall.get(i) + "                       "
                                + Info_For_Each_Movies.get(j).replace(".txt", "") + "                       " + t
                                + "                       " + d);
                        //
                        pw.flush();
                        pw.close();
                        in2.close();
                    }
                }
            }
        } catch (IOException e) {
            System.out.print(e);
        }

    }

    // نستخدم هذا التابع في الـ تصنيفات
    public void speceficGenre(String genre) {
        // الوصول للملف النصي الخاص بالنوع المحدد من قبل المستخدم
        File file = new File("Categories\\" + genre + ".txt");
        // قائمة الافلام الموجودة في قاعة
        List<String> list;
        // لتخزين نوع الفيلم
        String g;
        for (int i = 1; i <= 3; i++) {
            // الوصول لمجلد القاعة
            File f = new File("Cinema\\" + i);
            list = Arrays.asList(f.list());// افلام القاعة
            for (int j = 0; j < list.size(); j++) {
                try {
                    // الوصول لملف معلومات الفيلم
                    File f1 = new File("Cinema\\" + i + "\\" + list.get(j) + "\\Info.txt");
                    Scanner in = new Scanner(new FileReader(f1));
                    in.nextLine();
                    // قراءة نوع الفيلم من الملف
                    g = in.nextLine().substring(8);
                    PrintWriter pw = new PrintWriter(new FileWriter(file, true));
                    if (g.equals(genre)) {
                        // كتابة افلام النوع المحدد من قبل المستخدم في الملف النصي للنوع
                        pw.println(list.get(j) + "                In Hall                " + i);
                        pw.flush();
                        in.close();
                        pw.close();
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Cinema.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Cinema.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
