package com.netology.romanovaemail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtResult = (TextView) findViewById(R.id.viewResult);
        final TextView txtName = (TextView) findViewById(R.id.txtName);
        final TextView txtEmail = (TextView) findViewById(R.id.txtEmail);

        Button btnOK = (Button) findViewById(R.id.btnOK);
        Button btnCancel = (Button) findViewById(R.id.btnClear);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               boolean check = true;

               if (txtName.getText().length() == 0) {
                   txtResult.setText("Введите ваше имя для оформления подписки");
                   check =  false;
               }
                if (txtEmail.getText().length() == 0) {
                    txtResult.setText("Введите ваш Электронный адрес для оформления подписки");
                    check =  false;
                }

                if (check) {
                    txtResult.setText("Подписка успешно оформлена для пользователя " + txtName.getText() + ", электронный адрес  " + txtEmail.getText());
                }
            }
        });


        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("");
                txtEmail.setText("");
                txtName.setText("");
            }
        });
    }
}