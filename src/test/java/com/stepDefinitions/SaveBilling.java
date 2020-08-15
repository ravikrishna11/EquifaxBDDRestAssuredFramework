package com.stepDefinitions;

import org.testng.Assert;

import com.Common.CommonLibraries;
import com.Pojo.Savebilling_pojo;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class SaveBilling {
	
	String Endpoint = "";
	Headers header;
	String JSONRequest = "";
	Response response;
	Savebilling_pojo savebilling;

	@Given("Prepare Savebilling End Point,Headers,Request")
	public void prepare_Savebilling_End_Point_Headers_Request() {
		Endpoint = CommonLibraries.Read_Endpoint("Save_Billing");
		header = CommonLibraries.Commom_Headers();
		JSONRequest = CommonLibraries.Read_JSON_Request("SaveBilling");
	}

	@When("I do post call with End point ,Request & Headers for Savebilling API")
	public void i_do_post_call_with_End_point_Request_Headers_for_Savebilling_API() {
		response = CommonLibraries.JSON_POST(JSONRequest, Endpoint, header);
	}

	@Then("I validate the JSON status Code of Savebilling API")
	public void i_validate_the_JSON_status_Code_of_Savebilling_API() {
		int Actual_statuscode = response.getStatusCode();
		int Exp_statuscode = 200;
		Assert.assertEquals(Actual_statuscode, Exp_statuscode);
	}

	@Then("I Validate  booking Id,customerId,bookingCost  of Savebilling API")
	public void i_Validate_booking_Id_customerId_bookingCost_of_Savebilling_API() throws Exception, Exception, Exception {
		savebilling=	new ObjectMapper().readValue(response.asString(), Savebilling_pojo.class);
		String Actual_BookingID = savebilling.getBookingId();
		String Actual_CustomerID = savebilling.getCustomerId();
		String Actual_Bookingcost = savebilling.getBookingCost();
		String Expected_BookingID = CommonLibraries.Read_Excel("SaveBilling", "bookingId");
		String Expected_CustomerID = CommonLibraries.Read_Excel("SaveBilling", "CustomerId");
		String Expected_Bookingcost = CommonLibraries.Read_Excel("SaveBilling", "BookingCost");
		Assert.assertEquals(Actual_BookingID, Expected_BookingID);
		Assert.assertEquals(Actual_CustomerID, Expected_CustomerID);
		Assert.assertEquals(Actual_Bookingcost, Expected_Bookingcost);
	}

	@Then("I Validate billingAddress,zipzode,state of Savebilling API")
	public void i_Validate_billingAddress_zipzode_state_of_Savebilling_API() {
		String Actual_BillingAddress = savebilling.getBillingAddress();
		String Actual_Zipcode = savebilling.getZipzode();
		String Actual_states = savebilling.getState();
		String Expected_BillingAddress = CommonLibraries.Read_Excel("SaveBilling", "BillingAddress");
		String Expected_Zipcode = CommonLibraries.Read_Excel("SaveBilling", "Zipzode");
		String Expected_states = CommonLibraries.Read_Excel("SaveBilling", "state");
		Assert.assertEquals(Actual_BillingAddress, Expected_BillingAddress);
		Assert.assertEquals(Actual_Zipcode, Expected_Zipcode);
		Assert.assertEquals(Actual_states, Expected_states);

	}


}
