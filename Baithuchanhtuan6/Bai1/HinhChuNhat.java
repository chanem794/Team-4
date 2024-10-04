package Baithuchanhtuan6.Bai1;


// 1.	Tạo lớp Hình chữ nhật:
// •	Tạo lớp HinhChuNhat với các thuộc tính: chiều dài, chiều rộng.
// •	Viết các phương thức tính diện tích, chu vi.
// •	Tạo đối tượng và in kết quả ra màn hình..


import java.util.Scanner;
public class HinhChuNhat extends Hinh {
    private double chieuDai;
    private double chieuRong;

    public String getChieuDai() {
        return String.valueOf(this.chieuDai);
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public String getChieuRong() {
        return String.valueOf(this.chieuRong);
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public ChuNhat() {
        super();
    }

    public ChuNhat(String tenhinh, double chieuDai, double chieuRong) {
        super(tenhinh);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi() {
        return 2 * (this.chieuDai + this.chieuRong);
    }

    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    public void nhap() {
        super.nhap();
        System.out.print("Nhap chieu dai: ");
        this.chieuDai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        this.chieuRong = sc.nextDouble();
    }

    public void xuat() {
        super.xuat();
        System.out.println("Chieu dai: " + this.chieuDai);
        System.out.println("Chieu rong: " + this.chieuRong);
    }
}

