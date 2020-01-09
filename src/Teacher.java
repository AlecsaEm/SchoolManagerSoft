public class Teacher {


    private int id;
    private String name;
    private int salary;
    private int salaryEarned;




    public Teacher (int id, String name, int salary) {
this.id=id;
this.name=name;
this.salary=salary;
this.salaryEarned=0;

    }



//return id of teacher
    public int getId(){
        return id;
    }

// return name of the teacher
    public String setName(){
        return name;
    }
    public String getName()
    {return name ;}

//return the salary of the teacehr
    public int getSalary(){
        return salary;
    }

//set the salary of the teacher
    public void setSalary (int salary){
        this.salary=salary;
    }

    //removes from the total money earned by the school
    public void recieveSalary (int salary) {
        salaryEarned+=salary;
        School.updateTotalMoneyEarned(salary);



    }
}

