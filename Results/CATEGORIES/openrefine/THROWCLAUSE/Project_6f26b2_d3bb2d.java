for (OverlayModel overlayModel : overlayModels.values()) {
    try {
        overlayModel.onBeforeSave(this);
    } catch (Exception e) {
        logger.warn("Error signaling overlay model before saving", e);
    }
}