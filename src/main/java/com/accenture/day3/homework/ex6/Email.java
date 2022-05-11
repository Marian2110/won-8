package com.accenture.day3.homework.ex6;

import java.util.List;

public class Email implements AdvertisingPlatform {

    private final String subject;
    private final List<String> recipients;

    public Email(String subject, List<String> recipients) {
        this.subject = subject;
        this.recipients = recipients;
    }

    public void send(String subject, String body, List<String> recipients) {
        System.out.println("Email sent to " + recipients);
    }

    @Override
    public void launchAdvertisingCampaign(List<Service> services, String message, int days) {
        System.out.println("Email advertising campaign launched");
        System.out.println("Email subject: " + subject);
        System.out.println("Email recipients: " + recipients);
        System.out.println("Email services: " + services);
        System.out.println("Email days: " + days);

        StringBuilder body = new StringBuilder(message + "\n\n");
        for (Service service : services) {
            body
                    .append("\t").append(service.getName()).append(" is only ")
                    .append(service.getPrice()).append("$/month").append(", \n");
        }

        body.delete(body.length() - 2, body.length());
        System.out.println("Email body: \n" + body);
        for (int i = 0; i < days; i++) {
            System.out.println("Day " + (i + 1) + " of Email advertising campaign");
            send(subject, body.toString(), recipients);
        }


    }
}
