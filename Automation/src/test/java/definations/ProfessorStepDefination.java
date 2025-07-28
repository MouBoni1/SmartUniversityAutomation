package definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfessorStepDefination {

	WebDriver driver=new ChromeDriver();
	@Given("Navigate to the {string} page")
	public void navigate_to_the_page(String string) {
	    
	    driver.get("https://webapps.tekstac.com/SeleniumApp1/SmartUniversity/add_prof.html");
	}

	@When("the user enter first name as {string}")
	public void the_user_enter_first_name_as(String firstname) {
	    driver.findElement(By.id("firstName")).sendKeys(firstname);
	}

	@When("the user enter last name as {string}")
	public void the_user_enter_last_name_as(String lastname) {
	    driver.findElement(By.id("lastName")).sendKeys(lastname);
	}

	@When("the user enter phone number as {string}")
	public void the_user_enter_phone_number_as(String phoneno) {
	    driver.findElement(By.id("phoneNo")).sendKeys(phoneno);
	}

	@When("the user enter email ID as {string}")
	public void the_user_enter_email_id_as(String emailId) {
         driver.findElement(By.id("emaiId")).sendKeys(emailId);
	}

	@When("the user select department as {string}")
	public void the_user_select_department_as(String department) {
		WebElement dept=driver.findElement(By.id("department"));
	    Select select=new Select(dept);
	    select.selectByVisibleText(department);
	}

	@When("the user enter date of birth as {string}")
	public void the_user_enter_date_of_birth_as(String dob) {
	  driver.findElement(By.id("dob")).sendKeys(dob);
	}

	@When("the user select gender as {string}")
	public void the_user_select_gender_as(String gender) {
	    
	}

	@When("the user select qualification {string} and {string}")
	public void the_user_select_qualification_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user select country as {string}")
	public void the_user_select_country_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user select city as {string}")
	public void the_user_select_city_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user select state as {string}")
	public void the_user_select_state_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user upload a photo {string}")
	public void the_user_upload_a_photo(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user click on {string} button")
	public void the_user_click_on_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user should see a confirmation message {string}")
	public void the_user_should_see_a_confirmation_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
