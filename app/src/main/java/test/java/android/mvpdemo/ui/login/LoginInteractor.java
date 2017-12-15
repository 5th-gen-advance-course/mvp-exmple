package test.java.android.mvpdemo.ui.login;

/**
 * Created by Asus on 12/15/2017.
 */

public interface LoginInteractor {

    interface LoginResponseInteractor{
        void onUserNameError();
        void onPasswordError();
        void onLoginSuccess();
}

    //get network (RXandroid ,retrofit)
    void login(String userName,String password, LoginResponseInteractor response);

}
