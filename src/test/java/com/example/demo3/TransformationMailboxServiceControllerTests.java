package com.example.demo3;


import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Map;

public class TransformationMailboxServiceControllerTests {

//    @Before
//    public init() {
//
//    }

    @Test
    public void smokeTest() {
        TransformationMailboxServiceController controller = new TransformationMailboxServiceController(new MockHttpService());

        boolean expected = true;
        Assert.isTrue(controller.insertData(Map.of("Hello", "World")), "Test that basic case returns true");

    }
}
