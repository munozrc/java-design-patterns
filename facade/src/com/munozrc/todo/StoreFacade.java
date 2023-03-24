package com.munozrc.todo;

import java.util.ArrayList;

public class StoreFacade {

    private String fullName;
    private String ID;
    private String cardType;
    private String cardNumber;
    private String cardExpDate;
    private final ArrayList<SingleProduct> products = new ArrayList<>();

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public void addProduct(String name, int price) {
        this.products.add(new SingleProduct(name, price));
    }

    public boolean saveCustomerData() {
        Client objClient = new Client(fullName, ID);
        ListOfProducts objListOfProducts = new ListOfProducts(products);
        CreditCard objCreditCard = new CreditCard(cardType, cardNumber, cardExpDate);

        boolean validData = true;
        String errorMessage = "";

        if (!objClient.isValid()) {
            errorMessage = "Invalid Fullname or ID";
            validData = false;
        }

        if (!objListOfProducts.isValid()) {
            errorMessage = "List of Products is Empty!";
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

        return objClient.save() && objListOfProducts.save() && objCreditCard.save();
    }

}
