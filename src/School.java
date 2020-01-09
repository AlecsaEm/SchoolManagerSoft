import java.util.List;

public class School {

    //many teachers, many student
    // Implements Students and Teachers using ArrayLisy





    private List <Teacher> teachers;
    private List <Student> students;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

//new school object is create
// list of students in the school

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;

    }

//returns the list of teachers in the school
    public List<Teacher> getTeachers() {
        return teachers;
    }
//adds a teacher to the school
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);

    }
//returns the list of students in the school
    public List<Student> getStudents() {
        return students;
    }


//adds a student to the school
    public void addStudent(Student  student) {
        students.add(student);
    }


//returns the total money earned by the school



    public int getTotalMoneyEarned() {
        return totalMoneyEarned;



    }



//adds the total money earned by the school
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }
//returns the total money spent in school
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

//update the money that is spent by the school
    //which is the salary given by the school to its teachers

    public void updateTotalMoneySpent(int MoneySpent) {

       totalMoneyEarned -=  MoneySpent;
    }

}
