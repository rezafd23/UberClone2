package com.example.rezafd.uberclone2.Common;

import com.example.rezafd.uberclone2.Remote.FCMClient;
import com.example.rezafd.uberclone2.Remote.IFCMService;

/**
 * Created by REZAFD on 28/12/2017.
 */

public class Common {

    public static  final String driver_tbl="Drivers";
    public static  final String user_driver_tbl="DriversInformation";
    public static  final String user_rider_tbl="RidersInformation";
    public static  final String pickup_request_tbl="PickupRequest";
    public static final String token_tbl="Tokens";

    public static final String fcmURL ="https://fcm.googleapis.com";

    public static IFCMService getFCMService(){
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }

}
