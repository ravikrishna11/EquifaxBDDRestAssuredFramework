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

public class GetBook {
	
	String Endpoint = "";
	Headers header;
	Response response;
	CreateBook_Pojo createbook;
	@Given("Prepare Get Book End Point,Headers")
	public void prepare_Get_Book_End_Point_Headers() {
		Endpoint = CommonLibraries.Read_Endpoint("Get_Book");
		header=CommonLibraries.GetBook_Headers();
	}				

	@When("I do Get call with End point & Headers")
	public void i_do_Get_call_with_End_point_Headers() {
		response=CommonLibraries.JSON_GET(Endpoint, header,"bookId","3");
	}

	@Then("I validate the JSON status Code of Get Book API")
	public void i_validate_the_JSON_status_Code_of_Get_Book_API() {
		int Actual_statuscode = response.getStatusCode();
		int Exp_statuscode = 200;
		Assert.assertEquals(Actual_statuscode, Exp_statuscode);
	}

	@Then("I Validate book ID,Book Name of Get Book API")
	public void i_Validate_book_ID_Book_Name_of_Get_Book_API() throws Exception, Exception, Exception {
		createbook = new ObjectMapper().readValue(response.asString(), CreateBook_Pojo.class);

		String Actual_BookID=createbook.getbookId();
		String Actual_BookName = createbook.getBookName();
		String Expected_BookID = CommonLibraries.Read_Excel("CreateBook", "bookId");
		String Expected_BookName=CommonLibraries.Read_Excel("CreateBook", "BookName");
		Assert.assertEquals(Actual_BookID, Expected_BookID);
		Assert.assertEquals(Actual_BookName, Expected_BookName);
	}

	@Then("I Validate Author ID ,Author Name of Get Book API")
	public void i_Validate_Author_ID_Author_Name_of_Get_Book_API() {
		String Actual_AuthorID = createbook.getAuthorId();
		String Actual_authorName = createbook.getAuthorName();
		String Expected_AuthorId = CommonLibraries.Read_Excel("CreateBook", "AuthorId");
		String Expected_AuthorName = CommonLibraries.Read_Excel("CreateBook", "AuthorName");
		Assert.assertEquals(Actual_AuthorID, Expected_AuthorId);
		Assert.assertEquals(Actual_authorName, Expected_AuthorName);
	}

	@Then("I Validate Publisher ID,Publisher Name of Get Book API")
	public void i_Validate_Publisher_ID_Publisher_Name_of_Get_Book_API() {
		String Actual_publisherID = createbook.getPublisherId();
		String Actual_publisherName = createbook.getPublisherName();
		String Expected_PublisherId = CommonLibraries.Read_Excel("CreateBook", "PublisherId");
		String Expected_PublisherName = CommonLibraries.Read_Excel("CreateBook", "PublisherName");
		Assert.assertEquals(Actual_publisherID, Expected_PublisherId);
		Assert.assertEquals(Actual_publisherName, Expected_PublisherName);
	}


}
