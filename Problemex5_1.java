package problemex5;

import java.util.ArrayList;

public class Problemex5_1 {
	
	public static void main(String args[]) {
		int generateMax = 11;
		int temporal_generated;
		RandGenerator rg = new RandGenerator();
		NumberPrinter np = new NumberPrinter();
		ArrayList al_even = new ArrayList();
		ArrayList al_odd = new ArrayList();
		
		while(true) {
			temporal_generated = rg.generateRand(generateMax);
			np.printNum(generateMax, temporal_generated);
			if(temporal_generated == 0) break;
			else if((temporal_generated%2) == 0) al_even.add(temporal_generated);
			else al_odd.add(temporal_generated);
			
		}
		
		System.out.print("偶数:");
		for(int i = 0; i < al_even.size(); i++) {
			int print_num = (int)al_even.get(i);
			System.out.print(print_num+" ");
		}
		System.out.println();
		
		System.out.print("奇数:");
		for(int i = 0; i < al_odd.size(); i++) {
			int print_num = (int)al_odd.get(i);
			System.out.print(print_num+" ");
		}
		System.out.println();
		
	}

}
