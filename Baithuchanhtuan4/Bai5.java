package Baithuchanhtuan4;
// 5.	Viết chương trình nhập vào hai số nguyên và tìm UCLN và BCNN của hai số đó.
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        System.out.println("Vui lòng nhập hai số a và b để tìm ước chung lớn nhất và bội chung nhỏ nhất: ");
        System.out.printf("Nhập a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.printf("Nhập b: ");
        int b = new Scanner(System.in).nextInt();
        //khởi tạo biến ảo để tính toán
        int c = a, d = b;

        /* kiểm tra ước chung lớn nhất bằng phương pháp trừ dần
        while(c!=d)
            if (c>d)
                c=c-d;
            else
                d=d-c;
                */
        //kiểm tra ước chung lớn nhất bằng phương pháp ơ-clit
        while(c%d!=0)
        {
            int r= c%d;
            c=d;
            d=r;
        }
        System.out.printf("Vậy ước chung nhỏ nhất của %d và %d là %d",a,b,d);
    }
}
