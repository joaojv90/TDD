package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddApplicationTests {
	
//	Write a method that will receive a list of numbers and this method will return the text:
//		- "FizzBuzz" if i is divisible by 3 and 5.
//		- "Fizz" if i is divisible by 3.
//		- "Buzz" if i is divisible by 5.
//		- If none of the above conditions are true, then return the given number

	//@Test
	void contextLoads() {
		
			
	}
	
//	public int checkFizzBuzz (int num1) {
////		Scanner sc = new Scanner(System.in);
////		System.out.println("Ingrese un número: ");
////		int i1 = sc.nextInt();
//		if (num1%3==0) {
//			System.out.println("Fizz");			
//		}
//		return num1;
//	}
	public String checkNum (int [] nums) {
		if (nums[0]%3==0) {
			return "Fizz";
		}else if(nums[0]%5==0){
			return "Buzz";
		}
		return null;
	}

	@Test
	void testFizz () {
		int myArr [] = {3};
		assertEquals("Fizz", checkNum(myArr));
		myArr [0] = 5;
		assertEquals("Buzz", checkNum(myArr));
		myArr [0] = 15;
		assertEquals("FizzBuzz", checkNum(myArr));
	}

}
