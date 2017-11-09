import java.util.*;
public class DigitToWord
{
	StringBuffer DigitToWord= new StringBuffer("");
  public void pw(int CTCInNumber,String CTCInCurrency)
  {
    String  one[]={""," one"," two"," three"," four"," five"," six"," seven"," eight"," Nine"," ten"," eleven"," twelve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};

    String ten[]={"",""," twenty"," thirty"," forty"," fifty"," sixty"," seventy"," eighty"," ninety"};

    if(CTCInNumber > 19) { // this condition to print from one to nineteen which falls under one[]
    //	System.out.print(ten[CTCInNumber/10]+""+one[CTCInNumber%10]);
    	DigitToWord.append(ten[CTCInNumber/10]+""+one[CTCInNumber%10]);
    	} 
    else // this condition to print more then nineteen which falls under ten[]
    { 
   // 	System.out.print(one[CTCInNumber]);
    	DigitToWord.append(one[CTCInNumber]);
    }
    
    if(CTCInNumber > 0) // this condition to print either hundred, thousand, lakh, crore
   // 	System.out.print(ch);
    	DigitToWord.append(CTCInCurrency);
  }
  public static void main(String[] args)
  {
	  DigitToWord objDigitToWord = new DigitToWord();
	  try{
    int CTCInNumber=0;
    Scanner scanf = new Scanner(System.in);
    System.out.println("Enter an integer number: ");
    CTCInNumber = scanf.nextInt();
    
    if(CTCInNumber <= 0)   {                
      System.out.println("Enter numbers greater than 0");
   }
   else
   {
      
  //    a.pw((CTCInNumber/1000000000)," Hundred");
	   objDigitToWord.pw((CTCInNumber/10000000)%100," crore");
	   objDigitToWord.pw(((CTCInNumber/100000)%100)," lakh");
	   objDigitToWord.pw(((CTCInNumber/1000)%100)," thousand");
	   objDigitToWord.pw(((CTCInNumber/100)%10)," hundred");
	   objDigitToWord.pw((CTCInNumber%100)," ");
    }
    System.out.println(objDigitToWord.DigitToWord);
  }
  catch(Exception e){
	System.out.println(e.getLocalizedMessage());  
  }
  }
}