package Baithuchanhtuan4;
//2.	Viết chương trình sử dụng vòng lặp để in bảng cửu chương từ 1 đến 10.
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.printf("Bạn muốn in cửu chương số mấy: ");
        int a = new Scanner(System.in).nextInt();
        if(a>1 && a< 10)
            for(int i=1; i<=10;i++)
                System.out.printf("%d * %d = %d\n",a,i,a*i);
        else
            System.out.println("không có cửu chương "+a);
    }
}

