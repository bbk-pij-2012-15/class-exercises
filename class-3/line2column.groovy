print "Please enter some text: "
text = System.console().readLine()
int length = text.length()
int count = 0
String letter

while (count < length)
{
    count++
    letter = text.substring(0,1)
    println "$letter"
    text = text.substring(1)
}