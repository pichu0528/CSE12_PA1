/**
* Assignment 1                List12Tester.java             Due: 12 April 2013
* Login in: cs12sbd
**/

/**
* Class List12Testser - Class header comment
* This method is testing two add()s, contains(), get(), iterator(), 
* two remove()s, set(), and size() methods of the java.util.List12<E> interface.
* I am testing all these methods to meet the requirements in order to work for 
* a list with multiple elements.
* @author Pin Chu cs12sbd
*/



import java.util.*;
import junit.framework.*;
import java.util.List;
import java.util.NoSuchElementException;

public class List12Tester extends junit.framework.TestCase{
 /* Appends the specified element to the end of this list.(optional operation)*/
 public void testAdd(){
 List<Integer> myList = new List12<Integer>();

 for(int i = 0; i <1000; i++){
 assertTrue(myList.add(i));
 }
 myList = null;
 }

 /*Inserts the specified element at the specified position in this list.
   (optional operation)*/
public void testAddL(){
 List<Integer> myList = new List12<Integer>();
 for(int i = 0; i <= 1000; i++){
     myList.add(i);
     assertEquals(myList.get(i), new Integer(i));
   }
 myList = null;

 }
 
 /* Returns true if this list contains the specified element.*/
 public void testContains(){
 List<Integer> myList = new List12<Integer>();
 int j = 0;
 for(int i = 0; i < 1000; i++){
     myList.add(i,j);
     assertTrue(myList.contains(i) == true);
     j++;
    }
 myList = null;
 }
 
 /* Returns the element at the specified position in this list.
    @Exception, check if the entered number is out of bounds */
 public void testGet() throws Exception{
 List<Integer> myList = new List12<Integer>();
 try{
     myList.add(1);
     myList.add(2);
     myList.get(-1);
     fail();
     
    }
 catch(IndexOutOfBoundsException e){
     /*if the index is out of range (index < 0 || index >= size())*/
 }
 catch(Throwable e){
 // Catch all
 fail();
 }
 int j = 0;
 for(int i = 0; i < 1000; i++){
     myList.add(i,j);
     assertEquals(myList.get(i), new Integer(i));
     j++;
   }
 myList = null;
 }
 
 /* Returns an iterator over the elements in this deque in proper sequence. 
    The elements will be returned in order from first (head) to last (tail).*/
 public void testIterator(){
 List<Integer> myList = new List12<Integer>();
 Iterator a = myList.iterator();
 myList.add(1);
 assertTrue(a.hasNext());
 for (int i = 0; i < 1000; i++){
      myList.add(i);
      assertEquals(myList.add(i), a.hasNext());
      }
 }
 /* Test if next() has an exception*/
 public void testIteratorNext(){
 List<Integer> myList = new List12<Integer>();
 myList.add(1);
 Iterator b = myList.iterator();
 try{
     b.next();
     b.next();
     fail();
    }
 catch(NoSuchElementException e){
  //if the iteration has no next element
  }
 catch(Throwable e){
     // Catch all
     fail();
    }
}
  /* Test if nextReturn() returns*/
 public void testIteratorNextReturn(){
 List<Integer> myList = new List12<Integer>();
 myList.add(1);
 myList.add(2);
 myList.add(3);
 Iterator b = myList.iterator();
 assertEquals(new Integer (1), b.next());
 assertEquals(new Integer (2), b.next());
 assertEquals(new Integer (3), b.next());
 }
  /* Test if next() has an exception*/
 public void testIteratorRemove(){
 List<Integer> myList = new List12<Integer>();
 myList.add(1);
 Iterator c = myList.iterator();
 try{
     c.next();
     c.remove();
     c.remove();
     fail();
    }
 catch(IllegalStateException e){
     /* if neither next nor previous have been called, or remove or add 
        have been called after the last call to next or previous*/
    }
 catch(Throwable e){
    // Catch all
    fail();
    }
 }

 
   

 /* Removes the first occurrence of the specified element from this deque.*/
 public void testRemoveTrue(){
 List<Integer> myList = new List12<Integer>();
      for(int i = 0; i < 1000; i++){
          myList.add(i);
          assertTrue(myList.remove(new Integer(i)));
     }

 myList = null;
}


 /* Removes the element at the specified position in this list 
    (optional operation).*/
 public void testRemoveE(){
 List<Integer> myList = new List12<Integer>();
 //for(int i = 0; i < 1000; i++){
     myList.add(21);
     assertEquals(myList.remove(0), new Integer(21));
    //}
 myList = null;
 }

  /* Test if remove() has an exception*/
 public void testRemoveException(){
 List<Integer> myList = new List12<Integer>();
 try{
    myList.add(1);
    myList.remove(-1);
    fail();
    }
 catch(IndexOutOfBoundsException e){
    //if the index is out of range (index < 0 || index >= size())
    }
 }
    
 
 /* Replaces the element at the specified position in this list with the 
    specified element (optional operation).*/
 public void testSetException(){
 List<Integer> myList = new List12<Integer>();
 myList.add(1);
 try{
    myList.set(-1, new Integer(1));
    fail();
    }
 catch(IndexOutOfBoundsException e){
  //if the index is out of range (index < 0 || index >= size())   
 }
 catch(Throwable e){
   fail();
  }
}

 /* Test if set() has an exception*/
 public void testSetExcept(){
 List<Integer> myList = new List12<Integer>();
 myList.add(1);
 try{
    myList.set(1000000, new Integer(1));
    fail();
    }
 catch(IndexOutOfBoundsException e){
  //if the index is out of range (index < 0 || index >= size())   
 }
 catch(Throwable e){
   fail();
  } 
}


 public void testSet(){
 List<Integer> myList = new List12<Integer>();

 for(int i = 0; i < 1000; i++){
     myList.add(i);
     assertEquals(myList.get(i), myList.set(i, new Integer (i)));
 }
 myList = null;
 }

 /* Returns the number of elements in this list.*/
 public void testSize(){
 List<Integer> myList = new List12<Integer>();
 int count = 0;
 for(int i = 0; i < 1000; i++){
     myList.add(i);
     assertEquals(myList.size(), 1+count);
     count++;
 }
 myList = null;
 }

 /* A main method that will run my List12Tester class as a GUI program*/
 public static void main(String args[]){
    junit.swingui.TestRunner.main(new String[]{"List12Tester"});
 }
}

