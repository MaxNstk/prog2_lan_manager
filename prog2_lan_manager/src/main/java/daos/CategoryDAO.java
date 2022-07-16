package daos;

import interfaces.ICategoryDAO;
import java.util.HashSet;
import java.util.Set;
import models.Category;

/**
 *
 * @author petrix
 */
public class CategoryDAO implements ICategoryDAO {

    private static final Set<Category> categories = new HashSet<>();

    @Override
    public void createCategory(Category category) {
        categories.add(category);
    }

    @Override
    public Set<Category> getCategories() {
        return this.categories;
    }

}
