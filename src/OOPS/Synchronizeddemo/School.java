package OOPS.Synchronizeddemo;

public class School {
    public synchronized void  classDetails(String teacherName){
        for(int i=0;i<3;i++){
            System.out.println(i+"  "+teacherName);
        }
    }

}
class MyThread extends  Thread{
    School sch;
    String teacherName;

    @Override
    public void run() {
        sch.classDetails(teacherName);
    }
    MyThread(School sch,String teacherName){
        this.sch=sch;
        this.teacherName=teacherName;
    }
}
