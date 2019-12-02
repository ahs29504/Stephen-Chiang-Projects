public class TriangleTwo
{
    private int size; //size
    private String letter; //symbol or letter

public TriangleTwo()
{

}

public TriangleTwo(int count, String let)
{
    setTriangle(count, let);
}

public void setTriangle(int count, String let)
{
    size = count;
    letter = let;
}

public String getLetter()
{
    return "*"; //you can change the symbol that is printed
}

public String toString()
{
    String output="";
    for(int i = size; i >= 1; i--) // transverse through col
    {
        for(int x = i; x >= 1; x--) // transverse through row
        {    
            output += letter; // will print the letter that you chose
        }
        output += "\n"; // skips a line
    }
    return output + "\n"; // prints triangle
}
}