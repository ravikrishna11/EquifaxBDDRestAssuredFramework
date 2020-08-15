$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Library.feature");
formatter.feature({
  "name": "API Automation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Create Book API",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateBook"
    }
  ]
});
formatter.step({
  "name": "Prepare Create Book End Point,Headers,Request",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateBook.prepare_Create_Book_End_Point_Headers_Request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do Post call with End point,Headers \u0026 Request",
  "keyword": "When "
});
formatter.match({
  "location": "CreateBook.i_do_Post_call_with_End_point_Headers_Request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the JSON status Code",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateBook.i_validate_the_JSON_status_Code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate book ID,Book Name",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateBook.i_Validate_book_ID_Book_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate Author ID ,Author Name",
  "keyword": "And "
});
formatter.match({
  "location": "CreateBook.i_Validate_Author_ID_Author_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate Publisher ID,Publisher Name",
  "keyword": "And "
});
formatter.match({
  "location": "CreateBook.i_Validate_Publisher_ID_Publisher_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Get Book API",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@GetBook"
    }
  ]
});
formatter.step({
  "name": "Prepare Get Book End Point,Headers",
  "keyword": "Given "
});
formatter.match({
  "location": "GetBook.prepare_Get_Book_End_Point_Headers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do Get call with End point \u0026 Headers",
  "keyword": "When "
});
formatter.match({
  "location": "GetBook.i_do_Get_call_with_End_point_Headers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the JSON status Code of Get Book API",
  "keyword": "Then "
});
formatter.match({
  "location": "GetBook.i_validate_the_JSON_status_Code_of_Get_Book_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate book ID,Book Name of Get Book API",
  "keyword": "Then "
});
formatter.match({
  "location": "GetBook.i_Validate_book_ID_Book_Name_of_Get_Book_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate Author ID ,Author Name of Get Book API",
  "keyword": "And "
});
formatter.match({
  "location": "GetBook.i_Validate_Author_ID_Author_Name_of_Get_Book_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate Publisher ID,Publisher Name of Get Book API",
  "keyword": "And "
});
formatter.match({
  "location": "GetBook.i_Validate_Publisher_ID_Publisher_Name_of_Get_Book_API()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Get Book Details with PublisherId",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Book_PublisherId"
    }
  ]
});
formatter.step({
  "name": "Prepare Get Book details with publisherId End Point,Headers",
  "keyword": "Given "
});
formatter.match({
  "location": "GetBook_PublisherId.prepare_Get_Book_details_with_publisherId_End_Point_Headers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do Get PublisherId call with End point \u0026 Headers",
  "keyword": "When "
});
formatter.match({
  "location": "GetBook_PublisherId.i_do_Get_PublisherId_call_with_End_point_Headers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the JSON status Code of PublisherId API",
  "keyword": "Then "
});
formatter.match({
  "location": "GetBook_PublisherId.i_validate_the_JSON_status_Code_of_PublisherId_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate book ID,Book Name of PublisherId API",
  "keyword": "Then "
});
formatter.match({
  "location": "GetBook_PublisherId.i_Validate_book_ID_Book_Name_of_PublisherId_API()"
});
formatter.result({
  "error_message": "com.fasterxml.jackson.databind.exc.MismatchedInputException: Cannot deserialize instance of `com.Pojo.PublisherIdBook_Pojo` out of START_ARRAY token\n at [Source: (String)\"[{\"bookId\":3,\"bookName\":\"bookone\",\"authorId\":2,\"authorName\":\"authorone\",\"publisherId\":1,\"publisherName\":\"publisherone\",\"genre\":\"thriller\",\"price\":100,\"numberOfPages\":100}]\"; line: 1, column: 1]\r\n\tat com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:63)\r\n\tat com.fasterxml.jackson.databind.DeserializationContext.reportInputMismatch(DeserializationContext.java:1342)\r\n\tat com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1138)\r\n\tat com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1092)\r\n\tat com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1461)\r\n\tat com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:185)\r\n\tat com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)\r\n\tat com.fasterxml.jackson.databind.ObjectMapper._readMapAndClose(ObjectMapper.java:4013)\r\n\tat com.fasterxml.jackson.databind.ObjectMapper.readValue(ObjectMapper.java:3004)\r\n\tat com.stepDefinitions.GetBook_PublisherId.i_Validate_book_ID_Book_Name_of_PublisherId_API(GetBook_PublisherId.java:60)\r\n\tat ✽.I Validate book ID,Book Name of PublisherId API(file:src/test/resources/Features/Library.feature:42)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I Validate Author ID ,Author Name of PublisherId API",
  "keyword": "And "
});
formatter.match({
  "location": "GetBook_PublisherId.i_Validate_Author_ID_Author_Name_of_PublisherId_API()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validate CreatePublisher API",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreatePublisher"
    }
  ]
});
formatter.step({
  "name": "Prepare CreatePublisher End Point,Headers,Request",
  "keyword": "Given "
});
formatter.match({
  "location": "CreatePublisher.prepare_CreatePublisher_End_Point_Headers_Request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do post call with End point ,Request \u0026 Headers for CreatePublisher API",
  "keyword": "When "
});
formatter.match({
  "location": "CreatePublisher.i_do_post_call_with_End_point_Request_Headers_for_CreatePublisher_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the JSON status Code of CreatePublisher API",
  "keyword": "Then "
});
formatter.match({
  "location": "CreatePublisher.i_validate_the_JSON_status_Code_of_CreatePublisher_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate Publisher ID,Publisher Name of CreatePublisher API",
  "keyword": "Then "
});
formatter.match({
  "location": "CreatePublisher.i_Validate_Publisher_ID_Publisher_Name_of_CreatePublisher_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate Address of CreatePublisher API",
  "keyword": "And "
});
formatter.match({
  "location": "CreatePublisher.i_Validate_Address_of_CreatePublisher_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate Country Name of CreatePublisher API",
  "keyword": "And "
});
formatter.match({
  "location": "CreatePublisher.i_Validate_Country_Name_of_CreatePublisher_API()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate CreateAuthor API",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateAuthor"
    }
  ]
});
formatter.step({
  "name": "Prepare CreateAuthor End Point,Headers,Request",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAuthor.prepare_CreateAuthor_End_Point_Headers_Request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do post call with End point ,Request \u0026 Headers for CreateAuthor API",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAuthor.i_do_post_call_with_End_point_Request_Headers_for_CreateAuthor_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the JSON status Code of CreateAuthor API",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAuthor.i_validate_the_JSON_status_Code_of_CreateAuthor_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate Author Name of CreateAuthor API",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAuthor.i_Validate_Author_Name_of_CreateAuthor_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate Address of CreateAuthor API",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAuthor.i_Validate_Address_of_CreateAuthor_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate Country Name of CreateAuthor API",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAuthor.i_Validate_Country_Name_of_CreateAuthor_API()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate CreateCustomer API",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateCustomer"
    }
  ]
});
formatter.step({
  "name": "Prepare CreateCustomer End Point,Headers,Request",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateCustomer.prepare_CreateCustomer_End_Point_Headers_Request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do post call with End point ,Request \u0026 Headers for CreateCustomer API",
  "keyword": "When "
});
formatter.match({
  "location": "CreateCustomer.i_do_post_call_with_End_point_Request_Headers_for_CreateCustomer_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the JSON status Code of CreateCustomer API",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateCustomer.i_validate_the_JSON_status_Code_of_CreateCustomer_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate  Name of CreateCustomer API",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateCustomer.i_Validate_Name_of_CreateCustomer_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate Address of CreateCustomer API",
  "keyword": "And "
});
formatter.match({
  "location": "CreateCustomer.i_Validate_Address_of_CreateCustomer_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate Country Name of CreateCustomer API",
  "keyword": "And "
});
formatter.match({
  "location": "CreateCustomer.i_Validate_Country_Name_of_CreateCustomer_API()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Savebilling API",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Savebilling"
    }
  ]
});
formatter.step({
  "name": "Prepare Savebilling End Point,Headers,Request",
  "keyword": "Given "
});
formatter.match({
  "location": "SaveBilling.prepare_Savebilling_End_Point_Headers_Request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do post call with End point ,Request \u0026 Headers for Savebilling API",
  "keyword": "When "
});
formatter.match({
  "location": "SaveBilling.i_do_post_call_with_End_point_Request_Headers_for_Savebilling_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the JSON status Code of Savebilling API",
  "keyword": "Then "
});
formatter.match({
  "location": "SaveBilling.i_validate_the_JSON_status_Code_of_Savebilling_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate  booking Id,customerId,bookingCost  of Savebilling API",
  "keyword": "Then "
});
formatter.match({
  "location": "SaveBilling.i_Validate_booking_Id_customerId_bookingCost_of_Savebilling_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate billingAddress,zipzode,state of Savebilling API",
  "keyword": "And "
});
formatter.match({
  "location": "SaveBilling.i_Validate_billingAddress_zipzode_state_of_Savebilling_API()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate savebooking API",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Savebooking"
    }
  ]
});
formatter.step({
  "name": "Prepare savebooking End Point,Headers,Request",
  "keyword": "Given "
});
formatter.match({
  "location": "SaveBooking.prepare_savebooking_End_Point_Headers_Request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do post call with End point ,Request \u0026 Headers for savebooking API",
  "keyword": "When "
});
formatter.match({
  "location": "SaveBooking.i_do_post_call_with_End_point_Request_Headers_for_savebooking_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the JSON status Code of savebooking API",
  "keyword": "Then "
});
formatter.match({
  "location": "SaveBooking.i_validate_the_JSON_status_Code_of_savebooking_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate  book Id,customerId  of savebooking API",
  "keyword": "Then "
});
formatter.match({
  "location": "SaveBooking.i_Validate_book_Id_customerId_of_savebooking_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate bookingDate of savebooking API",
  "keyword": "And "
});
formatter.match({
  "location": "SaveBooking.i_Validate_bookingDate_of_savebooking_API()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [Jul 16, 2020] but found [Jul 17, 2020]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat com.stepDefinitions.SaveBooking.i_Validate_bookingDate_of_savebooking_API(SaveBooking.java:57)\r\n\tat ✽.I Validate bookingDate of savebooking API(file:src/test/resources/Features/Library.feature:118)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Validate Createbooking API",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Createbooking"
    }
  ]
});
formatter.step({
  "name": "Prepare Createbooking End Point,Headers,Request",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateBooking.prepare_Createbooking_End_Point_Headers_Request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do post call with End point ,Request \u0026 Headers for Createbooking API",
  "keyword": "When "
});
formatter.match({
  "location": "CreateBooking.i_do_post_call_with_End_point_Request_Headers_for_Createbooking_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the JSON status Code of Createbooking API",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateBooking.i_validate_the_JSON_status_Code_of_Createbooking_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate  book Id,customerId  of Createbooking API",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateBooking.i_Validate_book_Id_customerId_of_Createbooking_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate bookingDate of Createbooking  API",
  "keyword": "And "
});
formatter.match({
  "location": "CreateBooking.i_Validate_bookingDate_of_Createbooking_API()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete Request Book API",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Deletebook"
    }
  ]
});
formatter.step({
  "name": "Prepare Delete  Request Book End Point,Headers",
  "keyword": "Given "
});
formatter.match({
  "location": "DeleteBook.prepare_Delete_Request_Book_End_Point_Headers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do Delete Request  with End point  ,Book ID and Headers for Book  API",
  "keyword": "When "
});
formatter.match({
  "location": "DeleteBook.i_do_Delete_Request_with_End_point_Book_ID_and_Headers_for_Book_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the JSON status Code of Delete Request of Book API",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteBook.i_validate_the_JSON_status_Code_of_Delete_Request_of_Book_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate  JSON message for Delete Request of Book API",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteBook.i_Validate_JSON_message_for_Delete_Request_of_Book_API()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete Request publisher API",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Deletepublisher"
    }
  ]
});
formatter.step({
  "name": "Prepare Delete  Request publisher End Point,Headers",
  "keyword": "Given "
});
formatter.match({
  "location": "DeletePublisher.prepare_Delete_Request_publisher_End_Point_Headers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do Delete Request  with End point  ,publisher ID and Headers for publisher  API",
  "keyword": "When "
});
formatter.match({
  "location": "DeletePublisher.i_do_Delete_Request_with_End_point_publisher_ID_and_Headers_for_publisher_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the JSON status Code of Delete Request of publisher API",
  "keyword": "Then "
});
formatter.match({
  "location": "DeletePublisher.i_validate_the_JSON_status_Code_of_Delete_Request_of_publisher_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate  JSON message for Delete Request of publisher API",
  "keyword": "Then "
});
formatter.match({
  "location": "DeletePublisher.i_Validate_JSON_message_for_Delete_Request_of_publisher_API()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete Request Author API",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DeleteAutho"
    }
  ]
});
formatter.step({
  "name": "Prepare Delete  Request Author End Point,Headers",
  "keyword": "Given "
});
formatter.match({
  "location": "DeleteAuthor.prepare_Delete_Request_Author_End_Point_Headers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do Delete Request  with End point  ,Author ID and Headers for Author  API",
  "keyword": "When "
});
formatter.match({
  "location": "DeleteAuthor.i_do_Delete_Request_with_End_point_Author_ID_and_Headers_for_Author_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the JSON status Code of Delete Request of Author API",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteAuthor.i_validate_the_JSON_status_Code_of_Delete_Request_of_Author_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate  JSON message for Delete Request of Author API",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteAuthor.i_Validate_JSON_message_for_Delete_Request_of_Author_API()"
});
formatter.result({
  "status": "passed"
});
});