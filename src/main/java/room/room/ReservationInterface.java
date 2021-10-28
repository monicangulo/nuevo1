
package room.room;

import room.room.model.Reservation;
import org.springframework.data.repository.CrudRepository;


public interface ReservationInterface extends CrudRepository<Reservation, Integer> {
    
}
