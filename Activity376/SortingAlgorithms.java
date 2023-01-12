package Activity376;
import java.util.ArrayList;

public class SortingAlgorithms
{
  /**
   * Perform a selection sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> selectionSortInt(ArrayList<Integer> intList){
    /* your code goes here */
    for(int i = 0; i < intList.size()-1; i++){
      
      int minIndex = i;
      for (int searchIndex = i + 1; searchIndex < intList.size(); searchIndex++){
        if(intList.get(searchIndex) < intList.get(minIndex)){
          minIndex = searchIndex;
        }
      }

      int currentValue = intList.get(i);
      int smallestValue = intList.get(minIndex);
      intList.set(i, smallestValue);
      intList.set(minIndex, currentValue);
    }
    return intList;
  }

  /**
   * Perform an insertion sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> insertionSortInt(ArrayList<Integer> intList){
    /* your code goes here */
    for(int i = 1; i < intList.size(); i++){

      int beingSorted = intList.get(i);
      int lastIndex = i-1;

      while(lastIndex >= 0){
        int sortedValue = intList.get(lastIndex);
        if(sortedValue > beingSorted){
          intList.set(lastIndex+1, sortedValue);
          intList.set(lastIndex, beingSorted);
        }
        lastIndex--;
      }
    }
    return intList;
  }

  /**
   * Perform a selection sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */ 
  public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList){
    /* your code goes here */
    for(int i = 0; i < doubleList.size()-1; i++){
      
      int minIndex = i;
      for (int searchIndex = i + 1; searchIndex < doubleList.size(); searchIndex++){
        if(doubleList.get(searchIndex) < doubleList.get(minIndex)){
          minIndex = searchIndex;
        }
      }

      double currentValue = doubleList.get(i);
      double smallestValue = doubleList.get(minIndex);
      doubleList.set(i, smallestValue);
      doubleList.set(minIndex, currentValue);
    }
    return doubleList;
  }

  /**
   * Perform an insertion sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */
  public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList){
    /* your code goes here */
    for(int i = 1; i < doubleList.size(); i++){

      double beingSorted = doubleList.get(i);
      int lastIndex = i-1;

      while(lastIndex >= 0){
        double sortedValue = doubleList.get(lastIndex);
        if(sortedValue > beingSorted){
          doubleList.set(lastIndex+1, sortedValue);
          doubleList.set(lastIndex, beingSorted);
        }
        lastIndex--;
      }
    }
    return doubleList;
  }
}