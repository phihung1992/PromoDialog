package com.attlib.attpromodialog;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface IAdDialogService {
    @POST("api/advertisement/dialogads")
    Call<AdDialogInfo[]> getAds(@Body AdDialogInfoRequestArgs args);
}
