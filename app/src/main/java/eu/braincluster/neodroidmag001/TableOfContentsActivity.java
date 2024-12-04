package eu.braincluster.neodroidmag001;

import android.os.Bundle;

import androidx.recyclerview.widget.DefaultItemAnimator;

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

    @Override
    public void initializeComponent()
    {
        binding.bottomNavigationViewArticle.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.page_main)
            {
                startMainActivity();
                return true;
            }

            return false;
        });
    }

    private void displayInfo()
    {
        var category = getGlobalData().getCategory();

        binding.textViewCategoryName.setText(Category.getCategoryName(this, category));

        var articleList = Articles.getInstance().getArticlesByCategory(category);

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
