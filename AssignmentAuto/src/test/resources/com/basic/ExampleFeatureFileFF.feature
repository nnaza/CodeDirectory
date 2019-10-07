Feature: Example

Background: Common login steps
When I start the browser
	
Scenario: CheckBrowser
	And Navigate to "http://example.com" url
	Then Close browser
	
	
Scenario: FinishMe
And Navigate to "http://example.com" url
And I click on the "More information..." page link
Then a link with text1 "RFC 2606" must be present
And a link with text2 "RFC 6761" must be present
And the Domain Name box must contain "Root Zone Management" at index 2
Then Close browser

 
 