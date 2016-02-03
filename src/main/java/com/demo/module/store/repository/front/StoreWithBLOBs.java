package com.demo.module.store.repository.front;

public class StoreWithBLOBs extends Store {
    private String description;

    private String storeStory;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getStoreStory() {
        return storeStory;
    }

    public void setStoreStory(String storeStory) {
        this.storeStory = storeStory == null ? null : storeStory.trim();
    }
}