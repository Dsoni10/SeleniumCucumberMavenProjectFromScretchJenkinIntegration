package com.qascriptcucumber.StepDefs;

import com.qascriptcucmber.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {



    @Before
    public void setup(){
        initilizeDriver();

    }
    @After
    public void close(){
        closeDriver();
    }

}
