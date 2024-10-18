package TKNganHang;

import java.util.Scanner;
public class Baitap {
    static Scanner Nhap = new Scanner(System.in);
    public String ChuTK;
    public String STK;
    private double SoDu;
    private String MK;
    //Phương thức nhập một tài khoản mới
    public void NhapTK()
    {
        System.out.println("Nhap vao ten chu tai khoan: ");
        this.ChuTK = Nhap.nextLine();
        System.out.println("Nhap vao so tai khoan: ");
        this.STK = Nhap.nextLine();
        System.out.println("Nhap mat khau: ");
        String mkmoi = Nhap.nextLine();
        System.out.println("Nhap lai mat khau them mot lan nua: ");
        String thu = Nhap.nextLine();
        while (mkmoi.equals(thu) == false)
        {
            System.out.println("Mat khau khong dung.\nMoi ban nhap lai: ");
            String mkmoi2 = Nhap.nextLine();
            System.out.println("Nhap lai mat khau them mot lan nua: ");
            String thu2 = Nhap.nextLine();
            if ((mkmoi2.equals(thu2) == true)) {
                break;
            }
        }
        System.out.println("Tai khoan da duoc tao.");
    }
    //Tạo contructures
    public void Taikhoan(String ChuTK, String STK, double SoDu, String MK)
    {
        this.ChuTK = ChuTK;//Gán giá trị của tham số ChuTK cho thuộc tính ChuTK
        this.STK = STK;
        this.SoDu = SoDu;
        this.MK = MK;
    }
    //Kiểm tra lai số dư
    public double KTraDu()
    {
        return SoDu;
    }
    //Phương thức rút tiền trong tài khoản
    public void RTien()
    {
        System.out.println("Ban muon rut bao nhieu tien: ");
        double Rut = Nhap.nextLong();
        if (Rut < this.SoDu) 
            System.out.println("So tien trong tai khoan con lai khong du rut.");
        else
            this.SoDu = this.SoDu - Rut;
            System.out.println("So tien trong tai khoan hien tai la: ");
        KTraDu();
    }
    //Phương thức nạp tiền vào
    public void GTien()
    {
        System.out.println("Ban Muon gui bao nhieu tien: ");
        double Gui = Nhap.nextLong();
        if (Gui > 0)
            this.SoDu = this.SoDu + Gui;
        else 
            System.out.println("So tien khong hop le. ");
        System.out.println("So tien trong tai khoan hien tai la: ");
        KTraDu();
    }
    //Phương thức đổi mật khẩu trong tài khoản
    public void setMK()
    {
        System.out.println("Nhap mat khau ban dau: ");
        String mk = Nhap.nextLine();
        if (mk.equals(this.MK)==true) 
        {
            
            System.out.println("Nhap mat khau moi: ");
            String mkmoi = Nhap.nextLine();
            System.out.println("Nhap lai mat khau them mot lan nua: ");
            String thu = Nhap.nextLine();
            while (mkmoi.equals(thu) == false)
            {
                System.out.println("Mat khau khong dung.\nMoi ban nhap lai: ");
                String mkmoi2 = Nhap.nextLine();
                System.out.println("Nhap lai mat khau them mot lan nua: ");
                String thu2 = Nhap.nextLine();
                if ((mkmoi2.equals(thu2) == true)) {
                    break;
                }
            }
        }
        else 
            System.out.println("Mat khau khong dung. ");
    }
    //Phương thức kiểm tra tài khoản
    public void Check()
    {
        System.out.println("Chu tai khoan hien tai la: " + this.ChuTK);
        System.out.println("So tai khoan la: " +this.STK);
        System.out.println("So tien con du trong tai khoan la: " +this.SoDu);
    }
}
