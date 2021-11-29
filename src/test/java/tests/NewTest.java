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

        step("Открываем страницу https://vmeste.permkrai.ru/", () -> {
            open("https://vmeste.permkrai.ru/");
        });
        step("Проверяем наличие кнопки войти", () -> {
            $(".main-header__user-text").shouldHave(text("Войти"));
        });
    }
}
