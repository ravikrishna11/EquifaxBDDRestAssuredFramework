Feature: API Automation
  
@CreateBook
 Scenario: Validate Create Book API
    
    Given Prepare Create Book End Point,Headers,Request
    
    When I do Post call with End point,Headers & Request
    
    Then I validate the JSON status Code
    
    Then I Validate book ID,Book Name
    
    And I Validate Author ID ,Author Name
   
	And I Validate Publisher ID,Publisher Name
	
@GetBook
Scenario: Validate Get Book API
    
    Given Prepare Get Book End Point,Headers
    
    When I do Get call with End point & Headers
    
    Then I validate the JSON status Code of Get Book API
    
    Then I Validate book ID,Book Name of Get Book API
    
    And I Validate Author ID ,Author Name of Get Book API
   
	And I Validate Publisher ID,Publisher Name of Get Book API
	
@Book_PublisherId
Scenario: Validate Get Book Details with PublisherId
    
    Given Prepare Get Book details with publisherId End Point,Headers 
    
    When I do Get PublisherId call with End point & Headers
    
    Then I validate the JSON status Code of PublisherId API
    
    Then I Validate book ID,Book Name of PublisherId API
    
    And I Validate Author ID ,Author Name of PublisherId API
   
	
    
	
@CreatePublisher
Scenario: Validate CreatePublisher API
    
    Given Prepare CreatePublisher End Point,Headers,Request
    
    When I do post call with End point ,Request & Headers for CreatePublisher API
    
    Then I validate the JSON status Code of CreatePublisher API
    
    Then I Validate Publisher ID,Publisher Name of CreatePublisher API
    
    And I Validate Address of CreatePublisher API
    
    And I Validate Country Name of CreatePublisher API
    
@CreateAuthor
Scenario: Validate CreateAuthor API
    
    Given Prepare CreateAuthor End Point,Headers,Request
    
    When I do post call with End point ,Request & Headers for CreateAuthor API
    
    Then I validate the JSON status Code of CreateAuthor API
    
    Then I Validate Author Name of CreateAuthor API
    
    And I Validate Address of CreateAuthor API
   
	And I Validate Country Name of CreateAuthor API
	
@CreateCustomer
Scenario: Validate CreateCustomer API
    
    Given Prepare CreateCustomer End Point,Headers,Request
    
    When I do post call with End point ,Request & Headers for CreateCustomer API
    
    Then I validate the JSON status Code of CreateCustomer API
    
    Then I Validate  Name of CreateCustomer API
    
    And I Validate Address of CreateCustomer API
   
	And I Validate Country Name of CreateCustomer API

@Savebilling
Scenario: Validate Savebilling API
    
    Given Prepare Savebilling End Point,Headers,Request
    
    When I do post call with End point ,Request & Headers for Savebilling API
    
    Then I validate the JSON status Code of Savebilling API
    
    Then I Validate  booking Id,customerId,bookingCost  of Savebilling API
    
    And I Validate billingAddress,zipzode,state of Savebilling API
    
@Savebooking
Scenario: Validate savebooking API
    
    Given Prepare savebooking End Point,Headers,Request
    
    When I do post call with End point ,Request & Headers for savebooking API
    
    Then I validate the JSON status Code of savebooking API
    
    Then I Validate  book Id,customerId  of savebooking API
    
    And I Validate bookingDate of savebooking API  
    
@Createbooking
Scenario: Validate Createbooking API
    
    Given Prepare Createbooking End Point,Headers,Request
    
    When I do post call with End point ,Request & Headers for Createbooking API
    
    Then I validate the JSON status Code of Createbooking API
    
    Then I Validate  book Id,customerId  of Createbooking API
    
    And I Validate bookingDate of Createbooking  API
    
@Deletebook
Scenario: Delete Request Book API
    
    Given Prepare Delete  Request Book End Point,Headers
    
    When I do Delete Request  with End point  ,Book ID and Headers for Book  API
    
    Then I validate the JSON status Code of Delete Request of Book API
    
    Then I Validate  JSON message for Delete Request of Book API
		
   
@Deletepublisher
Scenario: Delete Request publisher API
    
    Given Prepare Delete  Request publisher End Point,Headers
    
    When I do Delete Request  with End point  ,publisher ID and Headers for publisher  API
    
    Then I validate the JSON status Code of Delete Request of publisher API
    
    Then I Validate  JSON message for Delete Request of publisher API
    
@DeleteAutho
Scenario: Delete Request Author API
    
    Given Prepare Delete  Request Author End Point,Headers
    
    When I do Delete Request  with End point  ,Author ID and Headers for Author  API
    
    Then I validate the JSON status Code of Delete Request of Author API
    
    Then I Validate  JSON message for Delete Request of Author API
    
