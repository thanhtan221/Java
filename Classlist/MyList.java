package Classlist;

import java.util.Arrays;

public class MyList<E> {
   private   int size ;
   private int default_capacity = 10;
   private Object elements[];
    public MyList(){
        elements =  new Object[default_capacity];
    }
    // coppyOf coppy mảng trong java
    private void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add (E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i){
        if (i>= size || i < 0){
            throw  new IndexOutOfBoundsException("index :" + i + ",Size " + i);
        }
        return (E) elements[i];
    }

}
