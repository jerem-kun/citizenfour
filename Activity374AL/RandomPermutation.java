package Activity374AL;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class RandomPermutation {
    
    public static void next(int length) {
      int[] r = new int[length];
      int[] p = new int[length];
      //String[] g = new String[length];
      //String[] seven = new String[length];
      ArrayList<String> g = new ArrayList<String>();
      ArrayList<String> seven = new ArrayList<String>();
      
      for (int i = 0; i < length; i++)
        p[i] = i + 1;
        
      for (int n = length; n > 0; n--) {
        int pos = (int) (Math.random() * n);
        r[n-1] = p[pos];
        p[pos] = p[n-1];
      }

      //System.out.println(java.util.Arrays.toString(r));
      

      //  ¯\_(ツ)_/¯  ¯\_(ツ)_/¯  ¯\_(ツ)_/¯  ¯\_(ツ)_/¯  ¯\_(ツ)_/¯  ¯\_(ツ)_/¯  ¯\_(ツ)_/¯  ¯\_(ツ)_/¯  ¯\_(ツ)_/¯  ¯\_(ツ)_/¯  ¯\_(ツ)_/¯  ¯\_(ツ)_/¯  ¯\_(ツ)_/¯  ¯\_(ツ)_/¯  ¯\_(ツ)_/¯ 
      try {
        Scanner sc = new Scanner(new File("/workspace/citizenfour/Activity374/horsedata.txt"));

        for(int i = 0; i < length; i++){
          String horseStats = sc.nextLine();
          String name = horseStats.substring(0, (horseStats.indexOf(",")));
          g.add(name);
        }
        System.out.println("\nNon-scarmbled Horseys: " + g.toString()); 
      } catch(Exception e) {System.out.println("Error reading or parsing phrases.txt");}

      
      for(int i = 0; i < length; i++){
        int neigh = r[i]-1;    
        seven.add(g.get(neigh));
      }
      System.out.println("\nScarmbled Horseys: " + seven.toString() + "\n");


      //  (っ＾▿＾)  (っ＾▿＾)  (っ＾▿＾)  (っ＾▿＾)  (っ＾▿＾)  (っ＾▿＾)  (っ＾▿＾)  (っ＾▿＾)  (っ＾▿＾)  (っ＾▿＾)  (っ＾▿＾)  (っ＾▿＾)  (っ＾▿＾)  (っ＾▿＾)  (っ＾▿＾)  (っ＾▿＾)  (っ＾▿＾)  (っ＾▿＾) 
      int limit = (int)(length/2);

      for(int i = 0; i < limit; i++){
        System.out.println(seven.get(i*2) + " and " + seven.get(i*2+1) + " are partnered!");
      }

      if (length%2 != 0){
        System.out.println(seven.get(length-1) + " does not have a partner D: \n");
      }

    }

}
