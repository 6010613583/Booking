public class CheckOut{
    private String date;
    private int number;

    public CheckOut(String date, int number){
        this.date = date;
        this.number = number;
    }

    public String toString() {
		String result = "";
		result += number + ",";
		result += date;

		return result;
	}

    public boolean equals(int number) {
		if (this.number == number) {
			return true;
		} else {
			return false;
		}
	}

    public int getNumber() {
        return number;
    }
    public String getDate() {
        return date;
    }
}