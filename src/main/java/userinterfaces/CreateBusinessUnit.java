package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;



public class CreateBusinessUnit extends PageObject {
    public static final Target ORGANIZATION = Target.the("Organization module").located(By.xpath("//*[@id='nav_menu1_3']/li[1]/a"));
    public static final Target BUSINESS_UNITS = Target.the("Business unite module").located(By.xpath("//*[@id='nav_menu1_3_1']/li[1]/a"));
    public static final Target NEW_BUSINESS_UNIT = Target.the("Create new business unit").locatedBy("//div[@class='tool-button add-button icon-tool-button']");
    public static final Target BUSINESS_UNIT_NAME = Target.the("Type the business unit name").located(By.xpath("//input[@class='editor s-Serenity-StringEditor s-StringEditor required']"));
    public static final Target PARENT_UNIT = Target.the("Select parent unit").located(By.xpath("//a[@class='select2-choice select2-default']"));
    public static final Target TEXT_BOX = Target.the("Fill with the parent unit name").located(By.xpath("//*[@id='s2id_autogen1_search']"));
    public static final Target SAVE = Target.the("Save changes").locatedBy("//div[@class='tool-button save-and-close-button icon-tool-button']");
    public static final Target VALIDATION = Target.the("Validation step").located(By.xpath("//a[contains(text(),'prueba')]"));
}
