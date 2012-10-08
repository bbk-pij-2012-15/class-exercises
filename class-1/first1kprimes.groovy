int count = 1
int thousandCount = 0
boolean primeCheck = null

while (thousandCount < 1000)
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
        thousandCount = thousandCount + 1
    }
    count = count + 1
}