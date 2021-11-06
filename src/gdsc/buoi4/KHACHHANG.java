/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdsc.buoi4;

public class KHACHHANG {
    
     public  String hoTen ; 
    public String SDT ; 
    public String diaChi ;
    public String email ;
    
    public KHACHHANG(){}

    public KHACHHANG(String hoTen, String SDT, String diaChi, String email, String gioHang) {
        this.hoTen = hoTen;
        this.SDT = SDT;
        this.diaChi = diaChi;
        this.email = email;
      //  this.gioHang = gioHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 

    @Override
    public String toString() {
        return "KhachHang{" + "hoTen=" + hoTen + ", SDT=" + SDT + ", diaChi=" + diaChi + ", email=" + email + '}';
    }
    
    
            
    


}
