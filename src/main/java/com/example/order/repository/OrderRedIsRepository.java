package com.example.order.repository;

import com.example.order.domain.entity.RedisOrder;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;


public interface OrderRedIsRepository extends ListCrudRepository<RedisOrder, String> {


    List<RedisOrder> findByOwnerId(Long ownerId);
}
