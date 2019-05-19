package com.gzeinnumer.antrianpasientv2.server;

import com.gzeinnumer.antrianpasientv2.model.ResponseAntrianAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiServiceAntrian {
    //todo 14
    @GET("Antrian/ListAntrian")
    Call<List<ResponseAntrianAPI>> readAntrianAPI(@Query("dokterID") String dokterID,
                                                  @Query("tgl") String tgl,
                                                  @Query("jam") String jam,
                                                  @Query("rsid") String rsid);
}
