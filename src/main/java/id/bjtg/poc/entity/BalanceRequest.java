package id.bjtg.poc.entity;

import java.util.HashMap;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class BalanceRequest {
    private String partnerReferenceNo;
    private String bankCardToken;
    private String accountNo;
    private String[] balanceTypes;
    private HashMap<String, String> additionalInfo;

    public String getPartnerReferenceNo() {
        return partnerReferenceNo;
    }

    public void setPartnerReferenceNo(String partnerReferenceNo) {
        this.partnerReferenceNo = partnerReferenceNo;
    }

    public String getBankCardToken() {
        return bankCardToken;
    }

    public void setBankCardToken(String bankCardToken) {
        this.bankCardToken = bankCardToken;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String[] getBalanceTypes() {
        return balanceTypes;
    }

    public void setBalanceTypes(String[] balanceTypes) {
        this.balanceTypes = balanceTypes;
    }

    public HashMap<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(HashMap<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

}
