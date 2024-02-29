package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.databinding.FragmentBlankBinding;

public class MainActivity extends AppCompatActivity {
    private FragmentBlankBinding binding;

    public void onMyButtonClick(View view)
    {
        binding.textView2.setText("Enjoy ur virusez");
        binding.button.setText("loser");
        binding.button.setTextSize(40);
        // выводим сообщение
        Toast.makeText(this, "downloading Trojan", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "downloading WinLocker", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "downloading NutCracker", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "downloading MLP480p.mp4", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentBlankBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
}