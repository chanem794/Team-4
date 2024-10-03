package Baithuchanhtuan4;
// 1.	Viết chương trình tính tổng các số từ 1 đến n.
import java.util.Scanner;
//dinh
public class Bai1 {
       public static void main(String[] args) {
           System.out.print("Vui nhap n: ");
           int n = new Scanner(System.in).nextInt();
           int sum = 0;
           for (int i = 1; i <= n; i++) {
               sum += i;
           }
           System.out.println("Tong la: " + sum);
       }
}
