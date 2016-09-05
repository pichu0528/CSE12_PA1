import junit.framework.*;

public class List12 extends java.util.LinkedList<E>{
 
 
 public boolean add(E o){
 /*
Specified by:
    add in interface Collection<E>
Parameters:
    e - element to be appended to this list
Returns:
    true (as specified by Collection.add(E))
Throws:
    UnsupportedOperationException - if the add operation is not supported by  this list
    ClassCastException - if the class of the specified element prevents it from being added to this list
    NullPointerException - if the specified element is null and this list does not permit null elements
    IllegalArgumentException - if some property of this element prevents it from being added to this list
 */
};


 public void add(int index, E element){
/*
Parameters:
    index - index at which the specified element is to be inserted
    element - element to be inserted
Throws:
    UnsupportedOperationException - if the add operation is not supported by this list
    ClassCastException - if the class of the specified element prevents it from being added to this list
    NullPointerException - if the specified element is null and this list does not permit null elements
    IllegalArgumentException - if some property of the specified element prevents it from being added to this list
    IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())
 */
};


 public boolean contains(Object o){
/*

Specified by:
    contains in interface Collection<E>
Parameters:
    o - element whose presence in this list is to be tested
Returns:
    true if this list contains the specified element
Throws:
    ClassCastException - if the type of the specified element is incompatible with this list (optional)
    NullPointerException - if the specified element is null and this list does not permit null elements (optional)
 */
};


 public E get(int index){
/*
Parameters:
    index - index of the element to return
Returns:
    the element at the specified position in this list
Throws:
    IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
 */
};


 public ListIterator(){
/* List<Integer> myList = new List12<Integer>();

Specified by:
    iterator in interface Collection<E>
Specified by:
    iterator in interface Iterable<E>
Returns:
    an iterator over the elements in this list in proper sequence
 */
};


 public boolean remove(Object o){
/*

Specified by:
    remove in interface Collection<E>
Parameters:
    o - element to be removed from this list, if present
Returns:
    true if this list contained the specified element
Throws:
    ClassCastException - if the type of the specified element is incompatible with this list (optional)
    NullPointerException - if the specified element is null and this list does not permit null elements (optional)
    UnsupportedOperationException - if the remove operation is not supported by this list
 */
};


 public E remove(int index){
/*
Parameters:
    index - the index of the element to be removed
Returns:
    the element previously at the specified position
Throws:
    UnsupportedOperationException - if the remove operation is not supported by this list
    IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
 */
};


 public E set(int index, E element){
/*
Parameters:
    index - index of the element to replace
    element - element to be stored at the specified position
Returns:
    the element previously at the specified position
Throws:
    UnsupportedOperationException - if the set operation is not supported by this list
    ClassCastException - if the class of the specified element prevents it from being added to this list
    NullPointerException - if the specified element is null and this list does not permit null elements
    IllegalArgumentException - if some property of the specified element prevents it from being added to this list
    IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
 */
};

 public int size(){
/*

Specified by:
    size in interface Collection<E>
Returns:
    the number of elements in this list
 */
};
 


}
