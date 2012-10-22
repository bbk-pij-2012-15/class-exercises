double totalBorrowed, yearsToPayback, interestRate, interestOverOneHundred
double numberOne = 1
print "Please enter the total amount borrowed for your mortgage: "
userInput = System.console().readLine()
totalBorrowed = Double.parseDouble(userInput)
print "Now enter the number of years over which you will pay it back: "
userInput = System.console().readLine()
yearsToPayback = Double.parseDouble(userInput)
print "Finally, enter the rate of interest: "
userInput = System.console().readLine()
interestRate = Double.parseDouble(userInput)
interestOverOneHundred = (interestRate / 100)

double totalToBePaid(double totalBorrowed, double numberOne, double interestOverOneHundred) {
    totalToBePaid = totalBorrowed * (numberOne + interestOverOneHundred)
    return totalToBePaid
}

totalToBePaid(totalBorrowed, numberOne, interestOverOneHundred)

double moneyToBePaid(double totalToBePaid, double yearsToPayback) {
    moneyToBePaid = (totalToBePaid / yearsToPayback)
    return moneyToBePaid
}

moneyToBePaid(totalToBePaid, yearsToPayback)

double numberOfYears(double totalToBePaid, double totalBorrowed) {
    double totalInterest = (totalToBePaid - totalBorrowed)
    numberOfYears = (totalInterest / moneyToBePaid)
    return numberOfYears
}

numberOfYears(totalToBePaid, totalBorrowed)

print "\nThe total amount you will pay is $totalToBePaid"
print "\nThe money you must pay every year is $moneyToBePaid"
print "\nThe number of years before the interst is paid, and only initial capital remains is $numberOfYears"