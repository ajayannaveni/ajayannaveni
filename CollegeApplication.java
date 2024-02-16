package com.practice;
import java.util.*;
public class CollegeApplication 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Btech b=new Btech();
		Bsc b1=new Bsc();
		MCA m=new MCA();
		Mtech m1=new Mtech();
		college c=new college();
		c.history();
		System.out.println("\nare you intermediate passed or Ug passed");
		System.out.println("select option");
		System.out.println(" 1.inter mediate\n 2.Ug passed\n 3.Exit");
		int num=s.nextInt();
		int num1,num4,num6,a,c1,c3,c4;
		double n6,n7,n8,c5;
		String s1,s2,s3,s4,s5,s6,s7,n1,n2,n4,n5,n3,s8,s9,i;
		while(true)
		{
			if(num==1)
			{
				System.out.println(" which one is choose:\n1.B.Tech\n2.Bsc");
				num1=s.nextInt();
				if(num1==1)
				{
				  b.branches();
				  System.out.println("\nwhich branch select");
				  b.num2=s.nextInt();
				  b.fee();
				}
				else if(num1==2)
				{	
					b1.branches();
					System.out.println("\nwhich branch select");
					b1.num3=s.nextInt();
					b1.fee();
				}
				else
					System.out.println("your enter invalid number please try again");
				break;
			}
		     else if(num==2)
			 {
					System.out.println("which one is choose:\n1.MCA\n2.M.Tech");
					num4=s.nextInt();
					if(num4==1)
					{
						m.branches();
						System.out.println("\nwhich branch select");
						m.num3=s.nextInt();
						m.fee();
					}
					else if(num4==2)
					{
						m1.branches();
						System.out.println("\nwhich branch select");
						m1.num5=s.nextInt();
						m1.fee();
					}
					else
						System.out.println("your enter invalid number please try again");
					break;	
			 }
		}
		            System.out.println("\nare you compartbale with fee \n1.yes\n2.no ");
		            s1=s.next();
		            System.out.println("enter the your details:-\nenter your surname:");
		            s2=s.next();
		            System.out.println("enter your name:");
		            s3=s.next();
		    		System.out.println("enter the your father name");
		    		s4=s.next();
		    		System.out.println("enter your mother name");
		    		s5=s.next();
		    		System.out.println("enter your mobile number:");
		    		n1=s.next();
		    		while(n1.length()!=10)
		    		{
						System.out.println("Please re-enter your mobile number conatins only 10 digits");
						n1=s.nextLine();
					}
		    		System.out.println("re-enter your mobile number");
		    		n2=s.next();
		    		while(n2.length()!=10)
		    		{
		    			System.out.println("Please re-enter your mobile number conatins only 10 digits");
						n2=s.nextLine();
		    		}
		    		System.out.println("enter the your father/mother mobile number:");
		    		n3=s.next();
		    		while(n3.length()!=10)
		    		{
		    			System.out.println("Please re-enter your mobile number conatins only 10 digits");
		    			n3=s.next();
		    		}
		    		System.out.println("enter the gmail");
		    		s8=s.next();
		    		System.out.println(" press 1 to verify your gmail");
		    		c3=s.nextInt();
		    		Random r=new Random();
		    		if(c3==1)
		    		{
		    		  a=r.nextInt(1000,9999);
			    	  System.out.println("Don't share the otp\notp :"+a+"\nenter the otp");
		    		  c4=s.nextInt();
		    		    if(a==c4)
		    		    	System.out.println("otp is verified");
		    		    else if(a!=4)
		    		    {
		    		    	System.out.println("otp is not valid re enter the otp");
		    		    	c4=s.nextInt();
		    		    	System.out.println("otp is verified");
		    		    }   
		    		 }
		    		 else 
		    		   {
		    			System.out.println("please re-click 1 to verify your gmail");
		    			c3=s.nextInt();
		    		   }
		    		System.out.println("enter the 10th hall-ticket");
		    		s9=s.next();
		    		System.out.println("enter the aadhar number:");
		    		i=s.next();
