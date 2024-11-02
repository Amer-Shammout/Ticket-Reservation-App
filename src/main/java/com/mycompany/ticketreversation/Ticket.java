/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketreversation;

import java.util.Random;

/**
 *
 * @author dell
 */
public class Ticket {
     private  int seatNumber;
        private  String showTime;
        public static  int ticketPrice = 5000;

    public Ticket() {
    }

        public Ticket(int seatNumber, String showTime) {
            this.seatNumber = seatNumber;
            this.showTime = showTime;
            
        }
        //توليد رقم الكرسي
        public int generateSeatNumber(){
            Random r = new Random();
            seatNumber = r.nextInt(100);
            return seatNumber;
        }
        public int getSeatNumber() {
            return seatNumber;
        }

        public String getShowTime() {
            return showTime;
        }

        public int getTicketPrice() {
            return ticketPrice;
        }
        
        
    }

