String str = 0
int x, prevx, valid = 0
boolean consecutive, done = false
boolean failsafe = true
boolean firstrun = true

while (!done)
{
    prevx = x
    valid = prevx + 1
    println "Please enter a positive number [-1 to stop]"
    str = System.console().readLine()
    x = Integer.parseInt(str)
    
    if (x == -1)
    {
    break
    }
    else if (x == valid)
    {
        consecutive = true
    }
    else if (firstrun = false)
    {
        failsafe = false
    }
    
    firstrun = false
}

if (consecutive == true && failsafe == true)
{
    print "Yes"
}
else if (consecutive == false && failsafe == true)
{
    print "confalse"
}
else if (consecutive == true && failsafe == false)
{
    print "failfalse"
}
else if (consecutive == false && failsafe == false)
{
    print "allfalse"
}