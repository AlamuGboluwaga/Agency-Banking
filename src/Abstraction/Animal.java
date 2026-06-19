package Abstraction;

 public abstract class Animal {

 abstract  void Sound ();// Abstract Method  "it does not have a body so it must be implemented at all children classes"

public  void Eyes()// Concrete Method
{
     System.out.println("All Animals have eyes");
 }
     public  void Animals(){
         System.out.println("Must animals have 4 legs");
     }

  }
