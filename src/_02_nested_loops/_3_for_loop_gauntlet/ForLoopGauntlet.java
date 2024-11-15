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

		for(int i=0; i<7; i++) {
			//System.out.println(i);

		}
		//#7

		for(int i=2013; i<2025; i++) {
			//System.out.println("In " + i +  ", I was " + (i-1962) + " years old");

		}

		//Nested For-Loops

		//#1

		//for(int i=0; i<3; i++) {

		for(int j=0; j<3; j++) {

			//for (int k=1; k<4; k++) {
				//System.out.print((k + j * 3)+ " ");
			//}   
			System.out.println();
		}

		//#3

		for (int q=0; q<10; q++) {


			//for(int g=1; g<11; g++) {
				//System.out.print((g + q * 10)+ " ");	
			//}
			//System.out.println();
		}
		
		
		//#4
		
		for(int i=1; i<7; i++) {
			for(int f=0; f<i; f++) {
			System.out.print("* ");	
			}
		System.out.println();	
		}
		//}
	}



}
