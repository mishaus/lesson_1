package ru.skillbox;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class Homework_1 {

    @Test
    void skillboxStoreTest() {
        //Зайти на главную страницу магазина skillboxstore
        open("http://intershop.skillbox.ru");

        // Ввести в поле поиска "Машина"
        $("[name=s]").setValue("Машина").pressEnter();

        //Убедиться что первый из найденых результатов содержит слово "машина"
        $$(".product").shouldHave(CollectionCondition.sizeGreaterThanOrEqual(3))
                .first().shouldHave(Condition.textCaseSensitive("машина"));
    }
}
