package controllers;

import daos.CategoryDAO;
import java.util.ArrayList;
import java.util.List;
import models.Category;

/**
 *
 * @author petrix
 */
public class CategoryController {

    private List<Category> filteredCategories;

    CategoryDAO categoryDAO = new CategoryDAO();

    public List<Category> getAll() {
        return categoryDAO.getCategories();
    }

    public List<Category> filterById(int id) {
        filteredCategories = new ArrayList<>();
        for (Category cat : categoryDAO.getCategories()) {
            if (cat.getId() == (id)) {
                filteredCategories.add(cat);
            }
        }
        return filteredCategories;
    }

    public List<Category> filterByDescription(String searchParam) {
        filteredCategories = new ArrayList<>();
        for (Category cat : categoryDAO.getCategories()) {
            if (cat.getDescription().contains(searchParam)) {
                filteredCategories.add(cat);
            }
        }
        return filteredCategories;
    }

    public List<Category> filterByCreditsValue(double searchParam) {
        filteredCategories = new ArrayList<>();
        for (Category cat : categoryDAO.getCategories()) {
            if (cat.getCreditsValue() == searchParam) {
                filteredCategories.add(cat);
            }
        }
        return filteredCategories;
    }

}
