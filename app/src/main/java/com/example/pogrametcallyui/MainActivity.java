package com.example.pogrametcallyui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

//import com.example.pogrametcallyui.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         //  setContentView(R.layout.activity_main);

        // Create layout
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        // Create TextView  //

        TextView textView = new TextView(this);
        textView.setText("Hiiiii");
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(30);
        textView.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
        textView.setLayoutParams(params);

        // Create EditText  //

        EditText editText = new EditText(this);
        editText.setLayoutParams(params);
        editText.setHint("Email");

        // Create button //

        Button button = new Button(this);
        button.setText("Button");
        button.getBackground().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_ATOP);
        button.setTextColor(Color.WHITE);
        button.setLayoutParams(params);

        linearLayout.addView(textView);
        linearLayout.addView(editText);
        linearLayout.addView(button);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ActionBar.LayoutParams.FILL_PARENT, ActionBar.LayoutParams.WRAP_CONTENT);
        this.addContentView(linearLayout, layoutParams);

    }
}