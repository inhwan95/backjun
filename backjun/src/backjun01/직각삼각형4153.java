package backjun01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 직각삼각형4153{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		boolean flag = true;
		int a,b,c;
		String str = "";
		
		while (flag) {
			input = br.readLine().split(" ");
			a = Integer.parseInt(input[0]);
			b = Integer.parseInt(input[1]);
			c = Integer.parseInt(input[2]);
			
			if(a==0 || b==0 || c==0) {
				return;
			}
			else if((Math.pow(a, 2) + Math.pow(b,2) ==Math.pow(c, 2)) ||
					(Math.pow(a, 2) + Math.pow(c,2) ==Math.pow(b, 2)) ||
					(Math.pow(c, 2) + Math.pow(b,2) ==Math.pow(a, 2)) ) {
				str = "right";
				System.out.println(str);
			} else {
				str = "wrong";
				System.out.println(str);
			}
		}
	}
}