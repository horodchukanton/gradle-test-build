package com.sample.test

class Service {

    private String testMessage = "default message"
    private String failMessage = null
    private int sleepTime
    private int usageCounter = 0

    Service(String testMessage, int sleepTime) {
        this.testMessage = testMessage
        this.sleepTime = sleepTime
    }

    void doTask() {
        if (sleepTime) {
            Thread.sleep(Long.valueOf(sleepTime))
        }

        println testMessage
        usageCounter++

        if (failMessage != null) {
            throw new RuntimeException(failMessage)
        }
    }

    String getTestMessage() {
        return testMessage
    }

    void setFailMessage(String msg) {
        failMessage = msg
    }

    int getUsageCounter() {
        return usageCounter
    }

}
