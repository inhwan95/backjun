package backjun01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// 3키로와 5키로 봉지가 있다. 숫자N 킬로그램을 쟀을때 나오는 최소 봉지 수
public class 설탕배달2839 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int box = Integer.parseInt(br.readLine());
		int five = 0;
		int three = 0;

		if(box==3| box==6| box==9| box==12) {
			while(box>=3) {
				box -= 3;
				three++;
			}
		} else if(box>=5) {	
			while(box>=5) {
				box -= 5;
				five++;
				if(box==3| box==6| box==9| box==12) {
					while(box>=3) {
						box -= 3;
						three++;
					}
				} 
			}
		} else {
			System.out.println(-1);
			return;
		}
		if(box!=0) {
			System.out.println(-1);
			return;
		}
		System.out.println(five+three);
	}
}

