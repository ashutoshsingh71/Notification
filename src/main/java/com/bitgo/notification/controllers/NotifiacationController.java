package com.bitgo.notification.controllers;

import com.bitgo.notification.services.NotificationService;

@RestController
@URlMapping("/notifications")
public class NotifiacationController {

    @Autowired
    NotificationService notificationService;

    @postMapping("/create")
    public String createNotification(@RequestBody String body){
        notificationService.createNotification(body);
        return "Notification created";
    }

    @postMapping("/send")
    public sendNotification(@RequestBody String body){
        //logic to get notification and
        notificationService.sendNotification();
    }
}
