for (Entry<String, Pattern> entry : _issuesMap.entrySet()) {
    if (entry.getValue().matcher(str).find()) {
        emitWarning(entry.getKey(), str);
    }
}