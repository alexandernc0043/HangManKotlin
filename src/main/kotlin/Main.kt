package com.github.alexandernc0043

lateinit var word: List<String>
val wordList = generateListOfWords()
val correctGuesses: MutableList<String> = mutableListOf()
val wrongGuesses: MutableList<String> = mutableListOf()
var won: Boolean = false
fun main() {
    initial()
    play()

}