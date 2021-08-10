package backjun01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test01 {
   
   public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String str = br.readLine(); //문자열 입력
      
      char ch[] = str.toUpperCase().toCharArray(); //문자열을 캐릭터형으로 변환
      char upper[] = new char[26]; //대문자 배열 생성
      int cnt[] = new int[26]; //카운트용 배열 생성
      boolean flag = false;
      int max = 0;
      
      for(int i =0; i<26; i++) {
         upper[i] = (char)(i+65); //대문자 배열 입력
      }
      
      //문자열 갯수 검사하여 카운트배열에 저장
      for(int i=0; i<ch.length; i++) {
         for(int j=0; j<upper.length; j++) {
            if(ch[i] == upper[j]) {
               cnt[j]++;
            }
         }
      }
      // 카운트 배열에서 최대값 검색
      for(int i =0; i<cnt.length; i++) {
         if(max <= cnt[i]) {
            max = cnt[i];
         }
      }
      //만약 최대값이 두개면 물음표 출력
      
      for(int i=0; i<cnt.length; i++) {
         for(int j =0; j<i; j++) {
            if(cnt[i] == max && cnt[j] == max ) {
               flag = true;
            }
         }
      }
      if(flag) {
         System.out.println("?");
      }
      //두개가 아니면 대문자 출력
      if(!flag) {
      for(int i =0; i<cnt.length; i++) {
         if(cnt[i] == max) {
            System.out.println(upper[i]);
            }
         }
      }
   }
}


//
//package backjun01;
//
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[26];
//		
//		String a = sc.next().toUpperCase();
//		
//		sc.close();
//		
//		int max = -1;
//		char st = '?';
//		
//		for(int i=0; i<a.length(); i++) {
//			arr[a.charAt(i)-65]++; //arr[2]++; c일때	for문이 돌 때마다 arr가 다음 순번으로 하나씩 늘어난다.
//			if(max<arr[a.charAt(i)-65]) {
//				max = arr[a.charAt(i)-65];
//				st = a.charAt(i);
//			}
//			else if(max == arr[a.charAt(i)-65]) {
//				st = '?';
//			}
//		}
//		System.out.println(st);
//	}
//
//}