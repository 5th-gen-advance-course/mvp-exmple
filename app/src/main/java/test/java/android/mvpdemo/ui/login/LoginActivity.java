package test.java.android.mvpdemo.ui.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import test.java.android.mvpdemo.R;
import test.java.android.mvpdemo.base.BaseActivity;
import test.java.android.mvpdemo.ui.main.MainActivity;

public class LoginActivity extends BaseActivity implements Presenter.LoginView{

    ProgressBar progressBar;
    EditText etUserName ,etPassword;
    Presenter.LoginPresenter presenter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        progressBar=findViewById(R.id.progressBar);
        etPassword=findViewById(R.id.etPassword);
        etUserName=findViewById(R.id.etUserName);

        //inject presenter object
        presenter= new LoginPresenterImpl(this);

    }


    public void onLogin(View view) {
        presenter.onLoginCredential(etUserName.getText().toString(),etPassword.getText().toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroyView();
    }

    @Override
    public void onShowProgressBar() {
        progressBar.setVisibility(ProgressBar.VISIBLE);
    }

    @Override
    public void onHideProgressBar() {
        progressBar.setVisibility(ProgressBar.INVISIBLE);
    }

    @Override
    public void onUserNameError() {
        etUserName.setError("Error user name");
    }

    @Override
    public void onPasswordError() {
        etPassword.setError("Password error");
    }

    @Override
    public void onLoginSuccess() {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
