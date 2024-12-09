package eu.braincluster.neodroidmag001;

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
        binding.buttonCategory01.setOnClickListener(view -> startTableOfContents(Category.EDITORIAL));

        binding.buttonCategory02.setOnClickListener(view -> startTableOfContents(Category.SHORT_STORY));

        binding.buttonCategory03.setOnClickListener(view -> startTableOfContents(Category.POEM));

        binding.buttonCategory04.setOnClickListener(view -> startTableOfContents(Category.COMPUTING));

        binding.buttonCategory05.setOnClickListener(view -> startTableOfContents(Category.WORLD));

        binding.buttonCategory06.setOnClickListener(view -> startTableOfContents(Category.RETRO));
    }

    private void startTableOfContents(Category category)
    {
        var globalData = getGlobalData();

        globalData.reset();
        globalData.setCategory(category);

        startTableOfContentsActivity();
    }
}
