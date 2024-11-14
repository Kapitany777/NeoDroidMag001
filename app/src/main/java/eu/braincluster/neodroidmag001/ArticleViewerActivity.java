package eu.braincluster.neodroidmag001;

import android.os.Bundle;
import android.webkit.WebSettings;

import eu.braincluster.neodroidmag001.databinding.ActivityArticleViewerBinding;

public class ArticleViewerActivity extends BaseActivity
{
    private ActivityArticleViewerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        displayArticle();
    }

    @Override
    public void initializeBinding()
    {
        binding = ActivityArticleViewerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    public void initializeComponent()
    {
        var settings = binding.webViewArticle.getSettings();

        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);

        // settings.setTextZoom(settings.getTextZoom() + 50);
    }

    private void displayArticle()
    {
        var article = getGlobalData().getArticle();

        binding.webViewArticle.loadUrl("file:///android_asset/" + article.getPath());
    }
}