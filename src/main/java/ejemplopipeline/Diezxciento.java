package ejemplopipeline;

public class Diezxciento {
	
	public int ahorro;
	public int sueldo;
	
	public Diezxciento(){
		ahorro = 20000000;
		sueldo = 700000;
	}
	
	public Diezxciento(int ahorro, int sueldo) {
		this.ahorro = ahorro;
		this.sueldo = sueldo;
	}
	
	public int diezxciento(){
		double diezxciento = ahorro * 0.1;
		System.out.println(diezxciento);
		return (int) diezxciento;
	}
	
	public int impuesto(int sueldo){
		int impuesto = 0;
		if (sueldo >= 1500000 && sueldo < 2500000) {
			impuesto = (int) (sueldo * 0.08);
			} else if (sueldo >= 2500000 && sueldo < 3000000) {
				impuesto = (int) (sueldo * 0.135);
				}else if (sueldo >= 3000000 && sueldo < 4000000) {
					impuesto = (int) (sueldo * 0.23);
					}else if (sueldo >= 4000000 && sueldo < 5000000) {
						impuesto = (int) (sueldo * 0.340);
						}else if (sueldo >= 5000000 && sueldo < 6000000) {
							impuesto = (int) (sueldo * 0.35);
						}else {
							impuesto = 0;
						}
		return impuesto;
	}
	
	public int saldoAhorro() {
		double noventaxciento = ahorro * 0.9;
		return (int) noventaxciento;
	}

}