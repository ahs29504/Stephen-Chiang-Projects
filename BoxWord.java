//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
 
import static java.lang.System.*;
 
public class BoxWord
{
   private String word;
 
        public BoxWord()
        {
                word="";
        }
 
        public BoxWord(String s)
        {
                setWord(s);
        }
 
        public void setWord(String w)
        {
                word = w;
                // set incoming parameter to the local variable
        }
 
        public String toString()
        {
                String output="";
                output+=word+"\n";
 
                /* create a for loop that has:
                    starting value x declared as an integer and set equal to word.length()-1
                    test boolean condition where the integer is greater than 1
                    decrement integer by 1 */
 
 
 
                for(int x = word.length()-1; x>1; x=x-1)
                {
                        output+=word.charAt(word.length()-x);
 
                /* create a for loop that has:
                    starting value k declared as an integer and set equal to word.length()-2
                    test boolean condition where the integer is greater than 0
                    decrement integer by 1 */
                        for(int k=word.length()-2; k>0; k=k-1)
 
                        {
                                output+=" ";
                        }
                        output+=word.charAt(x-1)+"\n";
 
                }
 
                // create an if statement to test if the word length is greater than 1
 
                if (word.length()>1)
                {
                        StringBuffer newword = new StringBuffer (word);
                        output+=newword.reverse()+"\n";
                }
                return output+"\n";
        }
}