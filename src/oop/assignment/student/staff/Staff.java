/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.assignment.student.staff;

/**
 *
 * @author Azfar
 */
 class Staff extends Person 
{
     private String school;
     private double pay;

    public Staff(String n, String a, String s, double p) 
    {
        super(n, a);
        this.school=s;
        this.pay=p;
   }

     
    
    public String GetSchool()
    {
      return school;
    }
     
     public void SetSchool (String sc)
     {
       this.school= sc;
     }
     
        public double GetPay()
    {
      return pay;
    }
     
    
        
        public void SetPay (double pa)
     {
       this.pay= pa;
     }
     
        
         @Override
    public String toString()
    {
    return GetName() +" "+ GetAddress()+" " + school +" "+ pay;
    }
   
    
}
