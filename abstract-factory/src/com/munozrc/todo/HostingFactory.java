package com.munozrc.todo;

public abstract class HostingFactory {

    public static String WINDOWS_HOSTING = "Windows";
    public static String LINUX_HOSTING = "Linux";

    public static String BASIC_PLAN = "Basic";
    public static String PREMIUM_PLAN = "Premium";
    public static String PREMIUM_PLUS_PLAN = "PremiumPlus";

    public abstract IBasic getBasic();

    public abstract IPremium getPremium();

    public abstract IPremiumPlus getPremiumPlus();

    public static HostingFactory getHostingFactory(String type) {

        if (type.equals(WINDOWS_HOSTING)) {
            return new WindowsHostingFactory();
        }

        if (type.equals(LINUX_HOSTING)) {
            return new LinuxHostingFactory();
        }

        throw new Error("getHostingFactory: type invalid");
    }

}
