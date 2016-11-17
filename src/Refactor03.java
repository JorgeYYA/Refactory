
public class Refactor03 {

	private static int colPeonNegra;
	private static int filPeonNegra;
	private static int colPeonBlanca;
	private static int filPeonBlanca;
	private static int sigmovColPeonNegra;
	private static int sigmovFilPeonNegra;
	
	public Refactor03(){
		colPeonNegra=1;
		filPeonNegra=3;
		colPeonBlanca=1;
		filPeonBlanca=3;
	}
	public static void main(String[] args) {
		//Calculamos el movimiento de un peón en un tablero de ajedrez
		//Para una partida con más peones
		//Juegan negras en la parte inferior del tablero
		
		
		//Calculamos siguiente movimieto
		if(comparaMovimientoMasMas()){
			//Me como blanca colocado en diagonal derecha
			sigmovColPeonNegra=colPeonNegra++;
			sigmovColPeonNegra=filPeonNegra++;
		}else if(comparaMovimientoMasMenos()){
			//Este movimiento está mal
			//Me como blanca colocado en diagonal izda
			sigmovColPeonNegra=colPeonNegra++;
			sigmovColPeonNegra=filPeonNegra--;
		}else if((colPeonNegra++!=colPeonBlanca)){
			//Muevo adelante
			sigmovColPeonNegra=colPeonNegra++;
		}
	}
	
	public static boolean comparaMovimientoMasMas()
	{
		boolean resultado;
		if((colPeonNegra++==colPeonBlanca)&&(filPeonNegra++==filPeonBlanca)){
			resultado=true;
		}
		else{
			resultado=false;
		}
		return resultado;
	}
	public static boolean comparaMovimientoMasMenos()
	{
		boolean resultado;
		if((colPeonNegra++==colPeonBlanca)&&(filPeonNegra--==filPeonBlanca)){
			resultado=true;
		}
		else{
			resultado=false;
		}
		return resultado;
	}
}
