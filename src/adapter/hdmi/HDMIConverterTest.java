package adapter.hdmi;

import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class HDMIConverterTest {
    @Test
    public void converterTest() {
        // given
        byte[] imageBytes = "test.jpg".getBytes(StandardCharsets.UTF_8);
        RGB rgb = new RGB();
        rgb.setImages(imageBytes);

        // when
        HDMIConverter hdmiConverter = new HDMIConverter();
        HDMI hdmi = hdmiConverter.convertRGBToHDMI(rgb);

        // then
        assertEquals(hdmi.getImages(), imageBytes);
    }
}
