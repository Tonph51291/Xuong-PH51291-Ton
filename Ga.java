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
public class Ga extends DongVat {

    private String mauLong,giongLoai;
  
    Scanner sc = new Scanner(System.in);

    public Ga() {
    }

   
    public Ga(  String maDV, String tenDV, String noisong, int cangNang, int tuoi,String mauLong, String giongLoai) {
        super(maDV, tenDV, noisong, cangNang, tuoi);
        this.mauLong = mauLong;
        this.giongLoai = giongLoai;
        
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public String getGiongLoai() {
        return giongLoai;
    }

    public void setGiongLoai(String giongLoai) {
        this.giongLoai = giongLoai;
    }

   

 



    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Moi ban nhap mau long ");
        mauLong = sc.nextLine();
        System.out.println("Moi ban nhap vao loai ga");
        giongLoai = sc.nextLine();
                }

    @Override
    public void hienthitt() {
        super.hienthitt();
        System.out.println("Mau long : " +getMauLong());
        System.out.println("Loai ga  : "+getGiongLoai());
    }
    
}
