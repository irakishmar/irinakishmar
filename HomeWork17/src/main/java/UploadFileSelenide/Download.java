package UploadFileSelenide;

import org.openqa.selenium.By;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;

public class Download {
    public void  downloadFile() throws IOException {
        File file = $(By.linkText("loremipsum.txt")).download();

    }

}
