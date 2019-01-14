package net.javavideotutorials.example;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Tests
{
  
  // 1. Create a failing test
  // 2. Write code to fix test (get test passing)
  // 3. Refactor code
  
  // System Under Test
  Sort sut;
  
  @Test
  public void should_accept_list_of_integers_into_constructor ()
  {
    // Arrange
    List<Integer> aList = new ArrayList<Integer>();
    
    // Act
    sut = new Sort(aList);
    
    // Assert
  }
  
  @Test
  public void should_sort_list_of_two_integers_in_ascending_order ()
  {
    // Arrange
    List<Integer> aList = new ArrayList<Integer>();
    aList.add(4);
    aList.add(1);
    
    // Act
    sut = new Sort(aList);
    
    System.out.println(aList);
    
    // Assert
    assertThat(aList.get(0), is(1));
    assertThat(aList.get(1), is(4));
  }
  
  @Test
  public void should_sort_list_of_two_integers_in_ascending_order_2 ()
  {
    // Arrange
    List<Integer> aList = new ArrayList<Integer>();
    aList.add(89);
    aList.add(156);
    
    // Act
    sut = new Sort(aList);
    
    // Assert
    assertThat(aList.get(0), is(89));
    assertThat(aList.get(1), is(156));
  }
  
  @Test
  public void should_sort_list_of_two_integers_in_ascending_order_3 ()
  {
    // Arrange
    List<Integer> aList = new ArrayList<Integer>();
    aList.add(156);
    aList.add(89);
    
    // Act
    sut = new Sort(aList);
    
    // Assert
    assertThat(aList.get(0), is(89));
    assertThat(aList.get(1), is(156));
  }
  
  @Test
  public void should_sort_list_of_three_integers_in_ascending_order ()
  {
    // Arrange
    List<Integer> aList = new ArrayList<Integer>();
    aList.add(832);
    aList.add(156);
    aList.add(89);
    
    // Act
    sut = new Sort(aList);
    
    System.out.println(aList);
    
    // Assert
    assertThat(aList.get(0), is(89));
    assertThat(aList.get(1), is(156));
    assertThat(aList.get(2), is(832));
  }
  
  
  @Test
  public void should_sort_list_of_20_integers_in_ascending_order ()
  {
 // Arrange
    List<Integer> aList = new ArrayList<Integer>();
    aList.add(3);
    aList.add(4);
    aList.add(14);
    aList.add(7);
    aList.add(15);
    aList.add(6);
    aList.add(8);
    aList.add(17);
    aList.add(1);
    aList.add(9);
    aList.add(10);
    aList.add(13);
    aList.add(2);
    aList.add(11);
    aList.add(18);
    aList.add(20);
    aList.add(5);
    aList.add(12);
    aList.add(16);
    aList.add(19);
    
    // Act
    sut = new Sort(aList);
    
    // Assert
    assertThat(aList.get(0), is(1));
    assertThat(aList.get(1), is(2));
    assertThat(aList.get(2), is(3));
    assertThat(aList.get(18), is(19));
    assertThat(aList.get(19), is(20));
  }
  
  
  // create 3 unit tests that will test
  //  1) a list of 3 elements are sorted in DESC order
  //  2) a list of 5 elements are sorted in DESC order
  //  3) a list of 20 elements are sorted in DESC order
  
  
  
  
  
}
