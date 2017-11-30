package com.MeylinaGunawanTanggal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class CourierDataTanggal {
    public static void main(String[] args) throws ParseException{
        Date now = new Date();
        System.out.println("Tanggal : " + now);
        // dd-MM-yyyy, dd MMM yyyy, dd MMMM yyyy, dd/MM/yyyy, dd MMM yyyy HH:mm:ss
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String nowFmt = sdf.format(now);
        System.out.println("Tanggal Format : "+nowFmt);
        Date dob = sdf.parse("15-05-1996");
        System.out.println("Tanggal Lahir : "+dob);
        
        Calendar calNow = Calendar.getInstance();
        calNow.setTime(now);
        Calendar calDob = Calendar.getInstance();
        calDob.setTime(dob);
        int year = calNow.get(Calendar.YEAR) - calDob.get(Calendar.YEAR);
    }
}
