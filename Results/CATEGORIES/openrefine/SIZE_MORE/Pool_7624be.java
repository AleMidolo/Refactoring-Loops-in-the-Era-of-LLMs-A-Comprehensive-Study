for (int i = 0; i < count; i++) {
    line = reader2.readLine();
    if (line != null) {
        Recon recon = Recon.loadStreaming(line);
        if (recon != null) {
            pool(recon);
        }
    }
}