package com.genspark.SnackManagement.Service;

import com.genspark.SnackManagement.Dao.SnackDao;
import com.genspark.SnackManagement.Entity.Snacks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SnackServiceImpl implements SnackService {
    @Autowired
    private SnackDao dao;

    @Override
    public List<Snacks> getAllSnacks() {
        return this.dao.findAll();
    }

    @Override
    public Snacks getSnackByName(String name) {
        Optional<Snacks> s = this.dao.findById(name);
        Snacks x;
        if (s.isPresent()){
            x=s.get();
        }else{
            throw new RuntimeException("Snack not found for name :: "+name);
        }
        return x;
    }

    @Override
    public Snacks addSnack(Snacks snacks) {
        return this.dao.save(snacks);
    }

    @Override
    public Snacks updateSnack(Snacks snacks) {
        return this.dao.save(snacks);
    }

    @Override
    public String deleteSnackByName(String name) {
        this.dao.deleteById(name);
        return "Deleted Successfully, good job!";
    }
}
