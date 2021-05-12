public class Cronometro {
	
	int hour;
	int minutes;
	int seconds;
	String str; 
	

	public Cronometro() {
		
		this.str = ""; 
		this.hour = 0;
		this.minutes = 0;
		this.seconds = 0;
		
	}
	
	//Set all methods:
	
	public String start() { 
		 
		// When the hour will be 60, the watch will stop himself giving a text massage to user
		while(this.hour < 60) {
			
			// Check minutes
			if(this.minutes < 60) {
				
				// Check seconds
				if(this.seconds < 60) {
					this.seconds++;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				} else {
					this.minutes++;
					this.seconds = 0; 
				}
				
			} else {
				this.hour++;
				this.minutes = 0; 
				this.seconds = 0;
			}

			if(this.hour < 10 && this.minutes < 10 && this.seconds < 10) {
				System.out.println("0" + this.hour + ":0" + this.minutes + ":0" + this.seconds);
				
			} else if(this.hour < 10 && this.minutes < 10) {
				System.out.println("0" + this.hour + ":0" + this.minutes + ":" + this.seconds);

			} else if(this.hour < 10) {
				System.out.println("0" + this.hour + ":" + this.minutes + ":" + this.seconds);

			} else if(this.minutes < 10 && this.seconds < 10) {
				System.out.println(this.hour + ":0" + this.minutes + ":0" + this.seconds);

			} else if(this.minutes < 10) {
				System.out.println(this.hour + ":0" + this.minutes + ":" + this.seconds);

			} else if(this.seconds < 10) {
				System.out.println(this.hour + ":" + this.minutes + ":0" + this.seconds);

			} else if(this.hour < 10 && this.seconds < 10) {
				System.out.println("0" + this.hour + ":" + this.minutes + ":0" + this.seconds);

			} else {
				System.out.println(this.hour + ":" + this.minutes + ":" + this.seconds);

			}

		}
		this.str = this.hour+":"+this.minutes+":"+this.seconds; 
		return str; 
	}
	
	public void reset() {
		
		this.stop();
		
	}
	
	public void stop() {
		
		this.hour = 0;
		this.minutes = 0;
		this.seconds = 0;
		
	}
	
	public void pause() { 	               //Metodo Start Avviato per chiamata
						    		     //POSSIAMO PASSARE UN'OGGETTO CHE HA I TRE ATTRIBUTI PRINCIPALI
		System.out.println(this.str);
		
		
	}
}
