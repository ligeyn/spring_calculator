package Repository;

import Model.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ActionRepository extends JpaRepository<Action, Long>{

}
