
package oop.assignment.student.staff;

import java.util.Scanner;


public class OOPAssignmentStudentStaff {

    public static void main(String[] args) 
    {
        int x,yr;
        int l =0,i=0;
        String n, ad, pro, sh;
        double f,py;
      Person [] P = new Person [100];
      
      
      do
      {
      
      System.out.println("Press 0 to enter Student info And  1 to enter staff information & 2 and 3 to get information and 4 for exit");
      Scanner input = new Scanner (System.in);
      x=input.nextInt();
       
            
        
      if (x ==0)
      {
           System.out.println("Enter students information");
           
           System.out.println("");
           
        
      System.out.println("");
      System.out.println("");
         System.out.print("Enter Name : ");
                n=input.next();
               System.out.print("Enter Address : ");
                ad=input.next();
               System.out.print("Enter Program : ");
                pro=input.next();
               System.out.print("Enter year : ");
                yr=input.nextInt();
               System.out.print("Enter fee : ");
                f=input.nextDouble();
                P[i]= new Student( n, ad,  pro,  yr,  f);
                System.out.println(P[i].toString());
               i++;
        }     
      
      
      
      else if(x==1)
      {
               System.out.println("Enter employes information");
          
               System.out.println("");
        
               System.out.println("");
            
               System.out.print("Enter Name : ");
               n=input.next();
               System.out.print("Enter Address : ");
               ad=input.next();
               System.out.print("Enter School :");
               sh=input.next();
               System.out.print("Enter Pay :");
               py=input.nextDouble();
               P[i]=new Staff(n,ad,sh,py);
               System.out.println(P[i]);
               i++;
            
        }
      
     
      
      if(x==2)
      {
          System.out.print("Enter student name: ");
          String k= input.next();
          System.out.println("");
            if(k.equals(P[i].GetName()))
            {
             System.out.println(P[i]);
             break;
            }
        
           
            
        }
      else if (x==3)
      {
          System.out.print("Enter Employee name: ");
          String k= input.next();
     
         System.out.println("");
            if(k.equals(P[i].GetName()))
            {
             System.out.println(P[i]);
             break;
            }
        }
          
          
          
      
      
      }while(x!=4);
      
      
    }
    
}
