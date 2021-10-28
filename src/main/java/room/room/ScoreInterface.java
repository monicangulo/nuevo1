
package room.room;

import room.room.model.Score;
import org.springframework.data.repository.CrudRepository;


public interface ScoreInterface extends CrudRepository<Score, Integer>{
    
}
