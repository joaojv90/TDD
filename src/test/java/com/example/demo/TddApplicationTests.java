package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddApplicationTests {
	
	public String checkNum (int [] nums) {
		if (nums[0]%3==0 && nums[0]%5==0) {
			return "FizzBuzz";
		}else if(nums[0]%3==0){
			return "Fizz";
		}else if(nums[0]%5==0) {
			return "Buzz";
		}
		return null;
	}

	@Test
	void testFizz () {
		int myArr [] = {15};
		assertEquals("FizzBuzz", checkNum(myArr));
		myArr [0] = 3;
		assertEquals("Fizz", checkNum(myArr));
		myArr [0] = 5;
		assertEquals("Buzz", checkNum(myArr));
	}

}
