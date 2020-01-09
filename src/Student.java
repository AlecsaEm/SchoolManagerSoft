


public class Student {

    private int id;
private String name;
private int grade;
private  int feesPaid;
private int feesTotal;




public Student (int id, String name, int grade) {
    this.feesPaid=0;
    this.feesTotal = 30000;
    this.id=id;
    this.name=name;
    this.grade=grade;
}



public void setGrade (int grade){
    this.grade=grade;
}

public void updateFeesPaid (int fees) {
    feesPaid=feesPaid+fees;
}

//return id of the student
    public int getId() {
        return id;
    }

//return name of the student
    public String getName() {
        return name;
    }

//return grade of the student
    public int getGrade(int grade ) {
        return grade;
    }

//return FeesPaid by the student



    public void pay (int fees) {
    feesPaid += fees;
    School.updateTotalMoneyEarned(feesPaid);
    }

//return FeesTotal of the student
    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees () {
     return feesTotal-feesPaid;
    }
}



