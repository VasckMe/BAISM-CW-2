package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

class MailValidatorTest {
    @Test
    fun mailValidator_IsGood_SmallMail() {
        assertFalse(MailValidator.isGood("m@g.com"))
    }

    @Test
    fun mailValidator_IsGood_MissingSymbol() {
        assertFalse(MailValidator.isGood("mytesttest.gmail.com"))
    }

    @Test
    fun mailValidator_IsGood_CorrectMail() {
        assertTrue(MailValidator.isGood("myfirstsecondtest@gmail.com"))
    }
}