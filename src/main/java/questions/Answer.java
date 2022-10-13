package questions;

import models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.CreateBusinessUnit;

import java.util.List;

public class Answer implements Question<Boolean> {

    private final List<LoginData> loginData;

    public Answer(List<LoginData> loginData) {
        this.loginData = loginData;
    }

    public static Answer tothe(List<LoginData> loginData) {
        return new Answer(loginData);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String Validation_message = Text.of(CreateBusinessUnit.VALIDATION).viewedBy(actor).asString();
        if (loginData.get(0).getValidation().equals(Validation_message)){
            result = true;
        } else{
            result = false;
        }
        return result;
    }
}
