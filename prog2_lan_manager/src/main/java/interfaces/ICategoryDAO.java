package interfaces;

import java.util.List;
import models.Category;

/**
 *
 * @author petrix
 */
public interface ICategoryDAO {

    /**
     * Adiciona a nova categoria criada
     * @param c 
     */
    public void createCategory(Category c);

   /**
    * Retorna a categoria correspondente ao ID
    * @param id 
    */
    public void retrieveCategory (int id);

    /**
     * Retorna todas as categorias cadastradas
     * @return List<Category>
     */
    public List<Category> getCategories();
    
}
