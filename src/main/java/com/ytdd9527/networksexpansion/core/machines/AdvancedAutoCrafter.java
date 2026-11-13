package com.ytdd9527.networksexpansion.core.machines;

import com.balugaq.netex.api.enums.CraftType;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("DuplicatedCode")
public class AdvancedAutoCrafter extends AutoCrafter {
    public AdvancedAutoCrafter(
        @NotNull ItemGroup itemGroup,
        @NotNull SlimefunItemStack item,
        @NotNull RecipeType recipeType,
        ItemStack @NotNull [] recipe,
        int chargePerCraft,
        boolean withholding) {
        super(itemGroup, item, recipeType, recipe, chargePerCraft, withholding);
    }

    public AdvancedAutoCrafter(
        @NotNull ItemGroup itemGroup,
        @NotNull SlimefunItemStack item,
        @NotNull RecipeType recipeType,
        ItemStack @NotNull [] recipe,
        int chargePerCraft,
        boolean withholding,
        @Nullable CraftType craftType) {
        super(itemGroup, item, recipeType, recipe, chargePerCraft, withholding, craftType);
    }

    @Override
    public boolean canBlueprintStack() {
        return true;
    }
}
