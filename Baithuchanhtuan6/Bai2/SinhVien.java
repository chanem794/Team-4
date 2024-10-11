package Baithuchanhtuan6.Bai2;

// 2.	Tạo lớp Sinh viên:
// •	Tạo lớp SinhVien với các thuộc tính: mã sinh viên, tên, ngày sinh, điểm trung bình.
// •	Viết các phương thức nhập thông tin, in thông tin.
// •	Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần.
import java.util.Scanner;

public class SinhVien {
    public  int msv;
    public  String ten;
    public  int nsinh;
    public  float dtb;
    public Scanner SC;
    public void Nhap ()
    {
        System.out.println("Vui lòng nhập mã sinh viên: ");
        SC = new Scanner(System.in);
        this.msv = SC.nextInt();
        System.out.println("Vui lòng nhập tên sinh viên: ");
        SC.nextLine();
        this.ten = SC.nextLine();
        System.out.println("Vui lòng nhập ngày sinh: ");
        this.nsinh = SC.nextInt();
        System.out.println("Vui lòng nhập điểm trung bình: ");
        this.dtb = SC.nextFloat();
    }
    public void In ()
    {
        System.out.println("Họ tên: "+ten);
        System.out.println("Mã sinh viên: "+msv);
        System.out.println("ngày sinh : "+nsinh);
        System.out.println("Điểm trung bình "+dtb);
    }

}