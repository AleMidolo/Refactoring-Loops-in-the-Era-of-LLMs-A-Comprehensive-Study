for (int i = 0; i < sampleSize; i++) {
    stmt.setLong(1, i);
    stmt.setString(2, getNextUeId());
    stmt.setDate(3, getNextStartDate());
    stmt.setDate(4, getNextEndDate());
    stmt.setInt(5, rand.nextInt());
    stmt.setInt(6, rand.nextInt());
    stmt.setInt(7, rand.nextInt(10));
    stmt.setInt(8, getMCC());
    stmt.setInt(9, getMNC());
    stmt.setInt(10, rand.nextInt(100));
    stmt.setString(11, getNextIMEI());
    stmt.addBatch();
    if (i % batchSize == 0) {
        stmt.executeBatch();
        conn.commit();
        System.out.println("Batch " + (counter++) + " executed successfully");
    }
}