package backjun01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 분해합2231{
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());   //분해합

		int[] N = new int[1_000_000];
		String str;
		List<Integer> list = new ArrayList<>();
		
		
		

		for(int i=0; i<N.length; i++) {
			int sum = 0;
			str = ""+i;
			String[] split = str.split("");

			for (int j = 0; j < split.length; j++) {
				sum += Integer.parseInt(split[j]);
			}
			if(M==(sum+i)) {
				list.add(i);
			}
		}
		try {
			System.out.println(list.get(0));
		} catch (Exception e) {
			System.out.println(0);
		}
	}
}