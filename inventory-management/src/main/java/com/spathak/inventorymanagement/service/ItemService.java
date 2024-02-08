package com.spathak.inventorymanagement.service;

import com.spathak.inventorymanagement.model.Item;
import com.spathak.inventorymanagement.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing inventory items.
 * This class provides methods to perform CRUD operations on items
 * by interfacing with the ItemRepository.
 */
@Service
public class ItemService {

    private final ItemRepository itemRepository;

    // Constructor-based injection of the ItemRepository
    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    /**
     * Retrieves all items from the inventory.
     * 
     * @return a list of all items
     */
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    /**
     * Retrieves a single item by its id.
     * 
     * @param id the id of the item to retrieve
     * @return an Optional containing the item if found, or an empty Optional if not found
     */
    public Optional<Item> getItemById(Long id) {
        return itemRepository.findById(id);
    }

    /**
     * Saves a new item or updates an existing item in the inventory.
     * 
     * @param item the item to save or update
     * @return the saved or updated item
     */
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    /**
     * Updates the information of an existing item.
     * 
     * @param id   the id of the item to update
     * @param item the updated item information
     * @return an Optional containing the updated item if the update was successful, or an empty Optional if not
     */
    public Optional<Item> updateItem(Long id, Item item) {
        return itemRepository.findById(id)
                .map(existingItem -> {
                    existingItem.setName(item.getName());
                    existingItem.setQuantity(item.getQuantity());
                    existingItem.setPrice(item.getPrice());
                    return itemRepository.save(existingItem);
                });
    }

    /**
     * Deletes an item from the inventory by its id.
     * 
     * @param id the id of the item to delete
     * @return true if the item was successfully deleted, false if the item was not found
     */
    public boolean deleteItem(Long id) {
        if (itemRepository.existsById(id)) {
            itemRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}

