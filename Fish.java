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
public class Fish extends DongVat {

    private String loaiCa, tocDoBoi, sanMoi;
    Scanner sc = new Scanner(System.in);

    public Fish() {
    }

    public Fish(String loaiCa, String tocDoBoi) {
        this.loaiCa = loaiCa;
        this.tocDoBoi = tocDoBoi;
    }

    public Fish(String maDV, String tenDV, String noisong, int cangNang, int tuoi, String loaiCa, String tocDoBoi, String sanMoi) {
        super(maDV, tenDV, noisong, cangNang, tuoi);
        this.loaiCa = loaiCa;
        this.tocDoBoi = tocDoBoi;
        this.sanMoi = sanMoi;
    }

    public String getSanMoi() {
        return sanMoi;
    }

    public void setSanMoi(String sanMoi) {
        this.sanMoi = sanMoi;
    }

    public String getLoaiCa() {
        return loaiCa;
    }

    public void setLoaiCa(String loaiCa) {
        this.loaiCa = loaiCa;
    }

    public String getTocDoBoi() {
        return tocDoBoi;
    }

    public void setTocDoBoi(String tocDoBoi) {
        this.tocDoBoi = tocDoBoi;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Moi ban nhap vao loai ca ");
        loaiCa = sc.nextLine();
        System.out.println("Toc do boi cua ca co nhanh khong ");
        tocDoBoi = sc.nextLine();
        System.out.println("Ca co san moi khong ");
        sanMoi = sc.nextLine();

    }

    @Override
    public void hienthitt() {
        super.hienthitt();
        System.out.println("Loai ca             : "+getLoaiCa());
        System.out.println("Toc do boi          : " +getTocDoBoi());
        System.out.println("Ca co san moi khong : " +getSanMoi());
    }
    

}