//		    		Integer j;
//		    		j=s.nextInt();
//		    		if(j!=10)
//		    		{
//		    			System.out.println("enter valid aadhar number");
//		    			j=s.nextInt();
//		    			System.out.println("aadhar number is verified");
//		    		}
		    		System.out.println("enter the 10th percentage");
		    		n6=s.nextDouble();
		    		System.out.println("enter the intermediate or diploma percentage");
		    		n7=s.nextDouble();
		    		c1=r.nextInt(1000,9999);
		    		if(num==1)
		    		{
		    		System.out.println(" your admission number is: "+"D"+c1);
		    		System.out.println("\nyour admission is done and upload your certificates"); 
		    		}
		    		else if(num==2)
		    		{
		    			    System.out.println("enter the UG percentage");
		    			    c5=s.nextDouble();
				    		System.out.println("\nyour admission number is: "+"D"+c1);
				    		System.out.println("\nyour admission is done and upload your certificates"); 
		    		}
	}
}
class college
{
	String cname,ccode,history,location;
	college()
	{
		cname="indur institute of engineering & technology";
		ccode="D31";
		location="siddipet";
	}
	public void history()
	{
		System.out.println("college:indur institute of engineering & technology"); 
		System.out.println("college code:"+ccode);
		System.out.println("location:"+location+"\n");
		System.out.println("     ****wel come new batch ***\n    ****our college speciality****");
		System.out.println("*----iiet his establish by 2001----*");
		System.out.println("*----iiet student is placed nearly 1-lack more---*");
		System.out.println("*----every year joining new batch 1000----*");
		System.out.println("*----our strength also student---*\n*----we conduct culture activities and sports----*");
		System.out.println("*----life is short so decide best opition----*");
	}
}
class Ug extends college
{
	public void courses()
	{
		System.out.println("B.tech");
		System.out.println("Bsc");
	}
}
class Btech extends Ug
{
	public void branches()
	{
		System.out.println("braches:\n1.eee\n2.ece\n3.cse\n4.civil\n5.mech\n6.it");
	}
	int num2;
	public void fee()
	{
		switch(num2)
		{
		case 1: System.out.println("eee fee is :90000");
		         break;
		case 2: System.out.println("ece fee is :85000");
                 break;
		case 3: System.out.println("cse fee is :150000");
                 break;
		case 4: System.out.println("it fee is  :125000");
                 break;
		case 5: System.out.println("civil fee is:80000");
                 break;
		case 6: System.out.println("mech fee is :80000");
                 break;
		default : System.out.println(" your enter the invalid number");	
		}
	}
}
class Bsc extends Ug
{
 int num3;
	public void branches()
	{
		String a[]=new String[]{"1.Bsc.computer","2.Bsc.mathematics","3.Bsc.forestry","4.Bsc.zoology","5.Bsc.Agriculture"};
        System.out.println("Bsc branches");
        for(int x=0;x<a.length;x++)
        {
        	System.out.println(a[x]);
        }
		}
	public void fee()
	{
		switch(num3)
		{
		case 1: System.out.println("Bsc.computer fee is :100000");
		         break;
		case 2: System.out.println("Bsc.mathematics fee is :95000");
                 break;
		case 3: System.out.println("Bsc.forestry fee is :80000");
                 break;
		case 4: System.out.println("Bsc.zoology fee is  :85000");
                 break;
		case 5: System.out.println("Bsc.Agriculture fee is  :100000");
                 break;
		default : System.out.println(" your enter the invalid number");	
		}
	}
}
class PG extends college
{
	public void courses()
	{
		System.out.println("1.Mca\n2.M.tech");
	}
}
class MCA extends PG
{ 
	int num3;
	public void branches()
	{
	String a[]=new String[]{"1.Mca.cyber security","2.Mca.dataScience","3.Mca.artificial Intelligence","4.Mca.cloud computing","5.Mca.Data analystics"};
    System.out.println("MCA branches: ");
    for(int x=0;x<a.length;x++)
    {
    	System.out.println(a[x]);
    }
    }
    public void fee()
    {
    switch(num3)
	{
	case 1: System.out.println("Mca.cyber security fee is :100000");
	         break;
	case 2: System.out.println("Mca.datascience fee is :95000");
             break;
	case 3: System.out.println("Mca.artificial intelligence fee is :90000");
             break;
	case 4: System.out.println("Mca.cloud computing fee is  :95000");
             break;
	case 5: System.out.println("Mca.Data Analystics fee is  :100000");
             break;
	default : System.out.println(" your enter the invalid number");	
	}
	}
}
class Mtech extends PG
{
	int num5;
	public void branches()	
	{
		String a[]=new String[]{"1.EEE","2.CSE","3.CIVIL","4.IT","5.CIVIL","6.MECH"};
	    System.out.println("Mtech branches");
	    for(String temp:a)
	    {
	    	System.out.println(temp);
	    }
	}
	public void fee()
	{
		switch(num5)
		{
		case 1: System.out.println("eee fee is :150000");
		         break;
		case 2: System.out.println("ece fee is :100000");
                 break;
		case 3: System.out.println("cse fee is :200000");
                 break;
		case 4: System.out.println("it fee is  :220000");
                 break;
		case 5: System.out.println("civil fee is:100000");
                 break;
		case 6: System.out.println("mech fee is :100000");
                 break;
		default : System.out.println(" your enter the invalid number");	
		}
	}
}
