package BtTh;

import java.util.Scanner;

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
        this.matKhau = matKhau;
    }

    
    public TaiKhoanNganHang() {
    }

    public TaiKhoanNganHang(String chutk, long sodu, int stk) {
        this.chutk = chutk;
        this.sodu = sodu;
        this.stk = stk;
    }

    public long getsodu() {
        return this.sodu;
    }
    public void In() {
        System.out.println("Tên người dùng: " + this.chutk);
        System.out.println("Số tài khoản: " + this.stk);
        System.out.println("Số dư: " + this.sodu);
    }

    private boolean kiemTraMatKhau(String matKhauNhap) {
        return matKhauNhap.equals(this.matKhau);
    }

    public void guiTien(long soTien) {
        System.out.println("Vui lòng nhập mật khẩu:");
        String matKhauNhap = SC.next();
        if (kiemTraMatKhau(matKhauNhap)) {
            if (soTien > 0) {
                this.sodu += soTien;
                System.out.println("Gửi tiền thành công. Số dư mới: " + this.sodu);
            } else {
                System.out.println("Số tiền gửi phải lớn hơn 0.");
            }
        } else {
            System.out.println("Mật khẩu không đúng.");
        }
    }

    public void rutTien(long soTien) {
        System.out.println("Vui lòng nhập mật khẩu:");
        String matKhauNhap = SC.next();
        if (kiemTraMatKhau(matKhauNhap)) {
            if (soTien > 0 && soTien <= this.sodu) {
                this.sodu -= soTien;
                System.out.println("Rút tiền thành công. Số dư mới: " + this.sodu);
            } else {
                System.out.println("Số tiền rút phải lớn hơn 0 và không vượt quá số dư.");
            }
        } else {
            System.out.println("Mật khẩu không đúng.");
        }
    }

    public void kiemTraSoDu() {
        System.out.println("Vui lòng nhập mật khẩu:");
        String matKhauNhap = SC.next();
        if (kiemTraMatKhau(matKhauNhap)) {
            System.out.println("Số dư hiện tại: " + this.sodu);
        } else {
            System.out.println("Mật khẩu không đúng.");
        }
    }

    
}
