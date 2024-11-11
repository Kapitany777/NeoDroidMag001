package eu.braincluster.neodroidmag001.articles;

import java.util.List;

/**
 * The articles of the diskmag
 */
public class Articles
{
    // region Singleton
    private static Articles instance;

    public static synchronized Articles getInstance()
    {
        if (instance == null)
        {
            instance = new Articles();
        }

        return instance;
    }
    // endregion

    private List<Article> articles;

    private Articles()
    {
        createArticles();
    }

    private void createArticles()
    {
        this.articles = List.of(

        );
    }

    public List<Article> getArticles()
    {
        return articles;
    }
}
