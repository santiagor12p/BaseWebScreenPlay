package tasks;

import models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterfaces.CreateBusinessUnit;

import java.util.List;

public class BusinessUnit implements Task {

    private List<LoginData> loginData;
    public BusinessUnit(List<LoginData> loginData){ this.loginData = loginData;}
    public static BusinessUnit theBusiness(List<LoginData> loginData) {
        return Tasks.instrumented(BusinessUnit.class, loginData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CreateBusinessUnit.ORGANIZATION),
                Click.on(CreateBusinessUnit.BUSINESS_UNITS),
                Click.on(CreateBusinessUnit.NEW_BUSINESS_UNIT),
                Enter.theValue(loginData.get(0).getName()).into(CreateBusinessUnit.BUSINESS_UNIT_NAME),
                Click.on(CreateBusinessUnit.PARENT_UNIT),
                Enter.theValue(loginData.get(0).getParentUnit()).into(CreateBusinessUnit.TEXT_BOX),
                Hit.the(Keys.ENTER).into(CreateBusinessUnit.TEXT_BOX),
                Click.on(CreateBusinessUnit.SAVE)
        );

    }
}
