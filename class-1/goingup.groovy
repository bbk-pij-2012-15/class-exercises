String str = 0
int x, prevx = 0
boolean consecutive, done = false
boolean failsafe = true

while (!done)
{
    prevx = x
    println "Please enter a positive number [-1 to stop]"
    str = System.console().readLine()
    x = Integer.parseInt(str)
    
    if (x == -1)
    {
    break
    }
    else if (x == (prevx + 1))
    {
        consecutive = true
    }
    else if (x != (prevx + 1))
    {
        failsafe = false
    }
}

if (consecutive == true && failsafe == true)
{
    print "Yes"
}
else
{
    print "No"
}
