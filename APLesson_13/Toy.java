public abstract class Toy
{
		private String name;
		private double count;
		
		
		public Toy()
		{
			this.count = 1;
			this.name = "";
		}
		
		public Toy(String n, double c)
		{
			this.count = c;
			this.name = n;
		}
		
		public abstract String getType();
		
		public String getName()
		{
			return name;
		}
		
		public double getCount()
		{
			return count;
		}
		
		public String setName()
		{
			this.name = n;
		}
		
		public double setCount()
		{
			this.count = c;
		}
		
		public String toString()
		{
			return name + " " + count;
		}
		
}