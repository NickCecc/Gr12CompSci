package cecchin.Stacks;

public class Student {
    private String name;
    private String bug;
    private StringBuilder sb;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBug() {
        return bug;
    }

    public void setBug(String bug) {
        this.bug = bug;
    }


    public String toString(){
        sb = new StringBuilder();
        sb.append(name);
        sb.append(bug);
        return sb.toString();
    }
}
