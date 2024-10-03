package Baithuchanhtuan4;
// 6.	Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó có phải là số đối xứng hay không (ví dụ: 121, 1331).
import java.util.Scanner;
public class Bai6 {
    public static boolean laSoDoiXung(int so) {
        int cuoi = so;
        int dau = 0;

        while (so > 0) {
            int chuSo = so % 10;
            dau = dau * 10 + chuSo;
            so /= 10;
        }

        return cuoi == dau;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int so = scanner.nextInt();

        if (laSoDoiXung(so)) {
            System.out.println(so + " là số đối xứng.");
        } else {
            System.out.println(so + " không phải là số đối xứng.");
        }
    }
}