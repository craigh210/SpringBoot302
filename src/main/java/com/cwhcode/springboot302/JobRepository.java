package com.cwhcode.springboot302;

import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Long> {
}
