package eu.braincluster.neodroidmag001.articles;

/**
 * An article in the diskmag
 */
public class Article
{
    /**
     * The category of the article
     */
    private final Category category;

    /**
     * The title of the article
     */
    private final String title;

    /**
     * The author of the article
     */
    private final String author;

    /**
     * The path of the HTML file of the article
     */
    private final String path;

    public Article(Category category, String title, String author, String path)
    {
        this.category = category;
        this.title = title;
        this.author = author;
        this.path = path;
    }

    public Category getCategory()
    {
        return category;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getPath()
    {
        return path;
    }
}
