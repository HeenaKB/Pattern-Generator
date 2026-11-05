//
//  Class author: Heena Kim Brooks
//  Date created: 10/28/26
//  General description: This class, Patterns, contains a main method that calls other methods to produce each of the various patterns. 
//


public class patternGenerator {

  //  Pre-condition: what must be true prior to the method being called //  including possible limitations on input
//  Post-condition: what the result of executing this method will be.
    public static void stars(int rows){
          String star = "*";
          while (rows > 0)
          {
            System.out.println(star);
            star = star + "**";
            rows -= 1;
          }
          System.out.println();
    }

 //  Pre-condition: what must be true prior to the method being called //  including possible limitations on input
//  Post-condition: what the result of executing this method will be.
    public static void triangle(int rows){
      int i = 0;
      while (i < rows) {
        i++;
        int j = 0;
        while (j < i) {
          System.out.print(i + " ");
          j++;
        }
        System.out.println();
       }
      System.out.println();
    }
  

// Pre-condition: start is odd
// Post-condition:
  public static void odds(int start){
    for (; start > 0; start-=2) {
      for (int i = 0;  i<start; i++){
        System.out.print(start+" ");
      } 
      System.out.println();
  }
  System.out.println();
}

// Pre-condition:
//Post-condition:




    public static void main(String[] args) {
         stars(7);
         triangle(9);
         odds(9);
    }
}


