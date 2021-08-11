package day12_OOP;

public class Ex02 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);//뚝뚝 일정한 시간간격으로 끊겨서 출력됨
				//3000면 3초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("다음문장 실행");
	}

}
