package cecchin.JavaBasics;

public class ForLoops {

	public ForLoops() {
		
		// 3 sections: (declaration/initialization; loop condition; update)
		// print the loop index, i, 0-9
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// generate 5 random numbers and output each & the total
		double total = 0;
		for(int i = 0; i < 5; i++) {
			double rand = Math.random()*100;
			System.out.println(rand);
			total+=rand; //total = total + rand;
		}
		System.out.println("Total is: " + total);
		
	    // descending for loop
		for(int i = 50; i >=0; i-=5) {
			System.out.println(i);
		}
		
		/* Tips:
		 * a) Loop index should be i -NESTED loop indices should be j 
		 * and subsequently k
		 * b) Update section of the code can contain expressions (e.g. i+=5)
		 * or statements (e.g. i = i + 5)
		 * c) Loop counters declared inside for loops are "out of scope" (not
		 * visible/usable) outside of the for loop { }
		 */
		
	}
	
	public static void main(String[] args) {
		new ForLoops();
	}

}
