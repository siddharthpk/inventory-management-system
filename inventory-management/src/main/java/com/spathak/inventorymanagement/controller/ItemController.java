package com.spathak.inventorymanagement.controller;

import com.spathak.inventorymanagement.model.Item;
import com.spathak.inventorymanagement.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing inventory items.
 * Handles requests for CRUD operations on items.
 */
@RestController
@RequestMapping("/api/items") // Base URL for all endpoints in this controller
public class ItemController {

    private final ItemService itemService;

    // Constructor-based injection of the ItemService
    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    /**
     * GET endpoint to retrieve all items in the inventory.
     * 
     * @return a list of all items
     */
    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    /**
     * GET endpoint to retrieve a single item by its id.
     * 
     * @param id the id of the item to retrieve
     * @return the item if found, or a 404 Not Found error if not found
     */
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable Long id) {
        return itemService.getItemById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * POST endpoint to add a new item to the inventory.
     * 
     * @param item the item to add
     * @return the created item
     */
    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemService.saveItem(item);
    }

    /**
     * PUT endpoint to update an existing item's information.
     * 
     * @param id   the id of the item to update
     * @param item the updated item information
     * @return the updated item
     */
    @PutMapping("/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable Long id, @RequestBody Item item) {
        return itemService.updateItem(id, item)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * DELETE endpoint to remove an item from the inventory.
     * 
     * @param id the id of the item to delete
     * @return a ResponseEntity indicating the operation result
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        if (itemService.deleteItem(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

