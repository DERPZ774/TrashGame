package com.derpz;

import com.fiskmods.gameboii.Cartridge;

public class TestCartridge {
        public static final Cartridge INSTANCE = new Cartridge("trashgame", () -> TestGame.INSTANCE);
}
