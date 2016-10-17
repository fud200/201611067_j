class Person {
    private float weight;
    public void setWeight(float w) {
        this.weight=w;
    }
    private float getWeight() {
        return weight;
    }
}
Person h=new Person();
h.setWeight((float)75.0);
System.out.println(h.getWeight());
