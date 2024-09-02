package com.github.alexandernc0043

import java.io.File

private var gamesToPlay: Int = 0
private var lengthOfWord: String = ""

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

private fun askLength(): String {
    while (true) {
        try {
            println("What length of words would you like to guess?\tShort: 1-5\tMedium 6-9\tLong: 10+")
            val response = readlnOrNull()
            if(response == null || !listOf("short", "medium","long").contains(response.lowercase())) {
                throw RuntimeException("You must enter either [Short, Medium, or Long]")
            }
            return response.lowercase()
        } catch (re: RuntimeException) {
            println(re.message)
        } catch (e: Exception) {
            println("Sorry you must enter a number")
        }
    }

}

fun generateListOfWords(): List<String> {
    return File("words.txt").readLines()
}

private fun generateWord(): List<String> {
    val list: List<String>
    while (true) {
        val word = wordList.random()
        when (lengthOfWord) {
            "short" -> {
                if (word.length in 0..5) {
                    list = convertToList(word)
                    break
                }
            }

            "medium" -> {
                if (word.length in 6..9) {
                    list = convertToList(word)
                    break
                }
            }

            "long" -> {
                if (word.length > 10) {
                    list = convertToList(word)
                    break
                }
            }
        }
    }
    return list
}

private fun convertToList(word: String): List<String> {
    val returnList: MutableList<String> = mutableListOf()
    val splitWord = word.toCharArray()
    splitWord.forEach { char ->
        returnList += char.toString()
    }
    return returnList
}