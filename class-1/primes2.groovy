boolean prime = null
print "please enter a number: "
number = System.console().readLine()
int i = Integer.parseInt(number)
int x = i


while (x >= 1)
	{
	x = x - 1
	
	if (x >= 1 && i % x == 0)
		{
		prime = false
		break
		}
	else
		{
		prime = true
		}		
	}
	
if (prime == true)
{print "yes"}
else
{print "no"}
