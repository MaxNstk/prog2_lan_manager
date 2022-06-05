package controllers;

import daos.CategoryDAO;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import models.Category;

/**
 *
 * @author petrix
 */
public class CategoryController {

    private Set<Category> filteredCategories;

    CategoryDAO categoryDAO = new CategoryDAO();

    public Set<Category> getAll() {
        return categoryDAO.getCategories();
    }
    
    
    public Set<Category> filterById(int id) {
        filteredCategories = new HashSet<>();
        Iterator<Category> i = categoryDAO.getCategories().iterator();
            if (i.next().getId() == id) {
                filteredCategories.add(i.next());
            }
        
        return filteredCategories;
    }
    
    public Set<Category> filterByName(String searchParam) {
        filteredCategories = new HashSet<>();
        Iterator<Category> i = categoryDAO.getCategories().iterator();
            if (i.next().getName().contains(searchParam)){
                filteredCategories.add(i.next());
            }
        return filteredCategories;
    }

    public Set<Category> filterByCreditsValue(double searchParam) {
        filteredCategories = new HashSet<>();
        Iterator<Category> i = categoryDAO.getCategories().iterator();
            if (i.next().getCreditsValue() == searchParam){
                filteredCategories.add(i.next());
            }
        return filteredCategories;
    }

}
