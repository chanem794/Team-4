package Baithuchanhtuan6.Bai2;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = SC.nextInt();
        ArrayList<SinhVien> SV = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.Nhap();
            SV.add(sv);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1) + ":");
            SV.get(i).In();
        }

        for (int i = 1; i < SV.size(); i++) {
            SinhVien key = SV.get(i);
            int j = i - 1;
            while (j >= 0 && SV.get(j).dtb < key.dtb) {
                SV.set(j + 1, SV.get(j));
                j = j - 1;
            }
            SV.set(j + 1, key);
        }

        System.out.println("Sap xep danh sach sinh vien theo diem trung binh giam dan: ");
        for (int i = 0; i < n; i++) {
            SV.get(i).In();
        }
    }
}
