print "please enter a number: "
num1 = System.console().readLine()
int x = Integer.parseInt(num1)
print "please enter another number: "
num2 = System.console().readLine()
int y = Integer.parseInt(num2)
int smlnum = y
int rem_else = 0

count = 0

while (y < x)
	{
	y = y + smlnum
	count = count + 1	
	}
	
rem = x - y

if (rem >= 0)
{
print "$num1 divided by $num2 is $count remainder $rem"
}
else 
{
rem_else = x - (y - smlnum)
}

if (rem_else != 0)
{
print "$num1 divided by $num2 is $count remainder $rem_else"
}