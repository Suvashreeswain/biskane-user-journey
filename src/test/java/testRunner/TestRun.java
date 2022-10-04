package testRunner;

import java.util.Date;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	
		features = { "Features/Login.Artist.feature" },
		glue ={"stepDefinitions"},
		tags={"@ArtistProfilePageVerify"}
	
)

public class TestRun {
		

}
