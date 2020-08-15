package com.stepDefinitions;

import org.testng.Assert;

import com.Common.CommonLibraries;
import com.Pojo.CreatePublisher_Pojo;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class CreatePublisher {
	
	String Endpoint = "";
	Headers header;
	Response response;
	String JSONRequest = "";
	CreatePublisher_Pojo createpublisher;

	@Given("Prepare CreatePublisher End Point,Headers,Request")
	public void prepare_CreatePublisher_End_Point_Headers_Request() {
		Endpoint = CommonLibraries.Read_Endpoint("Create_Publisher");
		header = CommonLibraries.Commom_Headers();
		JSONRequest = CommonLibraries.Read_JSON_Request("CreatePublisher");
	}

	@When("I do post call with End point ,Request & Headers for CreatePublisher API")
	public void i_do_post_call_with_End_point_Request_Headers_for_CreatePublisher_API() {
		response = CommonLibraries.JSON_POST(JSONRequest, Endpoint, header);
	}

	@Then("I validate the JSON status Code of CreatePublisher API")
	public void i_validate_the_JSON_status_Code_of_CreatePublisher_API() {
		int Actual_statuscode = response.getStatusCode();
		int Exp_statuscode = 200;
		Assert.assertEquals(Actual_statuscode, Exp_statuscode);
	}

	@Then("I Validate Publisher ID,Publisher Name of CreatePublisher API")
	public void i_Validate_Publisher_ID_Publisher_Name_of_CreatePublisher_API() throws Exception, Exception, Exception {
		createpublisher = new ObjectMapper().readValue(response.asString(), CreatePublisher_Pojo.class);

		String Actual_PublisherName = createpublisher.getPublisherName();

		String Expected_PublisherName = CommonLibraries.Read_Excel("CreatePublisher", "publisherName");

		Assert.assertEquals(Actual_PublisherName, Expected_PublisherName);
	}

	@Then("I Validate Address of CreatePublisher API")
	public void i_Validate_Address_of_CreatePublisher_API() {
		String Actual_Address = createpublisher.getAddress();

		String Expected_Address = CommonLibraries.Read_Excel("CreatePublisher", "address");
		
		Assert.assertEquals(Actual_Address, Expected_Address);
	}

	@Then("I Validate Country Name of CreatePublisher API")
	public void i_Validate_Country_Name_of_CreatePublisher_API() {
		String Actual_Country = createpublisher.getCountry();

		String Expected_Country= CommonLibraries.Read_Excel("CreatePublisher", "country");
		
		Assert.assertEquals(Actual_Country, Expected_Country);
	}

}
