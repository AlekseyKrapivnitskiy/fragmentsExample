import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;


public class RegistrationTest extends BaseTest {
    private RegistrationPage registrationPage;

    @BeforeEach
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
