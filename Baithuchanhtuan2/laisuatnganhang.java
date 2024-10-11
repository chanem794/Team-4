package Baithuchanhtuan2;
import java.util.Scanner;
//2. Khai báo các biến với các kiểu dữ liệu khác nhau (int, double, char, boolean) 
//để lưu trữ thông tin cá nhân của mình (tên, tuổi, chiều cao, có thích lập trình không). 
//In ra màn hình các giá trị đã lưu.
public class laisuatnganhang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Tạo đối tượng Scanner duy nhất
        double tong, lai;

        // Nhập thông tin từ người dùng
        System.out.print("Vui long nhap so tien can gui: ");
        double tien = scanner.nextDouble();

        System.out.print("Vui long nhap lai suat (theo %): ");
        double lsuat = scanner.nextDouble();

        System.out.print("Vui long nhap thang: ");
        int thang = scanner.nextInt();

        // Tính toán tiền lãi và tổng tiền cuối kỳ
        lai = tien * (lsuat / 100) * (thang / 12.0);  // Lãi suất tính theo năm, nên số tháng cần chia cho 12
        tong = tien + lai;

        // In kết quả ra màn hình
        System.out.printf("Tien lai sau khi gửi %d thang la: %.2f\n", thang, lai);
        System.out.printf("Tong tien sau khi gửi %d thang la: %.2f\n", thang, tong);
    }
}
