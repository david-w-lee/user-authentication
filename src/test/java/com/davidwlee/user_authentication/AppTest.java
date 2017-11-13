package com.davidwlee.user_authentication;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.davidwlee.controller.HomeController;

public class AppTest {
	
	@Test
    public void testApp() {
        HomeController hc = new HomeController();
        String result = hc.home();
        assertEquals(result, "index.html");
    }
}
