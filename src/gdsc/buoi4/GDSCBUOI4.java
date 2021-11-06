/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdsc.buoi4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class GDSCBUOI4 {

    /**
     * @param args the command line arguments
     */
    static Scanner nhap = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        QUANLI1 QL = new QUANLI1();

        while (true) {

            System.out.println("1.Bạn là nhà quản lí");
            System.out.println("2.Bạn là khách hàng");
            int chon ;
            System.out.println("mời bạn  chọn 1 trong hai tính năng trên: ");
            chon = nhap.nextInt();  
           nhap.nextLine();
            switch (chon) {
                case 1:
                    System.out.println("--SAU ĐÂY LÀ CHỨC NĂNG CỦA NHÀ QUẢN LÍ----");
                    System.out.println("       A> thêm quần   ");
                    System.out.println("       B> thêm áo     ");
                    System.out.println("       C> sửa quần    ");
                    System.out.println("       D> sửa áo      ");
                    System.out.println("       E> xóa áo       ");
                    System.out.println("       F> xóa quần     ");
                    System.out.println("       G> hiển thi danh sách quần");
                    System.out.println("       H> hiển thị danh sách áo");
                    System.out.println("       I>tìm kiếm quần");
                    System.out.println("       M>tìm kiếm áo");
                    String chon1;
                    System.out.println("mời bạn chọn chức năng 1 trong các chức năng sau đây:");
                    chon1 = nhap.nextLine();
                    switch (chon1) {
                        case "A":
                            QL.nhapQuan();
                            break;
                        case "B":
                            QL.nhapAo();
                            break;
                        case "C":
                            QL.suaQuan();
                            break;
                        case "D":
                            QL.suaAo();
                            break;
                        case "E":
                            QL.xoaAo();
                            break;
                        case "F":
                            QL.xoaQuan();
                            break;
                        case "G":
                            QL.hienThiQuan();
                            break;
                        case "H":
                            QL.hienThiAo();
                            break;
                        case "I":
                            System.out.println("chức năng này hiện đang thử nghiệm xin vui lòng chọn tính năng khác");
                            System.out.println("xin lỗi về sự bất  tiện này");
                            break;
                        case "M":
                            System.out.println("chức năng này hiện đang thử nghiệm xin vui lòng chọn tính năng khác");
                            System.out.println("xin lỗi về sự bất tiện này");
                            break;

                        default:
                            System.out.println("chỉ chọn A B C D E F G H I M");
                    }
                    break;

                case 2:
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("|----xin chào quý khách hàng thân mến, mời bạn chọn các chức năng sau đây----|");
                    System.out.println("-----------------------------------------------------------------------------");
                    while (true) {
                        System.out.println("A>Xem danh sách sản phẩm");
                        System.out.println("B>Tìm kiếm sản phẩm");
                        System.out.println("C>Thêm vào giỏ hàng");
                        System.out.println("D>Thanh toán giỏ hàng");
                        System.out.println(" vui lòng chọn:");
                        String chon3;
                        chon3 = nhap.nextLine();
                        switch (chon3) {
                            case "A":
                                System.out.println("Sâu đây là danh sách Quần");
                                QL.hienThiQuan();
                                System.out.println("-----------------------------------------------------");
                                System.out.println("Sâu đây là danh sách Áo");
                                QL.hienThiAo();
                                break;
                            case "B":
                                System.out.println("tính năng này hiện đang thử nghiệm chưa sẵn sàng dùng");
                                break;

                            default:
                                System.out.println("chỉ chon  1 trong các tính năng A B C D");
                        }

                    }

            }//

        }

    }

}
