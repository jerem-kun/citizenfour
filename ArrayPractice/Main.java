package ArrayPractice;
import java.util.*;

import javax.swing.plaf.TreeUI;

import javafx.beans.property.FloatPropertyBase;

public class Main {
    public static void main(String[] args){

        int[] pi = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        String[] konami = {"up", "up", "down", "down", "left", "right", "left", "right", "B", "A", "Start"};
        boolean[] indecisive = {true, true, false, true, false, false, false, true};
        
        double[][] poster = { {1, 4}, {1, 4, 5} };
        boolean[][] things =    {{true, false},
                                {true, false}};
        
        for(double sus[] : poster){
            for(double sos : sus){
                System.out.print(sos + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < poster.length; i++){
            System.out.println(Arrays.toString(poster[i]));
        }


        System.out.print("\n");
        int count = 0;
        while(count < pi.length){
            System.out.print(pi[count]);
            count += 1;
        }

        System.out.print("\n\n");
        for(int i = 0; i < konami.length; i++){
            System.out.println(konami[i]);
        }

        System.out.print("\n");
        for(boolean decision : indecisive){
            System.out.println(decision);
        }


        //FRQ PROBLEM
        String[] words = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};

        for (String x : words){
            if((x.substring(x.length()-3, x.length())).equals("ing")){
                System.out.println(x);
            }
        }


        //FRQ PROBLEM
        Array agony = new Array();
        double killme = agony.computeBonusThreshold();
        System.out.println(killme);

        agony.computeWages(10, 1.5);


    }
}

