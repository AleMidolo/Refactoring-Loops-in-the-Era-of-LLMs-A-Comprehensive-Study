for (String collectionName : this.getDatabase(this.database).listCollectionNames()) {
    this.dropCollection(collectionName);
}