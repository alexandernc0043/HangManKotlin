import java.io.File


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

