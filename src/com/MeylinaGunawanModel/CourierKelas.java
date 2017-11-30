package com.MeylinaGunawanModel;

public class CourierKelas {
    private int berat;
    private String tujuan;
    private String tipePaket;
    private double hargaPaket;
    private double asuransi;
    private double hargaTipeLayanan;

    public CourierKelas() {
    }

    public CourierKelas(int berat, String tujuan, String tipePaket, double hargaPaket, double asuransi, double hargaTipeLayanan) {
        this.berat = berat;
        this.tujuan = tujuan;
        this.tipePaket = tipePaket;
        this.hargaPaket = hargaPaket;
        this.asuransi = asuransi;
        this.hargaTipeLayanan = hargaTipeLayanan;
    }
    
    

    public int getBerat() {
        return berat;
    }

  
    public void setBerat(int berat) {
        this.berat = berat;
    }

   
    public String getTujuan() {
        return tujuan;
    }

  
    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

   
    public String getTipePaket() {
        return tipePaket;
    }

  
    public void setTipePaket(String tipePaket) {
        this.tipePaket = tipePaket;
    }

  
    public double getHargaPaket() {
        return hargaPaket;
    }

  
    public void setHargaPaket(double hargaPaket) {
        this.hargaPaket = hargaPaket;
    }

   
    public double getAsuransi() {
        return asuransi;
    }

  
    public void setAsuransi(double asuransi) {
        this.asuransi = asuransi;
    }

   
    public double getHargaTipeLayanan() {
        return hargaTipeLayanan;
    }

  
    public void setHargaTipeLayanan(double hargaTipeLayanan) {
        this.hargaTipeLayanan = hargaTipeLayanan;
    }
}
