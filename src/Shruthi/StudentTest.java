package Shruthi;

import OOPS.Class.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student stu=new Student();
      stu.setRollno(101);
      stu.setStudentName("shruthi");
      stu.setMobileNumber("987654321");
        System.out.println("Roll no of a student: "+stu.getRollno()+" student name: " +stu.getStudentName()+ " mobile number :"+stu.getMobileNumber());
    }
}
