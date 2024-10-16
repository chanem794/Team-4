package BtTh;
import java.util.Scanner;
public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaiKhoan TK = new TaiKhoan();
        TK.NhapTK();  // Nhập thông tin tài khoản trước khi bắt đầu
        
            System.out.println("BAN CAN GI!!!");
            System.out.println("1. De doi mat khau");
            System.out.println("2. De kiem tra toan bo tai khoan");
            System.out.println("3. De kiem tra so du tai khoan");
            System.out.println("4. De gui tien");
            System.out.println("5. De rut tien");
            System.out.println("6. De ket thuc");
            System.out.print("Ban can gi ?: ");
            
            // Kiểm tra xem người dùng có nhập số không
            if (scanner.hasNextInt()) {
                System.out.println("nhập lựa chọn của bạn");
               int a = scanner.nextInt();  // Chỉ gán giá trị khi người dùng nhập số
                
                // Kiểm tra lựa chọn hợp lệ
                switch (a) {
                    case 1:
                        TK.doiMatKhau();
                        break;
                    case 2:
                        TK.KiemTra();
                        break;
                    case 3:
                        System.out.println("So du tai khoan con: " + TK.getsodu());
                        break;
                    case 4:
                        TK.setsodu();
                        break;
                    case 5:
                        TK.ruttien();
                        break;
                    case 6:
                        System.out.println("Ket thuc chuong trinh.");
                        break;
                    default:
                        System.out.println("Khong hop le, vui long chon lai!");
                        break;
                }
            } 
            else {
                System.out.println("Vui long nhap so hop le!");
                scanner.next(); // Đọc bỏ dữ liệu không phải số
            }
    } 
    
}
    

    

        