package com.cg.author.client;

import com.cg.author.entities.Author;
import com.cg.author.service.AuthorService;
import com.cg.author.service.AuthorServiceImpl;


public class Client {

	public static void main(String[] args) {

		//Debug this program as Debug -> Debug as Java Application
		
				AuthorService service = new AuthorServiceImpl();
				
				Author author = new Author();
				author.setAuthorId(100);
				author.setFirstName("Junaid");
				author.setMiddleName("Abdul");
				author.setLastName("Kazi");
				author.setPhoneNo(9970);
				service.addAuthor(author);
				
				//at this breakpoint, we have added one record to table
				author = service.findAuthorById(100);
				System.out.print("ID:"+author.getAuthorId());
				System.out.println(" FirstName:"+author.getFirstName());
				
				author.setFirstName("Abhijeet");
				service.updateAuthor(author);
				
				//at this breakpoint, we have updated record added in first section
				author = service.findAuthorById(100);
				System.out.print("ID:"+author.getAuthorId());
				System.out.println(" FirstName:"+author.getFirstName());
				
				//at this breakpoint, record is removed from table
				service.removeAuthor(author);
				System.out.println("End of program...");

				
				
				
	}

}
