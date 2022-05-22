package daos;

import interfaces.ICategoryDAO;
import java.util.ArrayList;
import java.util.List;
import models.Category;

/**
 *
 * @author petrix
 */
public class CategoryDAO implements ICategoryDAO {

    private static final List<Category> categories = new ArrayList<>();

    @Override
    public void createCategory(Category c) {
        categories.add(c);
    }

    @Override
    public void retrieveCategory(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Category> getCategories() {
        return this.categories;
    }

}
