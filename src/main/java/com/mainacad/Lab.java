package com.mainacad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class Lab
{
    public static void main( String[] args )
    {
        //Создаём системную переменную которая содержит путь к драйверу
        System.setProperty("webdriver.chrome.driver","src\\main\\java\\com\\mainacad\\drivers\\chromedriver.exe");

        //My variables
        String myName = "Andrii";
        String myLastName = "Heha";
        String myDate = "07.05.2019";

        //Создаём вебдрайвер
        WebDriver driver = new ChromeDriver();

        //Открываем тестовую страницу
        driver.get("https://www.toolsqa.com/automation-practice-form/");

        //открываем полное окно
        driver.manage().window().maximize();

        //TODO: Вывести в консоль текст Инфо сообщения

        String infoTextElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[1]/p[1]/em/strong")).getText();
        System.out.println(infoTextElement);

        String infoTextElement2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[1]/p[2]/span/em")).getText();
        System.out.println(infoTextElement2);

        //TODO: Вывести в консоль текст заголовка формы ("Practice Automation Form")
        String formTitle = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/h1")).getText();
        System.out.println(formTitle);

        //TODO: Кликнуть линк Partial Link Test
        WebElement clickOnPartialLinkTest = driver.findElement(By.linkText("Partial Link Test"));
        clickOnPartialLinkTest.click();

        //TODO: Заполнить поле First name:

        WebElement fillFirstName = driver.findElement(By.name("firstname"));
        fillFirstName.sendKeys(myName);

        //TODO: Заполнить поле Last name:
        WebElement fillLastName = driver.findElement(By.name("lastname"));
        fillLastName.sendKeys(myLastName);

        //TODO: Выбрать пол
        WebElement sexOption = driver.findElement(By.id("sex-0"));
        sexOption.click();

        //TODO: Выбрать количество лет опыта
        WebElement yearExperience = driver.findElement(By.id("exp-5"));
        yearExperience.click();

        //TODO: Заполнить поле дата
        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys(myDate);

        //TODO: Выбрать несколько Automation Tool
        WebElement autoToolQTP = driver.findElement(By.id("tool-0"));
        autoToolQTP.click();

        WebElement autoToolSeleniumIDE = driver.findElement(By.id("tool-1"));
        autoToolSeleniumIDE.click();

        WebElement autoToolSeleniumWebDriver = driver.findElement(By.id("tool-2"));
        autoToolSeleniumWebDriver.click();


        //TODO: Выбрать континент из выпадающего списка
        Select selectContinents = new Select(driver.findElement(By.id("continents")));
        selectContinents.selectByVisibleText("Europe");

        //TODO: Выбрать несколько вариантов из списка Selenium Commands
        Select selectSeleniumCommands = new Select(driver.findElement(By.id("selenium_commands")));
        selectSeleniumCommands.selectByVisibleText("Browser Commands");
        selectSeleniumCommands.selectByVisibleText("Switch Commands");
        selectSeleniumCommands.selectByVisibleText("WebElement Commands");

        //TODO: Кликнуть на кнопку Button
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        //Waiting till Text 1 and Text2 will appear
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //TODO: Вывести в консоль текст лейбла Text1
        String printText1 = driver.findElement(By.id("NextedText")).getText();
        System.out.println(printText1);

        //TODO: Вывести в консоль текст лейбла Text2

        //TODO: Закрыть браузер
        driver.close();
    }
}
