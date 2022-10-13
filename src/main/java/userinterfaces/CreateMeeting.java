package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateMeeting {
    public static final Target MEETING = Target.the("Meeting module").located(By.xpath("//*[@id='nav_menu1_3']/li[2]/a"));
    public static final Target MEETINGS = Target.the("Meetings module").located(By.xpath("//*[@id='nav_menu1_3_2']/li[1]/a"));
    public static final Target NEW_MEETING = Target.the("Create new meeting button").located(By.xpath("//div[@class = 'tool-button add-button icon-tool-button']"));
    public static final Target MEETING_NAME = Target.the("Text box meeting name").located(By.xpath("//input[@name='MeetingName']"));
    public static final Target MEETING_TYPE = Target.the("Meetings type selector").located(By.xpath("//a[@class= 'select2-choice']"));
    public static final Target MEETING_TYPE_NAME = Target.the("Text box meeting type").located(By.xpath("//*[@id='s2id_autogen6_search']"));
    public static final Target MEETING_NUMBER = Target.the("Meetings number").located(By.xpath("//input[@name='MeetingNumber']"));
    public static final Target START_DATE = Target.the("Start date").located(By.xpath("//input[@name='StartDate']"));
    public static final Target START_HOUR = Target.the("Start hour").located(By.xpath("//select[@class = 'editor s-DateTimeEditor time']"));
    public static final Target END_DATE = Target.the("End date").located(By.xpath("//input[@name='EndDate']"));
    public static final Target END_HOUR = Target.the("End hour").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[5]/select"));
    public static final Target LOCATION = Target.the("Location meeting").located(By.xpath("//*[@id='select2-chosen-7']"));
    public static final Target LOCATION_NAME = Target.the("Location name").located(By.xpath("//*[@id='s2id_autogen7_search']"));
    public static final Target UNIT = Target.the("Unit module").located(By.xpath("//*[@id='select2-chosen-8']"));
    public static final Target UNIT_NAME = Target.the("Unit name module").located(By.xpath("//*[@id='s2id_autogen8_search']"));
    public static final Target ORGANIZED_BY = Target.the("Organized by module").located(By.xpath("//*[@id='select2-chosen-9']"));
    public static final Target ORGANIZED_BY_NAME = Target.the("Organized by module name").located(By.xpath("//*[@id='s2id_autogen9_search']"));
    public static final Target REPORTER = Target.the("Reporter module").located(By.xpath("//*[@id='select2-chosen-10']"));
    public static final Target REPORTER_NAME = Target.the("Reporter name").located(By.xpath("//*[@id='s2id_autogen10_search']"));
    public static final Target SAVE = Target.the("Save").located(By.xpath("//div[@class='tool-button save-and-close-button icon-tool-button']"));
    public static final Target VALIDATION2 = Target.the("Validation create meeting").located(By.xpath("//*[text()='prueba']"));

}
