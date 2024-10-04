package Baithuchanhtuan6;

// 2.	Tạo lớp Sinh viên:
// •	Tạo lớp SinhVien với các thuộc tính: mã sinh viên, tên, ngày sinh, điểm trung bình.
// •	Viết các phương thức nhập thông tin, in thông tin.
// •	Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần..
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;


public class SinhVien {
    public int msv;
    public String ten;
    public int nsinh;
    public float dtb;
    public Scanner SC;
    public SinhVien(){}
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
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Nhập số lương sinh viên: ");
        int n = SC.nextInt();
        SinhVien[] SV = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            SV[i] = new SinhVien();
            SV[i].Nhap();
        }
        Arrays.sort(SV, new Comparator<SinhVien>()
        {
            public int compare(SinhVien sv1, SinhVien sv2)
            {
                return Float.compare(sv2.dtb, sv1.dtb);
            }
        });
        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        for (SinhVien sv : SV) {
            sv.In();
            System.out.println("------------------------------");
        }

    }
}



