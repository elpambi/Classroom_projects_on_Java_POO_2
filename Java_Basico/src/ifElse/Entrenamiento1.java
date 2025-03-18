package ifElse;

public class Entrenamiento1 {
	public static void main(String[] args) {
		int mesNum;
		String mesText = "Marzo";

		switch(mesText) {
		    case "Enero": 
		        mesNum = 1;
		        break;
		    case "Febrero": 
		        mesNum = 2;
		        break;
		    case "Marzo": 
		        mesNum = 3;
		        break;
		    case "Abril": 
		        mesNum = 4;
		        break;
		    case "Mayo": 
		        mesNum = 5;
		        break;        
		    case "Junio": 
		        mesNum = 6;
		        break;
		    case "Julio": 
		        mesNum = 7;
		        break;
		    case "Agosto": 
		        mesNum = 8;
		        break;
		    case "Septiembre": 
		        mesNum = 9;
		        break;
		    case "Octubre": 
		        mesNum = 10;
		        break;
		    case "Noviembre": 
		        mesNum = 11;
		        break;
		    case "Diciembre": 
		        mesNum = 12;
		        break;
		    default:
		        mesNum = 0;
		}
		System.out.println(mesNum);
	}
}
