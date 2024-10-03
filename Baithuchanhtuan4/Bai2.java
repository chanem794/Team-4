package Baithuchanhtuan4;
//2.	Viết chương trình sử dụng vòng lặp để in bảng cửu chương từ 1 đến 10.
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
    int i, j;
    for ( i = 2; i <= 9; i++)
        for(j = 1; j <= 10; j++)
        {
            System.out.println(+i +" x "+j +" = "+(i*j));
        }
    }
}