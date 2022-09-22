package com.genspark.SnackManagement.Dao;

import com.genspark.SnackManagement.Entity.Snacks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SnackDao extends JpaRepository<Snacks,String> {
}
