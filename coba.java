public class coba{
	public static void main(String[] args){
		double[] angka = {40,42,47,48,55,56,65,75};
		double hasil;
		int counter = 0;
		
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				for(int k=0; k<8; k++){
					hasil = (angka[5]+angka[i]+angka[j]+angka[k])/4.0;
					counter++;
					System.out.println(counter+" "+hasil);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
