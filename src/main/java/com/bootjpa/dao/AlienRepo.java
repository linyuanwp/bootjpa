package com.bootjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.bootjpa.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>
{
    List<Alien> findByAname(String aname);
    
    List<Alien> findByAidGreaterThan(int aid);
    
    @Query("select a from Alien a where a.aname = ?1 order by a.aname")
    List<Alien> findByAnameSorted(String aname);
}
