package Baithuchanhtuan4;
// 5.	Viết chương trình nhập vào hai số nguyên và tìm UCLN và BCNN của hai số đó.
import java.util.Scanner;

public class Bai5 {
    public static int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao hai so nguyen: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int UCLN = UCLN(a, b);
        int BCNN = BCNN(a, b);
        System.out.println("UCLN cua hai so vua nhap la: " + UCLN);
        System.out.println("BCNN cua hai so vua nhap la: " + BCNN);
    }
}
