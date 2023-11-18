package bai3labkiemthu;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class giaipt {
	double nghiem =0;
	//pt bậc 1: ax+b = 0
	// điều kiện: a!=0
	public boolean ispt(int a,int b) {
		if(a==0) {
			return false;
		}else {
			nghiem = (double)-b/a;
			System.out.println(nghiem);
			return true;
		}
	}
	public static void main(String[] args) {
		Result rs = JUnitCore.runClasses(giaipt.class);
		for(Failure failure: rs.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Result=="+rs.wasSuccessful());
	}
}
