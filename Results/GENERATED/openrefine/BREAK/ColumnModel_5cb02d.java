columnGroups.stream()
            .filter(g -> g.startColumnIndex == startColumnIndex && g.columnSpan == span)
            .filter(g -> g.keyColumnIndex != keyColumnIndex)
            .findFirst()
            .ifPresent(columnGroups::remove);