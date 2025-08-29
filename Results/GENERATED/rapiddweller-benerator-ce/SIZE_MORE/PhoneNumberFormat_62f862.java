pattern.chars()
      .mapToObj(i -> (char) i)
      .forEach(c -> {
          switch(c) {
              case 'c':
                  toAppendTo.append(number.getCountryCode());
                  break;
              case 'a':
                  toAppendTo.append(number.getAreaCode());
                  break;
              case 'l':
                  toAppendTo.append(number.getLocalNumber());
                  break;
              default:
                  toAppendTo.append(c);
          }
      });