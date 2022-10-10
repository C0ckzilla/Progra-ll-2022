import java.awt.Color;

class Particula {
    private int x,y;
    private Color color = Color.RED;
    public Particula (int x, int y){
        color=Color.RED;
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public Color getColor(){
        return color;
    }
    public void move ()
    {
        int moveX = Math.random() > 0.5? 1:-1;
        int moveY = Math.random() >0.5? 1:-1;
        x= x+moveX;
        y= y+moveY;
        //Metodos para vehiculos
    }
}
