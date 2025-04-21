package pages.base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class WebFormPage extends BasePage {
    public WebFormPage(WebDriver driver) {
        super(driver);
    }

    private static final String URL_WEB_FORM = "https://www.selenium.dev/selenium/web/web-form.html";

    // Локаторы
    private static final By TEXT_INPUT = By.xpath("//input[@id='my-text-id']");
    private static final By TEXT_AREA = By.xpath("//textarea[@name='my-textarea']");
    private static final By PASSWORD_INPUT = By.xpath("//input[@name='my-password']");
    private static final By DROPDOWN_SELECT = By.xpath("//select[@name='my-select']");
    private static final By DROPDOWN_DATALIST = By.name("my-datalist");
    private static final By CHECKBOX_1 = By.xpath("//input[@id='my-check-1']");
    private static final By CHECKBOX_2 = By.xpath("//input[@id='my-check-2']");
    private static final By RADIO_DEFAULT = By.xpath("//input[@id='my-radio-2']");
    private static final By SUBMIT_BUTTON = By.xpath("//button[@class='btn btn-outline-primary mt-3']");
    private static final By SUCCESS_MESSAGE = By.xpath("//h1[@class = 'display-6']");
    private static final By DATE_PICKER = By.xpath("//input[@name='my-date']");
    private static final By COLOR_PICKER = By.xpath("//input[@name='my-colors']");
    private static final By EXAMPLE_RANGE = By.xpath("//input[@name='my-range']");



    public void openWebFormPage() {
        openUrl(URL_WEB_FORM);
    }

    
    public void TextInput(String text) {
        sendKeys(TEXT_INPUT, text);
    }

    public void TextArea(String text) {
        sendKeys(TEXT_AREA, text);
    }

    public void Password(String password) {
        sendKeys(PASSWORD_INPUT, password);
    }


    public String getTextInput() {
        return findElement(TEXT_INPUT).getAttribute("value");
    }


    public String getPassword() {
        return findElement(PASSWORD_INPUT).getAttribute("value");
    }

    public String getTextArea() {
        return findElement(TEXT_AREA).getAttribute("value");
    }



    public void DropdownSelect(String option) {
        Select dropdown = new Select(findElement(DROPDOWN_SELECT));
        dropdown.selectByVisibleText(option);
    }


    public void DropdownDATALIST(String option) {
        WebElement datalist = findElement(DROPDOWN_DATALIST);
        datalist.sendKeys(option);
    }




    public void setCheckbox1(boolean state) {
        WebElement checkbox = findElement(CHECKBOX_1);
        if (checkbox.isSelected() != state) {
            checkbox.click();
        }
    }

    public void setCheckbox2(boolean state) {
        WebElement checkbox = findElement(CHECKBOX_2);
        if (checkbox.isSelected() != state) {
            checkbox.click();
        }
    }


    public boolean GetCheckbox1() {
        return findElement(CHECKBOX_1).isSelected();
    }

    public boolean GetCheckbox2() {
        return findElement(CHECKBOX_2).isSelected();
        }


    public void selectDefaultRadio() {
        click(RADIO_DEFAULT);
    }


    public boolean getDefaultRadio() {
        return findElement(RADIO_DEFAULT).isSelected();
    }

    public void submitForm() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(SUBMIT_BUTTON));
        submitButton.click();
    }



    public void selectDate() {
        String date = "2024-09-23";
        sendKeys(DATE_PICKER, date);
    }

    public void selectGreenColor() {
        String greenColor = "#00FF00";
        sendKeys(COLOR_PICKER, greenColor);
    }



}

