package backjun01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부녀회장이_될테야2775{
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); 

		for(int v=0; v<T; v++) {
			int k = Integer.parseInt(br.readLine()); // 층
			int n = Integer.parseInt(br.readLine()); // 호수

			int[][] APT = new int[15][15];

			for (int i = 0; i < APT.length; i++) {
				APT[0][i] = i;
				APT[i][1] = 1;
			}

			for (int i = 1; i < APT.length; i++) {
				for (int j = 2; j < APT.length; j++) {
					APT[i][j] = APT[i][j-1] + APT[i-1][j];

				}
			}
			System.out.println(APT[k][n]);
		}

	}
}