package com.bitgo.notification.services;

import com.bitgo.notification.Entities.Notification;
import com.bitgo.notification.Exceptions.NotificationException;
import com.bitgo.notification.Repositories.NotificationRepository;
import jdk.nashorn.internal.parser.JSONParser;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NotificationService {

    @Autowired
    NotificationRepository notificationRepository;

    public String createNotification(String notification){
        String id = UUID.randomUUID().toString();
        Notification notification = new Notification(id,currentPriceOfBTC,marketTradeVolume,intraDayHighPrice,marketCap);
        saveNotification(notification);
        return "Notification created";
    }
    private void saveNotification(Notification notification){
        notificationRepository.save(notification.getId());
    }

    public void sendNotification(String notification,String email){
        try {
            //parse notification to get id
            Notification obj = getNotificationById(id);
            if(obj == null) {
                throw new NotificationException("Notification not found");
            }
        }catch(NotificationException ex){

        }catch (Exception ex){

        }
    }

    public List<String> getAllNotifications(){
       return notificationRepository.getAll();
    }

    private Notification getNotificationById(String id){
       return notificationRepository.get(id);
    }
    public boolean deleteNotification(String id){
        try {
            Notification obj = getNotificationById(id);
            if(obj == null) {
                throw new NotificationException("Notification not found");
            }
            return notificationRepository.delete(obj.getId());
        } catch (NotificationException e) {
            throw new RuntimeException(e);
        }catch (Exception ex){

        }
    }
}
