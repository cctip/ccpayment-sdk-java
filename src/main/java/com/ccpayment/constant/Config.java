package com.ccpayment.constant;

// dev http://74ab25e1merchant.cwallet.com/ccpayment/v1
// produce https://admin.ccpayment.com/ccpayment/v1
public class Config {
    public static final String ApiUrl = "http://74ab25e1merchant.cwallet.com/ccpayment/v1";
    public static final String HeaderAppId = "Appid";
    public static final String HeaderTimestamp = "Timestamp";
    public static final String HeaderSign = "Sign";
    public static final long expireDuration = 300L;
}
