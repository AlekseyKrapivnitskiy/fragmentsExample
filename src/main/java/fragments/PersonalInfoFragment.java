package fragments;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInfoFragment {
    @FindBy(id = "firstName")
    private SelenideElement firstNameField;

    @FindBy(id = "lastName")
    private SelenideElement lastNameField;

    public void enterFirstName(String firstName) {
        firstNameField.setValue(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.setValue(lastName);
    }
}
