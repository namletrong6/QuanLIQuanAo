/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdsc.buoi4;

/**
 *
 * @author HP
 */
 

import java.util.Scanner;

public abstract class SanPham {
    protected String maSP; 
    protected String loaiSP; 
     protected String tenSP;
   protected String moTa ;
    protected float giaTien; 
    protected int soLuong ;
   protected String size ;
    public SanPham(){
  
   
    
}

    public SanPham(String maSP, String loaiSP, String tenSP, String moTa, float giaTien, int soLuong, String size) {
        this.maSP = maSP;
        this.loaiSP = loaiSP;
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
        this.size = size;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + 
                ", loaiSP=" + loaiSP + 
                ", tenSP=" + tenSP + ", moTa=" + moTa + 
                ", giaTien=" + giaTien +
                ", soLuong=" + soLuong +
                ", size=" + size + '}';
    }
    
    
}
