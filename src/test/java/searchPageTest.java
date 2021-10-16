import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class searchPageTest {
    //    static mainPage main;
    static searchPage searchPage;

    @BeforeAll
    static void beforeAll() {
        searchPage = new mainPage().toSearch();
    }

    @ParameterizedTest
    @CsvSource({
            "alibaba,阿里巴巴",
            "jd,京东"
    })
    void search(String keyword, String name) {
        assertEquals(searchPage.search(keyword).getSearchlist().get(0), name);
    }

    @Test
    void getPrice() {
        assertFalse(searchPage.search("alibaba").getPrice() > 200);
    }

    @AfterAll
    static void tearDown() {
        searchPage.quit();
    }
}