package Baithuchanhtuan7;
import java.util.Scanner;

public class TaiKhoan {
    private int soTK;
    public String chuTK;
    public long soDu;
    private String MK;
    public Scanner SC;
    public TaiKhoan (){}
    public TaiKhoan (int soTK, String chuTK, Long soDu, String MK)
    {
        this.soTK = soTK;
        this.chuTK = chuTK;
        this.soDu = soDu;
        this.MK = MK;
    }
    public void NhapTK ()
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("Nhap so tai khoan: ");
        this.soTK = SC.nextInt();
        System.out.println("Nhap chu tai khoan: ");
        SC.nextLine();
        this.chuTK = SC.nextLine();
        System.out.println("Nhap so tien muon gui: ");
        this.soDu = SC.nextLong();
        SC.nextLine();
        System.out.println("Tao mat khau: ");
        this.MK = SC.nextLine();
    }
    public long getSoDu() {
        return soDu;
    }
    public void setMK(String MK)
    {
        this.MK = MK;
    }
    public void setSoDu() {
        String mkNhap;
        SC = new Scanner(System.in);
        System.out.println("vui long nhap mat khau: ");
        mkNhap = SC.nextLine();
        if(mkNhap.equals(this.MK)==true) {
            System.out.println("Vui long nhap so tien can gui vao (so tien phai lon hon 0): ");
            long money = SC.nextLong();
            if (money>0) {
                this.soDu = this.soDu + money;
                System.out.println("Rut tien thanh cong!");
            }
            else
                System.out.println("So tien gui khong hop le!");
            }
        else
            System.out.println("Mat khau sai! ");
    }
    public void ruttien()
    {
        String mkNhap;
        SC = new Scanner(System.in);
        System.out.println("vui long nhap mat khau: ");
        mkNhap = SC.nextLine();
        if(mkNhap.equals(this.MK)==true) {
            System.out.println("Vui long nhap so tien can rut vao (so tien phai lon hon 0 va phai be hon so du): ");
            long money = SC.nextLong();
            if (money>0 && money<= this.soDu) {
                this.soDu = this.soDu - money;
                System.out.println("Rut tien thanh cong!");
            }
            else
                System.out.println("So tien rut khong hop le!");
        }
        else
            System.out.println("Mat khau sai! ");
    }
    public void KiemTra ()
    {
        System.out.printf("Tai Khoan %s :\n",this.chuTK);
        System.out.println("So Tai Khoan: "+this.soTK);
        System.out.println("so Du tai khoan hien con: "+this.soDu);
    }
    public void doiMatKhau()
    {
        String mkCu;
        SC = new Scanner(System.in);
        System.out.println("vui long nhap mat khau cu: ");
        mkCu = SC.nextLine();
        if (mkCu.equals(this.MK) == true) {
            System.out.println("nhap mat khau moi: ");
            String mkMoi = SC.nextLine();
            setMK(mkMoi);
            System.out.println("Da doi mat khau thanh cong !");
        } else
            System.out.println("Mat khau ban nhap khong dung!");

    }

}
