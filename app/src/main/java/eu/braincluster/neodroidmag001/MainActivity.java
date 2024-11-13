package eu.braincluster.neodroidmag001;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import eu.braincluster.neodroidmag001.articles.Category;
import eu.braincluster.neodroidmag001.databinding.ActivityMainBinding;
import eu.braincluster.neodroidmag001.singletons.GlobalData;

public class MainActivity extends BaseActivity
{
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initializeComponent();
    }

    private void initializeComponent()
    {
        binding.imageButtonCategory01.setOnClickListener(view -> {
            startTableOfContents(Category.EDITORIAL);
        });
    }

    private void startTableOfContents(Category category)
    {
        globalData.reset();
        globalData.setCategory(category);

        var intent = new Intent(this, TableOfContentsActivity.class);

        startActivity(intent);
    }
}
