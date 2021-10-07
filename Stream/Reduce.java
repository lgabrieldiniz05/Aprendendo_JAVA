package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		int total1 = (int) nums.stream().reduce(soma).get();
		System.out.println(total1);
		
	}

