import java.util.Scanner;

public class bai4TH {
    public static void main(String[] args) {
        double tong, lai;
        System.out.print("Vui lòng nhập số tiền cần gửi: ");
        double tien = new Scanner(System.in).nextDouble();
        System.out.print("Vui lòng nhập lãi suất (theo %): ");
        double lsuat = new Scanner(System.in).nextDouble();
        System.out.print("Vui lòng nhập số tháng cần gửi: ");
        int thang = new Scanner(System.in).nextInt();

        lai = tien * (lsuat / 100) * thang;
        tong = tien + lai;

        System.out.printf("Tiền lãi sau %d tháng là: %.2f\n", thang, lai);
        System.out.printf("Tổng tiền sau khi gửi %d tháng là: %.2f\n", thang, tong);
    }
}
