import java.util.Scanner;

public class tinhtoan {
    public static void main(String[] args) {
        int tong, hieu, tich, du;
        float thuong;
        System.out.println("Nhập hai số nguyên a và b !");
        System.out.print("Nhập a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập b: ");
        int b = new Scanner(System.in).nextInt();
        tong = a+b;
        hieu = a-b;
        tich = a*b;
        thuong=1.0f*a/b;
        du = a%b;
        System.out.printf("Tổng của hai số nguyên %d và %d là: %d\n",a,b,tong);
        System.out.printf("Tích của hai số nguyên %d và %d là: %d\n",a,b,tich);
        System.out.printf("Hiệu của hai số nguyên %d và %d là: %d\n",a,b,hieu);
        if(b==0) {
            System.out.printf("Thuong tinh khong dc!!");
        }
        else {
            System.out.printf("Thương của hai số nguyên %d và %d là: %.2f\n",a,b,thuong);
            System.out.printf("Phần dư khi %d chia %d là: %d",a,b,du);
        }
    }
}