package com.example.greenvoice.Telas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
<<<<<<< HEAD
import android.widget.Toast;

=======
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
import androidx.appcompat.app.AppCompatActivity;
import com.example.greenvoice.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle a) {
        super.onCreate(a);
        setContentView(R.layout.activity_main);



        Button bt = findViewById(R.id.btEntrar);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, ActivityOpcao.class);
                 startActivity(intent);

<<<<<<< HEAD


=======
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
            }
        });

        TextView tx = findViewById(R.id.TxCadastrar);
        tx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AddUserActivity.class);
                startActivity(i);
            }
        });

        Button btAnonimo = findViewById(R.id.btAnonimo);
        btAnonimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityOpcao.class);
                startActivity(intent);
<<<<<<< HEAD

                Toast.makeText(MainActivity.this,  "O modo anônimo não permite o acompanhamento da denúncia!!", Toast.LENGTH_SHORT).show();

=======
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
            }
        });
    }
}
