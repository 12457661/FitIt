package com.example.ianhuang1.fitit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class EditProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        Spinner genderSpinner = (Spinner) findViewById(R.id.genderSpinner);

        ArrayAdapter<String> genderAdapter = new ArrayAdapter<String>(EditProfileActivity.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.genders));
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);

        Button saveBtn = (Button)findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nameEditText = (EditText)findViewById(R.id.nameEditText);
                EditText dobEditText = (EditText)findViewById(R.id.dobEditText);
                EditText weightEditText = (EditText)findViewById(R.id.weightEditText);

                String name = nameEditText.getText().toString();
                String dob = dobEditText.getText().toString();
                String weight = weightEditText.getText().toString();



            }
        });
    }
}
