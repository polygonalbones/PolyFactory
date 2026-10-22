package polygonalbones.polyfactory.mixin.recipe;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeMap;
import net.minecraft.world.item.crafting.RecipeType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

import java.util.Set;

@Mixin(RecipeMap.class)
public class RecipeMapMixin {
    @Unique
    private static final Set<Identifier> polyfactory$bannedRecipes = Set.of(
            Identifier.withDefaultNamespace("wooden_axe"),
            Identifier.withDefaultNamespace("wooden_hoe"),
            Identifier.withDefaultNamespace("wooden_pickaxe"),
            Identifier.withDefaultNamespace("wooden_shovel"),
            Identifier.withDefaultNamespace("wooden_spear"),
            Identifier.withDefaultNamespace("wooden_sword"),
            Identifier.withDefaultNamespace("stone_axe"),
            Identifier.withDefaultNamespace("stone_hoe"),
            Identifier.withDefaultNamespace("stone_pickaxe"),
            Identifier.withDefaultNamespace("stone_shovel"),
            Identifier.withDefaultNamespace("stone_spear"),
            Identifier.withDefaultNamespace("stone_sword")
    );

    @Unique
    private static boolean polyfactory$nukeRecipe(Identifier identifier) {
        return polyfactory$bannedRecipes.contains(identifier);
    }

    // byType.put
    @WrapOperation(
            method = "lambda$create$0",
            at = @At(
                    value = "INVOKE",
                    target = "Lcom/google/common/collect/ImmutableMultimap$Builder;put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMultimap$Builder;"
            )
    )
    private static ImmutableMultimap.Builder<RecipeType<?>, RecipeHolder<?>> polyfactory$recipeMapMixin$wrapImmutableMultimapBuilderPut(
            ImmutableMultimap.Builder<RecipeType<?>, RecipeHolder<?>> builder,
            Object key,
            Object value,
            Operation<ImmutableMultimap.Builder<RecipeType<?>, RecipeHolder<?>>> original,
            @Local(argsOnly = true, name = "recipe") Holder.Reference<Recipe<?>> recipe) {
        RecipeHolder<?> h = (RecipeHolder<?>)value;
        if(polyfactory$nukeRecipe((recipe.key().identifier()))) return builder;
        return original.call(builder, key, h);
    }

    // byKey.put
    @WrapOperation(
            method = "lambda$create$0",
            at = @At(
                    value = "INVOKE",
                    target = "Lcom/google/common/collect/ImmutableMap$Builder;put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;"
            )
    )
    private static ImmutableMap.Builder<ResourceKey<Recipe<?>>, RecipeHolder<?>> polyfactory$recipeMapMixin$wrapImmutableMapBuilderPut(
            ImmutableMap.Builder<ResourceKey<Recipe<?>>, RecipeHolder<?>> builder,
            Object key,
            Object value,
            Operation<ImmutableMap.Builder<ResourceKey<Recipe<?>>, RecipeHolder<?>>> original) {
        RecipeHolder<?> h = (RecipeHolder<?>)value;
        if(polyfactory$nukeRecipe(((ResourceKey<?>)key).identifier())) return builder;
        return original.call(builder, key, h);
    }
}