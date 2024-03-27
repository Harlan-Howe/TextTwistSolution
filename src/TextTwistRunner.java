import java.util.ArrayList;
import java.util.Scanner;
public class TextTwistRunner
{
    public static void main(String[] args)
    {
        TextTwister tt = new TextTwister();

        Scanner keyReader = new Scanner(System.in);
        System.out.println("Enter a word to twist: ");
        while (true)
        {
            String wordToTwist = keyReader.nextLine();

            ArrayList<String> wordList = tt.twistWord(wordToTwist);

            if (wordList == null)
                throw new RuntimeException("I got a null list back from the TextTwister. I'm guessing you haven't written the method yet.");

            for (String s : wordList) {
                System.out.println(s);
            }

            /*
            Alternate version... prints the words, sorted by length. Perhaps not the most efficient way of doing this.

            for (int i=1;i<=wordToTwist.length(); i++)
            {
                for (String s: wordList)
                {
                    if (s.length() == i)
                    {
                        System.out.println(s);
                    }
                }
            }
        */

        }
    }
}
