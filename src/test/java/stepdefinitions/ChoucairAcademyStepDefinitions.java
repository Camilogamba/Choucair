package stepdefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;
import tasks.Search;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast()); }

    @Given ("^than Rose wants to learn automation at the Academy choucair$")
    public void thanRoseWantToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thepage(), Login.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));
    }


    @When ("^she search for the course on the choucair Academy platform$")
    public void heSearchForTheCourseRecoursesAutomationOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then ("^she finds the course called$")
    public void heFindsTheCourseCalledResourcesRecoursesAutomation(List<AcademyChoucairData> academyChoucairData) throws Exception {
      //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }
}
