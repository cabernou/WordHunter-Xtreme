import java.util.ArrayList;

class WordGuesser {
  
  private String word; // APPLE
  private ArrayList<String> guessedWord; // [_,_,_,_,_]
  private ArrayList<String> guessedLetters; // [A,P,K]
  
  public WordGuesser(String word) {
    this.word = word.toUpperCase();
    this.guessedWord = new ArrayList<String>();
    for (int i = 0; i < this.word.length(); i++) {
      guessedWord.add("_");
    }
    this.guessedLetters = new ArrayList<String>();
  }
  //prints the letters so far guessed
  public String showGuessedLetters() {
    String wordDisplay = "";
    for (int i = 0; i < this.guessedLetters.size(); i++) {
      wordDisplay += guessedLetters.get(i) + " ";
    }
    return wordDisplay;
  }
  //prints the guessed word  
  public String showGuessedWord() {
    String wordDisplay = "";
    for (int i = 0; i < this.guessedWord.size(); i++) {
      wordDisplay += guessedWord.get(i) + " ";
    }
    return wordDisplay;
  }
  
  // Returns true if its a correct guess -
  //  if the letter is anywhere in the word
  // Also updates guessedWord and guessedLetters
  // also lets you know if you've already guessed that letter
  public boolean guessLetter(String letter) {
    if(!guessedLetters.contains(letter)){
    if(word.contains(letter)){
      for(int i = 0; i < word.length(); i ++){
        if(word.substring(i,i+1).equals(letter.toUpperCase())){
          guessedWord.set(i, letter);
        }
      }
      guessedLetters.add(letter);
      return true;
    }
    }
    else{
      System.out.println("You've already guessed that letter. So, ");
      return false;
    }
    guessedLetters.add(letter);
    return false;
  }

  // Returns true if they guessed the whole word
  public boolean hasWon() {
    String guess = "";
    for(int i =0; i < guessedWord.size(); i++){
      guess+= guessedWord.get(i);
    }
    if(guess.equals(word))return true;
    return false;
  }
  
}
