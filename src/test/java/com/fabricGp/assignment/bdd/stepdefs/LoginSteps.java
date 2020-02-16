package com.fabricGp.assignment.bdd.stepdefs;


import com.fabricGp.assignment.bdd.data.UserType;
import com.fabricGp.assignment.bdd.services.LoginPgServices;
import io.cucumber.java.ParameterType;
import io.cucumber.java8.En;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = com.fabricGp.assignment.bdd.config.TestConfiguration.class)
public class LoginSteps implements En {

    @ParameterType("ted|Ted|Regular|regular|user|customer|valid")
    public UserType userType(String type) {
        if (type.toLowerCase().equals("ted"))
            return UserType.Ted;
        else
            return UserType.Regular;
    }

    @Autowired
    public LoginSteps(LoginPgServices loginPgServices) {
        Given("{userType} user is logged in", (UserType type) -> {
            if (type == UserType.Ted)
                loginPgServices.loginValidTedUser();
            else
                loginPgServices.loginValidNonTedUser();
        });
    }
}
