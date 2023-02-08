package com.igorwojda.integer.reverse

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test
import kotlin.math.absoluteValue

private fun reverseInt(i: Int): Int {
    return if (i >= 0) {
        i.toString().reversed().toInt()
    }
    else {
        -(i.absoluteValue.toString().reversed().toInt())
    }
}

private class Test {
    @Test
    fun `ReverseInt handles 0 as an input`() {
        reverseInt(0) shouldBeEqualTo 0
    }

    @Test
    fun `ReverseInt flips a positive number`() {
        reverseInt(5) shouldBeEqualTo 5
        reverseInt(15) shouldBeEqualTo 51
        reverseInt(90) shouldBeEqualTo 9
        reverseInt(700) shouldBeEqualTo 7
        reverseInt(2359) shouldBeEqualTo 9532
    }

    @Test
    fun `ReverseInt flips a negative number`() {
        reverseInt(-5) shouldBeEqualTo -5
        reverseInt(-15) shouldBeEqualTo -51
        reverseInt(-90) shouldBeEqualTo -9
        reverseInt(-700) shouldBeEqualTo -7
        reverseInt(-2359) shouldBeEqualTo -9532
    }
}