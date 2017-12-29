package com.example.rezafd.uberclone2.Remote;

import com.example.rezafd.uberclone2.Model.FCMResponse;
import com.example.rezafd.uberclone2.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by REZAFD on 29/12/2017.
 */

public interface IFCMService {
    @Headers({
            "Content-Type:appication/json",
            "Authorization:key=AAAACBSfODY:APA91bGICRiFLumNBqB_2gLh6y6D5Qte20_vXdAxGNhVwwyGAVoXahcrJckbDkp_j9jpvzXPb5MLTOMsqmbBpmVMallzsHs6pK_pORlzAOgJXw3f-gg4GAwDBTjlc6b2vfbnRCbZCWxe"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
