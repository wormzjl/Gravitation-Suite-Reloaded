package com.estebes.gravisuitereloaded.item.tool;

import ic2.api.item.ElectricItem;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemToolBigDiamondDrill extends ItemToolBigMiningDrill {
    public ItemToolBigDiamondDrill(String name, int energyTier, double maxCharge, double transferLimit, boolean providesEnergy, double operationCost) {
        super(name, energyTier, maxCharge, transferLimit, providesEnergy, operationCost);
    }

    @Override
    public float getDigSpeed(ItemStack itemStack, Block block, int meta) {
        if (!ElectricItem.manager.canUse(itemStack, this.operationCost)) {
            return 1.0F;
        }
        if (canHarvestBlock(block, itemStack)) {
            return 10.0F;
        }
        return 1.0F;
    }

}
