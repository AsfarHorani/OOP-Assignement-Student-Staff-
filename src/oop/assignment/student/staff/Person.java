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
public class Person 
{
       private String name;
       private String Address;
       
        public Person(String n , String a)
      {
          name = n;
          Address = a;
      }
      
     public String GetName()
      {
          return this.name;
      }
      
      public void SetName(String Name)
      {
         this.name=Name;
      }
      
       public String GetAddress()
      {
          return this.Address;
      }
      
      public void SetAddress(String address)
      {
         this.Address=address;
      }
      
       @Override
      public String toString()
      {
      return "Name: " + name + "Addres: "  + Address ;
      }
      
      
      
}
