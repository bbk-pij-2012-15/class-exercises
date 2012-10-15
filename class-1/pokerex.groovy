validRanks = [ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" ]
validSuits = [ "H", "D", "C", "S" ]
String card1, card2, card3, card4, card5 = null
String unverifiedRank, unverifiedSuit, unverifiedCard, validRank, validSuit
int count = 1
boolean suit, rank = false

/////////////////////////////////////////////////////VALIDITY CHECKS START/////////////////////////////////////////////////////////////

print "Please enter card $count in format (XY), where X is Rank and Y is Suit. Two of Clubs would be 2C, Ace of Spades AS: "
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
    print "invalid rank. input must be in range [12345678910JQKA]. Quit and start again"
    }
if (validSuits.contains(unverifiedSuit))
    {  
    validSuit = unverifiedSuit
    suit = true
    }
else 
    {
    print "invalid suit. input must be in range [HDCS]. Quit and start again"
    }

    if (suit == true && rank == true)
        {
         card1 = "$validRank$validSuit"
         count = count + 1
        }
        
print "Please enter card $count in format (XY), where X is Rank and Y is Suit. Two of Clubs would be 2C, Ace of Spades AS: "
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
    print "invalid rank. input must be in range [12345678910JQKA]. Quit and start again"
    }
if (validSuits.contains(unverifiedSuit))
    {  
    validSuit = unverifiedSuit
    suit = true
    }
else 
    {
    print "invalid suit. input must be in range [HDCS]. Quit and start again"
    }

    if (suit == true && rank == true)
        {
         card2 = "$validRank$validSuit"
         count = count + 1
        }
        
print "Please enter card $count in format (XY), where X is Rank and Y is Suit. Two of Clubs would be 2C, Ace of Spades AS: "
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
    print "invalid rank. input must be in range [12345678910JQKA]. Quit and start again"
    }
if (validSuits.contains(unverifiedSuit))
    {  
    validSuit = unverifiedSuit
    suit = true
    }
else 
    {
    print "invalid suit. input must be in range [HDCS]. Quit and start again"
    }

    if (suit == true && rank == true)
        {
         card3 = "$validRank$validSuit"
         count = count + 1
        }
        
print "Please enter card $count in format (XY), where X is Rank and Y is Suit. Two of Clubs would be 2C, Ace of Spades AS: "
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
    print "invalid rank. input must be in range [12345678910JQKA]. Quit and start again"
    }
if (validSuits.contains(unverifiedSuit))
    {  
    validSuit = unverifiedSuit
    suit = true
    }
else 
    {
    print "invalid suit. input must be in range [HDCS]. Quit and start again"
    }

    if (suit == true && rank == true)
        {
         card4 = "$validRank$validSuit"
         count = count + 1
        }
        
print "Please enter card $count in format (XY), where X is Rank and Y is Suit. Two of Clubs would be 2C, Ace of Spades AS: "
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
    print "invalid rank. input must be in range [12345678910JQKA]. Quit and start again"
    }
if (validSuits.contains(unverifiedSuit))
    {  
    validSuit = unverifiedSuit
    suit = true
    }
else 
    {
    print "invalid suit. input must be in range [HDCS]. Quit and start again"
    }

    if (suit == true && rank == true)
        {
         card5 = "$validRank$validSuit"
         count = count + 1
        }
        
////////////////////////////////////////////////////////////VALIDITY CHECKS END/////////////////////////////////////////////////////////

print "\t$card1\t$card2\t$card3\t$card4\t$card5"