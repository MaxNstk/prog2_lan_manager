package daos;

import interfaces.ICategoryDAO;
import java.util.ArrayList;
import java.util.List;
import models.Category;


public class CategoryDAO implements ICategoryDAO {

    private static final List<Category> categories = new ArrayList<>();

    @Override
    public void createCategory(Category category) {
        categories.add(category);
    }

    @Override
    public List<Category> getCategories() {
        return this.categories;
    }

}
