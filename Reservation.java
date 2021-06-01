public class Reservation {
    private String name;
    private String roomType;
    private Boolean wifi;
    private int numPeople; 
    private int numRooms;  
    private int numNights; 
    private int dateCheckIn;
    private int dateCheckOut;
    private double totalCost;
    private double deposit;
    


    public Reservation(String name, String roomType, Boolean wifi, int numPeople, int numRooms, int numNight, int dateCheckIn, int dateCheckOut, double totalCost, double deposit){
        this.name = name;
        this.roomType = roomType;
        this.wifi = wifi;
        this.numPeople = numPeople;
        this.numRooms = numRooms;
        this.numNights = numNight;
        this.dateCheckIn = dateCheckIn;
        this.dateCheckOut = dateCheckOut;
        this.totalCost = totalCost;
        this.setDeposit(deposit);
    }
    
    
    public int getDateCheckOut() {
        return dateCheckOut;
    }
    
    public int getDateCheckIn() {
        return dateCheckIn;
    }
    
    public int getNumNights() {
        return numNights;
    }
    
    public int getNumRooms() {
        return numRooms;
    }
    
    public int getNumPeople() {
        return numPeople;
    }
    
    public Boolean isWifi() {
        return wifi;
    }
    
    
    public String getRoomType() {
        return roomType;
    }
    
    public String getName() {
        return name;
    }
    
    public double getTotalCost() {
        return totalCost;
    }
    
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    
    public double getDeposit() {
        return deposit;
    }
    
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
