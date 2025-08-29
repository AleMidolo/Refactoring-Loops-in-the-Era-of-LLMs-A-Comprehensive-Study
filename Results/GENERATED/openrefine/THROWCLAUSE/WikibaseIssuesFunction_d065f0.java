Manifest result = (Manifest) ((ArrayNode) manifests).stream()
    .map(manifest -> {
        try {
            return ManifestParser.parse((JsonNode) manifest);
        } catch (ManifestException e) {
            return null;
        }
    })
    .filter(parsed -> parsed != null && mediaWikiApiEndpoint.equals(parsed.getMediaWikiApiEndpoint()))
    .findFirst()
    .orElse(null);