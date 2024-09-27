//2.	Xếp loại học sinh: Nhập vào điểm trung bình của một học sinh. 
//Sử dụng câu lệnh điều kiện để xếp loại học sinh (Giỏi, Khá, Trung bình, Yếu).//
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.print("Nhap vao diem trung binh cua mot hoc sinh ");
        Scanner sc = new Scanner(System.in);
        Float diem = sc.nextFloat();
        if (diem > 8.0) {
            System.out.println("La hs Gioi");
        } else {
            if (diem > 6.5) {
                System.out.println("La hs Kha");
            } else {
                if (diem > 4) {
                    System.out.println("La hs Trung binh");
                } else {
                    System.out.println("La hs Yeu");
                }
            }
        }
        else
            System.out.println("Số bạn nhập vào không đúng");
    }
}
