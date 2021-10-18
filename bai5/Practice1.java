package bai5;
public class Practice1 {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //constructor to initialize the variable
   Practice1(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]) {
        Practice1.change(); //calling change method

        //creating objects
        Practice1 s1 = new Practice1(111, "Hoang");
        Practice1 s2 = new Practice1(222, "Khanh");
        Practice1 s3 = new Practice1(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}



