package com.github.alexandernc0043

import java.io.File

private var gamesToPlay: Int = 0
private var lengthOfWord: Int = 0

fun initial() {
    gamesToPlay = askGames()
    lengthOfWord = askLength()
    word = generateWord()
}

private fun askGames(): Int {
    var games: Int
    while (true) {
        try {
            println("How many games would you like to play?")
            games = readln().toInt()
            if (games < 1) throw RuntimeException("You must play at least 1 game.")
            break
        } catch (re: RuntimeException) {
            println(re.message)
        } catch (e: Exception) {
            println("Sorry you must enter a number!")
        }
    }
    return games
}

private fun askLength(): Int {
    var length: Int
    while (true) {
        try {
            println("What length of words would you like to guess?\tShort: 1-5\tMedium 6-9\tLong: 10+")
            length = readln().toInt()
            if (length < 1) throw RuntimeException("The value must be at least 1.")
            break
        } catch (re: RuntimeException) {
            println(re.message)
        } catch (e: Exception) {
            println("Sorry you must enter a number")
        }
    }
    return if (length in 0..5) {
        0
    } else if (length in 6..9) {
        1
    } else {
        2
    }
}

private fun generateWord(): List<String> {
    var list: List<String> = listOf()
    File("words.txt").forEachLine {
        when(lengthOfWord){
            0 -> if(it.length in 0..5) list = returnWordMap(it)
            1 -> if(it.length in 6..9) list = returnWordMap(it)
            2 -> if(it.length > 10) list = returnWordMap(it)
        }
    }
    return list
}
private fun returnWordMap(word: String): List<String>{
    val returnList: MutableList<String> = mutableListOf()
    val splitWord = word.toCharArray()
    splitWord.forEach { char ->
        returnList += char.toString()
    }
    return returnList
}