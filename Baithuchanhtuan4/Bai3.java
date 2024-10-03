package Baithuchanhtuan4;
// 3.	Viết chương trình nhập vào một số nguyên dương và tính giai thừa của số đó.

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int so;
        do {
            System.out.print("Nhap vao mot so nguyen duong: ");
            so = scanner.nextInt();
            if (so <= 0) {
                System.out.println("Nhap sai, vui long nhap lai!");
            }
        } while (so <= 0);

        long giaiThua = 1;
        for (int i = 1; i <= so; i++) {
            giaiThua *= i;
        }

        System.out.println("Giai thua cua " + so + " la: " + giaiThua);
    }
}
