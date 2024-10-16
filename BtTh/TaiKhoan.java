package BtTh;

import java.util.Scanner;
//thuong đang chỉnh nè
public class TaiKhoan {
    // định nghĩa thuộc tính
    public int stk; 
    public String chutk;
    private long sodu;
    private String matKhau;
    public Scanner SC;

    // khởi tạo  thuộc tính
    public TaiKhoan() {
        this.SC = new Scanner(System.in); 
    }
    public TaiKhoan(int stk, String chutk, long sodu, String matKhau) {
        this.stk = stk;
        this.chutk = chutk;
        this.sodu = sodu;
        this.matKhau = matKhau;
    }


    public void NhapTK(){
        System.out.println("Nhap so tai khoan");
        this.stk=SC.nextInt();
        System.out.println("Nhap chu tai khoan");
        SC.nextLine();
        this.chutk=SC.nextLine();
        System.out.println("Nhap so du");
        this.sodu=SC.nextLong();
        System.out.println("Nhap mat khau");
        SC.nextLine();//Dòng này được thêm vào để đọc và bỏ qua ký tự newline (dấu xuống dòng) còn lại trong buffer sau khi người dùng nhập số.
        this.matKhau=SC.nextLine();
    }
    public long getsodu() {
        return sodu;
    }


    public void setmatKhau(String matKhau){
        this.matKhau = matKhau;// reset lại mk
    }

    public void setsodu() {
        boolean xacThucMatKhau = false;
        Scanner SC = new Scanner(System.in);
    
        // Lặp lại cho đến khi mật khẩu chính xác
        while (!xacThucMatKhau) {
            System.out.println("Vui long nhap mk:");
            String nhapmk = SC.nextLine();
    
            if (nhapmk.equals(this.matKhau)) {
                xacThucMatKhau = true; // Xác thực thành công
    
                boolean tienHopLe = false;
    
                // Lặp lại cho đến khi nhập số tiền hợp lệ
                while (!tienHopLe) {
                    System.out.println("Nhập số tiền muốn gửi:");
                    long money = SC.nextLong();
    
                    if (money > 0) {
                        this.sodu += money;
                        System.out.println("Gửi tiền thành công");
                        tienHopLe = true; // Số tiền hợp lệ
                    } else {
                        System.out.println("So tien gui khong hop le . Vui long nhap lai.");
                    }
                }
            } else {
                System.out.println("Mat khau khong dung vui long nhap lai.");
            }
        }
    }
    
    public void ruttien() {
        boolean xacThucThanhCong = false;
        while (!xacThucThanhCong) {
            System.out.println("Vui long nhap mat khau:");
            String nhapmk = SC.nextLine();
    
            if (nhapmk.equals(this.matKhau)) {
                xacThucThanhCong = true;  // Mật khẩu đúng, thoát vòng lặp mật khẩu
                
                boolean tienHopLe = false;
                while (!tienHopLe) {
                    System.out.println("Nhap so tien muon rut:");
                    long money = SC.nextLong();
    
                    if (money > 0 && money <= this.sodu) {
                        this.sodu -= money;
                        System.out.println("Rut tien thanh cong");
                        tienHopLe = true;  // Tiền hợp lệ, thoát vòng lặp tiền
                    } else {
                        System.out.println("so tien rut ko hop le, vui long nhap lai");
                    }
                }
            } else {
                System.out.println("Mat khau sai vui long thu lại.");
            }
        }
    }
    
    public void KiemTra ()
    {
        System.out.printf("Ten Tai Khoan %s :\n"+ this.chutk);
        System.out.println("So Tai Khoan: "+this.stk);
        System.out.println("so Du tai khoan hien con: "+this.sodu);
    }
    public void doiMatKhau()
    {
        System.out.println("nhap mk cu");
        String mkcu = SC.nextLine();
        if(mkcu.equals(this.matKhau))
        {
            System.out.println("nhap mk moi cua ban");
            String mkmoi = SC.nextLine();
            setmatKhau( mkmoi);
            System.out.println("cap nhat mk thanh cong");

        }
        else
            System.out.println("cap nhat that bai");

    }
}















   





    