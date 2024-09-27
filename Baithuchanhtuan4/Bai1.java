package Baithuchanhtuan4;
// 1.	Viết chương trình tính tổng các số từ 1 đến n.
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.printf("Vui lòng nhập số n để tính tổng từ 1 đến n: ");
        int n = new Scanner(System.in).nextInt();
        int tong = 0;
        for(int i=1;i<=n; i++)
            tong = tong + i;
        System.out.printf("tổng giá trị từ một đến %d là: %d",n, tong);
    }
}
