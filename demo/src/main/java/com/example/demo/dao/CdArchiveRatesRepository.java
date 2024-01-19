package com.example.demo.dao;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ArchiveCdRates;

@Repository
public interface CdArchiveRatesRepository extends CassandraRepository<ArchiveCdRates, String> {

}
