package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class UKBA_VisaStepDef extends BaseUtil {
    private BaseUtil base;

    public UKBA_VisaStepDef(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the UKBA website")
    public void i_am_on_the_ukba_website() {
        base.driver.manage().window().maximize();
        base.driver.get("https://www.gov.uk/check-uk-visa/y");
        try {
            base.driver.findElement(By.xpath("//label[@data-cookie-types='all']")).click();
        } catch (NoSuchElementException e) {
            System.out.println("This is an exception thrown"  + e);

        }
//        base.driver.navigate().to("https://www.gov.uk/check-uk-visa/y");

    }

    @When("I provide nationality of {string}")
    public void i_provide_nationality_of(String countryName) {
        // Write code here that turns the phrase above into concrete actions
        Select select = new Select(base.driver.findElement(By.id("response")));
        select.selectByVisibleText(countryName);
    }

    @When("I click on the Continue button")
    public void i_click_on_the_continue_button() {

        WebElement continueButton = base.driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
        continueButton.click();
//        base.driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

    }

    @When("I select the reason {string}")
    public void i_select_the_reason(String string) {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.cssSelector("input[value='study']")).click();


    }

    @When("I state I am intending to stay for more than {int} months")
    public void i_state_i_am_intending_to_stay_for_more_than_months(Integer int1) {
        base.driver.findElement(By.cssSelector("input[value='longer_than_six_months']")).click();
        //        base.driver.findElement(By.xpath("//input[@value='longer_than_six_months']")).click();

    }

    @Then("I will be informed {string}")
    public void i_will_be_informed(String msg) {
        // Write code here that turns the phrase above into concrete actions

       assertThat(base.driver.findElements(By.xpath("//h2[starts-with(@class, 'gem-c-heading')]")).get(0).getText(), equalTo(msg));
//        assertThat(base.driver.findElements(By.xpath("//h2[starts-with(@class, 'gem-c-heading')]")).get(1).getText(), equalTo(msg));
//       assertThat(base.driver.findElement(By.xpath("//h2[.='You???ll need a visa to study in the UK'] ")).isDisplayed(), equalTo(true));

        //    assertThat(base.driver.findElement(By.xpath("//h2[.='"+msg+"']")).isDisplayed(), equalTo(true));
//    assertThat(base.driver.findElement(By.xpath("//h2[.='"+msg+"']")).getText(), equalTo(msg));
//        System.out.println((base.driver.findElements(By.xpath("//h2[starts-with(@class, 'gem-c-heading')]")).get(0).getText()));
//        System.out.println((base.driver.findElements(By.xpath("//h2[starts-with(@class, 'gem-c-heading')]")).get(1).getText()));
    }

    @And("I select {string} as reason for coming to the UK")
    public void iSelectAsReasonForComingToTheUK(String arg0) {
        base.driver.findElement(By.id("response-0")).click();
//base.driver.findElement(By.cssSelector("input#response-0")).click();
//        base.driver.findElement(By.cssSelector("input[id=response-0]")).click();
    }

    @When("I state I am not travelling or visiting a partner or family")
    public void i_state_i_am_not_travelling_or_visiting_a_partner_or_family() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//        base.driver.findElement(By.cssSelector("input[value='no']")).click();
        base.driver.findElement(By.id("response-0")).click();
    }

    @Then("I will be informed {string} or {string}")
    public void i_will_be_informed_or(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

}
