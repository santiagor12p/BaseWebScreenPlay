package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class LoginPage extends PageObject {
    public static final Target USER = Target.the("User").located(By.xpath("//*[contains(@id,'LoginPanel0_Username')]"));
    public static final Target PASSWORD = Target.the("Password").located(By.xpath("//*[@id='LoginPanel0_Password']"));
    public static final Target SIGN_IN = Target.the("Sign in button").located(By.xpath("//*[@id='LoginPanel0_LoginButton']"));
}
