/*
 * # ���ڿ� ��
 * . equals() �޼��� ������ ������ ��ġ���� ��
 * ��)
 * �ڳ���
 * �Է� = Ƽ�����罺
 * ��� = false
 */
package day_28;

import java.util.Scanner;

public class StringEx13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "�ڳ���";
		
		System.out.println("���� �̸��� �Է��ϼ���: ");
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
			System.out.println("��ġ");
		}
		else
		{
			System.out.println("����ġ");
		}
	}
}
