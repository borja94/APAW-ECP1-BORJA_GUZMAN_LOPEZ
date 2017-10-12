package es.upm.miw.apaw.ecp1.borja.guzman.strategy;

public class Context {
	 private Operation operation;

	   public Context(Operation strategy){
	      this.operation = strategy;
	   }

	   public int executeStrategy(int num1, int num2){
	      return operation.doOperation(num1, num2);
	   }
}
