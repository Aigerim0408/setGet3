public class Rectangle {
    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getSideD() {
        return sideD;
    }

    public void setSideD(int sideD) {
        this.sideD = sideD;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
    public int square(){
        int result = this.sideA * getSideB();
        return result;
    }
}
