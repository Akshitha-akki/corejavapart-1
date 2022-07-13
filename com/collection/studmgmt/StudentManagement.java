package com.collection.studmgmt;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement  {

	public static void main(String[] args) {
		ArrayList<Student> studentdetail=new ArrayList<Student>();
		Scanner scan =new Scanner(System.in);
		String name;
		int age,salary;
		while(true)
		{
			System.out.println("Click the 1 - Add details");
			System.out.println("Click the 2 - displaying of Students details");
			System.out.println("Click the 3 - Count the Students details ");
			System.out.println("Click the 4 - remove");
			System.out.println("Click the 5 - Incerement of salary");
			System.out.println("Click the 6 - exit");
			System.out.println("Enter the choice : ");
			int choice= scan.nextInt();
			switch(choice)
			{
			    case 1:System.out.println("Enter the name : ");
			    		name=scan.next();
			    		System.out.println("Enter the age :");
			    		age=scan.nextInt();
			    		System.out.println("Enter the Salary : ");
			    		salary=scan.nextInt();
			    		Student s=new Student();
			    		
			    		s.setName(name);
			    		s.setAge(age);
			    		s.setSalary(salary);
			    		studentdetail.add(s);
			    		System.out.println("Student record is added ");
			    		break;
			    
			    case 2:
			    	for(int i=0;i<studentdetail.size();i++)
			    	{
			    		System.out.println("------------------------------------------------");
			    		System.out.println("Student details : "+(i+1));
			    		System.out.println("StudntName : "+studentdetail.get(i).getName());
			    		System.out.println("StudentAge : "+studentdetail.get(i).getAge());
			    		System.out.println("StudentSalary :"+studentdetail.get(i).getSalary());
			    		System.out.println("-------------------------------------------------");    		
			    	}
			    	break;
			    case 3: System.out.println("Count of Students : "+studentdetail.size());
			            break;
			    case 4:
			    	System.out.println("Students details ");
			    	System.out.println("NamesAge ");
			    	for(int i=0;i<studentdetail.size();i++)
			    	{
			    		System.out.println(studentdetail.get(i).getName()+"  "+studentdetail.get(i).getAge());
			    	}
			    	System.out.println("Enter the name or age for deletion");
			    	name=scan.next();
			    	int count=0;
			    	for(int i=0;i<studentdetail.size();i++)
			    	{
			    		if(studentdetail.get(i).getName().contains(name))
			    		{
			    			System.out.println("Count of names : "+(++count));
			    			studentdetail.remove(i);
			    		}
			    	}
			    	if(count==0)
			    	{
			    		System.out.println("No Record is found");
			    	}
			    	else 
			    	{
			    		System.out.println("Record is Successfully deleted");
					}
			    	break;
			    case 5:
			    		System.out.println("Incerment of salary");
			    		System.out.println("Enter the incerement salaray");
			    	    int IncerementSalaray= scan.nextInt();
			    	    for(int i=0;i<studentdetail.size();i++)
				    	{
			    	    	  int oldSalary=studentdetail.get(i).getSalary();
				    		  System.out.println(oldSalary*IncerementSalaray/100+oldSalary);	
				    		  System.out.println();
				    	}
			    	    break;
			    case 6: System.exit(0);
			    		break;
			    default:
			    	System.out.println("Invaild data");
			    	break;
			            
			}
		}
	}

}
