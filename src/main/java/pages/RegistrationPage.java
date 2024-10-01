package pages;

import fragments.PersonalInfoFragment;

import static com.codeborne.selenide.Selenide.page;

public class RegistrationPage {
    public PersonalInfoFragment personalInfo;

    public RegistrationPage() {
        personalInfo = page(PersonalInfoFragment.class);
    }
}
