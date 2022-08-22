package org.example.tapestry.unit.pages;

import org.apache.tapestry5.dom.Document;
import org.apache.tapestry5.test.PageTester;
import org.junit.jupiter.api.Test;

import org.example.services.AppModule;
import org.example.services.QaModule;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IndexTest {

    @Test
    void test() {
        // given
        String appPackage = "org.example";
        String appName = "App";
        PageTester tester = new PageTester(appPackage, appName, "src/main/webapp", AppModule.class, QaModule.class);

        // when
        Document doc = tester.renderPage("Index");

        // then
        assertTrue(doc.getElementById("title").getChildMarkup().startsWith("Welcome to Tapestry 5!"));
    }
}

