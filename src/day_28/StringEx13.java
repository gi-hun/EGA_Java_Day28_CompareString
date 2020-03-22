/*
 * # 문자열 비교
 * . equals() 메서드 사용없이 문자의 일치여부 비교
 * 예)
 * 코끼리
 * 입력 = 티라노사우루스
 * 출력 = false
 */
package day_28;

import java.util.Scanner;

public class StringEx13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.println("동물 이름을 입력하세요: ");
		String myName = sc.next();
		
		int check = -1;
		
		if(name.length() == myName.length())
		{
			check = 1;
			for(int i=0;i<name.length();i++)
			{
				char name_arr = name.charAt(i);
				char myName_arr = name.charAt(i);
				
				if(name_arr ==  myName_arr)
				{
					check = 1;
				}
				else
				{
					check = -1;
				}
			}
		}
		
		if(check == 1)
		{
			System.out.println("일치");
		}
		else
		{
			System.out.println("불일치");
		}
	}
}
