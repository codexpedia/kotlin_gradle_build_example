package com.example.math

import java.util.Random

class MyMathUtil {
	
	fun square(n : Int) : Int {
		return n*n
	}

	fun double(n : Int) : Int {
		return n*2
	}

	fun randomInt() : Int {
		return Random().nextInt();
	}
}