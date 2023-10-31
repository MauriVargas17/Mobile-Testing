package testSuite;

import activities.files.MainFiles;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class FilesTest {

    MainFiles mainFiles = new MainFiles();

    public void verifyCreateFolder(String nameFolder){
        mainFiles.options.click();
        mainFiles.newFolder.click();
        mainFiles.folderName.clearSetText(nameFolder);
        mainFiles.setFolderTitle(nameFolder);
        mainFiles.okButton.click();

        String actualResult = mainFiles.folderTitle.getText();
        Assertions.assertEquals(nameFolder , actualResult
                ,"ERROR El folder no se creo");
    }

    public void verifyDeleteFolder(String nameFolder){
        mainFiles.folderTitle.longClick();
        mainFiles.delete.click();
        mainFiles.okButton.click();

        Assertions.assertFalse(mainFiles.folderTitle.isControlDisplayed(),
                "ERROR El folder no se borro");
    }

    @Test
    public void folderCreationAndDeletionTest(){
        String nameFolder = "Mauri"+new Date().getTime();
        verifyCreateFolder(nameFolder);
        verifyDeleteFolder(nameFolder);
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }



}