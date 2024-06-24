package OOPS.object;

import OOPS.Class.Employee;

public class EmployeeObj {
    public static void main(String[] args) {
        Employee emp=new Employee();//intilize of objects
        emp.setEmpId(101);
        emp.setEmpName("sai");
        System.out.println(emp.getEmpId()+"  "+emp.getEmpName());


    }
}
