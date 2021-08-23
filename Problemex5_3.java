package problemex5;

import java.util.ArrayList;

public class Problemex5_3 {

	public static void main(String[] args) {
		int generateMax = 101;
		int temporal_generated;
		RandGenerator rg = new RandGenerator();
		NumberPrinter np = new NumberPrinter();
		
		ArrayList<ArrayList<Integer>> arrs = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i<10; i++) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arrs.add(arr);
		}
		
		while(true) {
			temporal_generated = rg.generateRand(generateMax);
			np.printNum(generateMax, temporal_generated);
			if(temporal_generated == 0) break;
			arrs.get(temporal_generated%10).add(temporal_generated);
		}
		
		for(int i = 0; i<10; i++) {
			System.out.print("一の位が"+i+": ");
			if(arrs.get(i).size()==0) {
				System.out.println("なし");
				continue;
			}
			
			for(int j = 0; j<arrs.get(i).size(); j++) {
				System.out.print(arrs.get(i).get(j)+" ");
			}
			System.out.println("");
			
		}
		
	}

}
