//2.	Xếp loại học sinh: Nhập vào điểm trung bình của một học sinh. 
//Sử dụng câu lệnh điều kiện để xếp loại học sinh (Giỏi, Khá, Trung bình, Yếu).//
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        String kq;                                                  //Khai báo biến kết quả để kiểm tra học lực
        System.out.printf("Vui lòng nhập điểm của sinh viên: ");    //Nhập điểm của sinh viên
        float check = new Scanner(System.in).nextFloat();           //Khởi Tạo biến điểm
        if(check <= 10)                                             // kiểm tra xem giá trị nhập vào có phải là giá trị đúng hay không
        {
            kq = (10 >= check && check >= 8.5 )? "GIỎI" : (check >= 7.0 ? "KHÁ": (check >= 5.5? "TRUNG BÌNH":(check >= 4.0 ? "YẾU": "RỚT MÔN")));
            System.out.println("Vậy học sinh này đạt điểm " + kq);
        }
        else
            System.out.println("Số bạn nhập vào không đúng");
    }
}
