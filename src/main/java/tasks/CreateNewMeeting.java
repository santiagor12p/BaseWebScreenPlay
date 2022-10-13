package tasks;

import models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterfaces.CreateMeeting;

import java.util.List;

public class CreateNewMeeting implements Task {

    private List<LoginData> loginData;
    public CreateNewMeeting(List<LoginData> loginData) {this.loginData = loginData;}

    public static CreateNewMeeting with(List<LoginData> loginData) {
        return Tasks.instrumented(CreateNewMeeting.class, loginData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CreateMeeting.MEETING),
                Click.on(CreateMeeting.MEETINGS),
                Click.on(CreateMeeting.NEW_MEETING),
                Enter.theValue(loginData.get(0).getMeetingName()).into(CreateMeeting.MEETING_NAME),
                Click.on(CreateMeeting.MEETING_TYPE),
                Enter.theValue(loginData.get(0).getMeetingType()).into(CreateMeeting.MEETING_TYPE_NAME),
                Hit.the(Keys.ENTER).into(CreateMeeting.MEETING_TYPE),
                Enter.theValue(loginData.get(0).getMeetingNumber()).into(CreateMeeting.MEETING_NUMBER),
                Hit.the(Keys.ENTER).into(CreateMeeting.MEETING_NUMBER),
                Enter.theValue(loginData.get(0).getStartDate()).into(CreateMeeting.START_DATE),
                Click.on(CreateMeeting.START_HOUR),
                Enter.theValue(loginData.get(0).getEndDate()).into(CreateMeeting.END_DATE),
                Click.on(CreateMeeting.END_HOUR),
                Hit.the(Keys.ENTER).into(CreateMeeting.END_HOUR),
                Click.on(CreateMeeting.LOCATION),
                Enter.theValue(loginData.get(0).getLocation()).into(CreateMeeting.LOCATION_NAME),
                Hit.the(Keys.ENTER).into(CreateMeeting.LOCATION_NAME),
                Click.on(CreateMeeting.UNIT),
                Enter.theValue(loginData.get(0).getUnit()).into(CreateMeeting.UNIT_NAME),
                Hit.the(Keys.ENTER).into(CreateMeeting.UNIT_NAME),
                Click.on(CreateMeeting.ORGANIZED_BY),
                Enter.theValue(loginData.get(0).getOrganizedBy()).into(CreateMeeting.ORGANIZED_BY_NAME),
                Hit.the(Keys.ENTER).into(CreateMeeting.ORGANIZED_BY_NAME),
                Click.on(CreateMeeting.REPORTER),
                Enter.theValue(loginData.get(0).getReporter()).into(CreateMeeting.REPORTER_NAME),
                Hit.the(Keys.ENTER).into(CreateMeeting.REPORTER_NAME),
                Click.on((CreateMeeting.SAVE))
        );

    }
}
