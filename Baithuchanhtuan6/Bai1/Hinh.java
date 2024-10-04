package Baithuchanhtuan6.Bai1;
import java.util.Scanner;
public class Hinh {
    protected String tenhinh;
    protected Scanner sc;
    public String getTenhinh() {
        return this.tenhinh;
    }
    public void setTenhinh(String tenhinh) {
        this.tenhinh = tenhinh;
    }
    public Hinh() {
        sc = new  Scanner(System.in);
    }
    public Hinh (String tenhinh) {
        this.tenhinh = tenhinh;
        sc=new Scanner(System.in);
    }
    public void nhap() {
        System.out.print("ten hinh: ");
        this.tenhinh = sc.nextLine();
        
    }
    public  void xuat() {
        System.out.println("ten hinh la: " + this.tenhinh);      
    }
}
