public class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1;
    public Employee (String name, String birthDate, String hireDate){
        super (name, birthDate);
        this.hireDate = hireDate;
        this.employeeId = employeeId++;
        
        
    }
    public String toString(){
        return "Employee {" +"employeeId : " +employeeNo++ + ", hireDate "+hireDate + '\'' +"} " +super.toString();
    }    
}
