package com.github.alexandernc0043

fun play(){
    var winStatus = false

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
fun checkGuess(){

}
