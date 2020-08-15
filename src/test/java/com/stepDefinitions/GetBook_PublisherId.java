package com.stepDefinitions;





import java.util.List;

import org.testng.Assert;

import com.Common.CommonLibraries;

import com.Pojo.PublisherIdBook_Pojo;
import com.fasterxml.jackson.databind.ObjectMapper;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class GetBook_PublisherId {
	

	String Endpoint = "";
	Headers header;
	Response response;
	PublisherIdBook_Pojo getPublisherId;
	
	
	@Given("Prepare Get Book details with publisherId End Point,Headers")
	public void prepare_Get_Book_details_with_publisherId_End_Point_Headers() {
		
		Endpoint = CommonLibraries.Read_Endpoint("Get_Publisher");
		header=CommonLibraries.GetBook_Headers();
	}

	@When("I do Get PublisherId call with End point & Headers")
	public void i_do_Get_PublisherId_call_with_End_point_Headers() {
		
		response=  CommonLibraries. JSON_GET(Endpoint, header,"publisherId","1");
		
	}

	@Then("I validate the JSON status Code of PublisherId API")
	public void i_validate_the_JSON_status_Code_of_PublisherId_API() {
		
		int Actual_statuscode = response.getStatusCode();
		int Exp_statuscode = 200;
		Assert.assertEquals(Actual_statuscode, Exp_statuscode);
		
		
	}

	@Then("I Validate book ID,Book Name of PublisherId API")
	public void i_Validate_book_ID_Book_Name_of_PublisherId_API() throws Exception, Exception, Exception {
		
		getPublisherId = new ObjectMapper().readValue(response.asString(),PublisherIdBook_Pojo.class);
		
		
		List<PublisherIdBook_Pojo> Actual_BookID=getPublisherId.getBookId();
		List<PublisherIdBook_Pojo> Actual_BookName = getPublisherId.getBookName();
		System.out.println("Actual_BookID: "+Actual_BookID);
		String Expected_BookID = CommonLibraries.Read_Excel("CreateBook", "bookId");
		String Expected_BookName=CommonLibraries.Read_Excel("CreateBook", "BookName");
		Assert.assertEquals(Actual_BookID, Expected_BookID);
		Assert.assertEquals(Actual_BookName, Expected_BookName);
		
		
		
	}

	@And("I Validate Author ID ,Author Name of PublisherId API")
	public void i_Validate_Author_ID_Author_Name_of_PublisherId_API() {
		
		List<PublisherIdBook_Pojo> Actual_AuthorID = getPublisherId.getAuthorId();
		List<PublisherIdBook_Pojo> Actual_authorName = getPublisherId.getAuthorName();
		String Expected_AuthorId = CommonLibraries.Read_Excel("CreateBook", "AuthorId");
		String Expected_AuthorName = CommonLibraries.Read_Excel("CreateBook", "AuthorName");
		Assert.assertEquals(Actual_AuthorID, Expected_AuthorId);
		Assert.assertEquals(Actual_authorName, Expected_AuthorName);
	    
	}


}
