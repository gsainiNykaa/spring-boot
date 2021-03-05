package com.example.springboot.Repo;

import com.example.springboot.Entity.Alian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlianRepo extends JpaRepository<Alian, Integer> {

}
