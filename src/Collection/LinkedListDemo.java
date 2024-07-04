package Collection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();
        names.add("sai");//the present element
        names.add("vardhan");
        names.add("bunny");
        names.addFirst("shruthi");
        names.add("sai");
        System.out.println(names);
        System.out.println(names.getFirst());
        //remove,removeFirst(),removeLast(),addFirst(),addLast()

    }
    }
