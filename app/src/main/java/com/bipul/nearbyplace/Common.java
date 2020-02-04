package com.bipul.nearbyplace;

import com.bipul.nearbyplace.remotes.GoogleApiService;
import com.bipul.nearbyplace.remotes.RetrofitBuilder;

public class Common {
    private static final String BASE_URL = "https://maps.googleapis.com/";

    public static GoogleApiService getGoogleApiService() {
        return RetrofitBuilder.builder().create(GoogleApiService.class);
    }
}
