package loggers.impl;

import loggers.EventLogger;

public class ConsoleEventLogger implements EventLogger {

    public ConsoleEventLogger() {
    }

    public void logEvent(String message){
        System.out.println(message);
    }
}
