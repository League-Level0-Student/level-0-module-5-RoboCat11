package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {

	public static void main(String[] args) {

		// Single For-Loops


		// #1

		for(int i=0; i<101; i++) {
			//System.out.println (i);
		}

		//#2

		for(int i=100; i>=0; i--) {
			//System.out.println(i);	
		}
		//#3

		for(int i=2; i<101; i++) {
			if(i%2==0) {
				//System.out.println(i);
			}
		}
		//#4
		for(int i=1; i<100; i++) {
			if(i%2==1) {
				//System.out.println(i);
			}
		}
		//#5

		for(int i=1; i<501; i++) {
			//System.out.println(i);	
			if(i%2==1) {
				//System.out.println(i + " is odd");	
			}
			if(i%2==0) {
				//System.out.println(i + " is even");	
			}
		}
		//#6

		for(int i=0; i<778; i++) {
			if(i%7==0) {
		//System.out.println(i);
			}
		}
		//#7

		for(int i=1962; i<2025; i++) {
		System.out.println("In " + i +  ", I was " + (i-1962) + " years old");
			
		}
		
		//Nested For-Loops
		
		




	}

}
