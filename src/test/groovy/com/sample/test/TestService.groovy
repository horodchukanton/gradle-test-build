package com.sample.test

import org.junit.Assert
import org.junit.Test

class TestService {

    final String TEST_MESSAGE = "testMessage"
    final String FAIL_MESSAGE = "Expected exception"
    final int TEST_SLEEP_TIME = 1

    @Test
    void doTask() {
        Service service = new Service(TEST_MESSAGE, 0)

        // Check property was saved
        Assert.assertEquals(service.getTestMessage(), TEST_MESSAGE)

        service.doTask()

        // Check usage counter
        Assert.assertEquals(service.getUsageCounter(), 1)
    }

    @Test
    void doTaskWithSleep() {
        Service service = new Service(TEST_MESSAGE, TEST_SLEEP_TIME)

        long start = System.currentTimeMillis()
        service.doTask()
        long end = System.currentTimeMillis()
        long executionTime = end - start

        Assert.assertTrue(executionTime >= TEST_SLEEP_TIME)
    }

    @Test(expected = RuntimeException.class)
    void failTask() {
        Service service = new Service("", 0)
        service.setFailMessage(FAIL_MESSAGE)

        service.doTask()
    }
}
