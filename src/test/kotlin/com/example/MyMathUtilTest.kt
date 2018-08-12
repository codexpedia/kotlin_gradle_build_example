package com.example

import org.junit.Assert.assertEquals
import org.junit.Test
import com.example.math.MyMathUtil

class MyMathUtilTest {
    
    @Test 
    fun testSquare() {
        assertEquals(100, MyMathUtil().square(10))
    }

    @Test
    fun testDouble() {
    	assertEquals(20, MyMathUtil().double(10))
    }

    @Test
    fun testRandom() {
    	val randomInt1 = MyMathUtil().randomInt()
    	val randomInt2 = MyMathUtil().randomInt()
    	assertEquals(true, randomInt1 != randomInt2)
    }

    @Test
    fun failTest() {
        assertEquals(1000, MyMathUtil().square(10))
    }

}