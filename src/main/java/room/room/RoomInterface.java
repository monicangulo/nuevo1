
package room.room;

import room.room.model.Rooms;
import org.springframework.data.repository.CrudRepository;


public interface RoomInterface extends CrudRepository<Rooms, Integer>{
    
}
