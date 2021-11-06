/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdsc.buoi4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Quan extends SanPham {

    private float rongTui;
    private float daiQuan;

    public Quan() {

    }
    Scanner nhap = new Scanner(System.in);

    public Quan(String maSP, String loaiSP, String tenSP, String moTa, float giaTien, int soLuong, String size, float rongTui, float daiQuan) {
        super(maSP, loaiSP, tenSP, moTa, giaTien, soLuong, size);
        this.rongTui = rongTui;
        this.daiQuan = daiQuan;
    }

    public float getRongTui() {
        return rongTui;
    }

    public void setRongTui(float rongTui) {
        this.rongTui = rongTui;
    }

    public float getDaiQuan() {
        return daiQuan;
    }

    public void setDaiQuan(float daiQuan) {
        this.daiQuan = daiQuan;
    }

    public Scanner getNhap() {
        return nhap;
    }

    public void setNhap(Scanner nhap) {
        this.nhap = nhap;
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
    ArrayList<Quan> quan = new ArrayList<>();

    @Override
    public String toString() {
        return super.toString()
                + "Quan{" + "rongTui=" + rongTui + ", daiQuan=" + daiQuan
                + '}';
    }

}
