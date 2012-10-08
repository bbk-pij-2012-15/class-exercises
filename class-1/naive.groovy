println "please enter a number: "
num1 = System.console().readLine()
int int1 = Integer.parseInt(num1)
println "please enter another number: "
num2 = System.console().readLine()
int int2 = Integer.parseInt(num2)
println "please enter a final number: "
num3 = System.console().readLine()
int int3 = Integer.parseInt(num2)
int lowest, middle, highest

if (int1 < int2 && int1 < int3 )
{lowest = int1}
if (int2 < int1 && int2 < int3 )
{lowest = int2}
if (int3 < int1 && int3 < int2 )
{lowest = int3}

if (int1 < int2 && int1 > int3 )
{middle = int1}
if (int1 < int3 && int1 > int2 )
{middle = int1}
if (int2 < int1 && int2 > int3 )
{middle = int2}
if (int2 < int2 && int2 > int1 )
{middle = int2}
if (int3 < int1 && int3 > int2 )
{middle = int3}
if (int3 < int2 && int3 > int1 )
{middle = int3}

if (int1 > int2 && int1 > int3 )
{highest = int1}
if (int2 > int1 && int2 > int3 )
{highest = int2}
if (int3 > int1 && int3 > int2 )
{highest = int3}

print "from lowest to highest: $lowest, $middle, $highest"

