package tasks;

import models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginPage;

import java.util.List;

public class LogIn implements Task {

    private List<LoginData> loginData;

    public LogIn(List<LoginData> loginData) {
        this.loginData = loginData;
    }
    public static LogIn onThePage(List<LoginData>  loginData) {

        return Tasks.instrumented(LogIn.class, loginData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(loginData.get(0).getUser()).into(LoginPage.USER),
                Enter.theValue(loginData.get(0).getPassword()).into(LoginPage.PASSWORD),
                Click.on(LoginPage.SIGN_IN)
        );

    }
}
