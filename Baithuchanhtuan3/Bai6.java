package Baithuchanhtuan3;
// 6.	Viết chương trình thực hiện các phép tính cơ bản (cộng, trừ, nhân, chia) dựa trên lựa chọn của người dùng.
//testimport java.util.Scanner;
import java.util.Scanner;
public class Bai6 {
    
    public static void main(String[] args) {
        Scanner Nhap = new Scanner(System.in);
        System.out.println("Nhap vao hai so bat ki: ");
        int a = Nhap.nextInt();
        int b = Nhap.nextInt();
        Chon(a, b, Nhap);
    }

    public static void Chon(int a, int b, Scanner Nhap) {
        while (true) {
            System.out.println("Nhap vao dau ban muon trien khai: \n 1: Cong\n 2: Tru\n 3: Nhan\n 4: Chia\n 5: Thoat\n Hay chon lua chon cua ban");
            int n = Nhap.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Ket qua cua phep tinh la: " + (a + b));
                    break;
                case 2:
                    System.out.println("Ket qua cua phep tinh la: " + (a - b));
                    break;
                case 3:
                    System.out.println("Ket qua cua phep tinh la: " + (a * b));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println("Ket qua cua phep tinh la: " + (a * 1.0 / b) +"\n\n");
                    } else {
                        System.out.println("Loi: Khong the chia cho 0");
                    }
                    break;
                case 5:
                    System.out.println("Tam biet!");
                    return;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
            }
        }
    }
}