package activities.calendar;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class MainCalendar {
    public Button freeTrial = new Button(By.xpath("//android.widget.TextView[@resource-id=\"com.simplemobiletools.calendar:id/dialog_trial_start_free_trial\"]"));
    public Button addEvent = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"New Event\"]"));
    public TextBox title = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.simplemobiletools.calendar:id/event_title\"]"));
    public Button save = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Save\"]"));
    public Button okDisclaimer = new Button(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
    public Button day = new Button(By.xpath("(//android.view.View[@resource-id=\"com.simplemobiletools.calendar:id/month_view_background\"])[36]"));
    public Label event = new Label(By.xpath("//android.view.ViewGroup[@resource-id=\"com.simplemobiletools.calendar:id/event_item_holder\"]/android.view.ViewGroup"));

}