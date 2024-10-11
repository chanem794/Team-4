package BtTh;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        TaiKhoanNganHang a = new TaiKhoanNganHang();
        int b;
        long kq;
        System.out.println("=====================================");
        System.out.println("QUẢN LÝ TÀI KHOẢN NGÂN HÀNG");
        System.out.println("=====================================");
        System.out.print("Vui lòng nhập số tài khoản: ");
        String soTaiKhoan = SC.next();
        System.out.print("Vui lòng nhập tên người dùng: ");
        String tenNguoiDung = SC.next();
        System.out.print("Vui lòng nhập số tiền cần gửi lần đầu tiên: ");
        long soTienCanGui = SC.nextLong();
        System.out.print("Vui lòng nhập mật khẩu: ");
        String matKhau = SC.next();
        System.out.println("=====================================");
        do
        {
            System.out.println("Vui lòng chọn một trong các tùy chọn sau:");
            System.out.println("1. Kiểm tra toàn bộ tài khoản");
            System.out.println("2. Kiểm tra số dư");
            System.out.println("3. Gửi tiền vào tài khoản");
            System.out.println("4. Rút tiền");
            System.out.println("5. Kết thúc");
            System.out.println("=====================================");
            b = SC.nextInt();
            switch (b)
            {
                case 1:
                    System.out.println("Thông tin tài khoản:");
                    System.out.println("Tên người dùng: " + tenNguoiDung);
                    System.out.println("Số tài khoản: " + soTaiKhoan);
                    System.out.println("Số dư: " + a.getsodu());
                    System.out.println("=====================================");
                    break;
                case 2:
                    System.out.println("Số dư hiện tại: " + a.getsodu());
                    System.out.println("=====================================");
                    break;
                case 3:
                    System.out.print("Vui lòng nhập số tiền muốn gửi: ");
                    System.out.println("=====================================");
                    kq = SC.nextLong();
                    a.guiTien(kq);
                    break;
                case 4:
                    System.out.println("Vui lòng nhập số tiền muốn rút: ");
                    kq = SC.nextLong();
                    a.rutTien(kq);
                    System.out.println("=====================================");
                    break;
                case 5:
                    System.out.println("Đang kết thúc.....");
                    break;
                default:
                    System.out.println("Nhập không đúng! ");
                    break;
            }
        }
        while (b != 5);
    }
}