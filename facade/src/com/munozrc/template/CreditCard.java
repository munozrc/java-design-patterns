package com.munozrc.template;

public class CreditCard {

    private final String cardType;
    private final String cardNumber;
    private final String cardExpDate;
    private final String CC_DATA_FILE = "CC.txt";

    public CreditCard(String cardType, String cardNumber, String cardExpDate) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardExpDate = cardExpDate;
    }

    public boolean isValid() {
        String parseCardNumber = this.cardNumber.trim();
        int lengthCardNumber = parseCardNumber.length();

        if (this.cardType.equals("VISA") || this.cardType.equals("MASTER")) {
            return lengthCardNumber == 16;
        }

        if (this.cardType.equals("DISCOVER")) {
            return lengthCardNumber == 15;
        }

        return false;
    }

    public boolean save() {
        String dataLine = getCardType() + ", " + getCardNumber() + ", " + getCardExpDate();
        System.out.println("Grabado el archivo " + CC_DATA_FILE + " Texto: \u001B[33m" + dataLine + "\u001B[0m");
        return true;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardExpDate() {
        return cardExpDate;
    }

}
