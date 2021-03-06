package com.stepDefinitions;

import org.testng.Assert;

import com.Common.CommonLibraries;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class DeleteBook {
	
	String Endpoint = "";
	Headers header;
	Response response;
	@Given("Prepare Delete  Request Book End Point,Headers")
	public void prepare_Delete_Request_Book_End_Point_Headers() {
		Endpoint = CommonLibraries.Read_Endpoint("Delete_Book");
		header=CommonLibraries.GetBook_Headers();
	}

	@When("I do Delete Request  with End point  ,Book ID and Headers for Book  API")
	public void i_do_Delete_Request_with_End_point_Book_ID_and_Headers_for_Book_API() {
		response=CommonLibraries.JSON_Delete(Endpoint, header,"bookId","3");
	}

	@Then("I validate the JSON status Code of Delete Request of Book API")
	public void i_validate_the_JSON_status_Code_of_Delete_Request_of_Book_API() {
		int Actual_statuscode = response.getStatusCode();
		int Exp_statuscode = 200;
		Assert.assertEquals(Actual_statuscode, Exp_statuscode);
	}

	@Then("I Validate  JSON message for Delete Request of Book API")
	public void i_Validate_JSON_message_for_Delete_Request_of_Book_API() {
		String res=response.asString();
	  if(res.contains("Book Deleted Successfully")) {
		  Assert.assertTrue(true, "Book Deleted Successfully");
	  }else {
		  Assert.fail("Invalid Response");
	  }
	}


}
