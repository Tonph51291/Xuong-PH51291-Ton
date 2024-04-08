/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanxuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLyDongvat {

    ArrayList<DongVat> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void Nhap() {
        System.out.println("So luong con vat ban mon nhap la : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Moi ban nhap thong tinc on vat thu " + (i + 1));
            System.out.println("1-Brid  2-Fish     3-Dog     4-Cat  5-Chicken");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    Brid chim = new Brid();
                    chim.nhap();
                    list.add(chim);
                    break;

                case 2:
                    Fish ca = new Fish();
                    ca.nhap();
                    list.add(ca);
                    break;
                case 3:
                    Dog dg = new Dog();
                    dg.nhap();
                    list.add(dg);
                    break;

                case 4:
                    Dog gs = new Dog();
                    gs.nhap();
                    list.add(gs);
                    break;
                case 5:
                    Ga gc = new Ga();
                    gc.nhap();
                    list.add(gc);
                    break;
                default:
                    throw new AssertionError();
            }

        }
    }
   

    public void Xuat() {
       System.out.printf("%-20s %-20s %-20s %-20s \n", "MaDongvat", "Ten" , "CanNang" , "Tuoi");
        for (DongVat ttem : list){
            ttem.xuat();
        }
    }
     public void sua() {
        System.out.println("Moi ban nhap vao ma dong vat muon sua : ");
        String ma = new Scanner(System.in).nextLine();
        for (DongVat item : list) {
            if(item.getMaDV().equalsIgnoreCase(ma))
            {
                item.nhap();
            }
        }
         
    }
     public void hienThongTinChiTiet () {
          System.out.println("Moi ban nhap vao ma dong vat de hien thong tin chi tiet :  ");
         String ma = new Scanner(System.in).nextLine();
         for (DongVat item : list ) {
             if (item.getMaDV().equalsIgnoreCase(ma)) {
                 item.hienthitt();
                 System.out.println("");
                 break;
             }
         }
     }
     public void xoa () {
         System.out.println("Moi ban nhap vao ma dong vat muon xoa ");
         String ma = new Scanner(System.in).nextLine();
         for (DongVat item : list ) {
             if (item.getMaDV().equalsIgnoreCase(ma)) {
                 list.remove(item);
                 break;
             }
         }
         Xuat();
     }
     public void xoaTheoTen () {
         System.out.println("Moi ban nhap vao ten dong vat muon xoa ");
         String ten = new Scanner(System.in).nextLine();
         for (DongVat item : list ) {
             if (item.getMaDV().equalsIgnoreCase(ten)) {
                 list.remove(item);
                 break;
             }
         }
         Xuat();
     }
     public void timKiemTheoTen () {
          System.out.println("Moi ban nhap vao ten dong vat muon tim ");
         String ten = new Scanner(System.in).nextLine();
         for (DongVat item : list ) {
             if (item.getMaDV().equalsIgnoreCase(ten)) {
                  System.out.printf("%-20s %-20s %-20s %-20s \n", "MaDongvat", "Ten" , "CanNang" , "Tuoi");
                 item.xuat();
                 break;
             }
         }
     }
     public void timkiem () {
         System.out.println("Moi ban nhap vao ma dong vat muon tim kiem : ");
          String ma = new Scanner(System.in).nextLine();
          
         for (DongVat item : list ) {
             list.indexOf(ma);
             if (item.getMaDV().equalsIgnoreCase(ma)) {
                  System.out.printf("%-20s %-20s %-20s %-20s \n", "MaDongvat", "Ten" , "CanNang" , "Tuoi");
                 item.xuat();
                 break;
             }
         }
     }

    public void xapXepTen() {
        Comparator<DongVat> comp = new Comparator<DongVat>() {
            @Override
            public int compare(DongVat o1, DongVat o2) {
                return o1.getTenDV().compareTo(o2.getTenDV());
            }
        };
        Collections.sort(list, comp);
        Xuat();
    }
    public void timdvTheoCanNang () {
        System.out.print("Moi ban nhap khoang can nang toi thieu : ");
        int tt = new Scanner(System.in).nextInt(); 
        System.out.print("Moi ban nhap khoang can nang toi da : ");
        int td = new Scanner(System.in).nextInt(); 
        for (DongVat item : list ) {
            if (item.getCangNang() > tt && item.getCangNang() < td) {
                 System.out.printf("%-20s %-20s %-20s %-20s \n", "MaDongvat", "Ten" , "CanNang" , "Tuoi");
                item.xuat();
                break;
            }
        }
     }
}
