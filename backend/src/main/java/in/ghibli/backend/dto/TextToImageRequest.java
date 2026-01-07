package in.ghibli.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
public class TextToImageRequest {

    private List<TextPrompt> textPrompts;
    private double cfgScale = 7;
    private int height = 512;
    private int width = 768;
    private int samples = 1;
    private int steps = 30;
    private String stylePreset;

    @Data
    @AllArgsConstructor
    public static class TextPrompt{
        private String text;
    }

    public TextToImageRequest(String text, String style){
        this.textPrompts = List.of(new TextPrompt(text));
        this.stylePreset = style;
    }



}
