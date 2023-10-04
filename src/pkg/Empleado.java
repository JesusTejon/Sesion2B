package pkg;

public class Empleado {
	
	public enum TipoEmpleado{Vendedor, Encargado, otro};
	
	public static float CalculaNominaEmpleado(TipoEmpleado tipo,float ventasMes, float horasExtra) {
		
		float sueldo=0;
		
		//sueldo base
		if(tipo==TipoEmpleado.Vendedor) {
			
			sueldo=2000;
			
		}else if(tipo==TipoEmpleado.Encargado) 
			sueldo=2500;
		else return -1;
			
		
		//calculo por ventas del mes
		if(ventasMes>=1500) sueldo=sueldo+200;
		else if(ventasMes>=1000) sueldo=sueldo+100;
		else if(ventasMes<0) return -1;
		
		//horas extras
		if(horasExtra>=0)
		sueldo=sueldo+30*horasExtra;
		else return -1;
		
		//devuelvo el sueldo
		return sueldo;
	}
	
	public static float calculoNominaNeta(float nominaBruta) {
		float retencion=0f;
		
		//calculo de la retencion si la hay
		if(nominaBruta>2500)
			retencion=0.18f;
		else if(nominaBruta>2100)
			retencion=0.15f;
		else if(nominaBruta<0) return -1;
		
		//devuelvo el calculo de la nomina neta
		return nominaBruta*(1-retencion);
		
	}
}
