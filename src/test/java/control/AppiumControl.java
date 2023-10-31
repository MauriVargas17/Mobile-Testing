package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import session.Session;

public class AppiumControl {
    protected By locator;
    protected WebElement control;

    public AppiumControl(By locator){
        this.locator = locator;
    }

    public void findControl(){
        control = Session.getSession().getDevice().findElement(this.locator);
    }

    public void click(){
        findControl();
        control.click();
    }

    public void longClick() {
        findControl();

        Actions actions = new Actions(Session.getSession().getDevice());
        actions.clickAndHold(control).perform();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actions.release(control).perform();
    }

    public String getText(){
        findControl();
        return control.getText();
    }

    public boolean isControlDisplayed(){
        try {
            findControl();
            return control.isDisplayed();
        }catch (Exception e){
            return false;
        }

    }
}
