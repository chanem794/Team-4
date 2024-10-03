package Baithuchanhtuan4;
// 1.	Viết chương trình tính tổng các số từ 1 đến n.
import java.util.Scanner;
/**
 * bai_1
 */
public class Bai1 {
    static Scanner Nhap = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao mot so: ");
        int n = Nhap.nextInt();
        int S;
        int i;
        S = 0;
        for (i = 1; i <= n; i++)
        {
            S = S + i;
        }
        System.out.println("Tong cac so tu mot den n la: " +S);
    }
}
