package com.cg.author.client;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.cg.author.entities.Author;
import com.cg.author.service.AuthorService;
import com.cg.author.service.AuthorServiceImpl;


public class ClientSwitch {

	public static void main(String[] args) {

		//Debug this program as Debug -> Debug as Java Application
		
				AuthorService service = new AuthorServiceImpl();
				
				Author author = new Author();
				
				
				
				
				//////////////////////////////////
				
				
				int op,choice;
				Scanner sc = new Scanner(System.in);
				do{
				    System.out.println("Enter your choice");
				    System.out.println("1. Insert");
				    System.out.println("2. Get authoe by Id");
				    System.out.println("3. Update");
				    System.out.println("4. Remove ");
				    System.out.println("5. Exit loop");
				    System.out.println("****************************");
				    choice = sc.nextInt();
				  switch(choice)
				  {
				  
				  case 1:
					  author.setAuthorId(100);
						author.setFirstName("Junaid");
						author.setMiddleName("Abdul");
						author.setLastName("Kazi");
						author.setPhoneNo(9970);
						service.addAuthor(author);
						
						System.out.print("ID:"+author.getAuthorId());
						System.out.println(" FirstName:"+author.getFirstName());
						System.out.println("MiddleName:"+author.getMiddleName());
						System.out.println("Last Name:"+author.getLastName());
						System.out.println("Phone No:"+author.getPhoneNo());
						System.out.println("****************************");
						
					  
					  break;
				  
				  case 2:
					  author = service.findAuthorById(100);
						System.out.print("ID:"+author.getAuthorId());
						System.out.println(" FirstName:"+author.getFirstName());
						
						author.setFirstName("Abhijeet");
						service.updateAuthor(author);
					  
					  break;
				   case 3:
					   author = service.findAuthorById(100);
						System.out.print("ID:"+author.getAuthorId());
						System.out.println(" FirstName:"+author.getFirstName());
				      break;
				   case 4:
					   service.removeAuthor(author);
						System.out.println("End of program...");
				      break;
				  
				   case 5:
				      System.exit(choice);
				      break;
				  }
				    
				    
				}while(choice!=5);
				
			
				
	}

}


