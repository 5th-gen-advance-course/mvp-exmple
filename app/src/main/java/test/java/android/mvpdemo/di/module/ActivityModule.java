package test.java.android.mvpdemo.di.module;

import android.app.Application;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import test.java.android.mvpdemo.ui.login.LoginInteractor;
import test.java.android.mvpdemo.ui.login.LoginInteractorImpl;
import test.java.android.mvpdemo.ui.login.LoginPresenterImpl;
import test.java.android.mvpdemo.ui.login.Presenter;
import test.java.android.mvpdemo.ui.main.adapter.CategoryAdapter;
import test.java.android.mvpdemo.ui.main.adapter.CategoryViewHolder;

/**
 * Created by ratha on 12/18/2017.
 */

@Module
public class ActivityModule {

    private Application context;

    public ActivityModule(Application context){
        this.context=context;
    }

    @Provides
    @Singleton
    public Context getContext(){
        return context;
    }

    @Provides
    @Singleton
    public Presenter.LoginPresenter provideLoginPresenter(LoginInteractor loginInteractor){
        return new LoginPresenterImpl(loginInteractor);
    }
    @Provides
    @Singleton
    public LoginInteractor provideLoginInteractor(){
        return  new LoginInteractorImpl();
    }

    @Provides
    @Singleton
    public CategoryAdapter provideCategory(){
        return new CategoryAdapter(context);
    }

}
