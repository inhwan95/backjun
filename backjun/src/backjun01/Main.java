package backjun01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); 	//n장의 카드
		int M = Integer.parseInt(br.readLine()); 	// 딜러가 숫자 m외침
		
		// n에서 3장을 고른다.	
		for (int i = 0; i < N; i++) {
			int card = Integer.parseInt(br.readLine());
			
		}
		
	}
}