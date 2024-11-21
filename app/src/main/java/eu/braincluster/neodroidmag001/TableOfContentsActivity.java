package eu.braincluster.neodroidmag001;

import android.os.Bundle;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import eu.braincluster.neodroidmag001.adapters.ArticleAdapter;
import eu.braincluster.neodroidmag001.articles.Articles;
import eu.braincluster.neodroidmag001.articles.Category;
import eu.braincluster.neodroidmag001.databinding.ActivityTableOfContentsBinding;
import eu.braincluster.neodroidmag001.interfaces.INavigable;

public class TableOfContentsActivity extends BaseActivity implements INavigable
{
    private ActivityTableOfContentsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        displayInfo();
    }

    @Override
    public void initializeBinding()
    {
        binding = ActivityTableOfContentsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    private void displayInfo()
    {
        var category = getGlobalData().getCategory();

        binding.textViewCategoryName.setText(Category.getCategoryName(category));

        var articleList = Articles.getInstance().getEditorial();

        var adapter = new ArticleAdapter(this, articleList);

        binding.recyclerViewArticles.setItemAnimator(new DefaultItemAnimator());
        // binding.recyclerViewArticles.addItemDecoration(new DividerItemDecoration(TableOfContentsActivity.this, LinearLayoutManager.VERTICAL));
        binding.recyclerViewArticles.setAdapter(adapter);
    }

    @Override
    public void nextActivity()
    {
        startArticleViewerActivity();
    }
}
