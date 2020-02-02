package com.akademia.asocjacje.repository;

import com.akademia.asocjacje.model.quiz.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<Test,Long> {
    /*CrudRepository lub JpaRepository,
    -dziedziczymy po jednym lub drugim,
     w zalezności od tego jakie metody nas interesują
    -to nic innego jak po prostu zbior metod
    */
}
