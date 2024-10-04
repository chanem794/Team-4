package Baithuchanhtuan6;

// 3.	Tạo lớp Tài khoản ngân hàng:
// •	Tạo lớp TaiKhoan với các thuộc tính: số tài khoản, chủ tài khoản, số dư.
// •	Viết các phương thức gửi tiền, rút tiền, kiểm tra số dư.

import java.util.Scanner;

public class TaiKhoanNganHang {
    public int stk;
    public String chutk;
    public long sodu;
    public Scanner SC;

    public long getsodu() {
        return sodu;
    }

    public long guitien(long tien) {
        return this.sodu += tien;
    }
    public long ruttien(long tien) {
        return this.sodu -= tien;
    }


    public TaiKhoanNganHang() {
        SC = new Scanner(System.in);
        System.out.println("vui lòng nhập số tài khoản: ");
        this.stk = SC.nextInt();
        System.out.println("Vui lòng nhập tên người dùng: ");
        SC.nextLine();
        this.chutk = SC.nextLine();
        System.out.println("Vui lòng nhập số tiền cần gửi lần đầu tiên: ");
        this.sodu = SC.nextLong();
    }

    public void In() {
        System.out.println("Tên người dùng: " + this.chutk);
        System.out.println("Số tài khoản: " + this.stk);
        System.out.println("Số dư: " + this.sodu);
    }

    public static void main(String[] args) {//chinh sua
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
