/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdsc.buoi4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ao extends SanPham {

    private float daiTay;
    private float vongEo;
    private float vongNguc;
    private float vongMong;

    public Ao() {

    }

    public Ao(float daiTay, float vongEo, float vongNguc, float vongMong, String maSP, String loaiSP, String tenSP, String moTa, float giaTien, int soLuong, String size) {
        super(maSP, loaiSP, tenSP, moTa, giaTien, soLuong, size);
        this.daiTay = daiTay;
        this.vongEo = vongEo;
        this.vongNguc = vongNguc;
        this.vongMong = vongMong;
    }

    public float getDaiTay() {
        return daiTay;
    }

    public void setDaiTay(float daiTay) {
        this.daiTay = daiTay;
    }

    public float getVongEo() {
        return vongEo;
    }

    public void setVongEo(float vongEo) {
        this.vongEo = vongEo;
    }

    public float getVongNguc() {
        return vongNguc;
    }

    public void setVongNguc(float vongNguc) {
        this.vongNguc = vongNguc;
    }

    public float getVongMong() {
        return vongMong;
    }

    public void setVongMong(float vongMong) {
        this.vongMong = vongMong;
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

        return super.toString()
                + "Ao{" + "daiTay=" + daiTay
                + ", vongEo=" + vongEo
                + ", vongNguc=" + vongNguc
                + ", vongMong=" + vongMong + '}';
    }

}
