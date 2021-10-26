package com.cookandroid.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtTitle, edtBody;
    Button btn;
    int btnMode = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit);
        edtTitle = findViewById(R.id.edtTitle);
        edtBody = findViewById(R.id.edtBody);
        btn = findViewById(R.id.btn);

        edtTitle.setFocusableInTouchMode(false);
        edtTitle.setFocusable(false);
        edtBody.setFocusableInTouchMode(false);
        edtBody.setFocusable(false);
        btn.setVisibility(View.VISIBLE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (btnMode){
                    case 1:
                        btnMode = 2;
                        edtTitle.setFocusableInTouchMode(true);
                        edtTitle.setFocusable(true);
                        edtBody.setFocusableInTouchMode(true);
                        edtBody.setFocusable(true);
                        btn.setText("저장하기");
                        break;
                    case 2:
                        btnMode = 1;
                        edtTitle.setFocusableInTouchMode(false);
                        edtTitle.setFocusable(false);
                        edtBody.setFocusableInTouchMode(false);
                        edtBody.setFocusable(false);
                        btn.setText("수정하기");
                        break;
                }
            }
        });
    }
}
