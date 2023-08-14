package com.mystream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.*;

public class Survey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SurveyReport> list=new ArrayList();
		list.add(new SurveyReport(1,"peter","Mumbai",9,3,40));
		list.add(new SurveyReport(5,"Erric","Delhi",5,2,37));
		list.add(new SurveyReport(3,"Carrie","Hyderabad",8,6,56));
		list.add(new SurveyReport(6,"Don","Delhi",6,2,89));
		Stream<SurveyReport> surveystream=list.stream();
		/*SurveyReport s=surveystream.max((s1,s2)->{
			if(s1.getTotal_connection_request()==s2.getTotal_connection_request()) {
				return 0;
			}
			else if(s1.getTotal_connection_request()>s2.getTotal_connection_request()) {
				return 1;
			}
			else {
				return -1;
			}
			
			
		}).get();
		System.out.println(s);*/
		/*int i=surveystream.map((e)->e.getNo_of_days_for_request_completion()).reduce(0, (a,b)->(a+b))/2;
		System.out.println(i);*/
		
		/*int i=surveystream.map((e)->e.getAverage_request_per_day()).reduce(0, (a,b)->(a+b));
		System.out.println(i);*/
		
		long c=surveystream.filter((e)->e.getLocation().equals("Delhi")).count();
		System.out.println(c);
		
		
	}

}
