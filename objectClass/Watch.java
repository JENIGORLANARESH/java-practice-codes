package objectClass;

public class Watch {
    private int HH;
    private int MM;
    private int SS;
    Watch(int HH, int MM, int SS){
        this.HH = HH;
        this.MM=MM;
        this.SS = SS;
    }

    public String toString(){
        return HH+" " + MM + " " + SS;
    }

    public boolean equals(Object obj){
        Watch wt = (Watch) obj;
        return this.HH == wt.HH && this.MM == wt.MM && this.SS == wt.SS;
    }
}
