package ru.skillbox;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class UstinovAmazonTest {

    @Test
    void amazon(){
        // Open web site amazon.com
        open("https://amazon.com");
        // ввести гарри поттер в поле поиска и нажать энтер
        $("#twotabsearchtextbox").setValue("Harry Potter").pressEnter();
        //Проверка загруился список товаров и на первом месте товар с именем Harry Potter
        $$("[data-component-type=s-search-result]").first()
                .shouldHave(text("Harry Potter"));

    }
    @Test
    void amazonTest(){
        //Открыть страницу Amazon.com
        Selenide.open("https://amazon.com");
        //Проверка страница открылась-логотип видимый
        Selenide.$("[id=nav-logo]").shouldBe(Condition.visible);
        // Ввести Star Wars movie в поле поиска
        Selenide.$("[id=twotabsearchtextbox]").setValue("Star Wars movies").pressEnter();
        //Нажать Enter
        //Проверить что загрузился список товаров и на первом месте товар с именем Star Wars movie
        Selenide.$$("[data-component-type=s-search-result]").first().shouldBe(Condition.visible)
                .shouldHave(Condition.text("Star Wars"));
        Selenide.sleep(5000);
    }

}
