import java.util.Scanner;

public class bai2TH {
    public static void main(String[] args) {
        System.out.println("Hãy nhập thông tin cá nhân của bạn: ");
        System.out.println("Nhập họ và tên: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("Nhập tuổi: ");
        int tuoi = new Scanner(System.in).nextInt();
        System.out.println("Nhập chiều cao: ");
        float ccao = new Scanner(System.in).nextFloat();
        System.out.println("Bạn có thích học lập trình không: ");
        String dan = new Scanner(System.in).nextLine();
        System.out.println("Thông tin cá nhân của bạn là: ");
        System.out.println("Họ tên: " +ten);
        System.out.println("Tuổi: " +tuoi);
        System.out.println("Chiều cao: " +ccao);
        System.out.println(" có thích học lập trình !" +dan);
    }
}
