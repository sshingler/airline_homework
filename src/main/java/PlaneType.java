public enum PlaneType {
    BOEING747 (400, 40000),
    AIRBUSA380 (600, 60000);

    private int capacity;
    private int totalWeight;

    PlaneType (int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getTotalWeight(){
        return totalWeight;
    }

}
