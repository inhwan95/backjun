package backjun01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 달팽이는_올라가고_싶다2869 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		double day = 0;
		day = Math.ceil((double)(V-B)/(A-B));
		
		System.out.println((int)day);
		
	}
}

//		while(V!=end) {
//			day++;
//			end += A;
//			if(end>=V) {
//				System.out.println(day);
//				return;
//			}
//			end -= B;
//		}
//		System.out.println(day);
// 1일차 A만큼			// 1(A-B)+B
// 2일차 2A - B만큼		// 2(A-B)+B
// 3일차 3A - 2B만큼	// 3(A-B)+B
// 4일차 4A - 3B만큼	// 4(A-B)+B
// n일차 nA - (n-1)B만큼// n(A-B)+B
// V = day*(A-B)+B;