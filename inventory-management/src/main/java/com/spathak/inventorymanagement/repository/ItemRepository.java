package com.spathak.inventorymanagement.repository;

import com.spathak.inventorymanagement.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ItemRepository interface for handling CRUD operations for the Item entity.
 * This interface extends JpaRepository, providing a way to perform various
 * database operations without writing boilerplate code. Spring Data JPA
 * will automatically implement this interface at runtime.
 *
 * The JpaRepository interface requires two parameters:
 * - The type of the entity to handle, in this case, Item.
 * - The data type of the entity's identifier, which is Long for the Item entity.
 */
@Repository // Marks the interface as a Spring Data JPA repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    // By extending JpaRepository, you get many CRUD operations for Item entities,
    // including methods like findAll(), findById(), save(), deleteById(), etc.
    
    // You can define additional custom queries here as needed using Spring Data JPA query methods.
}
