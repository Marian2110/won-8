package com.accenture.day3.homework.ex6;

import java.util.List;

public class FacebookAds implements AdvertisingPlatform {

    private final List<String> targetAudiences;

    public FacebookAds(List<String> targetAudience) {
        this.targetAudiences = targetAudience;
    }
    @Override
    public void launchAdvertisingCampaign(List<Service> services, String message, int days) {
        System.out.println("Facebook: Launching advertising campaign");
        System.out.println("Facebook: Target Audience: " + targetAudiences);
        System.out.println("Facebook: Advertising message: " + message);
        System.out.println("Facebook: Advertising days: " + days);
        System.out.println("Facebook: Advertised services: " + services);

        for (int i = 0; i < days; i++) {
            System.out.println(message);
            services.forEach(service -> System.out.println(service.getName() + " is only  " + service.getPrice() + " $" + "/month"));
        }
    }
}
