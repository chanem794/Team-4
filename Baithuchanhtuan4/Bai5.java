package Baithuchanhtuan4;
// 5.	Viết chương trình nhập vào hai số nguyên và tìm UCLN và BCNN của hai số đó.
import java.util.Scanner;

public class Bai5 {
    
    static Scanner Nhap = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao hai so a va b: ");
        int a = Nhap.nextInt();
        int b = Nhap.nextInt();
        float i;
        int a1, b1;
        a1 = a;
        b1 = b;
        while (a1!=b1){
            if(a1>b1)
                a1 = a1-b1;
            else
                b1 = b1-a1;
        }
        System.out.println("Vay uoc chung lon nhat cua a va b la: "+a1);
        for (i = 1; ; i++)
            if((i%a==0)&&(i%b==0))
            {
                System.out.println("Vay boi chung lon nhat cua a va b la: "+i);
                break;
            }
    }
}
