import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestUsingPostmanEcho {
    @Test
    void shouldReturnRequest() {
        given()// Предусловия
                .baseUri("https://postman-echo.com")
                .body("Hello, world!")// отправляемые данные (заголовки и query можно выставлять аналогично)
                .when()// Выполняемые действия
                .post("/post")
                .then()// Проверки
                .statusCode(200)
                .body("data", equalTo("Hello, world!"))
        ;
    }
}
