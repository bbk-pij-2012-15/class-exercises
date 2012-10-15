println "calculator v0.1"
print "Please enter two numbers, separated by pressing <ENTER>"
String inputOne = System.console().readLine()
String inputTwo = System.console().readLine()
double numberOne = Double.parseDouble(inputOne)
double numberTwo = Double.parseDouble(inputTwo)

print "Please select an operation by typing its number and prerssing <ENTER>:"
print "\n1 = add\n2 = subtract\n3 = divide\n 4 = multiply"
String choice = System.console().readLine()
int operation = Integer.parseInt(choice)

if (operation == 1)
{
	double answer = (numberOne + numberTwo)
}
else if (operation == 2)
{
	double answer = (numberOne - numberTwo)
}
else if (operation == 3)
{
	double answer = (numberOne / numberTwo)
}
else if (operation == 4)
{
	double answer = (numberOne * numberTwo)
}
else
{
	print "\ninvalid input. please start over and choose an operation from the range [1234]"
	System.exit(1)
}
