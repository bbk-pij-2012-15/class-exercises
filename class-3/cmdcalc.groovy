print "command line calculator v0.1"
print "\nPlease enter a sum consisting of two number and an operator, followed by <ENTER>"
print "\n(operators must be +, -, * or /)"
String sum = System.console().readLine()
sum = sum.replaceAll("\\s","")
boolean add, subtract, multiply, divide = false

if (sum.contains("+"))
{
	add = true
	int operatorPosition = sum.indexOf("+")
}
if (sum.contains("-"))
{
	subtract = true
	int operatorPosition = sum.indexOf("-")
}
if (sum.contains("*"))
{
	multiply = true
	int operatorPosition = sum.indexOf("*")
}
if (sum.contains("/"))
{
	divide = true
	int operatorPosition = sum.indexOf("/")
}

double number2 = sum.substring(operatorPosition)


int sumSize = sum.size()
print sumSize

