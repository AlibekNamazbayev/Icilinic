package iclinic.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class OrderToCall {
    @Test
    void CallToOrderTest() {

        open("http://test.iclinic.kz");

        $("[class=c-btn]").click();
        $("[class=modal-container]").shouldBe(Condition.visible);

        $("[required=required] input").setValue("Alibek");
        $("[type=phone]").setValue("7007001098");

        $("[class=additional-btn_svg]").click();
        $("[class=form_add]").shouldBe(Condition.visible);

        $("[class=drop-down] ").click();
        $(byText("Гинеколог" )).click();

        $$("[class=drop-down] ").get(1).click();

        $("[id=date]").setValue("29032022");
        $("[id=time]").setValue("1232");
        $("[class=comment]").setValue("текст из автотеста");
        $("[class=form]").click();
        $(".rf-checkbox.form_add-checkbox").click(); ;
        $(".modal-wrapper .submit").click();

        $(".modal-wrapper .modal-container .modals").shouldBe(Condition.visible);

    }
}
