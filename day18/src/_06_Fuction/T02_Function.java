package _06_Fuction;

import java.util.*;
import java.util.function.*;

public class T02_Function {

	static List<Student> list = Arrays.asList(
				new Student("홍길동", 79, 100), 
				new Student("박길동", 84, 89),
				new Student("아무개", 68, 93), 
				new Student("김나래", 75, 47),
				new Student("BTS",98, 100));


	// 반환형 double
	static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		
		double avg = sum / list.size();
		return avg;
	}

	public static void main(String[] args) {
		// 영어평균 반환형이 double
		double engAvg = avg(t -> t.getEng());
		System.out.printf("[영어 평균 점수] = %.2f\n" , engAvg);

		double comAvg = avg(t -> t.getCom());
		System.out.printf("[컴퓨터 평균 점수] = %.2f", comAvg);
	}

}
