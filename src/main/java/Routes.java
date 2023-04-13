import java.util.HashMap;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

import id.bjtg.poc.entity.BalanceInfo;
import id.bjtg.poc.entity.BalanceRequest;
import id.bjtg.poc.entity.BalanceResponse;
import id.bjtg.poc.entity.CurrencyType;

public class Routes extends RouteBuilder {

    private final BalanceResponse balanceResponse = new BalanceResponse();

    public Routes() {
        this.balanceResponse.setResponseCode("2001100");
        this.balanceResponse.setResponseMessage("Request has been processed successfully");
        this.balanceResponse.setReferenceNo("2020102977770000000009");
        this.balanceResponse.setPartnerReferenceNo("2020102900000000000001");
        this.balanceResponse.setAccountNo("115471119");
        this.balanceResponse.setName("JONOMADE");

        BalanceInfo bi = new BalanceInfo();
        bi.setBalanceType("cash");
        CurrencyType amount = new CurrencyType("200000", "IDR");
        HashMap<String, CurrencyType> amountH = new HashMap<>();
        amountH.put("amount", amount);
        HashMap<String, CurrencyType> flamountH = new HashMap<>();
        flamountH.put("floatAmount", amount);
        HashMap<String, CurrencyType> holdHashMap = new HashMap<>();
        holdHashMap.put("holdAmount", amount);
        HashMap<String, CurrencyType> availableBHashMap = new HashMap<>();
        availableBHashMap.put("availableBalance", amount);
        HashMap<String, CurrencyType> ledgMap = new HashMap<>();
        ledgMap.put("currentMultilateralUnit", amount);
        HashMap<String, CurrencyType> curentLimit = new HashMap<>();
        curentLimit.put("amount", amount);

        bi.setAmount(amountH);
        bi.setFloatAmount(flamountH);
        bi.setHoldAmount(holdHashMap);
        bi.setAvailableBalance(availableBHashMap);
        bi.setLedgerBalance(ledgMap);
        bi.setCurrentMultilateralLimit(curentLimit);
        bi.setRegistrationStatusCode("0001");
        bi.setStatus("0001");
        HashMap<String, BalanceInfo> bihsh = new HashMap<>();
        bihsh.put("accountInfo", bi);
        this.balanceResponse.setAccountInfo(bihsh);
    }

    @Override
    public void configure() throws Exception {

        restConfiguration().clientRequestValidation(true).bindingMode(RestBindingMode.json);
        rest("/balance-inquiry")
                .post()
                .consumes("application/json")
                .produces("application/json")
                .type(BalanceRequest.class)
                .outType(BalanceResponse.class)
                .to("direct:findBalanceById");
        //.to("log:DEBUG?showBody=true&showHeaders=true");

        from("direct:findBalanceById")
                .setHeader("X-TIMESTAMP").simple("${date-with-timezone:now:UTC:yyyy-MM-dd'T'HH:mm:ss}")
                .setBody().constant(balanceResponse);
    }
}
