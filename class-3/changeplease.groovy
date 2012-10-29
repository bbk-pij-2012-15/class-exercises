double cost, paid, change, temp, newChange
int fiftyNote, twentyNote, tenNote, fiveNote, twopoundCoin, onepoundCoin, fiftyCoin, twentyCoin, tenCoin, fiveCoin, twoCoin, oneCoin
print "Please enter item cost: "
itemCost = System.console().readLine()
cost = Integer.parseInt(itemCost)
print "\nPlease enter amount paid: "
amountPaid = System.console().readLine()
paid = Integer.parseInt(amountPaid)
changeRemaining = (paid - cost)

fiftyNote = (changeRemaining / 50)
newChange = 50 * fiftyNote
changeRemaining = (changeRemaining - newChange)

twentyNote = (changeRemaining / 20)
newChange = 20 * twentyNote
changeRemaining = (changeRemaining - newChange)



print "$fiftyNote\n$newChange\n$changeRemaining\n$twentyNote"
