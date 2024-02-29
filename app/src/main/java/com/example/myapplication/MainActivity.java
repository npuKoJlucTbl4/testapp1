package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onMyButtonClick(View view)
    {
        TextView txt = (TextView) findViewById(R.id.textView2);
        Button btn = (Button) findViewById(R.id.button);
        // выводим сообщение
        Toast.makeText(this, "downloading Trojan", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "downloading WinLocker", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "downloading NutCracker", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "downloading MLP480p.mp4", Toast.LENGTH_SHORT).show();
        txt.setText("Enjoy ur virusez");
        btn.setText("loser");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_blank);

    }
}