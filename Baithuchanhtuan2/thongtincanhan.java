package Baithuchanhtuan2;
import java.util.Scanner;
//3. Nhập vào hai số nguyên từ bàn phím. Tính tổng, hiệu, tích, thương và phần dư của hai số đó. In kết quả ra màn hình
public class thongtincanhan {
    public static void main(String[] args) {
        System.out.println("Hay nhap thong tin ca nhan cua ban: ");
        System.out.print("Nhập họ ten: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.print("Nhap tuoi: ");
        int tuoi = new Scanner(System.in).nextInt();
        System.out.print("Nhap chieu cao: ");
        float ccao = new Scanner(System.in).nextFloat();
        System.out.print("Ban co thich hoc lap trình: ");
        String dan = new Scanner(System.in).nextLine();
        System.out.println("Thong tin ban nhap: ");
        System.out.println("Ho ten: " +ten);
        System.out.println("Tuoi: " +tuoi);
        System.out.println("Chieu cao: " +ccao);
        System.out.println(dan+ " thich hoc lap trinhh !");
    }   
}
