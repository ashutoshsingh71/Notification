package com.bitgo.notification.Exceptions;

public class NotificationException extends Exception{
    String message;
    public NotificationException() {
        this.message = "Notification does not exist";
    }
}
