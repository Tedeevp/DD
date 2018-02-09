package ru;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/ru/features",///C:\Users\WS\IdeaProjects\DD\src\test\java\ru\features
        glue = "ru/riskmarket/steps",
        tags = "@123")

public class CucumberTest {
}
