package DSA.DSAQuestions.multithreading.collections.comparator;

import java.util.*;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<String>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Kiwi");
        fruitList.add("Dragon Fruit");
        fruitList.add("Orange");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(9);
        list.add(20);
        list.add(2);
        list.sort((a, b) -> {
            return b - a;
        });
//        System.out.println(list);

        fruitList.sort((a, b) -> {
            return b.length() - a.length();
        });

//        System.out.println(fruitList);

        Student student1 = new Student("Jai", 2.9f);
        Student student2 = new Student("Veeru", 3.9f);
        Student student3 = new Student("Man", 3.9f);
        Student student4 = new Student("Piku", 4.9f);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

//        studentList.sort((a, b) -> {
//            if (b.getGpa() > a.getGpa()) {
//                return 1;
//            } else if (b.getGpa() < a.getGpa()) {
//                return -1;
//            } else {
//                return 0;
//            }
//        });

        Comparator<Student> studentComparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        studentList.sort(studentComparator);
        System.out.println(studentList);
    }
}
