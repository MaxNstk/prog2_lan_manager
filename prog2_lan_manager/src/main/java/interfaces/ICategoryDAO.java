package interfaces;

import java.util.List;
import java.util.Set;
import models.Category;


public interface ICategoryDAO {

    public void createCategory(Category category);
    public Category retrieveCategory(int id);
    public List<Category> getCategories();
    
}
