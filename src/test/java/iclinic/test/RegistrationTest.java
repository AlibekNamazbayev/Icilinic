package iclinic.test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTest {
    @Test
    void RegistrationWithIin() {
        open("http://test.iclinic.kz/registration");

        $("#iin input[type=text]").setValue("990803351557");

        $("[class='c-btn form-input--auto form__button']").click();
        //$(byText("Найти")).click();

    }
}


