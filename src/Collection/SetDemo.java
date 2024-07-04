package Collection;


import java.util.*;


public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> numbers=new TreeSet<>();//syntax
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(10);

//        System.out.println(numbers);
////        System.out.println(numbers.remove(12));
////        System.out.println("after removing a element");
////        System.out.println(numbers);
//        System.out.println(numbers.contains("rahul"));
//        Iterator<String> names= numbers.iterator();
//        while(names.hasNext()) {
//            System.out.println(names.next());
//        }
        Set<Integer> setnumbers=new TreeSet<>(numbers);//syntax
        setnumbers.add(15);
        setnumbers.add(16);
        setnumbers.add(19);
        setnumbers.add(10);
//        Set<Integer> union=new HashSet<>();
//        union.addAll(setnumbers);
        System.out.println(setnumbers);
        Collections.emptyList();
        System.out.println(setnumbers);



    }
}
