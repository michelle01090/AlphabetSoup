

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
    public void add(String word){
        letters += word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
        int randomIndex= (int) (Math.random()*letters.length()-1);
        char randomLetter= (letters.charAt(randomIndex));
        return randomLetter;
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
        int lettersLengthIndex= (int)(letters.length()/2);
        String firstHalf= letters.substring (0, lettersLengthIndex-1);
        String secondHalf= letters.substring(lettersLengthIndex-1);
        return (firstHalf+company+secondHalf);
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        String myStr = "This is W3Schools";
String regex = "is";
String letters="here are some words in my letters";

        
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num)
       
    //pick a random index such that you're smaller than "num" from the end of letters for example if letters has 10 characters and we want to remove 5 the largest index we want to pick would be 5
    //use substring to create two parts to add the before part and the after part and the middle gets "cut out"

    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){

        
    }
}
