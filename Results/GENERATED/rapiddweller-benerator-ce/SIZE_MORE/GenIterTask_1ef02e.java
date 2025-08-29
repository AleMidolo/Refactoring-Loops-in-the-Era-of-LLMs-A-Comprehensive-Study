statements.stream()
		.map(statement -> statement.execute(context) ? null : statement)
		.filter(statement -> statement instanceof ValidationStatement)
		.findFirst()
		.ifPresent(statement -> {
			success = true;
			this.message = ((MessageHolder) statement).getMessage();
		});