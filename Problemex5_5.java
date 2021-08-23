package problemex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problemex5_5 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<String> arr = new ArrayList<String>();
        String buf = "";
        
        do {
        	System.out.print("文字列を入力:");
        	buf = br.readLine();
        	if(buf.length()<5) {
        		arr.add(buf);
        	}
        }while(buf.length() != 0);
        
        for(int i = 0; i < arr.size(); i++) {
        	System.out.print(arr.get(i)+" ");
        }
	}
}
