double answer
println "calculator v0.1"
print "Please enter two numbers, separated by pressing <ENTER>"
String inputOne = System.console().readLine()
String inputTwo = System.console().readLine()
double numberOne = Double.parseDouble(inputOne)
double numberTwo = Double.parseDouble(inputTwo)

print "\nPlease select an operation by typing its number and prerssing <ENTER>:"
print "\n1 = add\n2 = subtract\n3 = divide\n4 = multiply"
String choice = System.console().readLine()
int operation = Integer.parseInt(choice)

if (operation == 1)
{
	answer = (numberOne + numberTwo)
}
else if (operation == 2)
{
	answer = (numberOne - numberTwo)
}
else if (operation == 3)
{
	answer = (numberOne / numberTwo)
}
else if (operation == 4)
{
	answer = (numberOne * numberTwo)
}
else
{
	print "\ninvalid input. please start over and choose an operation from the range [1234]"
	System.exit(1)
}

print "\n\nThe result is: $answer"
