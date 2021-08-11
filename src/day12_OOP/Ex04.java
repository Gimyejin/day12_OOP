package day12_OOP;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		HashMap map = new HashMap();
		map.put("메모장", "notepad");
		map.put("계산기", "calc");
		map.put("그림판", "mspaint");
		
		System.out.println(map);
		System.out.println("실행 명령어 입력");
		
		String key = input.next();
		if(map.containsKey(key)) {
			ProcessBuilder pro= new ProcessBuilder((String)map.get(key));
			//ProcessBuilder: 시스템을 실행 가능한 명령어를 실행시켜주는 기능
			
			try {
				pro.start();
				System.out.println("명령어 실행 되었음");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else System.out.println("해당 명령어는 존재하지 않습니다.");

	}

}
