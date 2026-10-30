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
    }

 //  Pre-condition: what must be true prior to the method being called //  including possible limitations on input
//  Post-condition: what the result of executing this method will be.
    public static void triangle(int rows){
      int i = 0;
      while (i <= rows) {
       int j = 0;
       while (j < i) {
        System.out.print(i);
        j++;
       }
       
       System.out.println();
       j++;
    }
  }

  public static void odds(int start){
    for (int i = 0; i <= rows; i++) {
      for (int j = 0; j < i; j++){
        System.out.print(i + " ");
      } 
      System.out.print.ln();
  }
}



    public static void main(String[] args) {
         stars(7);
         triangle(9);
    }
}


