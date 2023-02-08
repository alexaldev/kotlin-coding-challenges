package com.igorwojda.string.reverse

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun reverse(str: String): String {
    val result = StringBuilder()
    ((str.length-1) downTo 0).forEach {
        result.append(str[it])
    }
    return result.toString()
}

private class Test {
    @Test
    fun `Reverse of 'abcd' is 'dcba'`() {
        reverse("abcd") shouldBeEqualTo "dcba"
    }

    @Test
    fun `Reverse of 'aabbccdd' is 'ddccbbaa'`() {
        reverse("aabbccdd") shouldBeEqualTo "ddccbbaa"
    }
}
