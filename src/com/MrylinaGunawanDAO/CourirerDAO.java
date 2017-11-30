package com.MrylinaGunawanDAO;

import com.MeylinaGunawanModel.Harga;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourirerDAO {
    public static List<Harga> getHarga(){
        List<Harga> hargaList = new ArrayList<>();
        try{
            
            Scanner scan = new Scanner(new File ("C:/Java/HargaPaket.txt"));
            while (scan.hasNextLine()){
                Harga hargas = new Harga();
                String line = scan.nextLine();
                String[] data = line.split(",");
                
                hargas.setKotaTujuan(data[0]);
                hargas.setReguler(Double.parseDouble(data[1]));
                hargas.setKilat(Double.parseDouble(data[2]));
                hargas.setSds(Double.parseDouble(data[3]));
                hargas.setOns(Double.parseDouble(data[4]));
                hargas.setHds(Double.parseDouble(data[5]));
                
                hargaList.add(hargas);
            }
        }catch(FileNotFoundException ex){
            System.out.println("File tidak ada");
        }
        return hargaList;
    }
}
