for (int i = 0; i < count; i++) {
    String line = reader.readLine();
    Recon recon = Recon.loadStreaming(line);
    recons.put(recon.id, recon);
}