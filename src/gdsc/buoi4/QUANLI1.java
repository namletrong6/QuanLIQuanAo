/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdsc.buoi4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class QUANLI1 {

    List<Quan> quan;
    List<Ao> ao;
    Scanner nhap = new Scanner(System.in);

    public QUANLI1() {
        quan = new ArrayList<>();
        ao = new ArrayList<>();
    }

    // them quan
    public void nhapQuan() {
        System.out.println("nhap ma san pham: ");
        String maSP = nhap.nextLine();
        System.out.println("nhap loai sp:");
        String loaiSP = nhap.nextLine();
        System.out.println("nhap ten SP:");
        String tenSP = nhap.nextLine();
        System.out.println("mo ta :");
        String moTa = nhap.nextLine();
        System.out.println("nhap giá tien:");
        float giaTien = nhap.nextFloat();
        nhap.nextLine();
        System.out.println("so luong sp: ");
        int soLuong = nhap.nextInt();
        nhap.nextLine();
        System.out.println("nhap size:");
        String size = nhap.nextLine();
        System.out.println("nhap rong tui:");
        float rongTui = nhap.nextFloat();
        System.out.println("nhap dai quan :");
        float daiQuan = nhap.nextFloat();
        nhap.nextLine();
        Quan Q = new Quan(maSP, loaiSP, tenSP, moTa, giaTien, soLuong, size, rongTui, daiQuan);
        quan.add(Q);
        System.out.println("them thong tin quan thanh cong");

    }

    // sua quần : 
    public void suaQuan() {
        String maSP;
        System.out.println("nhap ma san pham ban can sua: ");
        maSP = nhap.nextLine();
        Quan Q = null;
        for (Quan x : quan) {
            if (x.getMaSP().equalsIgnoreCase(maSP)) {
                Q = x;
                System.out.println("nhap lai ma san pham can sua: ");
                String maSP1 = nhap.nextLine();
                System.out.println("nhap  lai  can sua loai sp:");
                String loaiSP = nhap.nextLine();
                System.out.println("nhap lai ten SP:");
                String tenSP = nhap.nextLine();
                System.out.println("nhap lai mo ta :");
                String moTa = nhap.nextLine();
                System.out.println("nhap lai giá tien:");
                float giaTien = nhap.nextFloat();
                nhap.nextLine();
                System.out.println("nhap lai so luong sp: ");
                int soLuong = nhap.nextInt();
                nhap.nextLine();
                System.out.println("nhap lai size:");
                String size = nhap.nextLine();
                System.out.println("nhap lai rong tui:");
                float rongTui = nhap.nextFloat();
                System.out.println("nhap  lai dai quan :");
                float daiQuan = nhap.nextFloat();
                nhap.nextLine();
                x.setMaSP(maSP1);
                x.setLoaiSP(loaiSP);
                x.setTenSP(tenSP);
                x.setMoTa(moTa);
                x.setGiaTien(giaTien);
                x.setSize(size);
                x.setSoLuong(soLuong);
                x.setRongTui(rongTui);
                x.setDaiQuan(daiQuan);
                System.out.println("da sua thong tin QUAN thanh cong");

            }

        }

    }

    //xoa quan
    public void xoaQuan() {
        String maSP;
        System.out.println("nhap ma quan ma ban can xoa: ");
        maSP = nhap.nextLine();
        Quan Q = null;
        for (Quan x : quan) {
            if (x.getMaSP().equalsIgnoreCase(maSP)) {
                Q = x; break;
            }
           
        }
        if (Q != null) {
            quan.remove(Q);
            System.out.println("da xoa thanh cong");
        } else {
            System.out.println("xoa khong thanh cong");
        }

    }

    //hien thi quan : 
    public void hienThiQuan() {
        for (Quan x : quan) {
            System.out.println(x.toString());
        }
    }

    //thêm sửa xóa Áo 
    public void nhapAo() {
        System.out.println("nhap ma san pham: ");
        String maSP = nhap.nextLine();
        System.out.println("nhap loai sp:");
        String loaiSP = nhap.nextLine();
        System.out.println("nhap ten SP:");
        String tenSP = nhap.nextLine();
        System.out.println("mo ta :");
        String moTa = nhap.nextLine();
        System.out.println("nhap giá tien:");
        float giaTien = nhap.nextFloat();
        nhap.nextLine();
        System.out.println("so luong sp: ");
        int soLuong = nhap.nextInt();
        nhap.nextLine();
        System.out.println("nhap size:");
        String size = nhap.nextLine();
        System.out.println("nhap dai tay:");
        float daiTay = nhap.nextFloat();
        System.out.println("nhap vong eo :");
        float vongEo = nhap.nextFloat();
        System.out.println("nhap vong nguc :");
        float vongNguc = nhap.nextFloat();
        System.out.println("nhap vong mong :");
        float vongMong = nhap.nextFloat();
        
        nhap.nextLine();
        Ao A = new Ao(daiTay, vongEo, vongNguc, vongMong, maSP, loaiSP, tenSP, moTa, giaTien, soLuong, size);
        ao.add(A);
        System.out.println("nhap them ao thanh cong");
    }

    //sửa áo 
    public void suaAo() {
        String maSP1;
        System.out.println("nhap ma san pham ban can sua: ");
        maSP1 = nhap.nextLine();
        Ao a = null;
        for (Ao x : ao) {
            if (x.getMaSP().equalsIgnoreCase(maSP1)) {
                a = x;
                System.out.println("nhap lai ma san pham can sua: ");
                String maSP = nhap.nextLine();
                System.out.println("nhap  lai  can sua loai sp:");
                String loaiSP = nhap.nextLine();
                System.out.println("nhap lai ten SP can sua:");
                String tenSP = nhap.nextLine();
                System.out.println("nhap lai mo ta can sua :");
                String moTa = nhap.nextLine();
                System.out.println("nhap lai giá tien can sua:");
                float giaTien = nhap.nextFloat();
                nhap.nextLine();
                System.out.println("nhap lai so luong sp can sua: ");
                int soLuong = nhap.nextInt();
                nhap.nextLine();
                System.out.println("nhap lai size can sua:");
                String size = nhap.nextLine();
                System.out.println("nhap  lai dai tay can sua:");
                float daiTay = nhap.nextFloat();
                System.out.println("nhap lai vong eo  can sua:");
                float vongEo = nhap.nextFloat();
                System.out.println("nhap lai vong nguc can sua :");
                float vongNguc = nhap.nextFloat();
                System.out.println("nhap lai vong mong can sua :");
                float vongMong = nhap.nextFloat();  nhap.nextLine();
                x.setDaiTay(daiTay);
                x.setGiaTien(giaTien);
                x.setLoaiSP(loaiSP);
                x.setMaSP(maSP);
                x.setMoTa(moTa);
                x.setNhap(nhap);
                x.setSize(size);
                x.setSoLuong(soLuong);
                x.setTenSP(tenSP);
                x.setVongEo(vongEo);
                x.setVongMong(vongMong);
                x.setVongNguc(vongNguc);
                System.out.println("bạn đã sửa thông tin thành công");
            }
        }

    }
 
    public void xoaAo() {
        String maSP;
        System.out.println("nhap ma quan ma ban can xoa: ");
        maSP = nhap.nextLine();
        Ao Q = null;
        for (Ao x : ao) {
            if (x.getMaSP().equalsIgnoreCase(maSP)) {
                Q = x;     break;
            }
       
        }
        if (Q != null) {
            quan.remove(Q);
            System.out.println("da xoa thanh cong ao");
        } else {
            System.out.println("xoa khong thanh cong ao");
        }

    }
    public void hienThiAo(){
         for (Ao x : ao) {
            System.out.println(x.toString());
        }
    }
    /* chức năng tìm kiếm đang bị lỗi
    public void  timKiemQuan(){
        String maSP; 
        float gia ; 
        String tenSP;
        while(true){
         System.out.println("1: tìm kiem theo ma sp");
        System.out.println("2: tim kiem theo gia san pham");
        System.out.println("3. tim kiem thoe ten san pham");
        System.out.println("moi ban chon");
        int chon4 ; 
       chon4= nhap.nextInt();
        switch(chon4){
            case 1: 
                System.out.println("moi ban nhap ma sp can tim kiem");
                maSP=nhap.nextLine();
                Quan Q=null ;
                for(Quan x: quan ){
            if(x.getMaSP().equalsIgnoreCase(maSP))
            {
                Q=x;
                System.out.println(Q.toString());
               
            }
             
        }
          
            break ;
              case 2: 
                System.out.println("moi ban nhap ten sp tim kiem");
                tenSP=nhap.nextLine();
                Quan Q1=null ;
                for(Quan x: quan ){
            if(x.getTenSP().equalsIgnoreCase(tenSP))
            {
                Q1=x;
                System.out.println(Q1.toString());
               
            }
             
        }
            if(Q1!=null){
               Q1.toString();
            }
            else{
                System.out.println("khong tim thay thong tin");
            }
            break ;
              case 3: 
                System.out.println("moi ban nhap ma sp can tim kiem");
                gia=nhap.nextFloat();
                Quan Q2=null ;
               for(int i =0 ; i<ao.size();i++){
                  if(gia==ao.get(i).getGiaTien())
                  {   
                     i.toString();
                      
              }
             
        }
            
                
                
        }
        
        
        
        
        
        }
      
        
        
       
        
    }   */
    

}
