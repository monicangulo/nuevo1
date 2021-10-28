
package room.room;

import room.room.model.Category;
import org.springframework.data.repository.CrudRepository;


public interface CategoryInterface extends CrudRepository<Category, Integer>{
    
}
