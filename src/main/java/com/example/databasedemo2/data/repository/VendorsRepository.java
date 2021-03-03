package com.example.databasedemo2.data.repository;

import com.example.databasedemo2.data.entity.Vendor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorsRepository extends CrudRepository<Vendor, Integer> {
}
