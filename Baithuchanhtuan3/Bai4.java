package Baithuchanhtuan3;
// 4.	Viết chương trình tìm số nhỏ nhất trong ba số a,b,c được nhập từ bàn phím.
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.printf("Vui long nhap 3 so a, b, c: ");
        int a = new Scanner(System.in).nextInt(); //khởi tạo và nhập 3 biến để kiểm tra
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        if(a>b)//kiểm tra theo dạng câu lệnh if else
            if(b>c)
                System.out.printf("Vay so co gia tri nho nhat la so %d", c);
            else
                System.out.printf("Vay so co gia tri nho nhat la so %d", b);
        else
        if(a<c)
            System.out.printf("Vay so co gia tri nho nhat la so %d", a);
        else
            System.out.printf("Vay so co gia tri nho nhat la so %d", c);
    }
}

