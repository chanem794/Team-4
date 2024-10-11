package Baithuchanhtuan3;
// 1.	Viết chương trình kiểm tra số âm, dương hoặc bằng 0.
//KIEMTRA
import java.util.Scanner;

public class Bai1 {
        public static void main(String[] args) {
            System.out.printf("Vui long nhap so: "); //Nhập số
            int check = new Scanner(System.in).nextInt();
            if(check > 0 )// check
                System.out.println("Day la so duong ! ");
            else if (check < 0)
                System.out.println("Day la so am ! ");
            else
                System.out.println("Day la so 0 ! ");
        }
}
