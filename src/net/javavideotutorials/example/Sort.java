package net.javavideotutorials.example;

import java.util.List;

public class Sort
{
  
  // List<Integer> ->  3, 82, 38, 18, 92, 100, 1
  //  ascending sorted order  (1 -> 100)
  public Sort (List<Integer> aList)
  {
    // 3, 82, 38, 18, 92, 100, 1
    // 3, 38, 82, 18, 92, 100, 1
    // 3, 38, 18, 82, 92, 100, 1
    // 3, 38, 18, 82, 92, 1, 100
    boolean swapped = true;
    
    while (swapped == true)
    {
      swapped = iterateThroughUnorderedElements(aList);
    }
    
  }

  private boolean iterateThroughUnorderedElements(List<Integer> aList)
  {
    boolean swapped;
    swapped = false;
    for (int i=0; i<aList.size()-1; i++)
    {
      if (aList.get(i) > aList.get(i+1))
      {
        swapped = swapElements(aList, i);
      }
    }
    return swapped;
  }

  private boolean swapElements(List<Integer> aList, int i)
  {
    boolean swapped;
    Integer element = aList.remove(i);
    aList.add(i+1, element);
    swapped = true;
    return swapped;
  }
}
