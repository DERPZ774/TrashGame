package com.derpz;

import com.derpz.graphics.TrashGameGraphics;
import com.derpz.graphics.TrashGameLoading;
import com.fiskmods.gameboii.Abstract2DGame;
import com.fiskmods.gameboii.Cartridge;
import com.fiskmods.gameboii.games.batfish.screen.ScreenLoading;
import com.fiskmods.gameboii.games.batfish.screen.ScreenMainMenu;
import com.fiskmods.gameboii.graphics.screen.Screen;
import com.fiskmods.gameboii.resource.IResourceListener;
import com.fiskmods.gameboii.wrapper.Main;

import java.nio.ByteBuffer;
import java.util.function.Consumer;

public class TrashGame extends Abstract2DGame {
    public static TrashGame INSTANCE = new TrashGame();
    private boolean launched;

    public TrashGame() {
        super(1024, 1);
    }

    @Override
    public void preInit(int width, int height) {

    }

    @Override
    public void postInit(int width, int height) {

    }

    @Override
    public Screen displayMenuScreen() {
        if (!launched)
        {
            launched = true;
            return new TrashGameLoading();
        }
        return new ScreenMainMenu();
    }

    @Override
    public void register(Consumer<IResourceListener> listeners) {
        listeners.accept(TrashGameGraphics.INSTANCE);
    }

    @Override
    public void read(ByteBuffer buf, int protocol) {

    }

    @Override
    public void write(ByteBuffer buf) {

    }

    public static void main(String[] args) throws Exception{
        Cartridge.register(TrashGameCartridge.INSTANCE);
        Main.main(args);
    }
}
