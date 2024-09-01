package com.github.alexandernc0043


fun initial() {
    gamesToPlay = askGames()
    lengthOfWord = askLength()
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
    return length
}
