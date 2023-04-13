package id.bjtg.poc.entity;

import java.util.HashMap;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class BalanceResponse {
  private String responseCode;
  private String responseMessage;
  private String referenceNo;
  private String partnerReferenceNo;
  private String accountNo;

  private String name;
  private HashMap<String, BalanceInfo> accountInfo;
  private HashMap<String, String> additionalInfo;

  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public String getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  public String getReferenceNo() {
    return referenceNo;
  }

  public void setReferenceNo(String referenceNo) {
    this.referenceNo = referenceNo;
  }

  public String getPartnerReferenceNo() {
    return partnerReferenceNo;
  }

  public void setPartnerReferenceNo(String partnerReferenceNo) {
    this.partnerReferenceNo = partnerReferenceNo;
  }

  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HashMap<String, BalanceInfo> getAccountInfo() {
    return accountInfo;
  }

  public void setAccountInfo(HashMap<String, BalanceInfo> accountInfo) {
    this.accountInfo = accountInfo;
  }

  public HashMap<String, String> getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(HashMap<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }
}