package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class Demoqa_tests {
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";

    }
    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        zoom(0.65);

        $("[id=firstName]").setValue("vika");
        $("[id=lastName]").setValue("kom");
        $("[id=userEmail]").setValue("vika@kom.com");
        $("#genterWrapper").$(byText("Female")).click();
        $("[id=userNumber]").setValue("1234567890");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("1991");
        $(".react-datepicker__day--011").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("bruss.jpeg");
        $("#currentAddress").setValue("Spb");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

    }

}