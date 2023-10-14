package datatypes;

public class Image {
    private int xMax;
    private int yMax;

    private Pixel[][] pixels;

    public Image(Pixel[][] pixels) {
        this.xMax = pixels.length;
        this.yMax = pixels[0].length;   //todo: bilder beachten die unterschiedliche lange "pixelzeilen" haben? --> ist ja eig schwachsinn
        this.pixels = pixels;
    }

    public Pixel getPixel(int x, int y) {
        if( (x >= 0 && x < xMax) && (y >= 0 && y < yMax) ) return this.pixels[x][y];
        else return new Pixel(0,0,0);
    }

    public int getxMax() {
        return xMax;
    }

    public void setxMax(int xMax) {
        this.xMax = xMax;
    }

    public int getyMax() {
        return yMax;
    }

    public void setyMax(int yMax) {
        this.yMax = yMax;
    }

    public Pixel[][] getPixels() {
        return pixels;
    }

    public void setPixels(Pixel[][] pixels) {
        this.pixels = pixels;
    }
}
