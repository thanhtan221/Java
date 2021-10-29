package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists<E> {

    public int size = 0;
    static final int default_capacity = 10;
    public Object[] elements;
    private Object E;

    public ArrayLists() {
        elements = new Object[default_capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public int add(int index, E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = index;
        return index;
    }

    public E remove(int index) {
        elements[size--] = index;
        return (E) elements;
    }

    public int size() {
        return this.size;
    }

    public E clone() {
        ArrayList a = new ArrayList();
        elements = Arrays.copyOf(elements, size);
        return (E) a;
    }

    public boolean contains(E o) {
        if (o.equals(size)) ;
        return o.equals(size);
    }

    public int indexOf(E o) {
        if (o == null) {
            for (int i = size - 1; i >= 0; i--)
                if (elements[i] == null)
                    return i;
        } else {
            for (int i = size - 1; i >= 0; i--)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;

    }

    //    public boolean add(E o){
//        ensureCapacity(size + 1);
//        elements[size ++] = o;
//        return true;
//    }
    public int ensureCapacity(int minCapacity) {
        minCapacity = (size * 2) + 2;
        return minCapacity;

    }

    public E get(int i) {
        for (int j = 0; j < elements.length; j++) {
            if (j > i) {
                System.out.println("Số Trong Mảng " + j + " vị trí " + i);
                break;
            }
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++)
            elements[i] = null;
        size = 0;
    }
}