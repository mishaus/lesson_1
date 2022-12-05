package ru.skillbox;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork_2 {

    @Test
    void skillboxStoreTestWithoutAdvice(){

        //Открыть страницу сайта.
        open("http://intershop2.skillbox.ru");

        //Вызвать из меню страницу «Мой Аккаунт».
        $("[id=menu-item-30]").click();

        //Убедиться, что виден заголовок h2 «Мой Аккаунт».
        $(Selectors.byText("Мой Аккаунт"));
        $(".post-title").shouldBe(visible);

    //Нажать на кнопку «Зарегистрироваться».
        $(Selectors.byText("Зарегистрироваться")).click();

        //Убедиться, что виден заголовок h2 «Регистрация».
        $(Selectors.byText("Регистрация"));
        $(".post-title").shouldBe(visible);

        //Нажать на линк «Главная».
        $("[id=menu-item-26]").click();
        //Убедиться, что заголовок h2 больше не виден.
        $(Selectors.byText("Регистрация"));
        $(".post-title").shouldNotBe(visible);
    }

    @Test
    void skillboxStoreTest0(){

        //Открыть страницу сайта.
        open("http://intershop2.skillbox.ru");

        //Вызвать из меню страницу «Мой Аккаунт».
        $$("[id=menu-primary-menu]").findBy(text("Мой Аккаунт")).click();

        //Убедиться, что виден заголовок h2 «Мой Аккаунт».
        $("h2.post-title").shouldBe(text("Мой Аккаунт"));

        //Нажать на кнопку «Зарегистрироваться».
        $("button.custom-register-button").shouldBe(text("Зарегистрироваться")).click();

        //Убедиться, что виден заголовок h2 «Регистрация».
        $("h2.post-title").shouldBe(text("Регистрация"));

        //Нажать на линк «Главная».
        $("[id=accesspress-breadcrumb]").find(byText("Главная")).click();


        //Убедиться, что заголовок h2 больше не виден.
        $("h2.post-title").shouldNotBe(visible);
    }

    @Test
    void skillboxStoreTest1(){

        //Открыть страницу сайта.
        open("http://intershop2.skillbox.ru");

        //Вызвать из меню страницу «Мой Аккаунт».
        $$("[id=menu-primary-menu]").findBy(text("Мой Аккаунт")).click();

        //Убедиться, что виден заголовок h2 «Мой Аккаунт».
        //$("h2.post-title").shouldBe(text("Мой Аккаунт"));

        //Нажать на кнопку «Зарегистрироваться».
        $("button.custom-register-button").shouldBe(text("Зарегистрироваться")).click();

        //Убедиться, что виден заголовок h2 «Регистрация».
        //$("h2.post-title").shouldBe(text("Регистрация"));

        //Нажать на линк «Главная».
        $("[id=accesspress-breadcrumb]").find(byText("Главная")).click();


        //Убедиться, что заголовок h2 больше не виден.
        $("h2.post-title").shouldNotBe(visible);
    }

    @Test
    void storeTest2() {

        //открыть страницу сайта https://lm.skillbox.cc/qa_tester/module07/homework1/
        open("https://lm.skillbox.cc/qa_tester/module07/homework1/");


        //найти в теге <main> элемент с id=finish
        $("[id=finish]").should(visible);

        //Внутри этого элемента найти текст «Телефон»
        $("[id=finish]").find(byText("Телефон")).should(visible);

        //проверить наличие текста «Телефон» внутри элемента с id=finish
        //$("[id=finish]").shouldHave(text("Телефон"));
    }
}
