package HachMap;

import InterfaceandComparable.ComparableCircle;
import InterfaceandComparable.comparable;

public class Students implements comparable<Student> {
    @Override
    public int compareTo(ComparableCircle o) {
        return 0;
    }

    private String name;
    private Integer age;
    private String address;

    public Students(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}

