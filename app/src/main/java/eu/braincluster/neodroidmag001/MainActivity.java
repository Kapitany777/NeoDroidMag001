package eu.braincluster.neodroidmag001;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import eu.braincluster.neodroidmag001.databinding.ActivityMainBinding;
import eu.braincluster.neodroidmag001.databinding.ActivityMainMenuBinding;

public class MainActivity extends BaseActivity
{
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initializeBinding()
    {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    public void initializeComponent()
    {
        binding.main.setOnClickListener(view -> {
            startMainMenuActivity();
        });

        binding.buttonStart.setOnClickListener(view -> {
            startMainMenuActivity();
        });
    }
}