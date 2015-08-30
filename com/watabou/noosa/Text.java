package com.watabou.noosa;

import com.nyrds.android.util.ModdingMode;

public abstract class Text extends Visual {

	protected Text(float x, float y, float width, float height) {
		super(x, y, width, height);
	}

	public static Text create() {
		if(ModdingMode.getTextRenderingMode()) {
			return new SystemText();
		}
		return new BitmapText();
	}
	
	public static Text create(Font font) {
		if(ModdingMode.getTextRenderingMode()) {
			return new SystemText(font);
		}
		return new BitmapText(font);
	}
	
	public static Text create(String text, Font font) {
		if(ModdingMode.getTextRenderingMode()) {
			return new SystemText(text, font);
		}
		return new BitmapText(text, font);
	}
	
	@Override
	public void destroy(){
		super.destroy();
	}
	
	@Override
	public void draw(){
		super.draw();
	}
	
	public abstract void measure();
	public abstract float baseLine();
	public abstract String text();
	public abstract void text(String str);

}
