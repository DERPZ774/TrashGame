package com.derpz.graphics;

import com.fiskmods.gameboii.resource.GameResourceLoader;
import com.fiskmods.gameboii.resource.IResourceListener;
import com.fiskmods.gameboii.resource.ImageResource;

public enum TrashGameGraphics implements IResourceListener {
    INSTANCE;
    public static ImageResource logo;
    @Override
    public void load(GameResourceLoader loader) {
        logo = loader.loadGIF("textures/logo.png", 109, 21, 2);
    }
}
