/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ticketreversation;


/**
 *
 * @author dell
 */
public class TicketReversation {
    // لنقل معلومات المستخدم الى باقي الواجهات
    public static User u ;
    
    //لنقل المعلومات التي نحتاجها في عملية الحجز و الغاء الحجز من الواجهة الى كلاس التيكيتنغ
    public static Ticketing t;
    
    
    public static void main(String[] args) throws InterruptedException {
   

        LoginFrame f = new LoginFrame();
        f.setVisible(true);
        f.pack();
        f.setLocationRelativeTo(null); 

}
}
