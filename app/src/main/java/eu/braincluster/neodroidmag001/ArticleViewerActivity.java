package eu.braincluster.neodroidmag001;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.navigation.NavigationBarView;

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

        binding.bottomNavigationViewArticle.setOnItemSelectedListener(item -> {
            final int itemId = item.getItemId();

            if (itemId == R.id.page_main)
            {
                startMainActivity();
                return true;
            }
            else if (itemId == R.id.page_table_of_contents)
            {
                finish();
                return true;
            }

            return false;
        });
    }

    private void displayArticle()
    {
        final var article = getGlobalData().getArticle();

        binding.webViewArticle.loadUrl("file:///android_asset/" + article.getPath());
    }
}