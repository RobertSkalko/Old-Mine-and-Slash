package com.robertx22.mine_and_slash.new_content.enums;

import com.robertx22.mine_and_slash.uncommon.interfaces.IWeighted;

public enum RoomGroup implements IWeighted {

    STONE_BRICK("stone_brick", 1000),

    SANDSTONE("sandstone", 800),

    MISC("misc", 10),

    BRICK("brick", 50) {
        @Override
        public boolean allowsOtherTypes() {
            return false;
        }
    },

    NETHER("nether", 0) {
        @Override
        public boolean allowsOtherTypes() {
            return false;
        }
    },
    NATURE("nature", 250) {
        @Override
        public boolean allowsOtherTypes() {
            return false;
        }
    },

    SNOW("snow", 0) {
        @Override
        public boolean allowsOtherTypes() {
            return false;
        }
    },

    MOSSY_BRICK("mossy_brick", 500) {
        @Override
        public boolean allowsOtherTypes() {
            return false;
        }
    },

    STEAMPUNK("steampunk", 100) {
        @Override
        public boolean allowsOtherTypes() {
            return false;
        }
    },

    TENT("tent", 100) {
        @Override
        public boolean allowsOtherTypes() {
            return false;
        }
    },

    SPRUCE_MANSION("spruce_mansion", 1000) {
        @Override
        public boolean allowsOtherTypes() {
            return false;
        }
    },

    MINE("mine", 500) {
        @Override
        public boolean allowsOtherTypes() {
            return false;
        }
    },
    TEST("test", 0);

    RoomGroup(String folder, int weight) {
        this.folder = folder;
        this.weight = weight;
    }

    public String folder;
    int weight;

    public boolean allowsOtherTypes() {
        return true;
    }

    @Override
    public int Weight() {
        return weight;
    }
}
