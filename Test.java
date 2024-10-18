package TKNganHang;

import java.util.Scanner;
public class Test {
    
    
    static Scanner Nhap = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Tao tai khoan moi: ");
        Baitap TK1 = new Baitap();
        TK1.NhapTK();
        System.out.println("Ban co muon kiem tra tai khoang khong\n1: Co\n2: Khong");
        int a = Nhap.nextInt();
        if (a == 1 ) {
            System.out.println("Ban muon lam gi: ");
            System.out.println("1: Kiem tra so du tai khoan. \n2: Rut tien");
            System.out.println("3: Gui tien: \n4: Doi lai mat khau ");
            System.out.println("5: Kiem tra lai thong tin tai khoan: ");
            int b = Nhap.nextInt();
            switch (b) 
            {
                case 1:
                    System.out.println("so du tai khoan: "+ TK1.KTraDu());
                    break;
                case 2:
                    TK1.RTien();;
                    break;
                case 3:
                    TK1.GTien();
                    break;
                case 4:
                    TK1.setMK();
                    break;
                case 5:
                    TK1.Check();
                    break;
                default:
                    System.out.println("khong hop le !");
                    break;
            }
        }
    }
}
