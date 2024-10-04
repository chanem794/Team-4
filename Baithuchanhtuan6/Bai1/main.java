package Baithuchanhtuan6.Bai1;
public class main {
    public static void main(String[] args) {
        HinhChuNhat cn = new HinhChuNhat();
        cn.nhap();
        cn.xuat();
        System.out.println("Chu vi: " + cn.tinhChuVi());
        System.out.println("Diện tích: " + cn.tinhDienTich());
        System.out.println("\n");
    }
}
