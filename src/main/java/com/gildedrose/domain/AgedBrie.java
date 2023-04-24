package com.gildedrose.domain;


import static com.gildedrose.services.GildedRoseRefactored.MAXIMUM_ITEM_QUALITY;

public class AgedBrie extends Item{

    public AgedBrie(final String name, final int sellIn, final int quality) {
        super(name, sellIn, quality);
    }

    public void updateItem() {
            this.sellIn = this.sellIn - 1;
            if (this.quality < MAXIMUM_ITEM_QUALITY) {
                this.quality = this.quality + 1;
            }
            if (this.quality < MAXIMUM_ITEM_QUALITY && this.sellIn < 0) {
                this.quality = this.quality + 1;
            }
    }
}