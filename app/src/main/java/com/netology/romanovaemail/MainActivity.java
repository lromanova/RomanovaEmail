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
                   txtResult.setText(R.string.empty_name);
                   check =  false;
               }
                if (txtEmail.getText().length() == 0) {
                    txtResult.setText(R.string.empty_mil);
                    check =  false;
                }

                if (check) {
                    txtResult.setText(getString(R.string.res_message) + " " + txtName.getText() + ", " + getString(R.string.res_message_mail) + " " + txtEmail.getText());
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