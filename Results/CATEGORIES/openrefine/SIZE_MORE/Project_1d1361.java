for (OverlayModel overlayModel : overlayModels.values()) {
    try {
        overlayModel.onAfterSave(this);
    } catch (Exception e) {
        logger.warn("Error signaling overlay model after saving", e);
    }
}