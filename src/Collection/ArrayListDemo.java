package Collection;

import java.util.ArrayList;


public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();//syntax
        list.add(11);//0
        list.add(30);//2
        list.add(50);//3
        list.add(40);//4
//        System.out.println(list);//printing the list elements
//        System.out.println(list.get(2));//selecting only one element by using index
//        list.remove(0);//removing an element by index
//        for(Integer i:list){//30,50,40
//            System.out.println(i);
//        }
//        System.out.println(list.size());// size of the list
        list.add(1,100);//1
        list.set(2,60);//30 - 60
        list.removeAll(list);//removes all the elements
        System.out.println(list);

    }
}
