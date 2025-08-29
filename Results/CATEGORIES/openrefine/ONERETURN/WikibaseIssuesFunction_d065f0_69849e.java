for (JsonNode manifest : (ArrayNode) manifests) {
    try {
        Manifest parsed = ManifestParser.parse(manifest);
        if (mediaWikiApiEndpoint.equals(parsed.getMediaWikiApiEndpoint())) {
            return parsed;
        }
    } catch (ManifestException e) {
    }
}