import java.io.*;
import java.util.ArrayList;

public class TextTwister
{

    ArrayList<String> dictionary;

    public TextTwister()
    {
        loadDictionary();
    }

    /**
     * reads the words in the file "word_list_moby_crossword.flat.txt" into the "dictionary" ArrayList.
     */
    private static void loadDictionary() {
        ArrayList<String> dictionary = new ArrayList<String>();
        File inputFile = new File("word_list_moby_crossword.flat.txt");
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String word;
            while((word = reader.readLine())!=null)
            {
                dictionary.add(word);
            }

        }catch (FileNotFoundException fnfExp)
        {
            System.out.println("File not found.");
            fnfExp.printStackTrace();
        }
        catch (IOException ioExp)
        {
            ioExp.printStackTrace();
        }
        System.out.println("Dictionary Loaded. "+dictionary.size());
    }

    /**
     * takes a string and makes a copy with the letter at index i removed.
     * For example:
     *      stringWithLetterAtIndexRemoved("bird", 2) --> "bid"
     *      stringWithLetterAtIndexRemoved("bird", 0) --> "ird"
     *      stringWithLetterAtIndexRemoved("rodent", 5) --> "roden"
     *      stringWithLetterAtIndexRemoved("rodent", 6) --> throws an exception.
     * @param s - the source string
     * @param i - the index of the character to remove
     * @return - a string that is one character shorter than s.
     */
    public String stringWithLetterAtIndexRemoved(String s, int i)
    {
        String result = "";
        // TODO: (OPTIONAL) you write this! (I think you will find this helpful later....)

        return result;
    }


    /**
     * given a source word, returns an ArrayList of all the strings that are composed of the letters contained in
     * wordToTwist in any order, where each letter appears exactly zero on one time.
     * In the case of repeated letters, like "Hello," there might be repeats or the letter "l" might be used twice.
     * -- So getting "Heo," "Helo," "Helo," and "Hello" (amongst many others) would be expected.
     * Optional: return just the list of "real" words.
     * @param wordToTwist - the source string to manipulate.
     * @return - an ArrayList of strings build from the wordToTwist.
     */
    public ArrayList<String> twistWord(String wordToTwist)
    {
        ArrayList<String> result = null;
        // TODO: write this method.
        // This is almost certainly a wrapper method that should
        // call a recursive method that returns an ArrayList of
        // Strings that you will subsequently return.

        return result;
    }

    // TODO: write a recursive method that receives a String for
    //  the "prefix" and the String for the "pool" and returns
    //  an ArrayList of all the possible "words" that start with the
    //  prefix and contain some, none, or all of the letters in the pool.

    /**
     * returns a new list of words that all start with contents of "prefix" and have combinations of the letters in
     * "pool"
     * For example, suppose we have a prefix "pla" and a pool "ids".
     * We'll consider the "i" from the pool. This gives us "plai" but recursion might return
     *        a list of ("plaid", "plaids", "plais", and "plaisd".)
     *        Hint: what do all those words start with? What is used to make the differences?
     * Next consider the "d" in the pool. This gives us "plad" but recursion might return
     *        a list of ("pladi", "pladis", "plads", and "pladsi".)
     * Also consider the "s" in the pool. This gives us "plas" but recursion might return
     *        a list of ("plasi", "plasid", "plasd" and "plasdi".)
     *
     * So this method would return a list of ("plai", "plaid", "plaids", "plais", and "plaisd", "plad", "pladi",
     * "pladis", "plads", "pladsi", "plas", "plasi", "plasid", "plasd" and "plasdi".)
     *
     * @param prefix - the starting part of all words to be generated
     * @param pool - the letters available to "play" with to make new words
     * @return - a list of words that start with "prefix" and end with a combination of letters in "pool" zero or one
     * times.
     */
    public ArrayList<String> twistWord(String prefix, String pool)
    {
        System.out.println("prefix: '"+prefix+"'\tpool: '"+pool+";"); // recommended for debugging.
        ArrayList<String> result = null;
        // TODO: write this recursive method.

        return result;
    }

    // TODO: (optional) given an ArrayList of "words," returns another
    //  ArrayList of all the words on this list that are actually found
    //  in the dictionary.

    /**
     * given a list of strings, returns a list of strings contained in the original list that were also contained in
     * the "word_list_moby_crossword.flat.txt" file.
     * @param randomWords - an ArrayList of random strings
     * @return an ArrayList of strings found in randomWords that are actual words.
     */
    public ArrayList<String> getRealWordsFromList(ArrayList<String> randomWords)
    {
        ArrayList<String> realWords = new ArrayList<String>();
        // TODO (Optional) - Loop through each word in randomWords and search for that word in the "dictionary" ArrayList.
        //                   If you find a match in the dictionary, append this word to "realWords."
        //                   Your search can be linear, or a binary search. (If you wish to do a recursive
        //                   binary search, I'd suggest that you *don't* try making _this_ method recursive, but call
        //                   "wordInDictionaryRange()" (the next method) from here and fill that recursive method in.)


        return realWords;
    }

    /**
     * A recursive search through the dictionary to determine whether the given word is a member.
     * @param wordToFind - the word to look for
     * @param start - the index of beginning of the range of words to look at.
     * @param end - the index of the last word to look at.
     * @return - whether the word is contained in "dictionary."
     */
    public boolean wordInDictionaryRange(String wordToFind, int start, int end)
    {
        // TODO: (Optional) - fill in this recursive binary search.
        // here's the outline for how to do this:
        //  base case #0: if end is before start... think about whether that means to return true or false.

        //  base case #1: find the midpoint between start and end. Is wordToFind at this place in the dictionary? If so,
        //  should you return true or false?

        // Figure out whether the word you are looking for falls in before or after the midpoint. There is a handy tool
        // for finding alphabetical order:
        //       int result = stringA.compareTo(stringB)
        // If stringA is before stringB in the dictionary, result will give you a negative number.
        // If stringA is after stringB in the dictionary, result will be a positive number.
        // (My mnemonic for this is result is akin to imagine an all-inclusive dictionary of all possible strings. Then
        // result = (position of A) - (position of B). That's probably not what it _actually_ is, but it is a good way
        // to remember what is positive and what is negative.

        // Once you know where the word is, either call this method recursively for the first half or the second half.
        // (Don't include the midpoint, itself... you know the word isn't there now.)
        // Note: this recursive method returns a boolean value. What will you do with that value?

        return false; // temporary... replace this.
    }
}
