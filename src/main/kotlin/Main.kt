package com.github.alexandernc0043

lateinit var word: List<String>

fun main() {
    initial()
    play()
    var tempWord = ""
    var guessTemp = ""
    word.forEach{
        it.forEach { guessTemp += "___ " ; tempWord += "_${it}_ "}
    }
    print(tempWord)
    println()
    print(guessTemp)
}