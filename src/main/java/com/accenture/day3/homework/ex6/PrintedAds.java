package com.accenture.day3.homework.ex6;

import java.util.List;



public class PrintedAds implements AdvertisingPlatform {

    private final List<String> locations;
    public PrintedAds(List<String> locations) {
        this.locations = locations;
    }
    @Override
    public void launchAdvertisingCampaign(List<Service> services, String message, int days) {
        System.out.println("Printed Ads: Advertising campaign launched");
        System.out.println("Printed Ads: message: " + message);
        System.out.println("Printed Ads: days: " + days);
        System.out.println("Printed Ads: services: " + services);
        System.out.println("Printed Ads: locations: " + locations);

        StringBuilder body = new StringBuilder(message + "\n\n");
        for (Service service : services) {
            body
                    .append("\t").append(service.getName()).append(" is only ")
                    .append(service.getPrice()).append("$/month").append(", \n");
        }

        System.out.println("Printed ad body: \n" + body);

        for (int i = 0; i < days; i++) {
            System.out.println("Day " + (i + 1) + " of Printed advertising campaign");
            System.out.println("Adds are being printed in the following locations: " + locations);
        }


    }
}
