package com.example.instaclone;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("d7CmO0hFoCKGYbFT4GtHPf6bkX5vpBM18Abtxb5c")
                .clientKey("FDBgLF0teMYH9grhByhAHmFz9SsJNglNjpV5Ixxl")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
