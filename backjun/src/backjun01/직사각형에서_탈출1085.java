package backjun01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 직사각형에서_탈출1085{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		int w = Integer.parseInt(input[2]);
		int h = Integer.parseInt(input[3]);

		int row = Math.abs(x-w);
		int col = Math.abs(y-h);
		
		List<Integer> list = new ArrayList<>();
		list.add(row);
		list.add(col);
		list.add(x);
		list.add(y);
		
		Collections.sort(list);
		
		System.out.println(list.get(0));
	}
}