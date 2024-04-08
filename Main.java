/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanxuong;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        QuanLyDongvat ql = new QuanLyDongvat();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println(" =========================================== ");
            System.out.println("|1.Nhap thong tin                           |");
            System.out.println("|2.Xuat thong tin                           |");
            System.out.println("|3.Sua dong vat theo ma                     |");
            System.out.println("|4.Hien thi thong tin chi tiet cua dong vat |");
            System.out.println("|5.Xoa dong vat theo ma                     |");
            System.out.println("|6.Xoa theo ten                             |");
            System.out.println("|7.Tim kiem theo ten                        |");
            System.out.println("|8.Tim kiem theo ma                         |");
            System.out.println("|9.Xap xep theo ten                         |");
            System.out.println("|10.Tim kiem theo khoang can nang           |");
            System.out.println("|0.Thoat");
            System.out.println(" =========================================== ");
            System.out.println("  Moi ban nhp vao chuc nang");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    ql.Nhap();
                    break;
                case 2:
                    ql.Xuat();
                    break;
                case 3:
                    ql.sua();
                    break;
                case 4:
                    ql.hienThongTinChiTiet();
                    break;
                case 5:
                    ql.xoa();
                    break;
                case 6:
                    ql.xoaTheoTen();
                    break;
                    case 7:
                    ql.timKiemTheoTen();
                    break;
                    case 8:
                    ql.timkiem();
                    break;
                    case 9:
                    ql.xapXepTen();
                    break;
                    case 10:
                    ql.timdvTheoCanNang();
                    break;
                    case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Moi ban chon lai");
            }

        } while (chon != 0);
    }
}
