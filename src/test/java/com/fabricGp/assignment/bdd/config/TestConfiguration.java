package com.fabricGp.assignment.bdd.config;

import com.fabricGp.assignment.bdd.data.User;
import com.fabricGp.assignment.bdd.helper.DefaultSeatSelection;
import com.fabricGp.assignment.bdd.helper.DefaultShowSelection;
import com.fabricGp.assignment.bdd.services.HomePgServices;
import com.fabricGp.assignment.bdd.services.LoginPgServices;
import com.fabricGp.assignment.bdd.services.SeatSelectionServices;
import com.fabricGp.assignment.bdd.services.ShowSelectionServices;
import com.fabricGp.assignment.bdd.ui.pages.HomePage;
import com.fabricGp.assignment.bdd.ui.pages.LoginPage;
import com.fabricGp.assignment.bdd.ui.pages.ShowSelectionPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan("com.fabricGp.assignment.bdd")
@Lazy
public class TestConfiguration {

//    @Bean
//    public WebDriver getWebDriver(){
//        return new ChromeDriverInitializer().getDriver();
//    }

    @Bean
    public HomePgServices getHomePgService(){
        return new HomePage();
    }

    @Bean
    public LoginPgServices getLoginPgService(){
        return new LoginPage();
    }

    @Bean
    public ShowSelectionPage getShowPage(){
        return new ShowSelectionPage();
    }

    @Bean(name = "tedUser")
    public User getTedUser(){
        User tedUser = new User();
        return tedUser;
    }

    @Bean
    public ShowSelectionServices getShowSerlectionService(){
        return new DefaultShowSelection();
    }

    @Bean
    public SeatSelectionServices getSeatSerlectionService(){
        return new DefaultSeatSelection();
    }

}
