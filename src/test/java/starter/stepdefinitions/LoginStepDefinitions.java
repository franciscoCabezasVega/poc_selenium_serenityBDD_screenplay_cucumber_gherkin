package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.login.DoLogin;
import starter.navigation.NavigateTo;

public class LoginStepDefinitions {

    @Given("{actor} has an active account")
    public void has_an_active_account(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSearchHomePage());
    }

    @When("{actor} sends their valid credentials")
    public void he_sends_their_valid_credentials(Actor actor) {
        actor.attemptsTo(
                NavigateTo.theSearchHomePage(),
                DoLogin.withCredential("pepito", "algo")
        );
    }

    @Then("he should have access to manage his account")
    public void he_should_have_access_to_manage_his_account() {

    }

}
