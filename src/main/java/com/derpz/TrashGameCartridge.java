package com.derpz;

import com.fiskmods.gameboii.Cartridge;

public class TrashGameCartridge {
        public static final Cartridge INSTANCE = new Cartridge("trashgame", () -> TrashGame.INSTANCE);
}
