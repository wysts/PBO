package bangundatar;

public class Lingkaran extends BangunDatar {
	private float phi, r;
	
	public Lingkaran(float _r) {
		this.r = _r;
		this.phi = 3.14f;
			
	}
	
	public void hitungLuas() {
		this.luas = phi * r * r;
		  	
	}
	
	public void hitungKeliling() {
		this.keliling = 2 * phi * r;
			
	}
		
}
