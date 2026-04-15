package org.example.Project_challeng;

public abstract class BaseNotifier{

   final String formatMessage(String message) {
      return "=== Notification ===\n" + message + "\n====================";
    }

   final void logNotification(String recipient) {

       System.out.println("Notification sent to: " + recipient);
    }



}


