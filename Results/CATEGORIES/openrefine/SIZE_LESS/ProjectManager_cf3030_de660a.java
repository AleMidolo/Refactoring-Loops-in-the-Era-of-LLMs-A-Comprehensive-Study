for (int index = 0; index < jsonObjArray.size(); index++) {
    if (jsonObjArray.get(index) instanceof ObjectNode) {
        ObjectNode projectMetaJsonObj = (ObjectNode) jsonObjArray.get(index);
        projectMetaJsonObj.put("display", false);
    }
}