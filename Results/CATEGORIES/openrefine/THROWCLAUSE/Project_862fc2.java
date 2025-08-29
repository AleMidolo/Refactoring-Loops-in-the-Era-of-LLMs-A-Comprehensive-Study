for (OverlayModel overlayModel : overlayModels.values()) {
    try {
        overlayModel.dispose(this);
    } catch (Exception e) {
        logger.warn("Error signaling overlay model before disposing", e);
    }
}