package com.munozrc.todo;

public class LinuxHostingFactory extends HostingFactory {

    @Override
    public IBasic getBasic() {
        return new LinuxBasic("Linux-Basic");
    }

    @Override
    public IPremium getPremium() {
        return new LinuxPremium("Linux-Premium");
    }

    @Override
    public IPremiumPlus getPremiumPlus() {
        return new LinuxPremiumPlus("Linux-Premium-Plus");
    }

}
