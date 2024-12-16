import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    @BeforeEach
    public void beforeEach() {
        System.out.println("Это - метод beforeEach!");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Это afterEach");
    }
}
