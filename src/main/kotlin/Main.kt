lateinit var word: List<String>
val wordList = generateListOfWords()
val correctGuesses: MutableList<String> = mutableListOf()
val wrongGuesses: MutableList<String> = mutableListOf()
var won: Boolean = false
var gamesToPlay: Int = 0
fun main() {
    initial()
    var i = 0
    while(i < gamesToPlay){
        play()
        i++
    }
}