package com.example.exercises_v1;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExerciseA extends AppCompatActivity {
    LinearLayout textFields;

    Button btn_createNew;
    Button btn_cancelAdd;
    Button btn_okayAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercise_a);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textFields = findViewById(R.id.ll_textFields);
        btn_createNew = findViewById(R.id.btn_createNew);
        btn_cancelAdd = findViewById(R.id.btn_cancelAdd);
        btn_okayAdd = findViewById(R.id.btn_confirmAdd);
    }

    public void openAddOperation(View view) {
        textFields.setVisibility(VISIBLE);
        btn_okayAdd.setVisibility(VISIBLE);
        btn_cancelAdd.setVisibility(VISIBLE);
        btn_createNew.setVisibility(GONE);
    }
}