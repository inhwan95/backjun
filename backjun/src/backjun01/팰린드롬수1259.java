package backjun01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 팰린드롬수1259 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<Integer>();
		
		int num = -1;
		String rs = null;

		while(num != 0) {
			String str = br.readLine();
			int s = Integer.parseInt(str);
			if(s==0) return;
			list.clear();
			stack.clear();
			String[] split = str.split("");
			
			for(int i=0; i<split.length; i++) {
				list.add(Integer.parseInt(split[i]));
				stack.push(Integer.parseInt(split[i]));
			}
			
			q: for (int j = 0; j < list.size(); j++) {
				if(list.get(j)!=stack.pop()) {
					rs = "no";
					break q;
				} else {
					rs = "yes";
				}
			}
			System.out.println(rs);
		}
		
	}
}
