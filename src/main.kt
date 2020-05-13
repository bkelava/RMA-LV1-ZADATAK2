fun main() {
    val game = Blackjack()
    var input: String = ""

    while (input != "4") {
        println("Welcome to Kotlin-BlackJack!")
        println("[1] Play a game")
        println("[2] View stats")
        println("[3] Reset stats")
        println("[4] Quit game")

        input = readLine().toString()

        when (input) {
            "1" -> game.play()
            "2" -> game.displayStats()
            "3" -> game.resetStats()
            "4" -> println("Goodbye!")
            else -> println("Invalid entry")
        }
    }
}