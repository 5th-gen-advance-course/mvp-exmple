package test.java.android.mvpdemo.ui.login;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by Asus on 12/15/2017.
 */

public class LoginInteractorImpl implements LoginInteractor {

    //get data from network Rxandroid
    @Override
    public void login(final String userName, final String password,final LoginResponseInteractor response) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(TextUtils.isEmpty(userName)){
                    response.onUserNameError();
                }else if(TextUtils.isEmpty(password)){
                    response.onPasswordError();
                }else{
                    response.onLoginSuccess();
                }
            }
        }, 1000);


    }
}
