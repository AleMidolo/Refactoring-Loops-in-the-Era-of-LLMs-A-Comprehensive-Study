project.columnModel.columnGroups.stream()
        .skip(columnGroupCount)
        .forEach(columnGroup -> {
            _oldColumnGroups.add(columnGroup);
            if (columnGroup.startColumnIndex <= _columnIndex) {
                if (columnGroup.startColumnIndex + columnGroup.columnSpan > _columnIndex) {
                    if (columnGroup.keyColumnIndex == _columnIndex) {
                        if (_removeOriginalColumn) {
                            project.columnModel.columnGroups.remove(columnGroup);
                        } else {
                            project.columnModel.columnGroups.set(project.columnModel.columnGroups.indexOf(columnGroup), new ColumnGroup(columnGroup.startColumnIndex, columnGroup.columnSpan + columnCountChange, columnGroup.keyColumnIndex));
                        }
                    } else {
                        project.columnModel.columnGroups.set(project.columnModel.columnGroups.indexOf(columnGroup), new ColumnGroup(columnGroup.startColumnIndex, columnGroup.columnSpan + columnCountChange, columnGroup.keyColumnIndex < _columnIndex ? columnGroup.keyColumnIndex : (columnGroup.keyColumnIndex + columnCountChange)));
                    }
                }
            } else {
                project.columnModel.columnGroups.set(project.columnModel.columnGroups.indexOf(columnGroup), new ColumnGroup(columnGroup.startColumnIndex + columnCountChange, columnGroup.columnSpan, columnGroup.keyColumnIndex + columnCountChange));
            }
        });