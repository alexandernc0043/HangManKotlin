fun play(){
    word = generateWord()
    var gameStatus = true
    printBoard()
    loop@
    while(gameStatus){
        gameStatus = checkStatus()
        if(gameStatus == false) break
        val guess = askGuess()
        if(checkGuess(guess)){
            correctGuesses += guess
        } else {
            wrongGuesses += guess
        }

        printBoard()
    }
    printWinLost(won)
}
fun askGuess(): String{
    while(true){
        try {
            println("Please enter your guess below")
            print("> ")
            val guess = readln()
            if(guess.length > 1) throw RuntimeException("You must only enter one character.")
            if(! guess.all {it.isLetter()}) throw RuntimeException("You must enter a letter.")
            return guess
        } catch (re: RuntimeException){
            println(re.message)
        } catch (e: Exception){
            println(e.message)
        }
    }
}
fun checkGuess(guess:String): Boolean {
    if(word.contains(guess)){
        val amount = word.count{it == guess}
        println("The word contains $amount of $guess.")
        return true
    }
    return false
}
fun printBoard(){
    println(Board.entries[wrongGuesses.size].stage)
    for(letter in word){
        if(correctGuesses.contains(letter)){
            print(" $letter ")
        } else {
            print(" ___ ")
        }
    }
    println("\nWrong guesses: $wrongGuesses [${wrongGuesses.size}]")
}
fun checkStatus(): Boolean{
    return if(correctGuesses.containsAll(word)){
        won = true
        false
    }
    else if(wrongGuesses.size == 6){
        won = false
        false
    }
    else {
        true
    }
}
fun printWinLost(win: Boolean){
    if(win){
        println("You won!\n\n\n\n")
        wrongGuesses.clear()
        correctGuesses.clear()
    } else {
        print("You lost! The word was ")
        word.forEach { print(it) }
        println("\n\n\n\n")
        wrongGuesses.clear()
        correctGuesses.clear()
    }
}