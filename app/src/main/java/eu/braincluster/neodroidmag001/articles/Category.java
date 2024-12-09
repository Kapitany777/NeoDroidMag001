package eu.braincluster.neodroidmag001.articles;

import android.content.Context;

import eu.braincluster.neodroidmag001.R;

/**
 * The category of an article
 */
public enum Category
{
    EDITORIAL,
    SHORT_STORY,
    POEM,
    COMPUTING,
    WORLD,
    RETRO,
    UNKNOWN;

    public static String getCategoryName(Context context, Category category)
    {
        final String categoryName =

                switch (category)
                {
                    case EDITORIAL -> context.getString(R.string.category_editorial);

                    case SHORT_STORY -> context.getString(R.string.category_short_story);

                    case POEM -> context.getString(R.string.category_poem);

                    case COMPUTING -> context.getString(R.string.category_computing);

                    case WORLD -> context.getString(R.string.category_world);

                    case RETRO -> context.getString(R.string.category_retro);

                    case UNKNOWN -> context.getString(R.string.category_unknown);
                };

        return categoryName;
    }
}
