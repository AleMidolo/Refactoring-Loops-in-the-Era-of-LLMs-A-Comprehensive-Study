for (Map.Entry<String, Object> entry : this.getComponents().entrySet()) {
    Object thisValue = entry.getValue();
    Object thatValue = that.getComponent(entry.getKey());
    if (!equalIgnoringDescriptor(thisValue, thatValue))
        return false;
}