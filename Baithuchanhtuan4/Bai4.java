package Baithuchanhtuan4;
// 4.	Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó có phải là số nguyên tố hay không..
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.printf("Vui lòng nhập số nguyên: ");
        int n = new Scanner(System.in).nextInt();
        if (n<=0)//kiểm tra số nhập vào có phải số nguyên dương hay không
            System.out.printf("Số %d không phải là một số nguyên dương nên không thể là một số nguyên tố !", n);
        else
        {
            int kq=0;//kởi tạo biến kết quả
            for(int i=1; i<=n ;i++)
                if(n%i==0)//kiểm tra n có phải số nguyên tố không
                    kq=kq+1;
            if(kq==2)
                System.out.printf("Vậy số %d là số nguyên tố !", n);
            else
                System.out.printf("Vậy số %d không phải là số nguyên tố !", n);
        }

    }
}


