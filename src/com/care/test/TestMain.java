package com.care.test;
//com.naver.projectName url의 역순으로 작성함
//서로 다른 패키지의 클래스를 사용할려면 import를 사용해야한다.

import com.care.zzz.TestClass2;

public class TestMain {

	public static void main(String[] args) {
		Test t = new Test();
		t.test();
		TestClass2 tc02=new TestClass2();
		tc02.testClass2();
		
		//클래스 이름이 같은 경우 하나의 패키지를 import 를 했다면
		//다른 클래스를 이용할때는 앞에 패키지명이 붙어서 사용된다.
		//ex)com.care.test 의 TestClass를 import했음
		//그럼 a.a.a의 testClass를 쓸때는 a.a.a.TestClass가 되버림.
		
		//이름은 받을 수 있으나 패키지가 다르기때문에 서로 다른 패키지인것을 알아두자
		
	}

}
