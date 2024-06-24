package OOPS.Class;

public class Student {
   private  int rollno;
   private String studentName;
   private String mobileNumber;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setRollno(int no)
   {
       rollno=no;
   }
   public int getRollno(){
       return rollno;
   }

}
