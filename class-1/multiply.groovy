print "please enter a number: "
num1 = System.console().readLine()
int x = Integer.parseInt(num1)
print "please enter another number: "
num2 = System.console().readLine()
int y = Integer.parseInt(num2)
int count, answer = 0

while (count != y)
	{
	count = count + 1
	answer = answer + x
	}

print "the result was: " + answer 
