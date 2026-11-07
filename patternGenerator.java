//
//  Class author: Heena Kim Brooks
//  Date created: 10/28/26
//  General description: This class, Patterns, contains a main method that calls other methods to produce each of the various patterns. 
//


public class patternGenerator {

  //  Pre-condition: rows must be greater than or equal to 0.
//  Post-condition: prints a triangle of stars.
    public static void stars(int rows){
          String star = "*";
          while (rows >= 0)
          {
            System.out.println(star);
            star = star + "**";
            rows -= 1;
          }
          System.out.println();
    }

 //  Pre-condition: rows must be greater than or equal to 0.
//  Post-condition: prints a triangle of increasing numbers.
    public static void triangle(int rows){
      int i = 0;
      while (i < rows) {
        i++;
        int j = 0;
        while (j < i) {
          System.out.print(i);
          j++;
        }
        System.out.println();
       }
      System.out.println();
    }
  

// Pre-condition: start must be a positive odd number.
// Post-condition: prints decreasing odd numbers.
  public static void odds(int start){
    for (; start > 0; start-=2) {
      for (int i = 0;  i<start; i++){
        System.out.print(start);
      } 
      System.out.println();
  }
  System.out.println();
}

// Pre-condition: maxE must be greater than or equal to 1.
//Post-condition: prints an increasing and decreasing E and O pattern.
  public static void eo(int maxE){
    String letter = "E";
   if(maxE % 2 == 0){
          letter = "O";
   }
     for (int i =1; i <= maxE; i++){
      for (int j = 0; j < i; j ++) {
        System.out.print(letter);
      }
      System.out.println();

      
      if (letter.equals("E")){
        letter = "O";
      }else{
        letter = "E";
     }

    }
      for (int i = maxE-1; i >= 1; i--){
      for (int j = 0; j < i; j ++) {
        System.out.print(letter);
      }
      System.out.println();

      if (letter.equals("E")){
        letter = "O";
      }else{
        letter = "E";
      }
  }
  System.out.println();
  }


  //Pre-condition: rows must be greater than or equal to 0.
  //Post-condition: prints a pyramid of decreasing numbers.
  public static void pyramid(int rows){
    for (int i = 1; i <= rows; i++) {
      for (int j = 1;  j < i; j++){
        System.out.print(" ");
      } 
      for (int k = 0; k < 2 * (rows - i) + 1; k++){
        System.out.print(i);
      }
      System.out.println();
  }
  System.out.println();
}

 
    public static void main(String[] args) {
         stars(7);
         triangle(9);
         odds(9);
         eo(6);
         eo(5);
         pyramid(5);
    }
}


