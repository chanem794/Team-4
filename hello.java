import java.util.Scanner;

public class hello {
     public static void main(String[] args) {
        System.out.print("Vui lòng nhập tên của bạn: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.printf("Helllo %s", ten);
    }
}