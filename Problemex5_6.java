package problemex5;

import java.util.ArrayList;

public class Problemex5_6 {
	public static void main(String args[]) {
		int generateMax = 11;
		int temporal_generated;
		RandGenerator rg = new RandGenerator();
		NumberPrinter np = new NumberPrinter();
		ArrayList al = new ArrayList();
		
		while(true) {
			temporal_generated = rg.generateRand(generateMax);
			np.printNum(generateMax, temporal_generated);
			if(temporal_generated == 0) break;
			if(temporal_generated != 2) al.add(temporal_generated);
			
		}
		
		for(int i = 0; i < al.size(); i++) {
			int print_num = (int)al.get(i);
			System.out.print(print_num+" ");
		}
		System.out.println();
	}
}
