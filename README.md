# Integrations testing

## Installation

1. Clone the project
2. Import the project to you IDE
3. Execute the test cases

## Plan for testing
We paln to make Bottom Up testing with junit so it will be automated and use Black Box testing so we only test that we give it some input and expect an output. The way we will make this is by testing all interfaces between the layers.

We expect that all methods have been unit tested.

We will test it in this order.

1. Buttom Up test
   * We chose to test using bottom up method so we are sure that each layer does as intented and get the correct data. 
   
   1. Testing the connection between Database and DataLayer (This will be created)
      * This will be completed with JUnit5
  
   2. Testing the connection between ServiceLayer and DataLayer. (This will be created)
      * This will be completed with JUnit5
  
   3. Testing the connection between UserInterfaceLayer and ServiceLayer (This will be created)
      * This will be completed with JUnit5
   
2. Performance testing (These test will not be created)
   * We would make performance test with Junit5 where we would test response and capacity.
   * Because we are Black Box testing it would also require us to make perfromance testing, to support the Black Box tests
