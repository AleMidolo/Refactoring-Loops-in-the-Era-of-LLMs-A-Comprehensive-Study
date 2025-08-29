for (int i = 0; i < count; i++) {
    line = reader2.readLine();
    if (line != null) {
        ReconCandidate candidate = ReconCandidate.loadStreaming(line);
        if (candidate != null) {
            pool(candidate);
        }
    }
}