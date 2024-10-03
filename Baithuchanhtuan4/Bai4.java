package Baithuchanhtuan4;
import java.util.Scanner;
// 4.	Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó có phải là số nguyên tố hay không..
public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int so;
        System.out.print("Nhap vao mot so nguyen: ");
        so = scanner.nextInt();

        boolean laSoNguyenTo = true;
        for (int i = 2; i < so; i++) {
            if (so % i == 0) {
                laSoNguyenTo = false;
                break;
            }
        }

        if (laSoNguyenTo) {
            System.out.println(so + " la so nguyen to");
        } else {
            System.out.println(so + " khong la so nguyen to");
        }
    }
}