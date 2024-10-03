package Baithuchanhtuan4;
// 4.	Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó có phải là số nguyên tố hay không..
import java.util.Scanner;

public class Bai4 {
    static Scanner Nhap = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao mot so bat ki: ");
        int a = Nhap.nextInt();
        int i, dem;
        dem = 0;
        for(i=1;i<=a;i++)
            if(a%i==0)
                dem = dem +1;
        if (dem == 2)
            System.out.println("Day la mot so nguyen to.");
        else
            System.out.println("Day khong phai la so nguyen to.");
    }
}

