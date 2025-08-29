IntStream.range(0, hosts.length)
         .forEach(i -> {
                String p = hosts[i];
                if (p.startsWith("*") && p.endsWith("*")) {
                    rHosts[i] = ".*" + Pattern.quote(p.substring(1, p.length() - 2)) + ".*";
                } else if (p.startsWith("*")) {
                    rHosts[i] = ".*" + Pattern.quote(p.substring(1));
                } else if (p.endsWith("*")) {
                    rHosts[i] = Pattern.quote(p.substring(0, p.length() - 1)) + ".*";
                } else {
                    rHosts[i] = Pattern.quote(p);
                }
         });