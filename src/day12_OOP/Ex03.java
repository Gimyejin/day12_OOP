package day12_OOP;

import java.io.IOException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("������ ���� ���ɾ� �Է�: ");
		String s = input.next();
		
		ProcessBuilder pro = new ProcessBuilder(s);
		try {
			pro.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//notepadġ�� �޸��� ����
	}

}