import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideDAD {
    @Test
    void drugAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
    }
}
