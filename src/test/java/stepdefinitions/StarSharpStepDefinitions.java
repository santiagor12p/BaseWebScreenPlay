package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.LoginData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import questions.AnswerMeeting;
import tasks.BusinessUnit;
import tasks.CreateNewMeeting;
import tasks.LogIn;
import tasks.OpenPage;

import java.util.List;

public class StarSharpStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^the user is on StartSharp page and sign in$")
    public void theUserIsOnStartSharpPageAndSignIn(List<LoginData> loginData) throws Exception{
        OnStage.theActorCalled("the user").wasAbleTo(OpenPage.thePage(), LogIn.onThePage(loginData));
    }


    @When("^fill in the spaces of business unit$")
    public void fillInTheSpacesOfBusinessUnit(List<LoginData> loginData) throws  Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(BusinessUnit.theBusiness(loginData));

    }

    @Then("^the business unit are created$")
    public void theBusinessUnitAreCreated(List<LoginData> loginData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(loginData)));

    }

    @When("^fill in the spaces of meetings$")
    public void fillInTheSpacesOfMeetings(List<LoginData> loginData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateNewMeeting.with(loginData));
    }

    @Then("^the meeting was created$")
    public void theMeetingWasCreated(List<LoginData> loginData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerMeeting.used(loginData)));
    }
}
