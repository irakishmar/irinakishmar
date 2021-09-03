package HomeWork13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class Hovers extends BaseTest{
    @Test
    public void hovers(){
        driver.get("https://the-internet.herokuapp.com/hovers");

       WebElement user1 = driver.findElement(By.xpath("//h5[contains(text(),'name: user1')]/../.."));
        sleep();
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(user1).build().perform();
        WebElement name1 = driver.findElement(By.xpath("//h5[contains(text(),'name: user1')]"));
        String userName1 = name1.getText();
        System.out.println(userName1);
        sleep();

        WebElement user2 = driver.findElement(By.xpath("//h5[contains(text(),'name: user2')]/../.."));
        sleep();
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(user2).build().perform();
        WebElement name2 = driver.findElement(By.xpath("//h5[contains(text(),'name: user2')]"));
        String userName2 = name2.getText();
        System.out.println(userName2);
        sleep();

        WebElement user3 = driver.findElement(By.xpath("//h5[contains(text(),'name: user3')]/../.."));
        sleep();
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(user3).build().perform();
        WebElement name3 = driver.findElement(By.xpath("//h5[contains(text(),'name: user3')]"));
        String userName3 = name3.getText();
        System.out.println(userName3);
        sleep();


    }
    private void sleep(){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){}
    }
}
