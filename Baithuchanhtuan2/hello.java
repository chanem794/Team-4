package Baithuchanhtuan2;
import java.util.Scanner;
// 1. Viết chương trình nhập vào tên của mình và xuất ra màn hình “Hello + Tên”
public class hello {
     public static void main(String[] args) {
        System.out.print("Vui long nhap ten cua ban: "); //Nhap jj do di
        String ten = new Scanner(System.in).nextLine();
        System.out.printf("Helllo %s", ten);
    }
}