package edu.monmouth.assignment1;

public class guardDog extends Dog {

	
		private short meanness;
		
		
		public guardDog(String furColor, short Meanness) {
		super(furColor);
		this.meanness = Meanness;
		}
		
		public void setMeanness(short meanness) {
			this.meanness = meanness;
		}
		
		public short getMeanness() {
		return meanness;	
		}
		
		@Override
		public void makeSound() {
			System.out.println(AnimalConstants.GUARDDOGSOUND);
		}
		
		@Override
		public void move() {
			System.out.println(AnimalConstants.GUARDDOGMOVE);
		}
		
	@Override
		public String toString() {
			return "Color: " + color + "\n" +
					"Meanness: " + meanness;
		}

	}


