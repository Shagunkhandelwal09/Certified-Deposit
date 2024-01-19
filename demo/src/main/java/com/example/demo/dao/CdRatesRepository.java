package com.example.demo.dao;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CdRates;

@Repository
public interface CdRatesRepository extends CassandraRepository<CdRates, String>{

}
