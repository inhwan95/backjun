package backjun01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 블랙잭2798{
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		String[] input1 = br.readLine().split(" ");
		List<Integer> list = new ArrayList<>();
		int N = Integer.parseInt(input[0]); 	//n장의 카드
		int M = Integer.parseInt(input[1]); 	// 딜러가 숫자 m외침
		int max = 0; // 3장의 합 비교 값 젤 큰거
		int sum = 0; // 3장의 합 값

		// n에서 3장을 고른다.	
		for (int i = 0; i < N; i++) {
			int card = Integer.parseInt(input1[i]);
			list.add(card);
		}

		for (int a = 0; a < list.size(); a++) {
			for (int b = a+1; b < list.size(); b++) {
				for (int c = b+1; c < list.size(); c++) {
					sum = list.get(a) + list.get(b) + list.get(c);
					if(sum<=M) {
						if(max <= sum) {
							max = sum;
						}
					}
				}
			}
		}
		System.out.println(max);
	}
}