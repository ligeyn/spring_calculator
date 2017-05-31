package Service.impl;

import Service.LogService;
import Model.Action;
import Repository.ActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    ActionRepository lri;

    @Override
    public void saveAction(Action action){
        lri.save(action);
    }

    @Override
    public List<Action> findAllActions(){

        return lri.findAll();
    }
}
