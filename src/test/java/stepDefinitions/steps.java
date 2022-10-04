package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class steps {

	public WebDriver driver;
	public LoginPage lp;
	
    @Given("^Lunch chrome browser$")
    public void lunch_chrome_browser() throws Throwable {
    	//System.setProperty("WebDriver.chrome.driver","/Drivers/chromedriver");
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
        lp=new LoginPage(driver);
        
    }

    @When("^User open biskane url$")
    public void user_open_biskane_url() throws Throwable {
    	driver.get("https://qa.biskane.com");
    }
    @When("^Click on login$")
    public void click_on_login() throws Throwable {
        lp.clickOnLogin();
    }

    @And("^Click on login button and Enter Email and Password$")
    public void click_on_login_button_and_enter_email_and_password() throws Throwable {
       lp.loginButton();
       lp.setUserName();
       lp.setPassword();
    }
    @When("^Print all the menu links$")
    public void print_all_the_menu_links() throws Throwable {
       lp.menuLinks();
    }

    @When("^Click on Search and enter text$")
    public void click_on_search_and_enter_text() throws Throwable {
      lp.searchBox();
    }

    @Then("^Validate the home page logo$")
    public void validate_the_home_page_logo() throws Throwable {
       lp.homepageLogo();
    }

    @Then("^Verify that url gets displayed$")
    public void verify_that_url_gets_displayed() throws Throwable {
    	Assert.assertTrue(lp.validateUrl());
    }

    @Then("^Verify the title of this page$")
    public void verify_the_title_of_this_page() throws Throwable {
    	Assert.assertTrue(lp.validateShopPageTitle());
    }

    @Then("^Verify the name$")
    public void verify_the_name() throws Throwable {
    	lp.collectionName();
    }

    @And("^Print Current URL$")
    public void print_current_url() throws Throwable {
        lp.printUrl();
    }

    @And("^Click on shop now$")
    public void click_on_shop_now() throws Throwable {
        lp.clickShop();
    }

    @And("^Print the url$")
    public void print_the_url() throws Throwable {
       lp.printShopPageUrl();
    }

    @And("^Navigate back to home page$")
    public void navigate_back_to_home_page() throws Throwable {
       lp.homePageButton();
    }


    @And("^Click on the search result$")
    public void click_on_the_search_result() throws Throwable {
       lp.searchButton();
    }

    @And("^Close the browser$")
    public void close_the_browser() throws Throwable {
        lp.close();
    }
    @When("^Click on Customer Signup link in Sign up dropdown$")
    public void click_on_customer_signup_link_insign_up_dropdown() throws Throwable {
        lp.clickSignup();
    }

    @When("^Enter data in to First Name,Last Name and Email field$")
    public void enter_data_in_to_first_namelast_name_and_email_field() throws Throwable {
       lp.textField();
    }

    @When("^User enter data in Password and Confirm Password$")
    public void user_enter_data_in_password_and_confirm_password() throws Throwable {
        lp.passwordField();
    }

    @When("^Click on I agree to The Terms of Service button$")
    public void click_on_i_agree_to_the_terms_of_service_button() throws Throwable {
        lp.clickOnAgree();
    }

    @When("^Enter data in to Contact Number field$")
    public void enter_data_in_to_contact_number_field() throws Throwable {
       lp.contactNo();
    }

    @Then("^Verify user is redirected to Customer Sign Up screen$")
    public void verify_user_is_redirected_to_customer_sign_up_screen() throws Throwable {
    	lp.CustomerPageTitle();
    }

    @Then("^Verify user is able to input data in First Name,Last Name and Email$")
    public void verify_user_is_able_to_input_data_in_first_namelast_name_and_email() throws Throwable {
    	Assert.assertTrue(lp.inputData());
    }

    @Then("^Verify the password and confirm password field$")
    public void verify_the_password_and_confirm_password_field() throws Throwable {
    	Assert.assertTrue(lp.password());
    }

    @Then("^Verify Sign up button is clickable or not$")
    public void verify_sign_up_button_is_clickable_or_not() throws Throwable {
    	Assert.assertTrue(lp.buttonClickable(null, driver));
    }

    @Then("^Verify data is entering or not$")
    public void verify_data_is_entering_or_not() throws Throwable {
    	Assert.assertTrue(lp.contactNoField());
    }

    @And("^Mouse hover on sign up menu$")
    public void mouse_hover_on_sign_up_menu() throws Throwable {
    	lp.signUpMenu();
    }

    @And("^Verify the form fields$")
    public void verify_the_form_fields() throws Throwable {
        lp.formFields();
    
}
    @When("^User enter data in First Name field$")
    public void user_enter_data_in_first_name_field() throws Throwable {
        lp.firstNamefield();
    }

    @Then("^Verify the required validation message$")
    public void verify_the_required_validation_message() throws Throwable {
        lp.validationMessage();
    
    }

    @When("^User dont enter data in First Name field$")
    public void user_dont_enter_data_in_first_name_field() throws Throwable {
        lp.dontEnterFirstName();
    }

    @When("^User enter more than 50 characters in first name field$")
    public void user_enter_more_than_50_characters_in_first_name_field() throws Throwable {
        lp.maxCharFirstName();
    }

    @When("^User enter blank space in first name field$")
    public void user_enter_blank_space_in_first_name_field() throws Throwable {
        lp.blankSpaceFirstName();
    }

    @When("^User dont enter data in Last Name field$")
    public void user_dont_enter_data_in_last_name_field() throws Throwable {
        lp.dontEnterLastName();
    }

    @When("^User enter more than 50 characters in last name field$")
    public void user_enter_more_than_50_characters_in_last_name_field() throws Throwable {
        lp.maxCharLastName();
    }

    @When("^User enter blank space in last name field$")
    public void user_enter_blank_space_in_last_name_field() throws Throwable {
        lp.blankSpaceLastName();
    }

    @Then("^Verify the error message$")
    public void verify_the_error_message() throws Throwable {
        lp.errorMessage();
    }

    @Then("^Verify the error message field$")
    public void verify_the_error_message_field() throws Throwable {
        lp.errorMessageField();
    }

    @Then("^Verify the first name blank space error message$")
    public void verify_the_first_name_blank_space_error_message() throws Throwable {
        lp.firstNameBlankSpace();
    }

    @Then("^Verify the error message below Last Name$")
    public void verify_the_error_message_below_last_name() throws Throwable {
        lp.verifyErrorLastName();
    }

    @Then("^Verify the last name field error message$")
    public void verify_the_last_name_field_error_message() throws Throwable {
        lp.verifyErrorMessageField();
    }

    @Then("^Verify the last name blank space error message$")
    public void verify_the_last_name_blank_space_error_message() throws Throwable {
        lp.blankSpaceLastNameError();
    }
    @When("^User enter First Name$")
    public void user_enter_first_name() throws Throwable {
        lp.firstName();
    }

    @When("^User enter Last Name$")
    public void user_enter_last_name() throws Throwable {
        lp.lastName();
    }

    @When("^User enter Email Id$")
    public void user_enter_email_id() throws Throwable {
       lp.emailID();
    }

    @When("^User enter Contact Number$")
    public void user_enter_contact_number() throws Throwable {
    	lp.contactNumberField();
    }

    @When("^User enter Password$")
    public void user_enter_password() throws Throwable {
    	lp.PasswordField();
    }

    @When("^User enter confirm Password$")
    public void user_enter_confirm_password() throws Throwable {
    	lp.confirmPassword();
    }

    @When("^User click on I agree to The Terms of Service button$")
    public void user_click_on_i_agree_to_the_terms_of_service_button() throws Throwable {
     lp.clickOnAgreeButton();
    }

    @When("^User click i am not robot button$")
    public void user_click_i_am_not_robot_button() throws Throwable {
        lp.clickIamNotRobot();
    }

    @Then("^Verify First Name is displaying$")
    public void verify_first_name_is_displaying() throws Throwable {
    	Assert.assertTrue(lp.firstNameVerify());
    }
    @Then("^Verify Last Name field$")
    public void verify_last_name_field() throws Throwable {
    	Assert.assertTrue(lp.laststNameVerify());
    }

    @Then("^Verify Email Id field$")
    public void verify_email_id_field() throws Throwable {
    	Assert.assertTrue(lp.emailIdField());
    }

    @Then("^Verify Contact Number is displaying$")
    public void verify_contact_number_is_displaying() throws Throwable {
    	Assert.assertTrue(lp.contactNumber());
    }

    @Then("^Verify Password field$")
    public void verify_password_field() throws Throwable {
    	Assert.assertTrue(lp.PasswordFieldVerify());
    }

    @Then("^Verify confirm Password field$")
    public void verify_confirm_password_field() throws Throwable {
    	Assert.assertTrue(lp.confirmPasswordVerify());
    }

    @Then("^Verify button is clicked$")
    public void verify_button_is_clicked() throws Throwable {
    	Assert.assertTrue(lp.buttonClickVerify());
    }

    @Then("^Verify the sign up page$")
    public void verify_the_sign_up_page() throws Throwable {
    	Assert.assertTrue(lp.signupPageVerify());
    }
    @And("^Click on sign up button$")
    public void click_on_sign_up_button() throws Throwable {
    	  lp.signUpButton();
    }

    @When("^Click on orders tab$")
    public void click_on_orders_tab() throws Throwable {
        lp.clickonOrder();
    }

    @Then("^Observe the page$")
    public void observe_the_page() throws Throwable {
    	Assert.assertTrue(lp.observeThePage());
    }

    @And("^Login with customer$")
    public void login_with_customer() throws Throwable {
       lp.cusomerLogIn();
    }
    @When("^Click on Artist Signup from dropdown$")
    public void click_on_artist_signup_from_dropdown() throws Throwable {
        lp.artistSignup();
    }

    @When("^User enter First Name in Artist Sign Up page$")
    public void user_enter_first_name_in_artist_sign_up_page() throws Throwable {
        lp.firstNameArtist();
    }

    @When("^User enter Last Name in Artist Sign Up page$")
    public void user_enter_last_name_in_artist_sign_up_page() throws Throwable {
        lp.laststNameArtist();
    }

    @When("^User enter Email Id in Artist Sign Up page$")
    public void user_enter_email_id_in_artist_sign_up_page() throws Throwable {
        lp.emailIdArtistPage();
    }

    @When("^User enter Contact Number in Artist Sign Up page$")
    public void user_enter_contact_number_in_artist_sign_up_page() throws Throwable {
        lp.phoneNoArtistPage();
    }

    @When("^User enter Password in Artist Sign Up page$")
    public void user_enter_password_in_artist_sign_up_page() throws Throwable {
       lp.passwordArtistPage();
    }

    @When("^User enter confirm Password in Artist Sign Up page$")
    public void user_enter_confirm_password_in_artist_sign_up_page() throws Throwable {
    	lp.confirmPasswordArtistPage();
    }

    @When("^Click on Next Button$")
    public void click_on_next_button() throws Throwable {
        lp.nextButton();
    }

    @Then("^Verify user is redirected to Artist Sign Up screen$")
    public void verify_user_is_redirected_to_artist_sign_up_screen() throws Throwable {
    	Assert.assertTrue(lp.artistScreen());
    }
    @Then("^Verify First Name is displaying in fisrt name place$")
    public void verify_first_name_is_displaying_in_fisrt_name_place() throws Throwable {
    	lp.firstnameDisplay();
    }

    @Then("^Verify Last Name field in last name place$")
    public void verify_last_name_field_in_last_name_place() throws Throwable {
    	Assert.assertTrue(lp.lastnameField());
    }

    @Then("^Verify Email Id is displaying$")
    public void verify_email_id_is_displaying() throws Throwable {
    	Assert.assertTrue(lp.loginfield());
    }

    @Then("^Verify Contact Number is displaying in Artist page$")
    public void verify_contact_number_is_displaying_in_artist_page() throws Throwable {
    	Assert.assertTrue(lp.contactNofield());
    }

    @Then("^Verify Password field in Artist page$")
    public void verify_password_field_in_artist_page() throws Throwable {
    	Assert.assertTrue(lp.passwordfield());
    }

    @Then("^Verify confirm Password field Artist page$")
    public void verify_confirm_password_field_artist_page() throws Throwable {
    	Assert.assertTrue(lp.confirmPasswordField());
    }

    @Then("^Verify the Artist page$")
    public void verify_the_artist_page() throws Throwable {
    	
    }
    
    @Then("^Verify Search the page$")
    public void verify_search_the_page() throws Throwable {
    	lp.verifySearchPage();
    }

    @And("^Click on Select Search Type dropdown$")
    public void click_on_select_search_type_dropdown() throws Throwable {
        lp.clickOnOrderId();
    } 
    @When("^User enter artist password$")
    public void user_enter_artist_password() throws Throwable {
        lp.artistPassword();
    }

    @When("^User click on Sign in button$")
    public void user_click_on_sign_in_button() throws Throwable {
        lp.clickOnLogin();
    }

    @When("^Click on settings gear icon$")
    public void click_on_settings_gear_icon() throws Throwable {
        lp.clickOnSettings();
    }

    @When("^Click on update bank info link$")
    public void click_on_update_bank_info_link() throws Throwable {
       
    }

    @When("^Click on update profile link$")
    public void click_on_update_profile_link() throws Throwable {
        
    }

    @Then("^Verify artist email Id is displaying$")
    public void verify_artist_email_id_is_displaying() throws Throwable {
    	Assert.assertTrue(lp.verifyArsistEmail());
    }

    @Then("^Verify artist password field$")
    public void verify_artist_password_field() throws Throwable {
    	Assert.assertTrue(lp.verifyArtistPassword());
    }

    @Then("^Verify user redirected to artist home page$")
    public void verify_user_redirected_to_artist_home_page() throws Throwable {
       lp.artistHomepage();
    }

    @Then("^Verify My profile page appears$")
    public void verify_my_profile_page_appears() throws Throwable {
      
    }

    @Then("^Verify Bank info page appears$")
    public void verify_bank_info_page_appears() throws Throwable {
       
    }

    @And("^User enter artist email Id$")
    public void user_enter_artist_email_id() throws Throwable {
       lp.artistEmailID();
    }

}

    

    
