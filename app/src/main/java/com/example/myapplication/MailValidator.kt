package com.example.myapplication

object MailValidator {
    fun isGood(mail: String): Boolean =
        mail.length >= 10 && mail.contains("@")
}