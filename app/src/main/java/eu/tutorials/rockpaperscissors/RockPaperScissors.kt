package eu.tutorials.rockpaperscissors

fun main() {
    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper or Scissors? Enter your choice: ")
    playerChoice = readln()

    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }

        2 -> {
            computerChoice = "Paper"
        }

        3 -> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "TIE"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }
    if (winner == "TIE") {
        println("It's a TIE")

    } else {
        println("$winner Won!")
    }
}