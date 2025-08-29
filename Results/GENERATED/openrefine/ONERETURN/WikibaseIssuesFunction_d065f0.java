Manifest result = ((ArrayNode) manifests).elements().stream()
                .map(manifest -> {
                    try {
                        return ManifestParser.parse(manifest);
                    } catch (ManifestException e) {
                        return null;
                    }
                })
                .filter(parsed -> parsed != null && mediaWikiApiEndpoint.equals(parsed.getMediaWikiApiEndpoint()))
                .findFirst().orElse(null);