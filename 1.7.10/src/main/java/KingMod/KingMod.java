package KingMod;

import KingMod.Block.BlockKingWood;
import KingMod.Block.SampleWood;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.LinkedList;

/**
 * Created by C6H2Cl2 on 2016/08/03.
 */
@Mod(modid = KingMod.Mod_ID,name = "King Mod[木ngMod]",useMetadata = true)
public class KingMod {
    public static final String Mod_ID = "KingMod";
    public static final String Version = "1.0.0";

    public static CreativeTabs tabKingMod = new CreativeTabs("KingMod") {
        @Override
        public Item getTabIconItem() {
            return Items.iron_axe;
        }
    };

    @Mod.Metadata(value = Mod_ID)
    public static ModMetadata metadata;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        loadMetadata(metadata);
        KingBlocks.registerBlocks();
        KingItems.registerItems();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event){

    }

    private void loadMetadata(ModMetadata modMetadata){
        modMetadata.modId = Mod_ID;
        LinkedList<String> authors = new LinkedList<>();
        authors.add("C6H2Cl2");
        authors.add("come25136");
        authors.add("world_of_the_takumi");
        authors.add("chibivaru");
        authors.add("Hayabusa");
        authors.add("Iberigorilla");
        authors.add("MineCake1.4.7");
        authors.add("UnreaL");
        authors.add("Pleurotus_eryngii");
        authors.add("kazu0617");
        modMetadata.authorList = authors;
        modMetadata.version = Version;
        modMetadata.description = "King氏のアイコンの木が折れたことを発端とした騒動から生まれたmod。";
        modMetadata.autogenerated = false;
    }
}
