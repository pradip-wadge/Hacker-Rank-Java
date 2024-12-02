import java.util.Scanner;

class Employee{
    private String name;
    private int empid;
    private float salary;
    public String getName() {
        return this.name;
    }
    public void setName( String name ){
        this.name = name;
    }
    public int getEmpid() {
        return this.empid;
    }
    public void setEmpid( int empid ){
        this.empid = empid;
    }
    public float getSalary() {
        return this.salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
}
class Program{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Name  :   ");
        //String name = sc.nextLine();
        //emp.setName( name );
        emp.setName(sc.nextLine());

        System.out.print("Empid :   ");
        //int empid = sc.nextInt();
        //emp.setEmpid(empid);
        emp.setEmpid(sc.nextInt());
        
        System.out.print("Salary    :   ");
        //float salary = sc.nextFloat();
        //emp.setSalary( salary );
        emp.setSalary(sc.nextFloat());

        //String name = emp.getName( );
        //System.out.println("Name    :   "+name);
        System.out.println("Name    :   "+emp.getName());

        //int empid = emp.getEmpid( );
        //System.out.println("Empid   :   "+empid);
        System.out.println("Empid   :   "+emp.getEmpid());

        //float salary = emp.getSalary( );
        //System.out.println("Salary  :   "+salary);
        System.out.println("Salary  :   "+emp.getSalary());
    }
}