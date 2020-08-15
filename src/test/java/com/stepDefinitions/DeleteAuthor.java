package com.stepDefinitions;

import org.testng.Assert;

import com.Common.CommonLibraries;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class DeleteAuthor {
	
	String Endpoint = "";
	Headers header;
	Response response;
	@Given("Prepare Delete  Request Author End Point,Headers")
	public void prepare_Delete_Request_Author_End_Point_Headers() {
		Endpoint = CommonLibraries.Read_Endpoint("Delete_Author");
		header=CommonLibraries.GetBook_Headers();
	}

	@When("I do Delete Request  with End point  ,Author ID and Headers for Author  API")
	public void i_do_Delete_Request_with_End_point_Author_ID_and_Headers_for_Author_API() {
		response=CommonLibraries.JSON_Delete(Endpoint, header,"authorId","2");
	}

	@Then("I validate the JSON status Code of Delete Request of Author API")
	public void i_validate_the_JSON_status_Code_of_Delete_Request_of_Author_API() {
		int Actual_statuscode = response.getStatusCode();
		int Exp_statuscode = 200;
		Assert.assertEquals(Actual_statuscode, Exp_statuscode);
	}

	@Then("I Validate  JSON message for Delete Request of Author API")
	public void i_Validate_JSON_message_for_Delete_Request_of_Author_API() {
		String res=response.asString();
		  if(res.contains("Successfully deleted author")) {
			  Assert.assertTrue(true, "Successfully deleted author");
		  }else {
			  Assert.fail("Invalid Response");
		  }
	}

}
