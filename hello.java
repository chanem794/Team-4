import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Vui lòng nhập tên của bạn: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.printf("Hello %s", ten);
    }
}