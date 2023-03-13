package student;

public class Student {
    private int studentId;
    private String studentName;
    private static String college = "aaaa";
    Student(int n, String r) {
        studentId = n;
        studentName = r;
    }
    static void chane(){
        college = "Rikkei Academy";
    }
    void display(){
        System.out.println(studentId + " " + studentName + " " + college);
    }
}
