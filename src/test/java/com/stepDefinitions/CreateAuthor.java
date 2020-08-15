package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.Common.CommonLibraries;
import com.Pojo.CreateAuthor_Pojo;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class CreateAuthor {
	
	String Endpoint = "";
	Headers header;
	String JSONRequest = "";
	Response response;
	CreateAuthor_Pojo createauthr;

	@Given("Prepare CreateAuthor End Point,Headers,Request")
	public void prepare_CreateAuthor_End_Point_Headers_Request() {
		Endpoint = CommonLibraries.Read_Endpoint("Create_Author");
		header = CommonLibraries.Commom_Headers();
		JSONRequest = CommonLibraries.Read_JSON_Request("CreateAuthor");
	}

	@When("I do post call with End point ,Request & Headers for CreateAuthor API")
	public void i_do_post_call_with_End_point_Request_Headers_for_CreateAuthor_API() {
		response = CommonLibraries.JSON_POST(JSONRequest, Endpoint, header);
	}

	@Then("I validate the JSON status Code of CreateAuthor API")
	public void i_validate_the_JSON_status_Code_of_CreateAuthor_API() {
		int Actual_statuscode = response.getStatusCode();
		int Exp_statuscode = 200;
		Assert.assertEquals(Actual_statuscode, Exp_statuscode);
	}

	@Then("I Validate Author Name of CreateAuthor API")
	public void i_Validate_Author_Name_of_CreateAuthor_API() throws Exception, JsonMappingException, IOException {
		createauthr = new ObjectMapper().readValue(response.asString(), CreateAuthor_Pojo.class);
		String Actual_Name = createauthr.getName();

		String Expected_Name = CommonLibraries.Read_Excel("CreateAuthor", "Name");

		Assert.assertEquals(Actual_Name, Expected_Name);

	}

	@Then("I Validate Address of CreateAuthor API")
	public void i_Validate_Address_of_CreateAuthor_API() {
		String Actual_Address = createauthr.getAddress();

		String Expected_Address = CommonLibraries.Read_Excel("CreateAuthor", "Address");

		Assert.assertEquals(Actual_Address, Expected_Address);
	}

	@Then("I Validate Country Name of CreateAuthor API")
	public void i_Validate_Country_Name_of_CreateAuthor_API() {
		String Actual_Country = createauthr.getCountry();
		String Expected_Country = CommonLibraries.Read_Excel("CreateAuthor", "Country");

		Assert.assertEquals(Actual_Country, Expected_Country);
	}


}
