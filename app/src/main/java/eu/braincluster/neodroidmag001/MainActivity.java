package eu.braincluster.neodroidmag001;

import android.content.Intent;
import android.os.Bundle;

import eu.braincluster.neodroidmag001.articles.Category;
import eu.braincluster.neodroidmag001.databinding.ActivityMainBinding;

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
        binding.buttonCategory01.setOnClickListener(view -> {
            startTableOfContents(Category.EDITORIAL);
        });
    }

    private void startTableOfContents(Category category)
    {
        var globalData = getGlobalData();

        globalData.reset();
        globalData.setCategory(category);

        var intent = new Intent(this, TableOfContentsActivity.class);

        startActivity(intent);
    }
}
