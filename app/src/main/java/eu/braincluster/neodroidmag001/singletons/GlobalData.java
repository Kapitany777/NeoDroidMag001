package eu.braincluster.neodroidmag001.singletons;

import eu.braincluster.neodroidmag001.articles.Article;
import eu.braincluster.neodroidmag001.articles.Category;

public class GlobalData
{
    // region Singleton
    private static GlobalData instance;

    public static synchronized GlobalData getInstance()
    {
        if (instance == null)
        {
            instance = new GlobalData();
        }

        return instance;
    }
    // endregion

    // region Private fields
    private Category category;

    private Article article;
    // endregion

    // region Private constructor
    private GlobalData()
    {
        reset();
    }
    // endregion

    public void reset()
    {
        this.setCategory(Category.UNKNOWN);
        this.setArticle(null);
    }

    // region Getters and setters
    public Category getCategory()
    {
        return category;
    }

    public void setCategory(Category category)
    {
        this.category = category;
    }

    public Article getArticle()
    {
        return article;
    }

    public void setArticle(Article article)
    {
        this.article = article;
    }
    // endregion
}
