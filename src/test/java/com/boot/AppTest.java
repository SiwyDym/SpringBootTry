package com.boot;

import com.boot.controller.HomeController;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by emarsiw on 2018-02-20.
 */
public class AppTest{

    @Test
    public void testApp() {
        HomeController hc = new HomeController();
        assertEquals("Das Boot - working!", hc.home());
    }
}