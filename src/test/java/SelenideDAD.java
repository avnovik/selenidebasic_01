import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideDAD {
    @Test
    void drugAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(Condition.text("B"));
        $("#column-b").shouldHave(Condition.text("A"));

    }
}
