print "command line calculator v0.1"
print "\nPlease enter a sum consisting of two number and an operator, followed by <ENTER>"
print "\n(operators must be +, -, * or /)"
String sum = System.console().readLine()
sum = sum.replaceAll("\\s","")                        //stripping all whitespace with regex
int operatorPosition
double answer
boolean add, subtract, multiply, divide = false

if (sum.contains("+"))
{
    add = true
    operatorPosition = sum.indexOf("+")
}
if (sum.contains("-"))
{
    subtract = true
    operatorPosition = sum.indexOf("-")
}                                    //determining which operator to apply later
if (sum.contains("*"))
{
    multiply = true
    operatorPosition = sum.indexOf("*")
}
if (sum.contains("/"))
{
    divide = true
    operatorPosition = sum.indexOf("/")
}

String num2 = sum.substring(operatorPosition + 1)
double numberTwo = Double.parseDouble(num2)                    //using the operator character as a position
String num1 = sum.substring(0, operatorPosition)                //from which to split the string into 2 numbers
double numberOne = Double.parseDouble(num1)

if (add == true)
{
    answer = (numberOne + numberTwo)
}
if (subtract == true)
{
    answer = (numberOne - numberTwo)
}
if (multiply == true)
{
    answer = (numberOne * numberTwo)
}
if (divide == true)
{
    answer = (numberOne / numberTwo)
}

print "\n The result is: $answer"