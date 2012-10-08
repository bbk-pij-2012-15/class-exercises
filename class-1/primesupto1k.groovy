int count = 1
boolean primeCheck = null

while (count < 1001)
{
    int dividedBy = 2
    int potentialPrime = count
    while (dividedBy < potentialPrime)
    {
        int remainder = count % dividedBy
        if (remainder == 0)
        {
            primeCheck = false
        }
        else 
        {primeCheck = true}
            if (primeCheck == true)
            {
                dividedBy = dividedBy + 1
            }
            else
            {break}
    }
    if (dividedBy == count)
    {
        print "\n$count"
    }
    count = count + 1
}