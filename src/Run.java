import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        double Mot_ty=1000000000;
        Scanner sc=new Scanner(System.in);
        Person person=new Person("phúc","thường tín");
        System.out.println(person.toString());
        Student student=new Student("hoàng rapper","hà nội","hiphop",1992,Mot_ty);
        System.out.println(student.toString());
        Staff staff=new Staff("đầm","bắc giang","codegym",1000000);
        System.out.println(staff.toString());
    }
}
