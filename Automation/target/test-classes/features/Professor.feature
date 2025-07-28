Feature: Add Professor Details Form

  Background: 
    Given Navigate to the "Add Professor Details" page

  Scenario Outline: Fill the Professor Details Form and submit
    When the user enter first name as "<FirstName>"
    And the user enter last name as "<LastName>"
    And the user enter phone number as "<PhoneNumber>"
    And the user enter email ID as "<Email>"
    And the user select department as "<Department>"
    And the user enter date of birth as "<DateOfBirth>"
    And the user select gender as "<Gender>"
    And the user select qualification "<Qualification1>" and "<Qualification2>"
    And the user select country as "<Country>"
    And the user select city as "<City>"
    And the user select state as "<State>"
    And the user upload a photo "<PhotoPath>"
    And the user click on "Add Professor" button
    Then the user should see a confirmation message "Professor added successfully"

  Examples:
    | FirstName | LastName | PhoneNumber  | Email               | Department     | DateOfBirth | Gender | Qualification1 | Qualification2 | Country     | City       | State      | PhotoPath               |
    | John      | Doe      | 9876543210   | john.doe@example.com | Computer Science | 01-01-1980  | Male   | M.E            | Ph.D           | India       | Bangalore  | Karnataka  | /path/to/photo1.jpg     |
    | Jane      | Smith    | 9123456789   | jane.smith@example.com | Electrical Engg | 15-05-1985  | Female | M.E            |                | USA         | New York   | New York   | /path/to/photo2.jpg     |
