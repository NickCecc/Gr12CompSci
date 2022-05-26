package cecchin.Assignments.dataStructureMarks;

import java.util.HashMap;

public class DataStructures {

    public DataStructures() {

        // create student map
        HashMap<String, Marks> studentMarks = new HashMap<String, Marks>();

        // create student 1 map
        HashMap<String, Float> student1Marks = new HashMap<String, Float>();
        // put key/value pairs in

        student1Marks.put("ICS4U", 97f);
        student1Marks.put("MHF4U", 80f);
        student1Marks.put("MDM4U", 90f);
        student1Marks.put("BSK4O", 100f);
        //create mark object

        Marks stu1 = new Marks(student1Marks);
        // assign student mark object
        studentMarks.put("9978654", stu1);

        // create student 2 map
        HashMap<String, Float> student2Marks = new HashMap<String, Float>();

        // put key/value pairs in
        student2Marks.put("ICS4M", 100f);
        student2Marks.put("MHF4M", 100f);
        student2Marks.put("MDM4M", 100f);
        //create mark object
        Marks stu2 = new Marks(student2Marks);
        // assign student mark object
        studentMarks.put("463810", stu2);

        // print both students marks
        System.out.println(studentMarks.get("9978654").getMarks());
        System.out.println(studentMarks.get("463810").getMarks());

        // update student1 mark
        studentMarks.get("9978654").getMarks().replace("ICS4U", 96f);

        System.out.println(studentMarks.get("9978654").getMarks());


    }

    public static void main(String[] args) {
        new DataStructures();
    }
}
