package bai5;


public class Exercise2 {
    public static class Student{
        public String Name = "john";
        public String classes = "C02";

        public void setName(String name) {
            Name = name;
        }

        public void setClasses(String classes) {
            this.classes = classes;
        }
    }

    public static void main(String[] args) {
        Student student = new Student(){
        };
        System.out.println(student.Name);
        System.out.println(student.classes);
    }
}
