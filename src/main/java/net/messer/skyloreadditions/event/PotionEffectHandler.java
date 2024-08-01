package net.messer.skyloreadditions.event;

import net.messer.skyloreadditions.item.ModItems;
import net.minecraft.world.damagesource.DamageEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.living.MobEffectEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import top.theillusivec4.curios.api.CuriosApi;

@Mod.EventBusSubscriber
public class PotionEffectHandler {
    @SubscribeEvent
    public static void onPotionEffect(MobEffectEvent.Applicable event){
        if(event.getEntity() instanceof Player player){
            var inventory = CuriosApi.getCuriosInventory(player);
            if(inventory.isPresent()){
                var stack = inventory.resolve().get().findFirstCurio(ModItems.AUGMENT_SHIELD.get());
                if(stack.isPresent()){
                    var effect = event.getEffectInstance().getEffect();
                    if(effect == MobEffects.POISON){
                        event.setResult(Event.Result.DENY);
                    }
                }
            }
        }
    }

}
