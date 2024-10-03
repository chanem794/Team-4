package Baithuchanhtuan4;
//2.	Viết chương trình sử dụng vòng lặp để in bảng cửu chương từ 1 đến 10.
public class Bai2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Bảng cửu chương của " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
