package eu.braincluster.neodroidmag001.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import eu.braincluster.neodroidmag001.articles.Article;
import eu.braincluster.neodroidmag001.databinding.ListItemArticleBinding;
import eu.braincluster.neodroidmag001.interfaces.INavigable;
import eu.braincluster.neodroidmag001.singletons.GlobalData;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ListItemHolder>
{
    private final INavigable activity;
    private final List<Article> articleList;

    public ArticleAdapter(INavigable activity, List<Article> articleList)
    {
        this.activity = activity;
        this.articleList = articleList;
    }

    @NonNull
    @Override
    public ArticleAdapter.ListItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        var binding = ListItemArticleBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new ArticleAdapter.ListItemHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleAdapter.ListItemHolder holder, int position)
    {
        var article = articleList.get(position);

        holder.bind(article);
    }

    @Override
    public int getItemCount()
    {
        return articleList != null ? articleList.size() : 0;
    }

    public class ListItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private final ListItemArticleBinding binding;

        public ListItemHolder(@NonNull ListItemArticleBinding binding)
        {
            super(binding.getRoot());

            this.binding = binding;
        }

        public void bind(Article article)
        {
            binding.getRoot().setClickable(true);
            binding.getRoot().setOnClickListener(this);

            binding.textViewListTitle.setText(article.getTitle());
            binding.textViewListAuthor.setText(article.getAuthor());
        }

        @Override
        public void onClick(View view)
        {
            var globalData = GlobalData.getInstance();
            var article = articleList.get(getAdapterPosition());

            globalData.setArticle(article);

            activity.nextActivity();
        }
    }
}
