package com.stepDefinitions;

import org.testng.Assert;

import com.Common.CommonLibraries;
import com.Pojo.SaveBooking_Pojo;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class SaveBooking {
	
	String Endpoint = "";
	Headers header;
	String JSONRequest = "";
	SaveBooking_Pojo savebooking;
	Response response;
	@Given("Prepare savebooking End Point,Headers,Request")
	public void prepare_savebooking_End_Point_Headers_Request() {
		Endpoint = CommonLibraries.Read_Endpoint("Save_Booking");
		header = CommonLibraries.Commom_Headers();
		JSONRequest = CommonLibraries.Read_JSON_Request("SaveBooking");
	}

	@When("I do post call with End point ,Request & Headers for savebooking API")
	public void i_do_post_call_with_End_point_Request_Headers_for_savebooking_API() {
		response = CommonLibraries.JSON_POST(JSONRequest, Endpoint, header);
	}

	@Then("I validate the JSON status Code of savebooking API")
	public void i_validate_the_JSON_status_Code_of_savebooking_API() {
		int Actual_statuscode = response.getStatusCode();
		int Exp_statuscode = 200;
		Assert.assertEquals(Actual_statuscode, Exp_statuscode);
	}

	@Then("I Validate  book Id,customerId  of savebooking API")
	public void i_Validate_book_Id_customerId_of_savebooking_API() throws Exception, Exception, Exception {
		savebooking=new ObjectMapper().readValue(response.asString(), SaveBooking_Pojo.class);
		String Actual_BookID=savebooking.getBookId();
		String Actual_CustomerID=savebooking.getCustomerId();
		String Expected_BookID=	CommonLibraries.Read_Excel("SaveBooking", "BookId");
		String Expected_CustomerID=CommonLibraries.Read_Excel("SaveBooking", "CustomerId");
		Assert.assertEquals(Actual_BookID, Expected_BookID);
		Assert.assertEquals(Actual_CustomerID, Expected_CustomerID);
	}

	@Then("I Validate bookingDate of savebooking API")
	public void i_Validate_bookingDate_of_savebooking_API() {
		//String Expected_Bookingdate=CommonLibraries.Simple_Date("MMM dd, yyyy");
		String Actual_BookingDate=savebooking.getBookingDate();
		String Expected_Bookingdate = CommonLibraries.Read_Excel("savebooking", "bookingDate");
		Assert.assertEquals(Actual_BookingDate, Expected_Bookingdate);
	}

}
