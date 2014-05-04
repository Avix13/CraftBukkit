package org.bukkit.craftbukkit;

import net.minecraft.server.EnumArt;
import org.bukkit.Art;
import java.util.HashMap;


// Safety class, will break if either side changes
public class CraftArt {

    static HashMap<EnumArt, Art> EnumArtToArt = initializeEnumArtToArt();

    private static HashMap<EnumArt, Art> initializeEnumArtToArt() {
        HashMap<EnumArt, Art> hashmap = new HashMap<EnumArt, Art>();
        hashmap.put(EnumArt.KEBAB, Art.KEBAB);
        hashmap.put(EnumArt.AZTEC, Art.AZTEC);
        hashmap.put(EnumArt.ALBAN, Art.ALBAN);
        hashmap.put(EnumArt.AZTEC2, Art.AZTEC2);
        hashmap.put(EnumArt.BOMB, Art.BOMB);
        hashmap.put(EnumArt.PLANT, Art.PLANT);
        hashmap.put(EnumArt.WASTELAND, Art.WASTELAND);
        hashmap.put(EnumArt.POOL, Art.POOL);
        hashmap.put(EnumArt.COURBET, Art.COURBET);
        hashmap.put(EnumArt.SEA, Art.SEA);
        hashmap.put(EnumArt.SUNSET, Art.SUNSET);
        hashmap.put(EnumArt.CREEBET, Art.CREEBET);
        hashmap.put(EnumArt.WANDERER, Art.WANDERER);
        hashmap.put(EnumArt.GRAHAM, Art.GRAHAM);
        hashmap.put(EnumArt.MATCH, Art.MATCH);
        hashmap.put(EnumArt.BUST, Art.BUST);
        hashmap.put(EnumArt.STAGE, Art.STAGE);
        hashmap.put(EnumArt.VOID, Art.VOID);
        hashmap.put(EnumArt.SKULL_AND_ROSES, Art.SKULL_AND_ROSES);
        hashmap.put(EnumArt.FIGHTERS, Art.FIGHTERS);
        hashmap.put(EnumArt.POINTER, Art.POINTER);
        hashmap.put(EnumArt.PIGSCENE, Art.PIGSCENE);
        hashmap.put(EnumArt.BURNINGSKULL, Art.BURNINGSKULL);
        hashmap.put(EnumArt.SKELETON, Art.SKELETON);
        hashmap.put(EnumArt.DONKEYKONG, Art.DONKEYKONG);
        hashmap.put(EnumArt.WITHER, Art.WITHER);
        return hashmap;
    }

    static HashMap<Art, EnumArt> ArtToEnumArt = initializeArtToEnumArt();
    
    private static HashMap<Art, EnumArt> initializeArtToEnumArt() {
        HashMap<Art, EnumArt> hashmap = new HashMap<Art, EnumArt>();
        hashmap.put(Art.KEBAB, EnumArt.KEBAB);
        hashmap.put(Art.AZTEC, EnumArt.AZTEC);
        hashmap.put(Art.ALBAN, EnumArt.ALBAN);
        hashmap.put(Art.AZTEC2, EnumArt.AZTEC2);
        hashmap.put(Art.BOMB, EnumArt.BOMB);
        hashmap.put(Art.PLANT, EnumArt.PLANT);
        hashmap.put(Art.WASTELAND, EnumArt.WASTELAND);
        hashmap.put(Art.POOL, EnumArt.POOL);
        hashmap.put(Art.COURBET, EnumArt.COURBET);
        hashmap.put(Art.SEA, EnumArt.SEA);
        hashmap.put(Art.SUNSET, EnumArt.SUNSET);
        hashmap.put(Art.CREEBET, EnumArt.CREEBET);
        hashmap.put(Art.WANDERER, EnumArt.WANDERER);
        hashmap.put(Art.GRAHAM, EnumArt.GRAHAM);
        hashmap.put(Art.MATCH, EnumArt.MATCH);
        hashmap.put(Art.BUST, EnumArt.BUST);
        hashmap.put(Art.STAGE, EnumArt.STAGE);
        hashmap.put(Art.VOID, EnumArt.VOID);
        hashmap.put(Art.SKULL_AND_ROSES, EnumArt.SKULL_AND_ROSES);
        hashmap.put(Art.FIGHTERS, EnumArt.FIGHTERS);
        hashmap.put(Art.POINTER, EnumArt.POINTER);
        hashmap.put(Art.PIGSCENE, EnumArt.PIGSCENE);
        hashmap.put(Art.BURNINGSKULL, EnumArt.BURNINGSKULL);
        hashmap.put(Art.SKELETON, EnumArt.SKELETON);
        hashmap.put(Art.DONKEYKONG, EnumArt.DONKEYKONG);
        hashmap.put(Art.WITHER, EnumArt.WITHER);
        return hashmap;
    }


    public static Art NotchToBukkit(EnumArt art) {
        try {
            return EnumArtToArt.get(art);
        } catch(AssertionError err){
            throw err;
        }
    }

    public static EnumArt BukkitToNotch(Art art) {
        try {
            return ArtToEnumArt.get(art);
        } catch(AssertionError err){
            throw err;
        }
    }
}
