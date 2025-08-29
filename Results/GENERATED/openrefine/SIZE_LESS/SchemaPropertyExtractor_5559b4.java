referenceExprs.stream()
    .map(WbReferenceExpr::getSnaks)
    .forEach(snakExprs::addAll);