import java.util.Scanner;

class Employee{
    private String name;
    private int empid;
    private float salary;
    
    public void acceptRecord( /* Employee this */ ){
        Scanner sc = new Scanner( System.in);
        System.out.print("Name  :   ");
        this.name = sc.nextLine();
        System.out.print("Empid  :   ");
        this.empid = sc.nextInt();
        System.out.print("Salary  :   ");
        this.salary = sc.nextFloat();
    }
    public void printRecord( /* Employee this */ ){
        System.out.println("Name    :   "+this.name);
        System.out.println("Empid   :   "+this.empid);
        System.out.println("Salary  :   "+this.salary);
    }
}
class Program{
    public static void main( String[] args ){
        Employee emp = new Employee();
        emp.acceptRecord( );    //emp.acceptRecord( emp );
        emp.printRecord( );     //emp.printRecord( emp ); 
    }
}