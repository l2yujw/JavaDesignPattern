package adapter.hdmi;

public class HDMI {
    private byte[] images;

    public HDMI(byte[] images) {
        this.images = images;
    }

    public byte[] getImages(){
        return images;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }
}
