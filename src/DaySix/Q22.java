package DaySix;

public class Q22 {

    int rollNo;
    String studentName;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Q22(int rollNo, String studentName){
        this.rollNo = rollNo;
        this.studentName = studentName;
    }
    public Q22(){
    }

    public static void main(String[] args) {
        Q22 obj = new Q22(1, "Samarth Anand");
        System.out.println(obj.getStudentName());
        System.out.println(obj);
    }

}
