package com.example.databasedemo2.data.repository;

import com.example.databasedemo2.data.entity.Term;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermsRepository extends CrudRepository<Term, Integer> {
}
