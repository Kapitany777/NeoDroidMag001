package eu.braincluster.neodroidmag001;

import android.os.Bundle;

import eu.braincluster.neodroidmag001.databinding.ActivityArticleViewerBinding;

public class ArticleViewerActivity extends BaseActivity
{
    private ActivityArticleViewerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initializeBinding()
    {
        binding = ActivityArticleViewerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}