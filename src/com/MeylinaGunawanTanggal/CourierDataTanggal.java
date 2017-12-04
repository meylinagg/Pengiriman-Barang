package com.MeylinaGunawanTanggal;

import com.toedter.calendar.JDateChooser;
import java.util.Date;

public class CourierDataTanggal{
    
    public void waktu()
    (
        Date date = new Date();
        JDateChooser.setDate(date);
    
    }






//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//public class CourierDataTanggal {
//    public static void main(String[] args) throws ParseException{
//        Date now = new Date();
//        System.out.println("Tanggal : " + now);
//        // dd-MM-yyyy, dd MMM yyyy, dd MMMM yyyy, dd/MM/yyyy, dd MMM yyyy HH:mm:ss
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//        String nowFmt = sdf.format(now);
//        System.out.println("Tanggal Format : "+nowFmt);
//        
//        Calendar calNow = Calendar.getInstance();
//        calNow.setTime(now);
//    }
//}
