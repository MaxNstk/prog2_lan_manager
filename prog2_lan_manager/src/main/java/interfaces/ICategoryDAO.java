package interfaces;

import java.util.Set;
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
     * Retorna todas as categorias cadastradas
     * @return Set<Category>
     */
    public Set<Category> getCategories();
    
}
