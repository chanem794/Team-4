package Baithuchanhtuan6.Bai3;

// 3.	Tạo lớp Tài khoản ngân hàng:
// •	Tạo lớp TaiKhoan với các thuộc tính: số tài khoản, chủ tài khoản, số dư.
// •	Viết các phương thức gửi tiền, rút tiền, kiểm tra số dư.


import java.util.Scanner;

public class TaiKhoanNganHang {
    public int stk;
    public String chutk;
    private long sodu;
    public Scanner SC;

    public TaiKhoanNganHang(int stk, String chutk, long sodu) {
        this.stk = stk;
        this.chutk = chutk;
        this.sodu = sodu;
    }

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
}
