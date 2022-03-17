package Iclinic.test.AuthRegister;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationTest {
    void RegistrationWithIin() {
        open("http://test.iclinic.kz/registration");
        $(".$0").setValue("990803351557");

    }
}
