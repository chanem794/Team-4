package Baithuchanhtuan6.Bai2;
import java.util.Scanner;
// 2.	Tạo lớp Sinh viên:
// •	Tạo lớp SinhVien với các thuộc tính: mã sinh viên, tên, ngày sinh, điểm trung bình.
// •	Viết các phương thức nhập thông tin, in thông tin.
// •	Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần.
public class SinhVien {
    public int msv;
    public String ten;
    public int nsinh;
    public float dtb;
    public Scanner SC;

    public SinhVien() {}

    public void Nhap() {
        System.out.print("Nhap ma sinh vien: ");
        SC = new Scanner(System.in);
        this.msv = SC.nextInt();
        System.out.print("Nhap ho ten: ");
        SC.nextLine();
        this.ten = SC.nextLine();
        System.out.print("Nhap ngay sinh: ");
        this.nsinh = SC.nextInt();
        System.out.print("Nhap diem trung binh: ");
        this.dtb = SC.nextFloat();
        System.out.println("------------------");
    }

    public void In() {
        System.out.println("Ho ten: " + ten);
        System.out.println("ma sinh vien: " + msv);
        System.out.println("ngay sinh : " + nsinh);
        System.out.println("diem trung binh: " + dtb);
        System.out.println("----------------------------------");
    }
}
