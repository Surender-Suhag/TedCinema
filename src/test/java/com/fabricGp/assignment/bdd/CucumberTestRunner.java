package com.fabricGp.assignment.bdd;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/features"
        },
        glue = {
               "com.fabricGp.assignment.bdd.stepdefs"
        },
        plugin = {
                "pretty",
        }
)
public class CucumberTestRunner {
}
