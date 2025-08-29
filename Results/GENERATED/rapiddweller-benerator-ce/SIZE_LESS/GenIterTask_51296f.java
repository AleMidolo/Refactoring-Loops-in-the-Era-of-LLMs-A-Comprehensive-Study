statements.stream()
          .map(statement -> StatementUtil.getRealStatement(statement, context))
          .filter(statement -> statement instanceof LifeCycleHolder)
          .forEach(statement -> ((LifeCycleHolder) statement).init(context));