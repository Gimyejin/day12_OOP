package com.care.test;
//com.naver.projectName url�� �������� �ۼ���
//���� �ٸ� ��Ű���� Ŭ������ ����ҷ��� import�� ����ؾ��Ѵ�.

import com.care.zzz.TestClass2;

public class TestMain {

	public static void main(String[] args) {
		Test t = new Test();
		t.test();
		TestClass2 tc02=new TestClass2();
		tc02.testClass2();
		
		//Ŭ���� �̸��� ���� ��� �ϳ��� ��Ű���� import �� �ߴٸ�
		//�ٸ� Ŭ������ �̿��Ҷ��� �տ� ��Ű������ �پ ���ȴ�.
		//ex)com.care.test �� TestClass�� import����
		//�׷� a.a.a�� testClass�� ������ a.a.a.TestClass�� �ǹ���.
		
		//�̸��� ���� �� ������ ��Ű���� �ٸ��⶧���� ���� �ٸ� ��Ű���ΰ��� �˾Ƶ���
		
	}

}
