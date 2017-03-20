package test.example.x_ercht;

import android.app.Application;

import com.jakewharton.threetenabp.AndroidThreeTen;

import timber.log.Timber;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidThreeTen.init(this);
        Timber.plant(new Timber.DebugTree());
    }
}
