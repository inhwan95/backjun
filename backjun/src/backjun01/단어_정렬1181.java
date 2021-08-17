package backjun01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class 단어_정렬1181 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			set.add(str);
		}
		for (String string : set) {
			list.add(string);
		}
		Collections.sort(list);

		for (int i = 0; i <= 50; i++) {
			for (int j = 0; j < list.size(); j++) {

				if(list.get(j).length() == i) {
					System.out.println(list.get(j));

				}
			}
		}
	}
}
