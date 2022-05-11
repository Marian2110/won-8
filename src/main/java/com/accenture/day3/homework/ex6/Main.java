package com.accenture.day3.homework.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var companyA = new Company("Company A",
                new ArrayList<>(
                        Arrays.asList(
                                new Service("Service 1", 20.45),
                                new Service("Service 2", 15.45),
                                new Service("Service 3", 10.45)
                        )
                )
        );

        companyA.addNewService(new Service("Service 4", 25.45));

        System.out.println("=============================================================");

        companyA.advertise(
                "Service 1",
                new FacebookAds(
                        List.of(
                                "Teenagers  between 15 and 24 years old",
                                "Adults between 29 and 32 years old",
                                "Elders between 60 and 65 years old"
                        )
                ),
                "Use our services",
                2
        );

        System.out.println("=============================================================");

        companyA.advertise(
                new Email(
                        companyA.getName() + " invites you to subscribe to our services",
                        List.of(
                                "email1@localhost.com",
                                "email2@localhost.com",
                                "email3@localhost.com"
                        )
                ),
                "Use our services",
                2
        );

        companyA.advertise(new PrintedAds(List.of("Central Square", "AFI Palace")), "Use our services");
    }

}
