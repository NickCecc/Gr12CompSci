package cecchin.Assignments.dataStructureMarks;

import java.util.HashMap;

public class Marks {
    public HashMap getMarks() {
        return marks;
    }

    public void setMarks(HashMap marks) {
        this.marks = marks;
    }

    private HashMap marks;

    public Marks(){
        setMarks(null);
    }
    public Marks(HashMap mark){
        setMarks(mark);
    }




}
