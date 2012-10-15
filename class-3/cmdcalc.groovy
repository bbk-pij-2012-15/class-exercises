print "command line calculator v0.1"
print "\nPlease enter a sum consisting of two number and an operator, followed by <ENTER>"
print "\n(operators must be +, -, * or /)"
String sum = System.console().readLine()
sum = sum.replaceAll("\\s","")						//stripping all whitespace with regex
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
}									//determining which operator to apply later
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

String num2 = sum.substring(operatorPosition + 1)
double numberTwo = Double.parseDouble(num2)					//using the operator character as a position
String num1 = sum.substring(0, operatorPosition)				//from which to split the string into 2 numbers
double numberOne = Double.parseDouble(num1)


int sumSize = sum.size()
print sumSize

