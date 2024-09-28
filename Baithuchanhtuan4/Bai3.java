package Baithuchanhtuan4;
// 3.	Viết chương trình nhập vào một số nguyên dương và tính giai thừa của số đó.

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.printf("Vui lòng nhập gía trị nguyên dương n: ");
        int n = new Scanner(System.in).nextInt();
        int kq=1;
        //Tính tổng theo vòng lặp for
        for(int i=1; i<=n; i++)
            kq = kq*i;
        /*
        Tính tổng theo vòng lặp while do
        int i= 1
        while (i <= n)
        {
            kq = kq*i;
            i+=1;
        }
         */
        System.out.printf("Tổng gia thừa của số %d là: %d",n,kq);
    }
}