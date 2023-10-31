package testSuite;

import activities.contacts.AlertSection;
import activities.contacts.ContactDetailScreen;
import activities.contacts.CreateContactScreen;
import activities.contacts.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class ContactsTest {

    MainScreen mainScreen = new MainScreen();
    AlertSection alertSection = new AlertSection();
    CreateContactScreen createContactScreen = new CreateContactScreen();
    ContactDetailScreen contactDetailScreen = new ContactDetailScreen();


    @Test
    public void verifyCreateContact(){
        String nameContact= "UPB"+new Date().getTime();
        mainScreen.addButton.click();
        //alertSection.cancelButton.click();
        createContactScreen.nameTextBox.setText(nameContact);
        createContactScreen.phoneTextBox.setText("777777777");
        createContactScreen.saveButton.click();
        String actualResult=contactDetailScreen.nameContactLabel.getText();
        Assertions.assertEquals(nameContact,actualResult
                ,"ERROR el contacto no se creo");
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }



}