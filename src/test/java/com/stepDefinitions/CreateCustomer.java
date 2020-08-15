package com.stepDefinitions;

import org.testng.Assert;

import com.Common.CommonLibraries;
import com.Pojo.CreateCustomer_Pojo;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class CreateCustomer {
	
	String Endpoint = "";
	Headers header;
	String JSONRequest = "";
	Response response;
	CreateCustomer_Pojo Createcustomer;

	@Given("Prepare CreateCustomer End Point,Headers,Request")
	public void prepare_CreateCustomer_End_Point_Headers_Request() {
		Endpoint = CommonLibraries.Read_Endpoint("Create_Customer");
		header = CommonLibraries.Commom_Headers();
		JSONRequest = CommonLibraries.Read_JSON_Request("CreateCustomer");
	}

	@When("I do post call with End point ,Request & Headers for CreateCustomer API")
	public void i_do_post_call_with_End_point_Request_Headers_for_CreateCustomer_API() {
		response = CommonLibraries.JSON_POST(JSONRequest, Endpoint, header);
	}

	@Then("I validate the JSON status Code of CreateCustomer API")
	public void i_validate_the_JSON_status_Code_of_CreateCustomer_API() {
		int Actual_statuscode = response.getStatusCode();
		int Exp_statuscode = 200;
		Assert.assertEquals(Actual_statuscode, Exp_statuscode);
	}

	@Then("I Validate  Name of CreateCustomer API")
	public void i_Validate_Name_of_CreateCustomer_API() throws Exception, Exception, Exception {
		Createcustomer = new ObjectMapper().readValue(response.asString(), CreateCustomer_Pojo.class);
		String Actual_Name = Createcustomer.getName();

		String Expected_Name = CommonLibraries.Read_Excel("CreateCustomer", "Name");

		Assert.assertEquals(Actual_Name, Expected_Name);
	}

	@Then("I Validate Address of CreateCustomer API")
	public void i_Validate_Address_of_CreateCustomer_API() {

		String Actual_Address = Createcustomer.getAddress();

		String Expected_Address = CommonLibraries.Read_Excel("CreateCustomer", "Address");

		Assert.assertEquals(Actual_Address, Expected_Address);
	}

	@Then("I Validate Country Name of CreateCustomer API")
	public void i_Validate_Country_Name_of_CreateCustomer_API() {
		String Actual_Country = Createcustomer.getCountry();
		String Expected_Country = CommonLibraries.Read_Excel("CreateCustomer", "Country");

		Assert.assertEquals(Actual_Country, Expected_Country);
	}


}
