//ANSWER 1:
/*
ENCAPSULATION REFERS TO MAKING A METHOD OR VARIABLE PRIVATE IN A CLASS SO THAT 
IT CANNOT BE DIRECTLY ACCESSED OUTSIDE THAT CLASS.IT HELPS IN MAKING THE CODE 
MORE SECURE AND EFFECTIVE.TO ACCESS ANY ENCAPSULATED DATA OUTSIDE THE CLASS A 
PUBLIC METHOD OF THE SAME CLASS IS USED.

EXAMPLE:

class Assignment
{
 public static void main(String[] args)
 {
     Encap obj = new Encap();
        obj.lol2();	 
 }
}	

class Encap
{
    private void lol()
	{
		System.out.println("THIS IS THE EXAMPLE OF ANSWER 1.");
	}
	
    void lol2()
    {
	  lol(); 
    }  
}

*/

//ANSWER 2:
/*
POLYMORPHISM REFERS TO HAVE DIFFERENT METHODS WITH SAME NAME HAVE
DIFFERENT PROPERTIES,FOR THIS INHERITANCE IS NEEDED.

THERE ARE TWO TYPES OF POLYMORPHISM:
1.OVERRIDE - FUNCTION NAME AND ARGUMENTS ARE SAME IN METHODS OF
             PARENT AND CHILD CLASS.
2.OVERLOAD - FUNCTION NAME IS SAME BUT ARGUMENTS ARE DIFFERENT
             IN METHODS OF PARENT AND CHILD CLASS.   			 

EXAMPLE:

class Parent
{
	void lol()
	{
		System.out.println("THIS IS THE EXAMPLE OF ANSWER 2.");
	}
}


class Child extends Parent
{
	public static void main(String[] args)
	{
		Child obj = new Child();
		    obj.lol(); 
			obj.lol(2);
	}
   
    void lol()
    {
		super.lol();
     System.out.println("THIS IS THE EXAMPLE OF ANSWER 2 AFTER OVERRIDE.");
	} 
	
	void lol(int a)
	{
        super.lol();		
		System.out.println("THIS IS THE EXAMPLE OF ANSWER "+a+" AFTER OVERLOAD.");
	}
}
*/

//ANSWER 3:
/*
1) ACCESS SPECIFIERS:-
                      THESE DETERMINE IN HOW MANY WAYS A METHOD OR A VARIABLE CAN 
					  BE ACCESSED WHICH ARE MAINLY "WIHTIN CLASS","OUTSIDE PACKAGE",
                      "OUTSIDE PACKAGE USING SUBCLASS","WITHIN PACKAGE".   
					  
                      FOUR TYPES OF ACCESS SPECIFIERS ARE:
					   -PUBLIC 
					   -PRIVATE
					   -DEFAULT
					   -PROTECTED
					   
2) PACKAGES:-
             IT REFERS TO THE FOLDERS IN WHICH THE JAVA FILES AND 
			 CLASS FILES ARE SAVED WHEN WRITING A PROGRAM IN JAVA.
			 
3) FINAL KEYWORD:-
                  WHEN WE DON'T WANT TO HAVE THE VALUE OF A VARIABLE CHANGED
                  THAT'S WHEN WE DECLARE THE VARIABLE ALONG WITH FINAL KEYWORD
                  SO THAT THE VALUE REMAINS CONSTANT THROUGHOUT THE PROGRAM.  				  
*/

//ANSWER 4:
/*
class Rectangle
{
	static void area()
	{
		System.out.println("area");
	}
	
	static String length ="length";
	static void length()
	{
		System.out.println(length);
	}
	
	void circumference()
	{
		System.out.println("circumference");
	}
	 
	String breadth ="breadth";
    void breadth()
	{
	 System.out.println(breadth);
	}
}

class Shape extends Rectangle
{
 	public static void main(String[] args)
	{
		Shape.area();
		Shape.length();
		
		Shape obj = new Shape();
		    obj.circumference();
			obj.breadth();
	}
}
*/	

//ANSWER 5:
/*
class Assignment
{
 public static void main(String[] args) 
 {	
   for(int i=0;i<4;i++)
   {
	switch(i)
	{
	case 0: System.out.println("   1");
	      break; 
    case 1: System.out.println("  11");
	      break; 
    case 2: System.out.println(" 111");
	      break;
    case 3: System.out.println("1111");
	      break;
	}
   }	
 } 
}
*/








