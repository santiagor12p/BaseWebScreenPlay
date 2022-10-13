package questions;

import models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.CreateBusinessUnit;
import userinterfaces.CreateMeeting;

import java.util.List;

public class AnswerMeeting implements Question<Boolean> {
    private final List<LoginData> loginData;

    public AnswerMeeting(List<LoginData> loginData) {
        this.loginData = loginData;
    }

    public static AnswerMeeting used (List<LoginData> loginData) {
        return new AnswerMeeting(loginData);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String Validation_message = Text.of(CreateMeeting.VALIDATION2).viewedBy(actor).asString();
        if (loginData.get(0).getValidation2().equals(Validation_message)){
            result = true;
        } else{
            result = false;
        }
        return result;
    }
}
