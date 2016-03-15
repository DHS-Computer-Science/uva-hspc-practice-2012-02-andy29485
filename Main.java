//Andriy Zasypkin
//2016-03-14
//Practice 2012 - 02: Reducing Improper Fractions

import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException {
    //create an input reader object
    BufferedReader input
            = new BufferedReader(new InputStreamReader(System.in));

    int nCases = Integer.valueOf(input.readLine());

    for(int i=1; i<=nCases; i++) {
      System.out.printf("Case %d: ", i);
      int n = Integer.valueOf(input.readLine());
      int d = Integer.valueOf(input.readLine());
      int w = n/d;
          n = n%d;

      if(n==0)
        System.out.println(w);
      else if(i==0)
        System.out.printf("%d/%d\n", n, d);
      else
        System.out.printf("%d %d/%d\n", w, n, d);
    }

    //close stream
    input.close();

    System.exit(0);
  }
}
