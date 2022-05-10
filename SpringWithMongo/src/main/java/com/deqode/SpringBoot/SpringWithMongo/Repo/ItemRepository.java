package com.deqode.SpringBoot.SpringWithMongo.Repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.deqode.SpringBoot.SpringWithMongo.Model.GroceryItem;

@Repository
public interface ItemRepository extends MongoRepository<GroceryItem, String>{
	
	@Query("{name:'?0'}")
    GroceryItem findItemByName(String name);
    
    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<GroceryItem> findAll(String category);
    
    public long count();

}
