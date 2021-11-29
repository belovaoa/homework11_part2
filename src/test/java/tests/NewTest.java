package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("group14")
public class NewTest extends TestBase {

    @Test
    void  upravlyaemVmesteTest() {

        step("Проверяем наличие кнопки войти", () -> {
            open("https://vmeste.permkrai.ru/");
            $(".main-header__user-text").shouldHave(text("Войти"));
        });
    }
}
