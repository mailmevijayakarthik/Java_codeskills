package cm.interview.questions;   

 
 class Main{ 
 
    public static void main(String[] args) { 
        Base x = new Base(); 
        Base y = new Derived(); 
        Derived z = new Derived(); 
        DoPrint(x); 
        DoPrint(y); 
        DoPrint(z); 
    } 
   public static void DoPrint( Base o ) { 

        o.Print();   
 } 
}