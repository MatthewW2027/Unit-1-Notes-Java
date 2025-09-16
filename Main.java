// Every Java file is a CLASS 
public class Main {
   // main method is the ENTRYWAY to the program 
   public static void main(String []args) {
      System.out.println("Welcome to Java");
      System.out.println("hiiiii");

      // 1. DECLARE a new variable 
      int score; 
      // 2. ASSIGN a value to the variable 
      score = 64;
      // INITIALIZE combines declaring + assigning 
      String pokeman = "Squirtle";
      double healthPercent = 0.75; 
      boolean isAlive = true; 
      
      // Use the plus sign to CONCATENATE (combine) Strings 
      String greeting = "Hello " + "World"; 
      System.out.println(greeting);
      // Quatation marks contain STRING LITERALS 
      
      //OUTPUT: difference between.print and .println
      System.out.print("hi"); 
      System.out.println("there"); 
      System.out.print("!");
      //.println dispalys the meesage THEN goes to the next line 

      //ESCAPE: use \ (backslash) to include special characters, use \n for line break 
      String message = "\nI woke up and said, \"HELLOW WORLD\""; 
      System.out.println(message);

      // ARITHMETIC expressions with operators 
      System.out.println(4+3); 
      System.out.println(4-1); 
      System.out.println(6*7); 
      System.out.println(5/3); //TRUNCATED! 
      // Integer division results in TRUNCATION, which is basically throwing away the decimal place
      System.out.println(5.0/3); //double 

      //COMPOUND expressions follow PEMDAS 
      double result = 2+(3*2-6); 
      System.out.println(result); 

      //REMAINDER % operator 
      int remain = 23 % 2; //1-> means ODD number 
      System.out.println(remain); 
      System.out.println(629 % 2); //0-> means EVEN 

      //Watch out for the plus sign! 
      System.out.println(3+"3");

   }
}
