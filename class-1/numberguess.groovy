int numberToGuess = Math.abs(1000 * Math.random())
int count = 0
int guess

while (guess != numberToGuess)
{
    count = count + 1
    println "Guess the number: "
    guessStr = System.console().readLine()
    guess = Integer.parseInt(guessStr)
        if (guess > numberToGuess)
                {println "Lower!"}
        else if (guess < numberToGuess)
                {println "Higher!"}
        else
                {println "CORRECT!!!"
                 break}
}

print "You needed $count guesses"