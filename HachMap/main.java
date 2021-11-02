package HachMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        Students students = new Students("Kien", 30, "HT");
        Students students1 = new Students("Nam", 39, "HN");
        Students students2 = new Students("Anh", 38, "HT");
        Students students3 = new Students("Tung", 38, "HT");
        List<Students> lists = new ArrayList<Students>();
        lists.add(students);
        lists.add(students1);
        lists.add(students2);
        lists.add(students3);
//        Collections.sort(lists);
        for (Students st : lists) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
//        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (Students st : lists) {
            System.out.println(st.toString());
        }
    }
}