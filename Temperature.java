class Temperature{
	void change(String a, float b){
			double c;
			if(a.equals("F")){
				c=(b-32)/1.8;
				System.out.println(b+a+" is chaged to "+c+"C");
				}
			else if(a.equals("C")){
				c = (b*1.8)+32;
				System.out.println(b+a+" is chaged to "+c+"F");
				}
				else{
					System.out.println("Error");
				}
			}
			public static void main(String[] args){
				Temperature c = new Temperature();
				c.change("C", 20.0f);
				Temperature f = new Temperature();
				f.change("F", 20.0f);
			}
		}