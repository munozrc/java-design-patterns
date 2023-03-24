package com.munozrc.template;

public class CustomerFacade {

    private String address;
    private String city;
    private String state;
    private String cardType;
    private String cardNumber;
    private String cardExpDate;
    private String firstName;
    private String lastName;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardExpDate(String cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean saveCustomerData() {
        Address objAddress = new Address(address, city, state);
        Account objAccount = new Account(firstName, lastName);
        CreditCard objCreditCard = new CreditCard(cardType, cardNumber, cardExpDate);

        boolean validData = true;
        String errorMessage = "";

        if (!objAccount.isValid()) {
            errorMessage = "Invalid FirstName/LastName";
            validData = false;
        }

        if (!objAddress.isValid()) {
            errorMessage = "Invalid Address/City/State";
            validData = false;
        }

        if (!objCreditCard.isValid()) {
            errorMessage = "Invalid CreditCard Info";
            validData = false;
        }

        if (!validData) {
            System.out.println(errorMessage);
            return false;
        }

        return objAddress.save() && objAccount.save() && objCreditCard.save();
    }

}
