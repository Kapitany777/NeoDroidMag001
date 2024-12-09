package eu.braincluster.neodroidmag001.articles;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The articles of the diskmag
 */
public final class Articles
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
                new Article(Category.EDITORIAL, "Bevezető Kapitánytól", "Kapitány", "editorial/kapitany_bevezeto.html"),
                new Article(Category.EDITORIAL, "Az újság nevéről", "Szerkesztőség", "editorial/szerk_ujsag_neverol.html"),
                new Article(Category.EDITORIAL, "E szám készítői", "Szerkesztőség", "editorial/szerk_keszitok.html"),
                new Article(Category.EDITORIAL, "Eddigi munkatársaink", "Szerkesztőség", "editorial/szerk_eddigi_keszitok.html"),

                new Article(Category.SHORT_STORY, "Szakítás", "Jimmy Cartwright", "shortstories/jimmy_szakitas.html"),

                new Article(Category.COMPUTING, "A mai modern világban", "Homoergaster", "computing/homoergaster_mai_modern_vilagban.html"),

                new Article(Category.RETRO, "Matt Barton: Dungeons and Desktops", "Kapitány", "retro/kapitany_dungeons_and_desktops.html"),
                new Article(Category.RETRO, "Matt Barton: Dungeons and Desktops 2.", "Kapitány", "retro/kapitany_dungeons_and_desktops.html")
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
}
