package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ZXmTmQgdAleEX5uT2nzHTCyvq5ajQ3ZHpTwljOr3")
                .clientKey("XMoHBohk1ytL3V2s0Q1gxXLNG1cCffndP94pIOgQ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
