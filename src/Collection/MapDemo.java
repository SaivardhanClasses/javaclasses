package Collection;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> studentsMarks=new TreeMap<>();//syntax
        studentsMarks.put("sai",20);
        studentsMarks.put("bunny",25);
        studentsMarks.put("sruthi",25);
        studentsMarks.put("abdul",30);
        Set<String> keys= studentsMarks.keySet();

        if(studentsMarks.containsKey("sruthi")){//true or false
            studentsMarks.put("sruthi",50);//updates the value
        }
        for(String s:keys){
            System.out.println(s +" --> "  +studentsMarks.get(s));
        }
        System.out.println(studentsMarks.get("sai"));
     //   System.out.println(studentsMarks);


    }
}
