statementExprs.stream()
        .flatMap(statementExpr -> {
            List<WbSnakExpr> snakExprs = new ArrayList<>(statementExpr.getQualifiers());
            snakExprs.addAll(statementExpr.getReferences().stream()
                    .flatMap(referenceExpr -> referenceExpr.getSnaks().stream())
                    .collect(Collectors.toList());
            return snakExprs.stream();
        })
        .map(WbSnakExpr::getProp)
        .filter(qualifierProperty -> qualifierProperty instanceof WbPropConstant)
        .map(qualifierProperty -> Datamodel.makeWikidataPropertyIdValue(((WbPropConstant) qualifierProperty).getPid()))
        .forEach(properties::add);