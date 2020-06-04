package com.app.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"PL", "default"})
@Service("i18nService")
public class I18PolishGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Dzien Dobry from Polish Greeting Service";
    }
}
