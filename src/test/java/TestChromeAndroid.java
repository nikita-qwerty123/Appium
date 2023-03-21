import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestChromeAndroid extends BaseClass {

    @BeforeClass
    public static void hillel() {
        driver.get("https://odessa.ithillel.ua/courses/qa-automation");
    }

    @Test
    public void getElements(){
        System.out.println(driver.findElement(By.xpath("//button[@id='btn-consultation-hero']")).getText());
        System.out.println(driver.findElement(By.xpath("//h2[@class='introduction-info_title']")).getText());
        System.out.println(driver.findElement(By.xpath("//h3[contains(.,'Цілі курсу')]")).getText());
        System.out.println(driver.findElement(By.xpath("//button[@class='button -l -primary']")).getText());
        System.out.println(driver.findElement(By.xpath("//button[@class='introduction-sidebar_widget introduction-sidebar-widget faq-question-link']")).getText());



    }
}
