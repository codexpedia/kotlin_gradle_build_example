package com.example

import com.example.math.MyMathUtil

fun main(args : Array<String>) {
	val num = if (args.isNotEmpty()) args[0].toIntOrNull() else null
	if (num == null) {
		println("Please provide a number!")
		return
	}

	val doubleOfNum = MyMathUtil().double(num)
	println("The double of $num is $doubleOfNum")
}



