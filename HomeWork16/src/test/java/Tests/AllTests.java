package Tests;

import HomeWork16.DownloadFile;
import HomeWork16.UploadFile;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class AllTests extends BaseTest {
    @Test
    public void downloadTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");

        DownloadFile downloadFile = new DownloadFile(driver);
        downloadFile.clickDownload();
    }

    @Test
    public void fileTest() throws IOException {

        File file = new File("target/text.txt");

        Path path = Paths.get("target/text.txt");

        List<String> lines = Files.readAllLines(path);


        Path path1 = Paths.get("target/text1.txt");
        path1.toFile().createNewFile();
        FileWriter writer = new FileWriter("target/text1.txt");


        writer.write("First Line,\n Second Line,\n Third Line\n");
        writer.flush();
        writer.close();

    }

    @Test
    public void uplioadTest() {
        driver.get("https://the-internet.herokuapp.com/upload");

        UploadFile uploadFile = new UploadFile(driver);
        uploadFile.uploadFileAction();

    }
}
