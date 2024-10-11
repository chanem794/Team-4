package Baithuchanhtuan6.Bai2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Nhập số lương sinh viên: ");
        int n = SC.nextInt();

        SinhVien [] SV = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            SV[i] = new SinhVien();
            SV[i].Nhap();
        }
        for(int i=0; i<n-1;i++)
            for(int j=1;j<n;j++)
                if (SV[i].dtb < SV[j].dtb)
                {
                    SinhVien Tg = new SinhVien();
                    Tg = SV[j];
                    SV[j] = SV[i];
                    SV[i]= Tg;
                }
        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        for (SinhVien sv : SV) {
            sv.In();
            System.out.println("------------------------------");
        }
    }
}
