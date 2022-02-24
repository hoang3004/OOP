package oo.baitapstudent;

public class Student {
    String name;
    int age;
    String mssv;
    String lop;

    public void Student1(String n, int a, String m, String l){
        name = n;
        age = a;
        mssv = m;
        lop = l;
    }

    public void Show(){
        System.out.println("Thông tin sinh viên: ");
        System.out.println("Tên: "+name);
        System.out.println("Tuổi: "+age);
        System.out.println("MSSV: "+mssv);
        System.err.println("Lớp: "+lop);
    }
}
