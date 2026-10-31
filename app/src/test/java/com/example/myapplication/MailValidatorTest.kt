package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

class MailValidatorTest {
    @Test
    fun mailValidator_IsGood_SmallMail() {
        assertTrue(MailValidator.isGood("m@g.com"))
    }

    @Test
    fun mailValidator_IsGood_MissingSymbol() {
        assertTrue(MailValidator.isGood("mytesttest.gmail.com"))
    }

    @Test
    fun mailValidator_IsGood_CorrectMail() {
        assertFalse(MailValidator.isGood("myfirstsecondtest@gmail.com"))
    }
}