package Service;

import Model.Action;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogService {

    public void saveAction(Action action);
    public List<Action> findAllActions();
}
