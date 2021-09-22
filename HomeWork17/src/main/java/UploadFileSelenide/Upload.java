package UploadFileSelenide;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class Upload {
    public void uploadFile(){
        File file = new File("loremipsum1.txt");
        $("input[type='file']").uploadFile(file);
        $("#file-submit").click();
    }
}
