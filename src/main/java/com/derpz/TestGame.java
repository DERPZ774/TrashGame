package com.derpz;

import com.fiskmods.gameboii.Abstract2DGame;
import com.fiskmods.gameboii.Cartridge;
import com.fiskmods.gameboii.graphics.screen.Screen;
import com.fiskmods.gameboii.resource.IResourceListener;
import com.fiskmods.gameboii.wrapper.Main;

import java.nio.ByteBuffer;
import java.util.function.Consumer;

public class TestGame extends Abstract2DGame {
    public static TestGame INSTANCE = new TestGame();

    public TestGame() {
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
        return null;
    }

    @Override
    public void register(Consumer<IResourceListener> listeners) {

    }

    @Override
    public void read(ByteBuffer buf, int protocol) {

    }

    @Override
    public void write(ByteBuffer buf) {

    }

    public static void main(String[] args) throws Exception{
        Cartridge.register(TestCartridge.INSTANCE);
        Main.main(args);
    }
}
