
package room.room;

import room.room.model.Client;
import org.springframework.data.repository.CrudRepository;


public interface ClientInterface extends CrudRepository<Client, Integer> {
    
}
