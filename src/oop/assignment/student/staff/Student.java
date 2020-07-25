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
public class Student extends Person 
{
    private String program;
    private int year;
    private double fee;
    
     public Student(String n, String a, String p, int y, double f) 
    {
        super(n, a);
        this.program = p;
        this.year=y;
        this.fee=f;
    }
   
     public String GetProgram()
    {
      return program;
    }
     
     public void SetProgram(String pr)
     {
       this.program=pr;
     }
    
       public int GetYear()
    {
      return year;
    }
     
     public void SetYear (int yr)
     {
       this.year= yr;
     }
       
       public double GetFee()
    {
      return fee;
    }
     
     public void SetFee (double fe)
     {
       this.fee= fe;
     }
     
    @Override
    public String toString()
    {
    return GetName() +" "+ GetAddress() +" "+ program +" "+ year +" "+ fee;
    }
    
}
  
    
