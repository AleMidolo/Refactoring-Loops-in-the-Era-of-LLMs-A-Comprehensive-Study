overlayModels.values().stream()
    .forEach(overlayModel -> {
        try {
            overlayModel.onAfterSave(this);
        } catch (Exception e) {
            logger.warn("Error signaling overlay model after saving", e);
        }
    });