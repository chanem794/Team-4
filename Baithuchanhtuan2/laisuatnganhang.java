package Baithuchanhtuan2;
import java.util.Scanner;

public class laisuatnganhang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Tạo đối tượng Scanner duy nhất
        double tong, lai;

        // Nhập thông tin từ người dùng
        System.out.print("Vui lòng nhập số tiền cần gửi: ");
        double tien = scanner.nextDouble();

        System.out.print("Vui lòng nhập lãi suất (theo %): ");
        double lsuat = scanner.nextDouble();

        System.out.print("Vui lòng nhập số tháng cần gửi: ");
        int thang = scanner.nextInt();

        // Tính toán tiền lãi và tổng tiền cuối kỳ
        lai = tien * (lsuat / 100) * (thang / 12.0);  // Lãi suất tính theo năm, nên số tháng cần chia cho 12
        tong = tien + lai;

        // In kết quả ra màn hình
        System.out.printf("Tiền lãi sau %d tháng là: %.2f\n", thang, lai);
        System.out.printf("Tổng tiền sau khi gửi %d tháng là: %.2f\n", thang, tong);
    }
}
