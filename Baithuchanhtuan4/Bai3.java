package Baithuchanhtuan4;
// 3.	Viết chương trình nhập vào một số nguyên dương và tính giai thừa của số đó.
import java.util.Scanner;

public class Bai3 {
    static Scanner Nhap = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao mot so n: ");
        int a = Nhap.nextInt();
        int i;
        int gith = 1;
        for(i=a;i>=1;i--)
            gith = gith*i;
        System.out.println("Giai thua cua n la: " +gith);
    }
}
