package com.igorwojda.string.capitalizesentence

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun capitalizeSentence(str: String): String {
    return str.split(" ").map { it.replaceFirstChar { it.titlecase() } }
        .fold("") { acc, s -> "$acc$s " }
        .removeSuffix(" ")
}

private class Test {
    @Test
    fun `"flower" is capitalized to "Flower"`() {
        capitalizeSentence("flower") shouldBeEqualTo "Flower"
    }

    @Test
    fun `"this is a house" is capitalised to "This Is A House"`() {
        capitalizeSentence("this is a house") shouldBeEqualTo "This Is A House"
    }
}
