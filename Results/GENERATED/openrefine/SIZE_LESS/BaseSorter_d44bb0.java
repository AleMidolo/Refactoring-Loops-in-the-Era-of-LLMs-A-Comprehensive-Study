IntStream.range(0, keys.length)
         .forEach(i -> keys[i] = makeKey(project, _keyMakers[i], _criteria[i], o, index));