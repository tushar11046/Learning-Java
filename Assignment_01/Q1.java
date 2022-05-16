package College.Assignment_01;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float avg=0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter the details for Student " + (i + 1));
            String name = sc.nextLine();
            int age = sc.nextInt();
            int percentage = sc.nextInt();
            sc.nextLine();
            Student st=new Student(name,age,percentage);
            avg+=percentage;
        }
        System.out.print("Average Percentage= "+(avg/6.0));
    }
}
class Student
{   String name;
    int age;
    int percentage;
    char section;
    Student(String name,int age,int percentage)
    {this.name=name;
        this.age=age;
        this.percentage=percentage;
        this.section='A';
    }
}
