package ArrayList;

public class ArraylistText {
    public static void main(String[] args) {
        ArrayList.ArrayLists arrayLists = new ArrayLists();
        arrayLists.add(1, 1);
        arrayLists.add(2, 2);
        arrayLists.add(3, 3);
        arrayLists.add(4, 4);
        arrayLists.add(5, 5);
        arrayLists.add(6, 6);
        arrayLists.add(7, 7);
        arrayLists.add(8, 8);
//        System.out.println(arrayLists.size);
        arrayLists.remove(1);
        System.out.println(arrayLists.size);
        arrayLists.clone();
        System.out.println(arrayLists.size-5);
        arrayLists.contains(12);
        System.out.println(arrayLists.contains(12));
        arrayLists.indexOf(4);
        System.out.println(arrayLists.indexOf(4));
//        arrayLists.add(3);
//        System.out.println(arrayLists.add(3));
        arrayLists.ensureCapacity(2);
        System.out.println(arrayLists.ensureCapacity(2));
        arrayLists.get(3);
        System.out.println(arrayLists.get(3));
        arrayLists.clear();
        System.out.println("size sau khi clear " + arrayLists.size);

    }

}
