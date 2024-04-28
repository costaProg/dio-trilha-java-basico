package SmartTV;

public class SmartTV {
		private boolean ligada;
		private int canal;
		private int volume;
		
		public SmartTV() {
			
		}
		
		public SmartTV(boolean ligada, int canal, int volume) {
			this.ligada = ligada;
			this.canal = canal;
			this.volume = volume;
		}
		
		public boolean getLigada(SmartTV tv) {
			return tv.ligada;
		}
		
		public int getCanal(SmartTV tv) {
			return tv.canal;
		}
		
		public int getVolume(SmartTV tv) {
			return tv.volume;
		}
		
		public void ligarDesligarTV(SmartTV tv, int valor) {
			tv.ligada = valor == 1? true : false;
		}
		
		public void aumentarDiminuirVolume(SmartTV tv, int valor) {
			tv.volume = valor == 1 ? tv.volume + 1 : tv.volume - 1;
		}
				
		public void mudarCanal(SmartTV tv, int valor) {
			tv.canal = valor == 1 ? tv.canal + 1 : valor;
		}
		
}


