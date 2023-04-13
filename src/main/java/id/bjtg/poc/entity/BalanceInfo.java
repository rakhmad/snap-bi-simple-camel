package id.bjtg.poc.entity;

import java.util.HashMap;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class BalanceInfo {
    private String balanceType;
    private HashMap<String, CurrencyType> amount;
    private HashMap<String, CurrencyType> floatAmount;
    private HashMap<String, CurrencyType> holdAmount;
    private HashMap<String, CurrencyType> availableBalance;
    private HashMap<String, CurrencyType> ledgerBalance;
    private HashMap<String, CurrencyType> currentMultilateralLimit;
    private String registrationStatusCode;
    private String status;

    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    public HashMap<String, CurrencyType> getAmount() {
        return amount;
    }

    public void setAmount(HashMap<String, CurrencyType> amount) {
        this.amount = amount;
    }

    public HashMap<String, CurrencyType> getFloatAmount() {
        return floatAmount;
    }

    public void setFloatAmount(HashMap<String, CurrencyType> floatAmount) {
        this.floatAmount = floatAmount;
    }

    public HashMap<String, CurrencyType> getHoldAmount() {
        return holdAmount;
    }

    public void setHoldAmount(HashMap<String, CurrencyType> holdAmount) {
        this.holdAmount = holdAmount;
    }

    public HashMap<String, CurrencyType> getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(HashMap<String, CurrencyType> availableBalance) {
        this.availableBalance = availableBalance;
    }

    public HashMap<String, CurrencyType> getLedgerBalance() {
        return ledgerBalance;
    }

    public void setLedgerBalance(HashMap<String, CurrencyType> ledgerBalance) {
        this.ledgerBalance = ledgerBalance;
    }

    public HashMap<String, CurrencyType> getCurrentMultilateralLimit() {
        return currentMultilateralLimit;
    }

    public void setCurrentMultilateralLimit(HashMap<String, CurrencyType> currentMultilateralLimit) {
        this.currentMultilateralLimit = currentMultilateralLimit;
    }

    public String getRegistrationStatusCode() {
        return registrationStatusCode;
    }

    public void setRegistrationStatusCode(String registrationStatusCode) {
        this.registrationStatusCode = registrationStatusCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}