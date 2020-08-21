package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.pages.google.GooglePage;
import test.pages.google.SearchResultsPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

    @Test
    public void userCanSearch() {
        GooglePage page = open("http://google.com/ncr", GooglePage.class);
        SearchResultsPage results = page.searchFor("selenide");
        Assert.assertTrue(results.getResults().size() > 5);
        results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
