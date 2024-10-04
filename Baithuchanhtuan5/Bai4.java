package Baithuchanhtuan5;
// 4.	Viết chương trình để tìm phần tử xuất hiện nhiều nhất trong một mảng.
<<<<<<< HEAD
//khang
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
    //tạo một biến tuần suất để điếm
    public static int TanSuat (int [] ds)
    {
        List<Integer> so = new ArrayList<>();
        List<Integer> lanxh = new ArrayList<>();
        for(int num : ds)
        {
            int gt = so.indexOf(num);
            if (gt == -1)
            {
                so.add(num);
                lanxh.add(1);
            }
            else
                lanxh.set(gt, lanxh.get(gt)+1);
        }
        int soLanxh = 0;
        int soNhieuNhat = -1;
        for (int i=0; i< lanxh.size();i++)
            if (soLanxh < lanxh.get(i))
            {
                soLanxh = lanxh.get(i);
                soNhieuNhat = so.get(i);
            }
        return soNhieuNhat;
    }

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.println("Nhập tổng phần tử danh sách: ");
        int a = SC.nextInt();
        int [] danhsach = new int[a];
        for(int j = 0; j < a; j++)
        {
            System.out.printf("Nhập phần tử thứ %d",j);
            danhsach[j] = SC.nextInt();
        }
        int kq = TanSuat(danhsach);
        System.out.println("Danh sách bạn vừa nhập là: ");
        for (int ds : danhsach)
            System.out.printf("%d ",ds);
        System.out.println("Số nhiều nhất là: "+kq);
    }
}

