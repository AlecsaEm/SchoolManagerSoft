import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

Teacher Emma = new Teacher(1, "Emma ", 2500);
Teacher Jessie = new Teacher(2,"Jessie", 4500);
Teacher Jeremiah = new Teacher (3,"Jeremiah", 7000);


        List <Teacher> teacherList = new ArrayList<>();
        teacherList.add(Emma);
        teacherList.add(Jessie);
        teacherList.add(Jeremiah);

        Student Judith = new Student(1,"Judith", 10);
Student Joshua = new Student (2,"Joshua", 8);
Student Jossy = new Student(3,"Jossy", 7);


List <Student> studentList = new ArrayList<>();
        studentList.add(Joshua);
        studentList.add(Judith);
        studentList.add(Jossy);

School LiceuSiret = new School(teacherList, studentList);


Joshua.pay(1000);
Judith.pay(2200);

System.out.println(LiceuSiret.getTotalMoneyEarned());
            System.out.println("        ");
System.out.println("Making LiceuSiret pay  salary");
Emma.recieveSalary(Emma.getSalary());
System.out.println("LiceuSiret has spent to  " + Emma.getName()+ "  and now has  " + LiceuSiret.getTotalMoneyEarned());
Jeremiah.recieveSalary(Jeremiah.getSalary());
System.out.println("LiceuSiret has spent to  " + Jeremiah.getName()+ "  and now has  " + LiceuSiret.getTotalMoneyEarned());

        System.out.println(Joshua.getRemainingFees());
        System.out.println(Judith.getRemainingFees());


    }
}
