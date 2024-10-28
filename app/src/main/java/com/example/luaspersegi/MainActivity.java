package com.example.luaspersegi;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout textLayoutPanjang, textLayoutLebar;
    private TextInputEditText inputPanjang, inputLebar;
    private MaterialButton btnHitung;
    private TextView textHasil;
    private int panjang, lebar, luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textLayoutPanjang = findViewById(R.id.text_layout_panjang);
        textLayoutLebar = findViewById(R.id.text_layout_lebar);
        inputPanjang = findViewById(R.id.input_panjang);
        inputLebar = findViewById(R.id.input_lebar);
        btnHitung = findViewById(R.id.btn_hitung);
        textHasil = findViewById(R.id.text_hasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panjang = Integer.parseInt(inputPanjang.getText().toString());
                lebar = Integer.parseInt(inputLebar.getText().toString());
                luas = panjang * lebar;
                textHasil.setText("Luas= "+luas);
            }
        });
    }
}