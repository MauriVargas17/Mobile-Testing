package activities.calculator;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainCalculator {
    public Button fiveButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"5\"]"));
    public Button sevenButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"7\"]"));
    public Button addButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"plus\"]"));
    public Button equalButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"equals\"]"));

    public Label resultLabel = new Label(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.calculator:id/result_final\"]"));

}
