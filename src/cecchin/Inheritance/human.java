package cecchin.Inheritance;

public class human {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    private int age;
    private String name;
    private String school;

    public human(){
    }

    public human(int age, String name, String school){
        setAge(age);
        setSchool(school);
        setName(name);
    }

    public String makeNoise(){
        return "OMG";
    }



}
