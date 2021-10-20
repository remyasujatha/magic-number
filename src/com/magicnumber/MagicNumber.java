package com.magicnumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MagicNumber {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 123, 163);
		Consumer<Integer> isMagicNumber = (b)-> {
			if(isMagicNumber(b)) { System.out.println(b + " is a maigic number");}
			else {System.out.println(b + " is a not maigic number");}
			};
		
		numbers.stream().forEach((b)-> {
	   isMagicNumber.accept(b);});

		
	}

	private static boolean isMagicNumber(int a) {

		int sum = sumofDigits(a, 0);
		if (sum == 1)
			return true;
		return false;

	}

	private static int sumofDigits(int a,int sum) {

		if (a == 0) {
			if (sum >= 10) {
				a = sum;
				sum = 0;
			} else {
				return sum;
			}
		}
		sum += a % 10;
		return (sumofDigits(a / 10, sum));
	}
}
