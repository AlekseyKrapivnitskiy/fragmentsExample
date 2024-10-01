package fragments;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class PersonalInfoFragment {
    @FindBy(id = "firstName")
    private SelenideElement firstNameField;

    @FindBy(id = "lastName")
    private SelenideElement lastNameField;

    @Step("Ввод имени: {firstName}")
    public void enterFirstName(String firstName) {
        firstNameField.setValue(firstName);
    }

    @Step("Ввод фамилии: {lastName}")
    public void enterLastName(String lastName) {
        lastNameField.setValue(lastName);
    }
}
