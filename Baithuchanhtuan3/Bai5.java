package Baithuchanhtuan3;
// 5.	Viết chương trình kiểm tra xem ba cạnh nhập vào có tạo thành một tam giác hay không. 
// Nếu có, xác định loại tam giác (đều, cân, vuông, thường).
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        System.out.println("vui long nhap 3 canh cua mot tam giac: ");
        System.out.println("nhap a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("nhap b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("nhap c: ");
        int c = new Scanner(System.in).nextInt();
        //KIểm tra các cạnh của một tam giác
        if (a+b>c && a+c>b && b+c>a)
        {
            System.out.println("day la 3 canh cua mot tam giac !");
            //Kiểm tra đó là tam gì nếu 3 cạnh đó là tam giác
            if (a==b && b==c) // 3 cạnh bằng nhau
                System.out.println("Day la tam giac deu");
            else if (a==b || a==c || b==c)//hai cạnh bằng nhau
                System.out.println("Day la tam gia can");
            else if ((a*a == b*b+c*c) || (b*b == a*a+c*c) || (c*c == a*a+b*b)) // bình phương cạnh huyền bằng bình phương hai cạnh góc vuông
                System.out.println("Day laf tam giac vuong");
            else
                System.out.println("Day laf tam giac thuong");
        }
        else
            System.out.println("day khong phai la 3 canh cua mot tam giac !");
    }
}
