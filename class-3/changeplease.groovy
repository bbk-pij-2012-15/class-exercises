double cost, paid, change, temp, newChange, changeRemaining
int loopNumber = 0, amount_of_note_or_coin, special
String note_or_coin_name
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
print "Please enter item cost: "
itemCost = System.console().readLine()
cost = Double.parseDouble(itemCost)
print "\nPlease enter amount paid: "
amountPaid = System.console().readLine()
paid = Double.parseDouble(amountPaid)
changeRemaining = (paid - cost)
change = (paid - cost)
print "Your change is: $change"

while (changeRemaining > 0)
{
    loopNumber++
    if (loopNumber == 1) {
        special = 50 ; 
        note_or_coin_name = "£50 notes"
    } else if (loopNumber == 2) {special = 20 ; note_or_coin_name = "£20 notes"}
    else if (loopNumber == 3) {special = 10 ; note_or_coin_name = "£10 notes"}
    else if (loopNumber == 4) {special = 5 ; note_or_coin_name = "£5 notes"}
    else if (loopNumber == 5) {special = 2 ; note_or_coin_name = "£2 coins"}
    else if (loopNumber == 6) {special = 1 ; note_or_coin_name = "£1 coins"}
    else if (loopNumber == 7) {special = 0.50 ; note_or_coin_name = "50p coins"}
    else if (loopNumber == 8) {special = 0.20 ; note_or_coin_name = "20p coins"}
    else if (loopNumber == 9) {special = 0.10 ; note_or_coin_name = "10p coins"}
    else if (loopNumber == 10) {special = 0.05 ; note_or_coin_name = "5p coins"}
    else if (loopNumber == 11) {special = 0.02 ; note_or_coin_name = "2p coins"}
    else if (loopNumber == 12) {special = 0.01 ; note_or_coin_name = "1p coins"}
    else if (loopNumber > 12) {
        break
    }

    amount_of_note_or_coin = (changeRemaining / special)
    newChange = (special * amount_of_note_or_coin)
    changeRemaining = (changeRemaining - newChange)

    print "\n You should receive: $amount_of_note_or_coin $note_or_coin_name"
    println "\n amount_of_note_or_coin = $amount_of_note_or_coin \n changeRemaining = $changeRemaining \n special = $special"
   
    print "\n$changeRemaining"
}
