print "enter some text and i'll tell you how many e's in it: "
word = System.console().readLine()
int count = 0

while (word.size() > 0)
{
    letter = word.charAt(0)
    if (letter == "e")
    {
        count++
    }
    word = word.substring(1)
}

print count