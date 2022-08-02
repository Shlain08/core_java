import java.util.Scanner;
class Test
{
 public static void main(String[] args)
 {
	 
//Answer 1:	
/* 
 System.out.println("ENTER THE NUMBER:");
 
 Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
  
  if(a%2==0)
  {
   System.out.println("THE ENTERED NUMBER "+a+" IS EVEN.");  
  }	 
  else
  {	  
 System.out.println("THE ENTERED NUMBER "+a+" IS ODD.");  
  }
*/ 

//ANSWER 2:
/*
 System.out.println("ENTER THE NUMBER:");
 
 Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
  
  if(a>55)
  {
    System.out.println("THE ENTERED NUMBER "+a+" IS GREATER THAN 55.");
  } 	
  else if(a==55)
  {
    System.out.println("THE ENTERED NUMBER "+a+" IS EQUAL TO 55.");
  }	  
  else
  {
	System.out.println("THE ENTERED NUMBER "+a+" IS LESS THAN 55.");
  }
*/  

//ANSWER 3:
/*
 System.out.println("ENTER THE VALUE OF A:");
 Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   
 System.out.println();

 System.out.println("ENTER THE VALUE OF B:");
 Scanner s = new Scanner(System.in);
   int b = s.nextInt();
 
  if(a==b)
  {
  System.out.println("THE ENTERED NUMBER A - "+a+" IS EQUAL TO ENTERED NUMBER B - "+b+".");	  
  }	
  else if(a>b)
  {
  System.out.println("THE ENTERED NUMBER A - "+a+" IS GREATER THAN ENTERED NUMBER B - "+b+".");	  
  }
  else
  {
  System.out.println("THE ENTERED NUMBER B - "+b+" IS GREATER THAN ENTERED NUMBER A - "+a+".");	    
  }
*/ 

//ANSWER 4: 
/*
 System.out.println("ENTER THE 3-DIGIT ROLL_NO:");
 Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   
  switch(a)
  {
	case 579: System.out.println("579 IS SONU'S ROLL NO.");
        break;
    case 546: System.out.println("546 IS MONU'S ROLL NO.");
        break;   	
    case 553: System.out.println("553 IS MANU'S ROLL NO.");
        break;
	case 544: System.out.println("544 IS MEENU'S ROLL NO.");
        break;
	case 516: System.out.println("516 IS MEENA'S ROLL NO.");
        break;	
	default: System.out.println("NOT ALLOWED");
        break; 	
  }
*/

//ANSWER 5:
/*
PASS BY VALUE: 
              -IT IS USED TO COPY PARAMETERS FROM ONE FUNCTION TO ANOTHER.
			  -INSTEAD OF ORIGINAL VALUE THE COPIED VALUE IS PASSED.
			  -CHANGE IN COPIED VALUE DOESN'T AFFECT ORIGINAL VALUE.
			  -JAVA USES THIS METHOD.
			  
PASS BY REFERENCE:
              -IT IS ALSO USED TO USE PARAMETERS OF ONE FUNCTION IN ANOTHER.
   			  -THE ORIGINAL VALUE IS PASSED FROM ONE FUNCTION TO ANOTHER.
			  -CHANGE IN PASSED VALUE AFFECTS ORIGINAL VALUE.
			  -JAVA DOES NOT USE THIS METHOD. 
*/ 

//ANSWER 6:
/*
 System.out.println("ENTER THE NUMBER:");
 Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
  
 System.out.println();
  
  for(int i=1;i<=a;i++) 
  {
   System.out.println(i);
  }
*/  

//ANSWER 7:
/* 
 System.out.println("ENTER VALUES:");
 Scanner sc = new Scanner(System.in); 
  int a[10] = sc.nextInt();
 
  for(int i=1;i<=a.length;i++)
  {
   System.out.println(a);
  }	  
*/

//ANSWER 8:
/*
  for(int i=1;i<=5;i++)
  {
	if(i%2==0)
	{
	  System.out.print("0");
	}		
	else
	{
	  System.out.print("1");
	}
  }	
  
  System.out.println();
  
   for(int i=1;i<=5;i++)
  {
	if(i%2==0)
	{
	  System.out.print("1");
	}		
	else
	{
	  System.out.print("0");
	}
  }	
  
  System.out.println();
  
   for(int i=1;i<=5;i++)
  {
	if(i%2==0)
	{
	  System.out.print("0");
	}		
	else
	{
	  System.out.print("1");
	}
  }	
*/  
 }	  
}

