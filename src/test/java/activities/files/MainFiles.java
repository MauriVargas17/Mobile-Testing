package activities.files;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class MainFiles {
    public Button options = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
    public Label newFolder = new Label(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.documentsui:id/title\" and @text=\"New folder\"]"));
    public TextBox folderName = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"android:id/text1\"]"));
    public Button okButton = new Button(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
    public Label folderTitle;
    public Button delete = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Delete\"]"));

    public void setFolderTitle(String name){
        folderTitle = new Label(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\""+name+"\"]"));
    }

}
