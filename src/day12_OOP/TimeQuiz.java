package day12_OOP;

import java.text.*;
import java.util.Date;

public class TimeQuiz {
	private Date date;
	private SimpleDateFormat simpl;
	
	
	public String getDate() {
		return simpl.format(date);
	}

	public void setDate() {
		date = new Date();
		simpl =new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss�� ");
		
	}
	public void time() {
		for(int i=0;i<10;i++) {
			setDate();
			String s = getDate();
			System.out.println(s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


}