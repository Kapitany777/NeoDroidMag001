package eu.braincluster.neodroidmag001.articles;

import java.util.List;
import java.util.stream.Collectors;

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
                new Article(Category.EDITORIAL, "Bevezető", "Kapitány", "editorial/kapitany_bevezeto.html"),
                new Article(Category.EDITORIAL, "A programról", "Kapitány", "editorial/kapitany_bevezeto.html"),
                new Article(Category.EDITORIAL, "Készítők", "Kapitány", "editorial/kapitany_bevezeto.html")
        );
    }

    public List<Article> getArticles()
    {
        return articles;
    }

    public List<Article> getArticlesByCategory(Category category)
    {
        return articles.stream()
                .filter(a -> a.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    public List<Article> getEditorial()
    {
        return getArticlesByCategory(Category.EDITORIAL);
    }
}
