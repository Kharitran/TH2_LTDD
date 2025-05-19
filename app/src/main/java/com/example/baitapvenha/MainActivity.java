package com.example.baitapvenha;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editten, edittuoi, editemail;
    TextView kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        addControl();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void addControl(){
        editten=findViewById(R.id.editten);
        edittuoi=findViewById(R.id.edittuoi);
        editemail=findViewById(R.id.editemail);
        kq=findViewById(R.id.kq);
    }
    public void kiemtra(View view) {
            if (editemail.getText() == null || editemail.getText().toString().trim().isEmpty()) {
                kq.setText("Email không hợp lệ");
                kq.setTextColor(Color.RED);
            } else if (!editemail.getText().toString().contains("@")) {
                kq.setText("Email không đúng định dạng");
                kq.setTextColor(Color.RED);
            } else {
                kq.setText("Bạn đã nhập email hợp lệ");
                kq.setTextColor(Color.BLUE);

            }

    }



}