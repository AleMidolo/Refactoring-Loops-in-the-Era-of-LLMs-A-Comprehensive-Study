return StreamSupport.stream(((ArrayNode) manifests).spliterator(), false)
        .map(manifest -> {
            try {
                return ManifestParser.parse((JsonNode) manifest);
            } catch (ManifestException e) {
                return null;
            }
        })
        .filter(Objects::nonNull)
        .filter(parsed -> mediaWikiApiEndpoint.equals(parsed.getMediaWikiApiEndpoint()))
        .findFirst()
        .orElse(null);