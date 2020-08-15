package com.stepDefinitions;

import org.testng.Assert;

import com.Common.CommonLibraries;
import com.Pojo.CreateBooking_Pojo;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class CreateBooking {
	
	String Endpoint = "";
	Headers header;
	String JSONRequest = "";
	CreateBooking_Pojo CreateBooking;
	Response response;
	@Given("Prepare Createbooking End Point,Headers,Request")
	public void prepare_Createbooking_End_Point_Headers_Request() {
		Endpoint = CommonLibraries.Read_Endpoint("Create_Booking");
		header = CommonLibraries.Commom_Headers();
		JSONRequest = CommonLibraries.Read_JSON_Request("CreateBooking");
	}

	@When("I do post call with End point ,Request & Headers for Createbooking API")
	public void i_do_post_call_with_End_point_Request_Headers_for_Createbooking_API() {
		response = CommonLibraries.JSON_POST(JSONRequest, Endpoint, header);
	}

	@Then("I validate the JSON status Code of Createbooking API")
	public void i_validate_the_JSON_status_Code_of_Createbooking_API() {
		int Actual_statuscode = response.getStatusCode();
		int Exp_statuscode = 200;
		Assert.assertEquals(Actual_statuscode, Exp_statuscode);
	}

	@Then("I Validate  book Id,customerId  of Createbooking API")
	public void i_Validate_book_Id_customerId_of_Createbooking_API() throws Exception, Exception, Exception {
		CreateBooking=new ObjectMapper().readValue(response.asString(), CreateBooking_Pojo.class);
		String Actual_BookID=CreateBooking.getBookId();
		String Actual_CustomerID=CreateBooking.getCustomerId();
		String Expected_BookID=	CommonLibraries.Read_Excel("CreateBooking", "BookId");
		String Expected_CustomerID=CommonLibraries.Read_Excel("CreateBooking", "CustomerId");
		Assert.assertEquals(Actual_BookID, Expected_BookID);
		Assert.assertEquals(Actual_CustomerID, Expected_CustomerID);
	}

	@Then("I Validate bookingDate of Createbooking  API")
	public void i_Validate_bookingDate_of_Createbooking_API() {
		
		String Actual_BookingDate=CreateBooking.getBookingDate();
		String Expected_Bookingdate=CommonLibraries.Simple_Date("MMM dd, yyyy");
		System.out.println("adate: "+Actual_BookingDate);
		System.out.println("edate: "+Expected_Bookingdate);
		//String Expected_Bookingdate = CommonLibraries.Read_Excel("CreateBooking", "bookingDate");
		Assert.assertEquals(Actual_BookingDate, Expected_Bookingdate);
	}

}


