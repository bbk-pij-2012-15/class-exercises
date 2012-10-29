print "enter some text: "
word = System.console().readLine()
print "\nenter the letter you want to search the text for: "
searchTerm = System.console().readLine()

int count = 0

while (word.size() > 0)
{
    letter = word.charAt(0)
    if (letter == searchTerm)
    {
        count++
    }
    word = word.substring(1)
}

print count