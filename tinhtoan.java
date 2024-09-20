import java.util.Scanner;

public class tinhtoan {
    public static void main(String[] args) {
        System.out.println("Hãy nhập thông tin cá nhân của bạn: ");
        System.out.print("Nhập họ và tên: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.print("Nhập tuổi: ");
        int tuoi = new Scanner(System.in).nextInt();
        System.out.print("Nhập chiều cao: ");
        float ccao = new Scanner(System.in).nextFloat();
        System.out.print("Bạn có thích học lập trình không: ");
        String dan = new Scanner(System.in).nextLine();
        System.out.println("Thông tin cá nhân của bạn là: ");
        System.out.println("Họ tên: " +ten);
        System.out.println("Tuổi: " +tuoi);
        System.out.println("Chiều cao: " +ccao);
        System.out.println(dan+ " thích học lập trìnhh !");
    }
}