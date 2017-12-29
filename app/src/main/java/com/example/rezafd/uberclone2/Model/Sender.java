package com.example.rezafd.uberclone2.Model;

/**
 * Created by REZAFD on 29/12/2017.
 */

public class Sender {
    public Notification notification;
    public String to;

    public Sender(String token, Notification data){

    }

    public Sender(Notification notification, String to) {
        this.notification = notification;
        this.to = to;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
