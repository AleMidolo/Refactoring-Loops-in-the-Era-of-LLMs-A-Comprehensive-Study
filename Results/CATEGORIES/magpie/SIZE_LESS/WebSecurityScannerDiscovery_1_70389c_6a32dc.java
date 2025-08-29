for (ScanRun element : client.listScanRuns(request).iterateAll()) {
    list.add(element);
}