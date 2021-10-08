package edu.cnm.deepdive.animals;

import android.app.Application;
import com.squareup.picasso.Picasso;

public class AnimalsApplication extends Application {

  //Implementing use of Picasso in our App.
  @Override
  public void onCreate() {
    super.onCreate();
    Picasso.setSingletonInstance(
        new Picasso.Builder(this)
            .loggingEnabled(BuildConfig.DEBUG)
            .build()
    );
  }
}
