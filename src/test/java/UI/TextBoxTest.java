package UI;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.base.WebFormPage;

public class TextBoxTest extends BaseTest {

    private WebFormPage webFormPage;

    @BeforeClass
    public void beforeClass() {
        System.out.println("Setting up before class in TextBoxTest.");
        webFormPage = new WebFormPage(driver);
    }

    @Test
    public void testTextBox() {
        // Шаг 1: Перейти на страницу
        webFormPage.openWebFormPage();

        String fullName = "Кожевников Владимир Сергеевич";
        String companyName = "Лига цифровой экономики";
        String password = "Password";

        webFormPage.TextInput(fullName);
        webFormPage.TextArea(companyName);
        webFormPage.Password(password);

        Assert.assertEquals(webFormPage.getTextInput(), fullName, "TextInput не соответствует ожидаемому!");
        Assert.assertEquals(webFormPage.getTextArea(), companyName, "TextArea не соответствует ожидаемому!");
        Assert.assertEquals(webFormPage.getPassword(), password, "Password не соответствует ожидаемому!");



    }

    @Test
    public void SelectTextTest() {
        webFormPage.openWebFormPage();
        String dropdownOption = "Two";
        webFormPage.DropdownSelect(dropdownOption);
        String datalistOption = "Seattle";
        webFormPage.DropdownDATALIST(datalistOption);


    }

    @Test
    public void CheckBoxTest() {
        webFormPage.openWebFormPage();
        webFormPage.setCheckbox1(true);
        webFormPage.setCheckbox2(true);
        Assert.assertTrue(webFormPage.GetCheckbox1(), "CheckBox1 не отмечен!");
        Assert.assertTrue(webFormPage.GetCheckbox2(), "CheckBox2 не отмечен!");


    }

    @Test
    public void RadioButtonTest() {
        webFormPage.openWebFormPage();
        webFormPage.selectDefaultRadio();
        Assert.assertTrue(webFormPage.getDefaultRadio(), "Радиобаттон не выбран!");
    }

    @Test
    public void SubmitTest() {
        webFormPage.openWebFormPage();
        webFormPage.submitForm();

    }

    @Test
    public void DateTest() {
        webFormPage.openWebFormPage();
        webFormPage.selectDate();
    }


    @Test
    public void ColorTest() {
        webFormPage.openWebFormPage();
        webFormPage.selectGreenColor();
    }


}



