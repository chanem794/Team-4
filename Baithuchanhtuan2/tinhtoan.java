package Baithuchanhtuan2;
import java.util.Scanner;
//4. Tính toán lãi suất ngân hàng:

//· Nhập vào số tiền gửi, lãi suất hàng năm và số tháng gửi.

//· Tính số tiền lãi và số tiền gốc cuối kỳ.

//· In kết quả ra màn hình.
public class tinhtoan {
    public static void main(String[] args) {
        int tong, hieu, tich, du;
        float thuong;
        System.out.println("Nhap hai so nguyen a, b !");
        System.out.print("Nhap a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhap b: ");
        int b = new Scanner(System.in).nextInt();
        tong = a+b;
        hieu = a-b;
        tich = a*b;
        thuong=1.0f*a/b;
        du = a%b;
        System.out.printf("Tong cua hai so nguyen %d va %d la: %d\n",a,b,tong);
        System.out.printf("Tich cua hai so nguyen %d va %d la: %d\n",a,b,tich);
        System.out.printf("Hieu cua hai so nguyen %d va %d la: %d\n",a,b,hieu);
        if(b==0) {
            System.out.printf("Thuong tinh khong dc!!");
        }
        else {
            System.out.printf("Thuong cua hai so nguyen %d va %d la: %.2f\n",a,b,thuong);
            System.out.printf("Du cua hai so nguyen %d va %d la: %d",a,b,du);
        }
    }
}