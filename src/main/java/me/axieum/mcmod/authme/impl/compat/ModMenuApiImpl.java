package me.axieum.mcmod.authme.impl.compat;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfig;


import me.axieum.mcmod.authme.impl.config.AuthMeConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
/**
 * A compat layer for integrating with Mod Menu.
 */
@Environment(EnvType.CLIENT)
public class ModMenuApiImpl implements ModMenuApi
{
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory()
    {
        return screen -> AutoConfig.getConfigScreen(AuthMeConfig.class, screen).get();
    }
}
