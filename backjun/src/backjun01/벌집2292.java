package backjun01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집2292{
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 1;
		int j =0;

		if(N==1) {
			System.out.println(cnt);
		} else {
			for (int i = 1; i<=N; i++) {
				j += (cnt*6);
				i = j+1;
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}