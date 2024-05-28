//Figura 4.15: Incremento.java
//Operadores de pré-incremento e de pós-incremento.
package posepreincremento;

public class PosePreIncremento {

	public static void main(String[] args) {
		
		//demonstra o operador de pós-incremento
		int c = 5;
		System.out.printf("c antes do pós incremento: %d%n",c);// imprime 5
		System.out.printf("pós-incremento de c: %d%n", c++);// imprime 5
		System.out.printf("c depois do pós-incremento: %d%n", c);//imprime 6
		
		System.out.println();
		
		//demonstra o operador de pré-incremento
		c = 5;
		System.out.printf("c antes do pré-incremento: %d%n", c);// imprime 5
		System.out.printf("pré-incremento de c: %d%n", ++c); //imprime 6
		System.out.printf("c depois do pré-incremento %d%n", c);

	}

}
