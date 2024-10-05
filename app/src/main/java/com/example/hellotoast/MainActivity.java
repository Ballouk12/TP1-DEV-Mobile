package com.example.hellotoast;

import static android.app.ProgressDialog.show;
import static java.lang.Integer.parseInt;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import android.widget.Toast;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void displayMessage (View view ) {
        Toast.makeText(MainActivity.this,"Hello Toast", Toast.LENGTH_LONG).show();
    }
    public void increment (View view) {
        TextView output = findViewById(R.id.DisplayedValue) ;
        if (output!=null) {
            try {
                int currentValue = Integer.parseInt(output.getText().toString()) ;
                output.setText(String.valueOf(++currentValue));
            } catch (NumberFormatException e) {
                output.setText(String.valueOf(0));
            }

        }
    }

}