package day12_OOP;

public class Ex02 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);//�Ҷ� ������ �ð��������� ���ܼ� ��µ�
				//3000�� 3��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("�������� ����");
	}

}
