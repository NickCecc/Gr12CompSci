package cecchin.Inheritance;

public class student extends human {

    private int grade;

    public student(){
        super();

    }
    public student(int grade){
        setGrade(grade);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String makeNoise(){
        return "Hello";
    }









}
