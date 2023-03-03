package com.munozrc.todo;

public class WindowsHostingFactory extends HostingFactory {

    @Override
    public IBasic getBasic() {
        return new WindowsBasic("Windows-Basic");
    }

    @Override
    public IPremium getPremium() {
        return new WindowsPremium("Windows-Premium");
    }

    @Override
    public IPremiumPlus getPremiumPlus() {
        return new WindowsPremiumPlus("Windows-Premium-Plus");
    }

}
