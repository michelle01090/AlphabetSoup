
//Name: Michelle Wei
//Date: 09/29/26
//Description: This program will be able to execute a number of different methods that will produce different combinations/compilations of the company and letters the user inputs. 

public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    //precondition: the user enters a non empty string input in the terminal, proceeded by the word add
    //post condition: the program appends the users input into the string letters
    public void add(String word){
        letters += word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    //precondition: the user types the word randomLetter into the terminal
    //postcondition: the program randomly selects a character from the string letters and returns it
    public char randomLetter(){
        int randomIndex= (int) (Math.random()*letters.length());
        char randomLetter= (letters.charAt(randomIndex));
        return randomLetter;
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    //precondition: the user sets company as a string and has added characters into the string letters
    //post condition: the program returns the letters currently stored with the company name placed directly in the center of all the letters
    public String companyCentered(){
        int lettersLengthIndex= (int)(letters.length()/2);
        String firstHalf= letters.substring (0, lettersLengthIndex-1);
        String secondHalf= letters.substring(lettersLengthIndex-1);
        return (firstHalf+company+secondHalf);
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    //precondition: the user has already inputted a word that has been appended to the string letters so that it isnn't empty
    //postcondition: The program returns the string letters, with the first vowel removed if there is a vowel
    public void removeFirstVowel(){
        letters=  letters.replaceFirst("[aeiouAEIOU]", "");
        return letters; 

        
    }
    //precondition: the user inputs a number proceeded by the word num. The user has inputed a word, proceed by the word add that has been added to the string letters so that it isn't empty. 
    //postcondition: the program returns a new string, which removes num letters from a random spot in the string letters.
    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
       
    //pick a random index such that you're smaller than "num" from the end of letters for example if letters has 10 characters and we want to remove 5 the largest index we want to pick would be 5
    int maxIndex=letters.length()-num;
    int randomIndex= (int)(Math.random()*(maxIndex));
    String newFirst= letters.substring(0, randomIndex);
    String newLast= letters.substring(randomIndex + 1);
    //use substring to create two parts to add the before part and the after part and the middle gets "cut out"
    return newFirst+newLast;
    }
    //precondition: the user inputs a word, proceeded by the word add so that it is appended to string letters so that it isn't empty.
    //postcondition; the program returns the new string letter, with the word "word" removed from it if it is present.
    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
        letters = letters.replaceFirst(word, "");
    }
}
