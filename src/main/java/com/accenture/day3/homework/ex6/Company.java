package com.accenture.day3.homework.ex6;

import java.util.List;

public class Company {
    private String name;
    private List<Service> services;

    public Company(String companyName, List<Service> services) {
        this.name = companyName;
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public void setName(String companyName) {
        this.name = companyName;
    }

    public List<Service> getServices() {
        return services;
    }

    public void addNewService( Service service ) {
        this.services.add(service);
    }

    public Service getServiceByName(String serviceName) {
        for (Service service : this.services) {
            if (service.getName().equals(serviceName)) {
                return service;
            }
        }
        return null;
    }

    public void advertise(String serviceName, AdvertisingPlatform platform, String message, int days) {
        Service service = getServiceByName(serviceName);
        if (service == null) {
            System.out.println("Service not found");
            return;
        }
        platform.launchAdvertisingCampaign( List.of(service), message, days);
    }

    public void advertise(AdvertisingPlatform platform, String message, int days) {
        if (this.services.isEmpty()) {
            System.out.println("No services found to promote");
            return;
        }

        platform.launchAdvertisingCampaign(services, message, days);
    }

    public void advertise(AdvertisingPlatform platform, String message) {
        if (this.services.isEmpty()) {
            System.out.println("No services found to promote");
            return;
        }

        platform.launchAdvertisingCampaign(services, message, 1);
    }
}
