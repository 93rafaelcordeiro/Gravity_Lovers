package org.academiadecodigo.bootcamp65.objects;

public class BarrierType extends Barrier{

    private Barrier barrier20x40;
    private Barrier barrier20x80;
    private Barrier barrier20x120;
    private Barrier barrier40x20;
    private Barrier barrier80X20;
    private Barrier barrier120x20;



    public BarrierType(double x, double y, double width, double height) {
        super(x, y, width, height);
        this.barrier20x40=new Barrier(x,y,20,40);
        this.barrier20x80= new Barrier(x,y,20,80);
        this.barrier20x120= new Barrier(x,y,20,120);
        this.barrier40x20=new Barrier(x,y,40,20);
        this.barrier80X20= new Barrier(x,y,80,20);
        this.barrier120x20= new Barrier(x,y,120,20);
    }

    public Barrier getBarrier20x40() {
        return barrier20x40;
    }

    public Barrier getBarrier20x120() {
        return barrier20x120;
    }

    public Barrier getBarrier20x80() {
        return barrier20x80;
    }

    public Barrier getBarrier40x20() {
        return barrier40x20;
    }

    public Barrier getBarrier80X20() {
        return barrier80X20;
    }

    public Barrier getBarrier120x20() {
        return barrier120x20;
    }
}
