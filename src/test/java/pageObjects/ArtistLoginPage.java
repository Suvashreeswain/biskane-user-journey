package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArtistLoginPage {
	public WebDriver Idriver;
	public ArtistLoginPage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver,this);		
	}
	@FindBy(id="login")
	WebElement loginButton;

	@FindBy(id="name")
	WebElement textbox;
}
