// 6.	Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó có phải là số đối xứng hay không (ví dụ: 121, 1331).
package Baithuchanhtuan4;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        System.out.println("Vui lòng nhập một số nguyên: ");
        int n =  new Scanner(System.in).nextInt();
        //khai báo một biến ảo để tính toán
        int kq = n, tog =0 ;
        //tạo một số đảo ngược so với số n vừa nhập
        while(kq != 0)
        {
            int a;
            a = kq % 10;//lấy đơn vị
            tog = tog*10 +a;// lấy đơn vị vừa tìm được + (đơn vị trước đó * 10)
            kq = kq/10; //tách đơn vị vừa tìm được ra khỏi số
        }
        if(tog==n)
            System.out.printf("số %d là một số đối xứng %d !",n);
        else
            System.out.printf("số %d không phải là số đối xứng! ",n);
    }
}
