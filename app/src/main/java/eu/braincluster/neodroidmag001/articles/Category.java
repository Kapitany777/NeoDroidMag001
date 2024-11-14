package eu.braincluster.neodroidmag001.articles;

/**
 * The category of an article
 */
public enum Category
{
    EDITORIAL,
    SHORT_STORY,
    POEM,
    UNKNOWN;

    public static String getCategoryName(Category category)
    {
        String categoryName =

                switch (category)
                {
                    case EDITORIAL -> "Bevezető";

                    case SHORT_STORY -> "Novellák";

                    case POEM -> "Versek";

                    case UNKNOWN -> "Ismeretlen";
                };

        return categoryName;
    }
}
