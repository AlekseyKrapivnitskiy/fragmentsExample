package example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class RegistrationTest {
    private RegistrationPage registrationPage;

    @BeforeMethod
    public void setUp() {
        open("https://example.com/registration");
        registrationPage = page(RegistrationPage.class);
    }

    @Test
    public void testRegistration() {
        registrationPage.personalInfo.enterFirstName("John");
        registrationPage.personalInfo.enterLastName("Doe");
    }
}
