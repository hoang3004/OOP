package oo.baitapstudent;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student tuanstudent = new Student();
        tuanstudent.Student1("Tuan", 18, "014", "K14DCPM01");
        tuanstudent.Show();
        System.out.println("--------------------------------");

        Student hoangstudent = new Student();
        hoangstudent.Student1("Hoang", 20, "018", "K14DCPM01");
        hoangstudent.Show();
        System.out.println("--------------------------------");

        Student minhstudent = new Student();
        minhstudent.Student1("Minh", 19, "012", "K14DCPM01");
        minhstudent.Show();
     
    }
}
