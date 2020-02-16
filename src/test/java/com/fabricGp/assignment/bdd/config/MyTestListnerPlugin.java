package com.fabricGp.assignment.bdd.config;


import io.cucumber.plugin.EventListener;
import io.cucumber.plugin.event.*;

public class MyTestListnerPlugin implements EventListener {


    @Override
    public void setEventPublisher(EventPublisher eventPublisher) {
        eventPublisher.registerHandlerFor(TestRunStarted.class,(t)->this.handleRunStarted(t));
        eventPublisher.registerHandlerFor(TestCaseStarted.class,(t)->this.handleTestCaseStarted(t));
    }

    private void handleTestCaseStarted(TestCaseStarted t) {

        System.out.println("***********Test case Name is ******");
        System.out.println( t.getTestCase().getName());
        System.out.println("****************DONE***************");
    }


    private <T extends Event> void handleRunStarted(TestRunStarted t) {
        System.out.println("**********************************");
        System.out.println("Test run started");

        System.out.println("********************");

    }
}
