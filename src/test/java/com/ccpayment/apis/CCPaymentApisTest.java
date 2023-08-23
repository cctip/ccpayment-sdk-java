package com.ccpayment.apis;

import com.ccpayment.beans.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CCPaymentApisTest {

    public CCPaymentApis getInstance(){
        return CCPaymentApis.getInstance("202306261609051673241961567358982", "caddaa522ad547ebb42fd77e8b759372");
    }

    @Test
    void createOrder() throws Exception {
        CreateOrderParam param = new CreateOrderParam();
        param.setProductPrice("0.07");
        param.setTokenId("2e6cfa7d-f658-455d-89cd-31ebbcfdfa2c");
        param.setRemark("this is a remark");
        param.setMerchantOrderId("putyourorderidhere");
        param.setDenominatedCurrency("TOKEN");
        param.setNotifyUrl("https://xxxxxxxx.com/notify.url");
        param.setOrderValidPeriod(1800);
        param.setCustomValue("custom value");
        CreateOrderResponse resp = getInstance().createOrder(param);
        System.out.println(resp);
    }

    @Test
    void getSupportToken() throws Exception{
       GetSupportTokenResponse resp = getInstance().getSupportToken();
       System.out.println(resp);
    }

    @Test
    void getTokenChain() throws Exception{
        GetTokenChainParam param = new GetTokenChainParam();
        param.setTokenId("217d4c3b-4f84-4416-bf1a-a1d15d7d2f50");
        GetTokenChainResponse resp = getInstance().getTokenChain(param);
        System.out.println(resp);
    }

    @Test
    void checkoutUrl() throws Exception{
        CheckoutUrlParam param = new CheckoutUrlParam();
        param.setProductPrice("1000");
        param.setMerchantOrderId("thisisoutorderno45");
        param.setReturnUrl("https://www.xxxx.com/callback");
        param.setProductName("this is product name");
        param.setNotifyUrl("https://xxxxxxxx.com/notify.url");
        param.setOrderValidPeriod(1800);
        param.setCustomValue("custom value");
        CheckoutUrlResponse resp = getInstance().checkoutUrl(param);
        System.out.println(resp);
    }

    @Test
    void getTokenRate() throws Exception{
        GetTokenRateParam param = new GetTokenRateParam();
        param.setAmount("1000");
        param.setTokenId("e8f64d3d-df5b-411d-897f-c6d8d30206b7");
        GetTokenRateResponse resp = getInstance().getTokenRate(param);
        System.out.println(resp);
    }

    @Test
    void callback() throws Exception {
        String callbackData = "{\"pay_status\":\"success\",\"order_type\":\"Invoice\",\"record_id\":\"202302201213531627642695975706624\",\"order_id\":\"202302200951001627606736097771520\",\"origin_price\":\"25\",\"origin_amount\":\"25\",\"fiat_rate\":\"0.08\",\"paid_amount\":\"10\",\"token_rate\":\"0.08\",\"chain\":\"BSC\",\"contract\":\"0xbA2aE424d960c26247Dd6c32edC70B295c744C43\",\"crypto\":\"DOGE\",\"extend\":{\"invoice_id\":\"202302200950101627606529100480512\",\"user_email\":\"herculew@protonmail.com\",\"merchant_order_id\":\"202211154785795\"}}";
        String appId = "202302010636261620672405236006912";
        long timestamp = 1677653408;
        String sign = "c7c6e98b684f079b71d950ce15033b479a140f6f5aa0dece06eb28f45f04c088";
        CallbackData data = getInstance().callback(callbackData, appId, timestamp, sign);
        System.out.println(data);
    }

    @Test
    void withdraw() throws Exception{
        WithdrawParam param = new WithdrawParam();
        param.setTokenId("2e6cfa7d-f658-455d-89cd-31ebbcfdfa2c");
        param.setAddress("TJXTfwqepEZwTbXgZQoDLgqHt5bfQUN1HX");
        param.setMerchantOrderId("withdraw0002");
        param.setMerchantPaysFee(false);
        param.setValue("2");
        WithdrawResponse resp = getInstance().withdraw(param);
        System.out.println(resp);
    }

    @Test
    void checkUser() throws Exception{
        CheckUserParam param = new CheckUserParam();
        param.setCId("9454818");
        CheckUserResponse resp = getInstance().checkUser(param);
        System.out.println(resp);
    }

    @Test
    void assets() throws Exception{
        AssetsParam param = new AssetsParam();
        param.setTokenId("e8f64d3d-df5b-411d-897f-c6d8d30206b7");
        AssetsResponse resp = getInstance().assets(param);
        System.out.println(resp);
    }

    @Test
    void networkFee() throws Exception{
        NetworkFeeParam param = new NetworkFeeParam();
        param.setTokenId("f137d42c-f3a6-4f23-9402-76f0395d0cfe");
        NetworkFeeResponse resp = getInstance().networkFee(param);
        System.out.println(resp);
    }

    @Test
    void orderInfo() throws Exception{
        OrderInfoParam param = new OrderInfoParam();
        param.setMerchantOrderIds(new String[]{"thisisoutorderno1100"});
        OrderInfoResponse[] resp = getInstance().orderInfo(param);
        System.out.println(Arrays.toString(resp));
    }

    @Test
    void  getSupportCoin() throws Exception {
        GetSupportCoinResponse resp = getInstance().getSupportCoin();
        System.out.println(resp);
    }

    @Test
    void paymentAddress() throws Exception {
        PaymentAddressParam param = new PaymentAddressParam();
        param.setChain("TRX");
        param.setUserId("59586869696");
        param.setNotifyUrl("https://xxxxxxx.com/notify.html");
        PaymentAddressResponse resp = getInstance().paymentAddress(param);
        System.out.println(resp);
    }

    @Test
    void GetChainHeightInfo() throws Exception {
        GetChainHeightInfoResponse[] resp = getInstance().getChainHeightInfo();
        System.out.println(Arrays.toString(resp));
    }
}