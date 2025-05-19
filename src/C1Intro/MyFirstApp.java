public class MyFirstApp{
	public static void main(String args[]){
		System.out.println("I Rule!");
		System.out.println("The World");
		//1 Para Hacer Algo
		int x = 3;
		String name = "Dirk";
		x = x * 17;
		System.out.println("x es " + x);
		double d = Math.random();
		//This is a comment
		//2 Bucles For y While
		while(x > 12){
			x = x - 1;
		}
		for(int i = 0;i < 10; i = i + 1){
			System.out.println("i es ahora" + i);
		}
		
		//3 Condicionales if/else o un operador ternario
		if(x == 10){
			System.out.println("x debe ser 10");
		}else{
			System.out.println("x no debe ser 10");

		}
		
		if((x < 3) && (name.equals("Dirk"))){
			System.out.println("suavemente");

		}
		System.out.println("Esta linea se ejecuta sin importar");
		
		

		
	}
}