package BtTh;
import  java.util.Scanner;
public class TaiKhoanNganHang {
    private int stk;
    private String chutk;
    private long sodu;
    private String matKhau;
    public Scanner SC;
    public TaiKhoanNganHang(int stk, String chutk, long sodu, String matKhau) {
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
