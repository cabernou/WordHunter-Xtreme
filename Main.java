import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter("\\n");
    String word = "BANANA";
    WordGuesser game = new WordGuesser(word);
    
    System.out.println("Welcome to WordHunter Xtreme!");
    
    boolean stillPlaying = true;
    while (stillPlaying) {
      System.out.println(game.showGuessedWord());
      System.out.println("Please guess a letter:");
      String guess = scanner.next().toUpperCase();
      boolean foundLetter = game.guessLetter(guess);
      if (foundLetter) {
        System.out.println("YAY YOU FOUND ONE!!");
      } else {
        System.out.println("im sorry, but no");
      }
      System.out.println("Letters Already Guessed: "  + game.showGuessedLetters() + " ");
      if (game.hasWon()) {
        System.out.println("***WINNER!***");
        System.out.println(word);
        stillPlaying = false;
      }
    }
  }
}
