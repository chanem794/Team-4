package Baithuchanhtuan3;
// 3.	Viết chương trình giải phương trình bậc 2.

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập giá trị a, b, c
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();
        
        // Tính delta (b^2 - 4ac)
        double delta = b * b - 4 * a * c;

        // Xử lý trường hợp khác nhau cua delta
        if (delta > 0) {
            // Hai nghiệm phân biệt
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            // Một nghiệm kép
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep: x = " + x);
        } else {
            // Vô nghiệm
            System.out.println("Phuong trinh vo nghiem.");
        }
    }
}
