import java.util.Scanner;
class Gradebot{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      double grade;
      double outof;
      double percent;
      String gradeletter ="";
   System.out.print("What did you get");
   grade=sc.nextDouble();
   System.out.print("What is it out of");
   outof=sc.nextDouble();
   
   percent=grade/outof *100;
      if(percent<0 || percent > 100 ){
          System.out.print("Cringe,not funny");
      
        }
        
        else{ if  (percent >= 86 && percent <= 100){
               System.out.print("A");
      System.out.print("SHEEEEEEESH,"+ percent +"percent"  + "thats how ur feeling?");
      
    }  else  if (percent >= 73  && percent <= 85){
         System.out.print( "B");
      System.out.print( percent  +"percent ?" +"ok now im scared to take it");
      
            
 }  else if (percent >= 67 && percent <= 72){
     System.out.print( "C +");
      
      System.out.print( "feels bad that test counts for 47 percent of your final grade");
      
    }          
  else if (percent >= 60 && percent <= 66){
         System.out.print( "C");
      System.out.print( "Tear me to pieces and I won't even feel it :C");
      
      
      
    
    } else if (percent >= 50 && percent <= 65){
        System.out.print( "C -");
      System.out.print( "...");
    }
      else   if (percent >= 0 && percent <= 49){
           System.out.print( "F");
      System.out.print( "Feel bad go to bed wake up even worse");
    
    }
}
   } 
    
    
    
    
    
    
   }  