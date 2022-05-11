package cecchin.JavaBasics;
import java.util.ArrayList;

class ArrayListsTeacherD2 {
  public ArrayListsTeacherD2() {
	 /* Example 1 - Using ArrayLists
       ArrayList - dynamically resizable
       declare an ArrayList and give it a parameter as best practise
       Cannot use primitive types in an ArrayList -must store all data of the same types
    */
    ArrayList<String> names = new ArrayList<String>();
    names.add("Stella");
    names.add("Steven");
    names.add(2, "Lisa"); // inserts at position given by index, shifts existing element 
    //and any subsequent elements to the right
    
    
    // get and print element 1
    System.out.println(names.get(1));
    
    for (int i = 0; i < names.size(); i++) {
		System.out.println(names.get(i));
	}
    
    // Can also print values using an enhanced-for loop
    // Don't try to change name - they don't stick
    System.out.println("....");
    for (String name: names) {
    	System.out.println(name);
    	name = "Quinton";
    }
    System.out.println("....");
    for (String name: names) {
    	System.out.println(name);
    }
    
    // remove element at index 1
    names.remove(1);
    int size = names.size();
    System.out.println(size);
    
    // other commonly useful methods:
    names.clear();
    size = names.size();
    System.out.println(size);
    
    // Example 2
    ArrayList<Integer> nums = new ArrayList<Integer>();
    for(int i = 0; i< 10; i++) {
      nums.add(i);   // nums.add(Integer.valueOf(i));  OR  nums.add(new Integer(i));
      // "autoboxes" Integer from int type automatically
    }

    System.out.println("Printing nums:...");
    for(int i = 0; i < nums.size(); i++) {
      int mark = nums.get(i); // nums.get(i).intValue();
      // Java "unboxes" our Integer to a primitive int value
      System.out.println(mark);
    }

    
  }
  public static void main(String[] args) {
    new ArrayListsTeacherD2();
  }
}