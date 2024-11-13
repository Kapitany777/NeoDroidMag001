package eu.braincluster.neodroidmag001;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import eu.braincluster.neodroidmag001.adapters.ArticleAdapter;
import eu.braincluster.neodroidmag001.articles.Articles;
import eu.braincluster.neodroidmag001.databinding.ActivityMainBinding;
import eu.braincluster.neodroidmag001.databinding.ActivityTableOfContentsBinding;

public class TableOfContentsActivity extends AppCompatActivity implements INavigable
{
    private ActivityTableOfContentsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        binding = ActivityTableOfContentsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        displayInfo();
    }

    private void displayInfo()
    {
        var articleList = Articles.getInstance().getEditorial();

        var adapter = new ArticleAdapter(this, articleList);

        binding.recyclerViewArticles.setItemAnimator(new DefaultItemAnimator());
        binding.recyclerViewArticles.addItemDecoration(new DividerItemDecoration(TableOfContentsActivity.this, LinearLayoutManager.VERTICAL));
        binding.recyclerViewArticles.setAdapter(adapter);
    }

    @Override
    public void nextActivity()
    {

    }
}
