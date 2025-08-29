_dimensions.stream()
    .forEach(d -> {
        if (d.next == d.values.size()) {
            d.next = 0;
            int index = _dimensions.indexOf(d);
            if (index < _dimensions.size() - 1) {
                _dimensions.get(index + 1).next++;
            }
        }
        cells.add(0, d.values.get(d.next));
        if (_dimensions.indexOf(d) == 0) {
            d.next++;
        }
    });