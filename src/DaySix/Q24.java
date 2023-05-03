package DaySix;

public class Q24 {
    int length;
    int width;
    int height;
    int radius;

    Q24(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void areaRectangle(int len, int wid){
        System.out.println(len*wid);

    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
