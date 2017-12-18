package test.java.android.mvpdemo.di;

import javax.inject.Singleton;

import dagger.Component;
import test.java.android.mvpdemo.di.module.ActivityModule;
import test.java.android.mvpdemo.di.module.ApplicationModule;
import test.java.android.mvpdemo.ui.login.LoginActivity;
import test.java.android.mvpdemo.ui.main.MainActivity;

/**
 * Created by ratha on 12/18/2017.
 */

@Singleton
@Component(modules = {ApplicationModule.class, ActivityModule.class})
public interface ApplicationComponent {

    void inject(MainActivity target);
    void inject(LoginActivity target);
}
