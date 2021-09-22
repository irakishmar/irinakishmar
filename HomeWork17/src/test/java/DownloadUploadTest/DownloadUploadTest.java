package DownloadUploadTest;

import UploadFileSelenide.Download;
import UploadFileSelenide.Upload;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static com.codeborne.selenide.Selenide.open;

public class DownloadUploadTest {
    @Test
    public void downloadFile() throws IOException {
        open("https://the-internet.herokuapp.com/download");

        Download download = new Download();
        download.downloadFile();

    }
    @Test
    public void fileTest() throws IOException {

       // File file = new File("build/downloads/loremipsum.txt");

        Path path = Paths.get("loremipsum.txt");

      //  List<String> lines = Files.readAllLines(path);


            Path path1 = Paths.get("loremipsum1.txt");
        path1.toFile().createNewFile();
        FileWriter writer = new FileWriter("loremipsum1.txt");


        writer.write("First Line,\n Second Line,\n Third Line\n");
        writer.flush();
        writer.close();

    }
    @Test
    public void uploadFile(){
        open("https://the-internet.herokuapp.com/upload");
        Upload upload = new Upload();
        upload.uploadFile();
    }
}
