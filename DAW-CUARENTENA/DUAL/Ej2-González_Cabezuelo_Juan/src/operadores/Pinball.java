package operadores;

import java.util.Scanner;

public class Pinball {
	Scanner teclado = new Scanner(System.in);
	
	private int points;
	private int strenght;
	private int numbolas;
	
	public Pinball() {}
	public int getPoints(){return points;}
	public void setPoints(int points){this.points = points;}
	public int getNumbolas(){return numbolas;}
	public void setNumbolas(int numbolas){this.numbolas = numbolas;}
	
	public int getStrenght(){return strenght;}
	public void setStrenght(int strenght){this.strenght = strenght;}
	private int altStrenght(){
		int n;
		n = (int) (Math.random() * 99 + 1);
		return n;
	}
	
	
	public void shoot() {
		int start = 1;
		int nbolas = 3;
		int opt1=2,opt2;
		this.numbolas = nbolas;
		this.points = start;
		
		do{
			if(this.numbolas>0 && this.points>0){
				System.out.println("|===========================|");
				System.out.println("|== BOLAS: "+this.numbolas+" | POINTS: "+this.points+"  ==|");
				System.out.println("|===========================|");
				System.out.println("|== 0 POINTS ---> -1 BOLA ==|");
				System.out.println("|== 0 BOLAS --> LOSE      ==|");
				System.out.println("|== 100 POINTS --> WIN    ==|");
				System.out.println("|---------------------------|");
				System.out.println("| 1. Lanzar                 |");
				System.out.println("| 2. Ver bolas              |");
				System.out.println("| 3. Puntuación             |");
				System.out.println("| 0. Salir                  |");
				System.out.println("|===========================|");
				System.out.print("| Opción: ");
				opt1 = teclado.nextInt();
				
				if(opt1<0 || opt1>3) {
					System.out.println("|==ERROR==| Introduzca una opción correcta");
				}else{
					if(this.numbolas <= 0){	
						System.out.println("|===== NO QUEDAN BOLAS =====|");
						System.out.println("|===== YOU LOOSE...... =====|");
						break;	
					}else if(this.points<100 && this.points>0){
						switch(opt1) {
							case 1:
								setStrenght(this.altStrenght());
								
								System.out.println("|===========================|");
								System.out.println("|===FUERZA: "+this.getStrenght()+" ====|");		
								System.out.println("|===========================|");
								
								if(this.getStrenght()>=75){
									do {
										System.out.println("|---------------------------|");
										System.out.println("| 1. +1 Bola                |");
										System.out.println("| 2. +10 Points             |");
										System.out.println("| 3. +20 Points, -1 Bola    |");
										System.out.println("|===========================|");
										System.out.print("| Opción: ");
										opt2 = teclado.nextInt();
										
										if(opt2<1 || opt2>3) {
											System.out.println("|==ERROR==| Introduzca una opción correcta");
										}else{
											switch (opt2) {
											case 1:
												this.numbolas++;
												System.out.println("| +1 Bola. Nbolas: "+this.numbolas+"    |");
												break;
											case 2:
												this.points += 10;
												System.out.println("| +10 Points. Points: "+this.points+"    |");
												break;
											case 3:
												this.numbolas--;
												this.points += 20;
												System.out.println("| +20 Points. -1 Bola       |");
												System.out.println("| Points,: "+this.points+" BOLAS: "+this.numbolas+"     |");
												break;
											}
											System.out.println("|---------------------------|");
										}
										opt2=0;
									}while(opt2<1 && opt2>3);
								}else if(this.strenght>= 50 && this.strenght < 75) {
									do {
										System.out.println("|---------------------------|");
										System.out.println("| 1. Points aleatory        |");
										System.out.println("| 2. +5 Points              |");
										System.out.println("|===========================|");
										System.out.print("| Opción: ");
										opt2 = teclado.nextInt();
										
										if(opt2<1 || opt2>2) {
											System.out.println("|==ERROR==| Introduzca una opción correcta");
										}else{
											switch (opt2) {
											case 1:
												this.points = this.altStrenght();
												System.out.println("| New Points: "+this.points+" |");
												break;
											case 2:
												this.points += 5;
												System.out.println("| Points: "+this.points+"    |");
												break;
											}
											System.out.println("|---------------------------|");
										}
										opt2=0;
									}while(opt2<1 && opt2>2);
								} else if(this.strenght >= 0 && this.strenght < 50) {
									System.out.println("| INSSUCCESFUL STRENGHT     |");
									System.out.println("| -20 POINTS                |");
									this.points -= 20;
									System.out.println("| New Points: "+this.points+"           |");
								}
								break;
							case 2:
								System.out.println("| Bolas: "+this.numbolas+"     |");
								break;
							case 3:
								System.out.println("| Points: "+this.points+"    |");	
								break;
							case 0:
								break;
						}		
					}else if(this.points>=100){
						System.out.println("|==YOUUUUU WIIIIN!!!==|");
						break;
					}else {
						this.numbolas--;
						this.points=1;
					}		
				}	
			}else if(this.numbolas<=0){
				System.out.println("|===== YOU LOOSE...... =====|");
				opt1=0;
				break;
			}else {
				this.numbolas--;
				this.points=1;
			}
		}while(opt1>0 && opt1<=3);
		System.out.println("|---------------------------|");
		System.out.println("| POINTS: "+this.points+" | BOLAS: "+this.numbolas+"      |");
		System.out.println("|======== END GAME =========|");
		System.out.println("|===========================|");
	}
}