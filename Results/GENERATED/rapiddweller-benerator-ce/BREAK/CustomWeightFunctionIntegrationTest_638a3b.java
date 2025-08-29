products.stream()
        .map(e -> (String) e.get("c"))
        .forEach(val -> {
            switch (val.charAt(0)) {
                case 'a':
                    a++;
                    break;
                case 'b':
                    b++;
                    break;
                case 'c':
                    c++;
                    break;
                default:
                    fail("expected 'a', 'b' or 'c', found: " + val.charAt(0));
            }
        });