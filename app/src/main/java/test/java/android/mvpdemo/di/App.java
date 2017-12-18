package test.java.android.mvpdemo.di;

import android.app.Application;
import test.java.android.mvpdemo.di.module.*;
/**
 * Created by ratha on 12/18/2017.
 */

public class App extends Application{

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component=DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .activityModule(new ActivityModule(this))
                .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
