package Baithuchanhtuan5;
//7.	Tạo một lớp Student với các thuộc tính: mã sinh viên, tên, điểm trung bình.
//Viết Thực hiện các chức năng: thêm sinh viên, xóa sinh viên, tìm kiếm sinh viên theo mã, sắp xếp sinh viên theo điểm.


import Baithuchanhtuan6.Bai2.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai7 {
    public static class Student
    {
        public String maSinhVien;
        public String ten;
        public double diemTrungBinh;
        public Scanner SC = new Scanner(System.in);
        public Student(){};
        public Student(String maSinhVien, String ten, double diemTrungBinh)
        {
            this.maSinhVien = maSinhVien;
            this.ten = ten;
            this.diemTrungBinh = diemTrungBinh;
        }
        public void NhapSV ()
        {
            SC = new Scanner(System.in);
            System.out.println("Nhap ma sinh vien: ");
            this.maSinhVien = SC.nextLine();
            System.out.println("Nhap ten Sinh vien: ");
            this.ten = SC.nextLine();
            System.out.println("Nhap diem trung binh: ");
            this.diemTrungBinh = SC.nextDouble();
        }
        public void  XuatSV()
        {
            System.out.println("Ma sinh vien: "+this.maSinhVien);
            System.out.println("Ten sinh vien: "+this.ten);
            System.out.println("Diem trung binh: "+this.diemTrungBinh);
            System.out.println("-------------------------------");
        }
    }
    public static class ListStudent
    {
        private ArrayList<Student> DSStudent = new ArrayList<>();
        public Scanner SC = new Scanner(System.in);
        public ListStudent()
        {
            this.DSStudent = new ArrayList<>();
        }
        public ListStudent(ArrayList DSStudent)
        {
            this.DSStudent = DSStudent;
        }
        public void Nhap() {
            int check;
            System.out.println("Nhap so sinh vien: ");
            check = SC.nextInt();
            for(int i = 0; i<check;i++)
            {
                System.out.println("nhap sinh vien thu %d: ");
                Student SinhVien = new Student();
                SinhVien.NhapSV();
                DSStudent.add(SinhVien);
            }
        }
        public void Xoa()
        {
            int check;
            System.out.println("Nhap vi tri sinh vien muon xoa: ");
            check = SC.nextInt();
            SC.nextLine();
            if(check<= DSStudent.size()-1 && check >=0)
            {
                //DSStudent.remove(check);
                for(int i = check;i< DSStudent.size()-1;i++)
                    DSStudent.set(i,DSStudent.get(i+1));
            }
            else
                System.out.println("Vi tri khong chinh xac!");
        }
        public void them()
        {
            int check;
            System.out.println("Nhap vi tri sinh vien muon nhap vao: ");
            check = SC.nextInt();
            System.out.println("Nhap thong tin sinh vien: ");
            Student SinhVien = new Student();
            SinhVien.NhapSV();
            if(check<= DSStudent.size()-1 && check>=0)
                DSStudent.add(check,SinhVien);
        }
        public void timKiem()
        {
            String check;
            System.out.println("nhap ma sinh vien can tim: ");
            check = SC.nextLine();
            for(int i=0;i<=DSStudent.size()-1;i++)
                if (DSStudent.get(i).maSinhVien.equals(check)==true)
                {
                    System.out.println("Da tim thay sinh vien tai vi tri "+i);
                    DSStudent.get(i).XuatSV();
                }
                else
                    System.out.println("Khong tim thay sinh vien voi ma "+check);
        }
        public void xapSep()
        {
            for (int i=0;i<DSStudent.size()-1;i++)
                for (int j=i+1;j<=DSStudent.size()-1;j++)
                    if (DSStudent.get(i).diemTrungBinh < DSStudent.get(j).diemTrungBinh)
                    {
                        Student trungGian = DSStudent.get(j);
                        DSStudent.set(j,DSStudent.get(i));
                        DSStudent.set(i,trungGian);
                    }
        }
        public void xuat()
        {
            for(Student st : DSStudent)
                st.XuatSV();
        }
    }

    public static void main(String[] args) {
        ListStudent studentlist =  new ListStudent();
        Scanner SC = new Scanner(System.in);
        int check;
        System.out.println("Day la Lan dau tien ban nhap: ");
        studentlist.Nhap();
        do
        {
            System.out.println("nhap yeu cau: ");
            System.out.println("1. de them sinh vien");
            System.out.println("2. de xoa sinh vien");
            System.out.println("3. de tim kiem sinh vien");
            System.out.println("4. de sap xep");
            System.out.println("5. de ket thuc");
            check = SC.nextInt();
            switch (check)
            {
                case 1:
                    studentlist.them();
                    break;
                case 2:
                    studentlist.Xoa();
                    break;
                case 3:
                    studentlist.timKiem();
                    break;
                case 4:
                    studentlist.xapSep();
                    break;
                case 5:
                    System.out.println("------------");
                    break;
                default:
                    System.out.println("khong hop le.");
                    break;
            }
        }
        while(check!=5);

    }
}
