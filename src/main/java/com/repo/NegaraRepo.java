package com.repo;

import com.entity.Negara;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NegaraRepo extends PagingAndSortingRepository<Negara,Integer> {
}
