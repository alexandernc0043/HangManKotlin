import java.io.File

var lengthOfWord: String = ""

fun generateListOfWords(): List<String> {
    return File("src/main/resources/words.txt").readLines()
}

fun generateWord(): List<String> {
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