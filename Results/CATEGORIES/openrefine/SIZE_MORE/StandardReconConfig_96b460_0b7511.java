for (int i = 0; i < jobs.size(); i++) {
    StandardReconJob job = (StandardReconJob) jobs.get(i);
    if (i > 0) {
        stringWriter.write(",");
    }
    stringWriter.write("\"q" + i + "\":");
    stringWriter.write(job.code);
}