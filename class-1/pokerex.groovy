validRanks = [ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" ]
validSuits = [ "H", "D", "C", "S" ]
String card1, card2, card3, card4, card5 = null
String unverifiedRank, unverifiedSuit, unverifiedCard, validRank, validSuit
int count = 1
boolean suit, rank = false

/////////////////////////////////////////////////////VALIDITY CHECKS START/////////////////////////////////////////////////////////////

print "Please enter card $count in format (XY), where X is Rank and Y is Suit. Two of Clubs would be 2C, Ace of Spades 1S: "
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
    print "invalid rank. input must be in range [12345678910JQK]. Quit and start again"
    System.exit(1)
    }
if (validSuits.contains(unverifiedSuit))
    {  
    validSuit = unverifiedSuit
    suit = true
    }
else 
    {
    print "invalid suit. input must be in range [HDCS]. Quit and start again"
    System.exit(1)
    }

    if (suit == true && rank == true)
        {
         card1 = "$validRank$validSuit"
         rank1 = validRank
         suit1 = validSuit
         count = count + 1
        }
        
print "Please enter card $count in format (XY), where X is Rank and Y is Suit. Two of Clubs would be 2C, Ace of Spades 1S: "
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
    print "invalid rank. input must be in range [12345678910JQK]. Quit and start again"
    System.exit(1)
    }
if (validSuits.contains(unverifiedSuit))
    {  
    validSuit = unverifiedSuit
    suit = true
    }
else 
    {
    print "invalid suit. input must be in range [HDCS]. Quit and start again"
    System.exit(1)
    }

    if (suit == true && rank == true)
        {
         card2 = "$validRank$validSuit"
         rank2 = validRank
         suit2 = validSuit
         count = count + 1
        }
        
print "Please enter card $count in format (XY), where X is Rank and Y is Suit. Two of Clubs would be 2C, Ace of Spades 1S: "
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
    print "invalid rank. input must be in range [12345678910JQK]. Quit and start again"
    System.exit(1)
    }
if (validSuits.contains(unverifiedSuit))
    {  
    validSuit = unverifiedSuit
    suit = true
    }
else 
    {
    print "invalid suit. input must be in range [HDCS]. Quit and start again"
    System.exit(1)
    }

    if (suit == true && rank == true)
        {
         card3 = "$validRank$validSuit"
         rank3 = validRank
         suit3 = validSuit
         count = count + 1
        }
        
print "Please enter card $count in format (XY), where X is Rank and Y is Suit. Two of Clubs would be 2C, Ace of Spades 1S: "
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
    print "invalid rank. input must be in range [12345678910JQK]. Quit and start again"
    System.exit(1)
    }
if (validSuits.contains(unverifiedSuit))
    {  
    validSuit = unverifiedSuit
    suit = true
    }
else 
    {
    print "invalid suit. input must be in range [HDCS]. Quit and start again"
    System.exit(1)
    }

    if (suit == true && rank == true)
        {
         card4 = "$validRank$validSuit"
         rank4 = validRank
         suit4 = validSuit
         count = count + 1
        }
        
print "Please enter card $count in format (XY), where X is Rank and Y is Suit. Two of Clubs would be 2C, Ace of Spades 1S: "
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
    print "invalid rank. input must be in range [12345678910JQK1]. Quit and start again"
    System.exit(1)
    }
if (validSuits.contains(unverifiedSuit))
    {  
    validSuit = unverifiedSuit
    suit = true
    }
else 
    {
    print "invalid suit. input must be in range [HDCS]. Quit and start again"
    System.exit(1)
    }

    if (suit == true && rank == true)
        {
         card5 = "$validRank$validSuit"
         rank5 = validRank
         suit5 = validSuit
         count = count + 1
        }
        
////////////////////////////////////////////////////////////VALIDITY CHECKS END/////////////////////////////////////////////////////////

print "\t$card1\t$card2\t$card3\t$card4\t$card5"

///////////////////////////////////////////////////////////NEED TO SORT CARDS//////////////////////////////////////////////////////

if (rank1 == "J") {rank1 = "11"}
else if (rank1 == "Q") {rank1 = "12"}
else if (rank1 == "K") {rank1 = "13"}
if (rank2 == "J") {rank2 = "11"}
else if (rank2 == "Q") {rank2 = "12"}
else if (rank2 == "K") {rank2 = "13"}
if (rank3 == "J") {rank3 = "11"}
else if (rank3 == "Q") {rank3 = "12"}                                    //////converting jack, queen and king values to numbers, for sorting purposes
else if (rank3 == "K") {rank3 = "13"}
if (rank4 == "J") {rank4 = "11"}
else if (rank4 == "Q") {rank4 = "12"}
else if (rank4 == "K") {rank4 = "13"}
if (rank5 == "J") {rank5 = "11"}
else if (rank5 == "Q") {rank5 = "12"}
else if (rank5 == "K") {rank5 = "13"}

int int1 = Integer.parseInt(rank1)
int int2 = Integer.parseInt(rank2)
int int3 = Integer.parseInt(rank3)                                        ///////////////making them all integers
int int4 = Integer.parseInt(rank4)
int int5 = Integer.parseInt(rank5)

int top, four, three, two, one                                        //////// defining some integers to store the sorted ranks
unsortedList = [0,0,0,0,0] 
unsortedList[0] = int1
unsortedList[1] = int2
unsortedList[2] = int3
unsortedList[3] = int4
unsortedList[4] = int5
sortedList = unsortedList.sort()
print sortedList