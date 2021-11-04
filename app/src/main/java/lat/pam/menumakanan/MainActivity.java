package lat.pam.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("Login");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    public void login() {
        //take input value
        TextView usernameTV = findViewById(R.id.username_text);
        TextView passwordTV = findViewById(R.id.password_text);

        String username = usernameTV.getText().toString();
        String password = passwordTV.getText().toString();

        Log.d("print", "Username = " + username + " dan Password = " + password);
        Log.d("print", String.valueOf(username.equals("irvan")));
        Log.d("print", String.valueOf(password.equals("000000")));
        //Checking username and password
        if (username.equals("irvan") && password.equals("000000")) {
            Log.d("success", "Sukses Login");
            //if true, move activity
            //use Explicit Intent
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
            this.finish();
        }  else {
            Log.d("failed", "Gagal login");
            //if false, show error message
            Toast toast = Toast.makeText(getApplicationContext(), "Username/Password salah ngab", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}