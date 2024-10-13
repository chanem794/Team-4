package Baithuchanhtuan7;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        TaiKhoan tk1 = new TaiKhoan();
        Scanner SC = new Scanner(System.in);
        int a;
        System.out.println("Day la lan dau ban dang nhap tai khoan !");
        tk1.NhapTK();
        do {
            System.out.println("Nhap yeu cau thiet: ");
            System.out.println("1. De doi mat khau");
            System.out.println("2. De kiem tra toan bo tai khoan");
            System.out.println("3. De kiem tra so du tai khoan");
            System.out.println("4. De gui tien");
            System.out.println("5. De rut tien");
            System.out.println("6. De ket thuc");
            System.out.println("Ban can gi ?: ");
            a = SC.nextInt();
            switch (a) {
                case 1:
                    tk1.doiMatKhau();
                    break;
                case 2:
                    tk1.KiemTra();
                    break;
                case 3:
                    System.out.println("so du tai khoan con: "+ tk1.getSoDu());
                    break;
                case 4:
                    tk1.setSoDu();
                    break;
                case 5:
                    tk1.ruttien();
                    break;
                case 6:
                    System.out.println("----------------");
                    break;
                default:
                    System.out.println("khong hop le !");
                    break;
            }
        }
        while(a!= 6);
    }
}
