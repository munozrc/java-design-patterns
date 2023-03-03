package com.munozrc.todo;

public class ClientMain {

    public static void main(String[] args) {

        String hostingPlatform = HostingFactory.WINDOWS_HOSTING;
        String hostingPlan = HostingFactory.BASIC_PLAN;
        String searchResult = "";

        HostingFactory hosting = HostingFactory.getHostingFactory(hostingPlatform);

        if (hostingPlan.equals(HostingFactory.BASIC_PLAN)) {
            IBasic basic = hosting.getBasic();
            searchResult = "Name: " + basic.getBasicName() + "\nFeatures: " + basic.getBasicFeatures();
        }

        if (hostingPlan.equals(HostingFactory.PREMIUM_PLAN)) {
            IPremium premium = hosting.getPremium();
            searchResult = "Name: " + premium.getPremiumName() + "\nFeatures: " + premium.getPremiumFeatures();
        }

        if (hostingPlan.equals(HostingFactory.PREMIUM_PLUS_PLAN)) {
            IPremiumPlus premiumPlus = hosting.getPremiumPlus();
            searchResult = "Name: " + premiumPlus.getPremiumPlusName() + "\nFeatures: " + premiumPlus.getPremiumPlusFeatures();
        }

        System.out.println(searchResult);
    }
}
