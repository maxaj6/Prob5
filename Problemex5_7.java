package problemex5;

import java.util.ArrayList;

public class Problemex5_7 {
	public static void main(String args[]) {
		int generateMax = 11;
		int temporal_generated;
		RandGenerator rg = new RandGenerator();
		NumberPrinter np = new NumberPrinter();
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while(true) {
			temporal_generated = rg.generateRand(generateMax);
			np.printNum(generateMax, temporal_generated);
			if(temporal_generated == 0) break;
			al.add(temporal_generated);
			if(al.size()>=2) al = bubblesort(al);
			for(int i = 0; i < al.size(); i++) {
				int print_num = (int)al.get(i);
				System.out.print(print_num+" ");
			}
			System.out.println();
		}
		
	}
	
	public static ArrayList<Integer> bubblesort(ArrayList<Integer> arr){
		
		ArrayList<Integer> ret = arr;
		
		for(int i = ret.size()-1; i  >= 0; i--) {
			for (int j = i; j > 0; j--) {
				if (ret.get(j-1) > ret.get(j)) {
					int temp = ret.get(j-1);
					ret.set(j-1, ret.get(j));
					ret.set(j, temp);
				}
				
			}
		}
		
		return ret;
	}
	
}
