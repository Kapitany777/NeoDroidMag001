package eu.braincluster.neodroidmag001;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import eu.braincluster.neodroidmag001.databinding.ActivityMainBinding;
import eu.braincluster.neodroidmag001.databinding.ActivityTableOfContentsBinding;

public class TableOfContentsActivity extends AppCompatActivity
{
    private ActivityTableOfContentsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        binding = ActivityTableOfContentsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
