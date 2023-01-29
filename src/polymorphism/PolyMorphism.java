
package polymorphism;

import java.util.ArrayList;
import java.util.InputMismatchException;//FOR INPUT MISMATCH EXCEPTION
import java.lang.ArrayIndexOutOfBoundsException;//FOR INDDX OUT OF BOUND EXCEPTION
import java.util.Scanner;// FOR INPUT TO INPUT STREAM

/**
 *
 * @author Usman_Aslam
 */

/**
 * THIS IS BASE CLASS EMPLOYEE. IT CONTAIN GENERIC EMPLOYEE DATA VARIABLES/ MRMBERS
 * WHICH COMMON TO ALL EMPLOYEE WORKING IN AN ORGANIZATION.
 */
class Employee {
    String name;
    int e_no;
    Employee()
    {
        name = "";
        e_no = 0;
          
    }
    /**
     * SETTER AND GETTER BOTHS ARE OVERRIDED FUNCTIONS
     * WE OVERRIDE IN BOTH SUB CLASSES.
     */
    void setter(Scanner obj)
    {
        System.out.print("ENTER NAME OF EMPLOY: ");
        name=obj.nextLine();
        System.out.print("ENTER NUM OF EMPLOY: ");
        e_no=obj.nextInt();
        obj.nextLine();
        
    }
    void getter()
    {
        System.out.println("NAME: " + name);
        System.out.println("EMPLOYE NO: " + e_no);
    }
   
}

/**
 * IT IS SUB CLASS INHERITED FROM EMPLOYEE CLASSS.
 * WHICH CONTAIN ITS SPECIFIC VARIABLES ALONG WITH EMPLOYYE VARIABLE BECAUSE IT INHERITED FROM 
 * EMPLOYEE CLASS.
 */
class Manager extends Employee 
{
    String title;
    int c_dues;
    
    Manager()
    {
        title=" ";
        c_dues=0;
    }
    
    @Override
    void setter(Scanner obj)
    {
        super.setter(obj);
        System.out.print("ENTER TITLE: ");
        title=obj.nextLine();
        System.out.print("ENTER CLUB DUES: ");
        c_dues=obj.nextInt();
        obj.nextLine();
    }
     @Override
    void getter()
    {
        super.getter();
        System.out.println("TITLE: " + title);
        System.out.println("CLUB DUES: " + c_dues);
    }
   
    
}

/** 
 * IT IS SUB CLASS INHERITED FROM EMPLOYEE CLASSS.
 * WHICH CONTAIN ITS SPECIFIC VARIABLES ALONG WITH EMPLOYYE VARIABLE BECAUSE IT INHERITED FROM 
 * EMPLOYEE CLASS.
 */
class Scientist extends Employee 
{
    String r_f;
    int nop;
    Scientist()
    {
        r_f=" ";
        nop=0;
    }

    @Override
    void setter(Scanner obj)
    {
        super.setter(obj);
        System.out.print("ENTER YOUR RESEARCH FIELD: ");
        r_f=obj.nextLine();
        System.out.print("ENTE NO OF PUBLICATION: ");
        nop=obj.nextInt();
        obj.nextLine();
            
    }
    @Override
    void getter()
    {
        super.getter();
        System.out.println("RESEARCH FIELD: " + r_f);
        System.out.println("NO OF PUB: " + nop);
    }
 
    

    
    
}

/**
 * IT IS SUB CLASS INHERITED FROM EMPLOYEE CLASSS.
 * WHICH CONTAIN ITS SPECIFIC VARIABLES ALONG WITH EMPLOYYE VARIABLE BECAUSE IT INHERITED FROM 
 * EMPLOYEE CLASS.
 */
class Foreman extends Employee
{
    int n_o_labour;
    
