
package room.room;

import room.room.model.Message;
import org.springframework.data.repository.CrudRepository;


public interface MessageInterface extends CrudRepository<Message, Integer>{
    
}
