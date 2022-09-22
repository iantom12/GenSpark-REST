package com.genspark.SnackManagement.Service;

import com.genspark.SnackManagement.Entity.Snacks;

import java.util.List;

public interface SnackService {

    List<Snacks> getAllSnacks();
    Snacks getSnackByName(String name);
    Snacks addSnack(Snacks snacks);
    Snacks updateSnack(Snacks snacks);
    String deleteSnackByName(String name);
}
