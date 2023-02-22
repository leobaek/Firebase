package com.leo104.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    EditText editId;
    EditText editPassword;
    Button btnLogin;
    Button btnRegister;
    FirebaseAuth mAuth;
    String primaryKey;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editId = findViewById(R.id.editId);
        editPassword = findViewById(R.id.editPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editId.getText().toString().isEmpty() || editPassword.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "입력 사항을 확인해보세요.", Toast.LENGTH_LONG).show();
                    return;
                }else{
                    primaryKey = editId.getText().toString().trim();
                    Log.i("primaryKey", primaryKey);
                }
                mAuth = FirebaseAuth.getInstance();
                mAuth.signInWithEmailAndPassword(editId.getText().toString().trim(), editPassword.getText().toString().trim())
                        .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {


                                    Intent intent = new Intent(MainActivity.this,StartActivity.class);
                                    Log.i("프라이머리키", primaryKey);
                                    intent.putExtra("primaryKey",primaryKey);
                                    startActivity(intent);
                                    finish();
                                } else {
                                    Toast.makeText(getApplicationContext(), "실패하였습니다.", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);

                startActivity(intent);

            }
        });







    }


}