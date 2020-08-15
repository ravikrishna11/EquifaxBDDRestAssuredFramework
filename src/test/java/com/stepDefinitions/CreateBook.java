package com.stepDefinitions;

import org.testng.Assert;

import com.Common.CommonLibraries;
import com.Pojo.CreateBook_Pojo;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class CreateBook {
	
	String Endpoint = "";
	Headers header;
	String JSONRequest = "";
	CreateBook_Pojo createbook;
	Response response;
	
	@Given("Prepare Create Book End Point,Headers,Request")
	public void prepare_Create_Book_End_Point_Headers_Request() {
	
		
		Endpoint = CommonLibraries.Read_Endpoint("Create_book");
		header = CommonLibraries.Commom_Headers();
		JSONRequest = CommonLibraries.Read_JSON_Request("CreateBook");
		
		JSONRequest=JSONRequest.replace("<authorID>","1001");
		JSONRequest=JSONRequest.replace("<publisherID>","1002");
		System.out.println("Prepared JSON----> " + JSONRequest );
		

	}

	@When("I do Post call with End point,Headers & Request")
	public void i_do_Post_call_with_End_point_Headers_Request() {
		response = CommonLibraries.JSON_POST(JSONRequest, Endpoint, header);
	}

	@Then("I validate the JSON status Code")
	public void i_validate_the_JSON_status_Code() {
		int Actual_statuscode = response.getStatusCode();
		int Exp_statuscode = 200;
		Assert.assertEquals(Actual_statuscode, Exp_statuscode);
	}

	@Then("I Validate book ID,Book Name")
	public void i_Validate_book_ID_Book_Name() throws Exception, Exception, Exception {
		createbook = new ObjectMapper().readValue(response.asString(), CreateBook_Pojo.class);

		String Actual_BookID=createbook.getbookId();
		String Actual_BookName = createbook.getBookName();
		String Expected_BookID = CommonLibraries.Read_Excel("CreateBook", "bookId");
		String Expected_BookName=CommonLibraries.Read_Excel("CreateBook", "BookName");
		Assert.assertEquals(Actual_BookID, Expected_BookID);
		Assert.assertEquals(Actual_BookName, Expected_BookName);
	}

	@Then("I Validate Author ID ,Author Name")
	public void i_Validate_Author_ID_Author_Name() {
		String Actual_AuthorID = createbook.getAuthorId();
		String Actual_authorName = createbook.getAuthorName();
		String Expected_AuthorId = CommonLibraries.Read_Excel("CreateBook", "AuthorId");
		String Expected_AuthorName = CommonLibraries.Read_Excel("CreateBook", "AuthorName");
		Assert.assertEquals(Actual_AuthorID, Expected_AuthorId);
		Assert.assertEquals(Actual_authorName, Expected_AuthorName);
	}

	@Then("I Validate Publisher ID,Publisher Name")
	public void i_Validate_Publisher_ID_Publisher_Name() {
		String Actual_publisherID = createbook.getPublisherId();
		String Actual_publisherName = createbook.getPublisherName();
		String Expected_PublisherId = CommonLibraries.Read_Excel("CreateBook", "PublisherId");
		String Expected_PublisherName = CommonLibraries.Read_Excel("CreateBook", "PublisherName");
		Assert.assertEquals(Actual_publisherID, Expected_PublisherId);
		Assert.assertEquals(Actual_publisherName, Expected_PublisherName);
	}
	
	

}
