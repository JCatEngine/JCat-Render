package JCat.Canvas;

import JCat.Interaction.CanvasKeyListener;
import JCat.Interaction.CanvasMouseListener;
import JCat.Render.RenderData;
import JCat.Textures.Texture;

/**
 * a canvas have ability to draw texture and receive origin event
 * @author Administrator
 *
 */
public interface Canvas {

	/**
	 * draw texture to screen
	 * @param texture
	 * @param renderData
	 */
	void drawTexture(Texture texture, RenderData renderData);

	/**
	 * called before render
	 */
	void preRender();

	/**
	 * called after render
	 */
	void postRender();
	/**
	 * 
	 */
	void addMouseListener(CanvasMouseListener listener);
	/**
	 * 
	 */
	void addKeyListener(CanvasKeyListener listener);

}