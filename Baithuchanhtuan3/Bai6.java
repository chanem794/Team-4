package Baithuchanhtuan3;
// 6.	Viết chương trình thực hiện các phép tính cơ bản (cộng, trừ, nhân, chia) dựa trên lựa chọn của người dùng.
//testimport java.util.Scanner;

public class bai6 {
    static Scanner Nhap = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Nhap vao hai so bat ki: ");
        int a = Nhap.nextInt();
        int b = Nhap.nextInt();
        bai6.Chon(a, b);
    }
    public static void Chon(int a, int b)
    {
        System.out.println("Nhap vao dau ban muon trien khai: \n 1: Cong\n 2: Tru\n 3: Nhan\n 4: Chia\n Hay chon lua chon cua ban");
        int n = Nhap.nextInt();
        switch (n) 
        {
            case 1:
                System.out.println("Ket qua cua phep tinh la: " + (a+b));
                break;
            case 2:
                System.out.println("Ket qua cua phep tinh la: " + (a-b));
                break;
            case 3:
                System.out.println("Ket qua cua phe4p tinh la: " + (a*b));
                break;
            case 4:
                System.out.println("Ket qua cua phep tinh la: " + (a*1.0/b));
                break;
        }
    }
}