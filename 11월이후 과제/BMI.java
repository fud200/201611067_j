class BMI {
	public String computeBMI(float w, float h) {
		float bmi = (float) w / (h * h);
		System.out.printf("bmi = %.1f", bmi);
		
		if (bmi <= 18.5)
			return "low";
		else if (bmi >= 18.5 && bmi < 23)
			return "normal";
		else if (bmi >= 23 && bmi < 25)
			return "risky";
		else if (bmi >= 25 && bmi < 30)
			return "obesity 1";
		else if (bmi >= 30 && bmi < 40)
			return "obesity 2";
		else if (bmi >= 40)
			return "obesity 3";
		else
			return "error";
	}
	public static void main(String[] args) {
		float w = (float) 76.5;
		float h = (float) 1.8;
		BMI b = new BMI();
		String res = b.computeBMI(w, h);
		System.out.printf(" Weight = %.1f kg, Height = %.1f then %s", w, h, res);
	}
}