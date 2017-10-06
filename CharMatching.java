public class CharMatching { // 1

   public static void main (String [] args) { // 2
      String userInput = ""; // 3
      char firstLetter = '-'; // 4

      userInput = "banana"; // 5
      firstLetter = 'b'; // 6

      if (userInput.charAt(0) == firstLetter) { // 7
         System.out.println("Found match: " + firstLetter);
      }
      else {
         System.out.println("No match: " + firstLetter); // 8
     }// 10

    }
    
}
