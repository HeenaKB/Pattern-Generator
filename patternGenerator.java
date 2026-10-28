//
//  Class author: Heena Kim Brooks
//  Date created: 10/28/26
//  General description: This class, Patterns, contains a main method that calls other methods to produce each of the various patterns. 
//


public class patternGenerator {
    public static void stars(int rows){
          int star = 7;
          while (star <= 7)
          {
            System.out.print(star);
            star += 2;
          }
    }

    public static void main(String[] args) {
         stars(7);
    }
}


