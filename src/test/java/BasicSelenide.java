import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BasicSelenide {
    @Test
    void findJUnitOnGithub() {
        String githubSelenide = "https://github.com/selenide/selenide",
                assertionPage = "SoftAssertions",
                exampleTextJUnit5 = "Using JUnit5 extend test class";
        // - Откройте страницу Selenide в Github
        open(githubSelenide);
        //- Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        //- Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-box").$$("li").last().$("button").click();
        // - Откройте страницу SoftAssertions
        $(byText(assertionPage)).click();
        // - проверьте что внутри есть пример кода для JUnit5
        $("#wiki-body").shouldHave(Condition.text(exampleTextJUnit5));

    }
}
