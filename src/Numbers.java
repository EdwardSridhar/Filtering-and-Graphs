public class Numbers {
    int redNumber;
    int greenNumber;
    int blueNumber;

    GraphView gView;

    public Numbers(int n1, int n2, int n3) {
        this.redNumber = n1;
        this.greenNumber = n2;
        this.blueNumber = n3;
    }

    public void attach(GraphView gView) {
        this.gView = gView;
    }

    public void updateValues(int n1, int n2, int n3) {
        //values multiplied by 10 to make the numbers to input smaller
        this.redNumber = n1*10;
        this.greenNumber = n2*10;
        this.blueNumber = n3*10;
        gView.updateGraph(n1*10, n2*10, n3*10);
        // call method on graphView object to update itself
    }
}
