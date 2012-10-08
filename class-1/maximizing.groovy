String str = 0
int x, highest = 0

while (x != -1)
{
    println "Please enter a positive number [-1 to stop]"
    str = System.console().readLine()
    x = Integer.parseInt(str)
    
    if (x > highest)
    {
        highest = x
    }
    
}

print "\nThe highest number entered was: $highest"