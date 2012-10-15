array validRanks = [ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" ]
array validSuits = [ "H", "D", "C", "S" ]
String card1, card2, card3, card4, card5 = null
String unverifiedRank, unverifiedSuit, unverifiedCard, validRank, validSuit
int count = 0

while (card5 ==null)
{
count = count + 1
boolean suit, rank = false

print "Please enter card $count in format (XY), where X is Rank and Y is Suit. Two of Clubs would be 2C: "
unverifiedCard = System.console().readLine()
unverifiedRank = unverifiedCard.substring(0,1)
unverifiedSuit = unverifiedCard.substring(1,2)
if (validRanks.contains(unverifiedRank))
    {  
    validRank = unverifiedRank
    rank = true
    }
else 
    {
    print "invalid rank. input must be in range [12345678910JQKA]"
    count = count - 1
    }
if (validSuits.contains(unverifiedSuit))
    {  
    validSuit = unverifiedSuit
    suit = true
    }
else 
    {
    print "invalid suit. input must be in range [HDCS]"
    count = count - 1
    }

    if (suit = true && rank = true)
        {
         card = "$validSuit$validRank"