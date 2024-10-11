package Baithuchanhtuan6.Bai3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        TaiKhoanNganHang a = new TaiKhoanNganHang();
        int b;
        long kq;
        do
        {
            System.out.println("Vui lòng nhập: ");
            System.out.println("1. để kiểm tra toàn bộ tài khoản ");
            System.out.println("2. để kiểm tra số dư ");
            System.out.println("3. để gửi tiền vào tài khoản");
            System.out.println("4. để rút tiền");
            System.out.println("5. để kết thúc");
            b = SC.nextInt();

            switch (b)
            {
                case 1:
                    a.In();
                    break;
                case 2:
                    System.out.println("Số tiền hiện có của bạn là: "+a.getsodu());
                    break;
                case 3:
                    System.out.println("Nhập số tiền bạn muốn gửi: ");
                    kq = SC.nextLong();
                    System.out.println("Số tiền trong tài khoản bây giờ là là:"+a.guitien(kq));
                    break;
                case 4:
                    System.out.println("nhập số tiền bạn muốn rút: ");
                    kq = SC.nextLong();
                    System.out.println("Số tiền trong tài khoản bây giờ là: "+a.ruttien(kq));
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