    Foreman()
    {
        n_o_labour=0;
        
    }
    @Override
    void setter(Scanner obj)
    {
        super.setter(obj);
        System.out.print("ENTER NO OF LABOURS: ");
        n_o_labour = obj.nextInt();

        obj.nextLine();
            
    }
    @Override
    void getter()
    {
        super.getter();
       
        System.out.println("NO OF LABOURS: " + n_o_labour);
    }
    
    
}

/** 
 * IT IS SUB CLASS INHERITED FROM EMPLOYEE CLASSS.
 * WHICH CONTAIN ITS SPECIFIC VARIABLES ALONG WITH EMPLOYYE VARIABLE BECAUSE IT INHERITED FROM 
 * EMPLOYEE CLASS.
 */
class Labour extends Employee 
{
    int wrk_hrs;
    int hrs_rate;
    Labour()
    {
        wrk_hrs=0;
        hrs_rate=0;
    }
    
    @Override
    void setter(Scanner obj)
    {
        super.setter(obj);
        System.out.print("ENTER WORKING HOURS: ");
        wrk_hrs = obj.nextInt();
        System.out.print("ENTE HOURS RATE: ");
        hrs_rate =obj.nextInt();
        obj.nextLine();
            
    }
    @Override
    void getter()
    {
        super.getter();
        System.out.println("WORKING HOURS: " + wrk_hrs);
        System.out.println("HOURS RATE: " + hrs_rate);
    }
   
}

/**
 *THIS IS THE MAIN CLASS.
 * FROM WHICH WE CONTROL THE EXCECUTION OF PROGRAM.
 * OUR MAIN IS PRESENT IN THIS CLASS.
 *
 */

public class PolyMorphism {  
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
        /**
         * ARRAYLIST IS DYNAMICALLY DATA STRUCTURE..
         * WE USE IT IN ORDER TO EXPAND OUR LIST ACCORDING TO OUR NEEED.
         */
        ArrayList<Employee> emp = new ArrayList<Employee>();
        int n = 0;
        while(true)
        {
            
            System.out.println("-----------(MENU)----------");
            System.out.println("1) Manager ");
            System.out.println("2) Scientist ");
            System.out.println("3) Labour ");
            System.out.println("4) Foreman ");
            System.out.println("5) Display All Data ");
            System.out.println("6) Exit \n");
            
            System.out.print("Enter Your Choice: ");
            char ch = obj.next().charAt(0);
            obj.nextLine();
            
            switch(ch)
            {
                case '1':
                    emp.add(new Manager());
                    try
                    {
                        emp.get(n).setter(obj);
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println(e);
                        obj.nextLine();
                        System.out.println("Enter Again.......!!!!  ");
                        emp.get(n).setter(obj);
                    }
                    n++;
                    break;
                case '2':
                    emp.add(new Scientist());
                    try
                    {
                        emp.get(n).setter(obj);
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println(e);
                        obj.nextLine();
                        System.out.println("Enter Again.......!!!!  ");
                        emp.get(n).setter(obj);
                    }
                    n++;
                    break;
                case '3':
                    emp.add(new Labour());
                    try
                    {
                        emp.get(n).setter(obj);
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println(e);
                        obj.nextLine();
                        System.out.println("Enter Again.......!!!!  ");
                        emp.get(n).setter(obj);
                    }
                    n++;
                    break;                
               
                case '4':
                    emp.add(new Foreman());
                    try
                    {
                        emp.get(n).setter(obj);
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println(e);
                        obj.nextLine();
                        System.out.println("Enter Again.......!!!!  ");
                        emp.get(n).setter(obj);
                    }
                    n++;
                    break;                
                case '5':
                  
                    try{
                        for(Employee e: emp)
                            e.getter();
                    }
                    catch(ArrayIndexOutOfBoundsException e)
                    {
                        System.out.println(e);
                        System.out.println("Acces Invalid Index.....");
                    }
                    break;
                
                case '6':
                    System.exit(-1);
                    
                    
            }
   
        }
    }
    
}
