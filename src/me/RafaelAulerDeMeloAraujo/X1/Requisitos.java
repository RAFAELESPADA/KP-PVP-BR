package me.RafaelAulerDeMeloAraujo.X1;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Requisitos implements Listener, CommandExecutor {

	
	@EventHandler
	  public void warps(InventoryClickEvent e)
	  {
	    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta() != null))
	    {
	      Inventory inv = e.getInventory();
	      Player p = (Player)e.getWhoClicked();
	      if (inv.getTitle().equals("Requisitos para TAGS."))
	      {
	        e.setCancelled(true);
	      }
	    }
	  }
public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args)
{
  if (!(sender instanceof Player)) {
    return true;
  }
  Player p = (Player)sender;
  if (cmd.getName().equalsIgnoreCase("requisitos"))
  {
    Inventory warps = Bukkit.createInventory(p, 27, "Requisitos para TAGS.");
    
   
    
    ItemStack fps = new ItemStack(Material.TRIPWIRE_HOOK);
    ItemMeta fps2 = fps.getItemMeta();
    fps2.setDisplayName("§3§lREQUISITOS DE TAGS");
    List<String> lore1 = new ArrayList();
    lore1.add("§fAqui você podera vizualizar");
    lore1.add("§fOs requisitos da tag §b§lYT§a/§c§lMINIYT");
    lore1.add("§fLeia atentamente as informaçoes");
    lore1.add("");
    lore1.add("§fDepois so contatar um §4§LDONO");
    lore1.add("§fOu entrar no nosso discord"); 
    lore1.add("§bDigite /discord para entrar no discord"); 
    fps2.setLore(lore1);
    fps.setItemMeta(fps2);
    
    ItemStack lava = new ItemStack(Material.INK_SACK, 1, (short)11);
    ItemMeta lava2 = lava.getItemMeta();
    lava2.setDisplayName("§b§lYT");
    List<String> lore2 = new ArrayList();
    lore2.add("§fPara tornar-se §b§lYT§f, é necessário possuir");
    lore2.add("");
    lore2.add("§4- §f100 vizualizacoes no video do servidor");
    lore2.add("§fA tag tem duração de §67 DIAS §fproduza videos para renova-lá");
    lore2.add("");
    lore2.add("§fApos isso requisitar sua tag no §3§lDISCORD");
    lava2.setLore(lore2);
    lava.setItemMeta(lava2);
       
    ItemStack v1 = new ItemStack(Material.INK_SACK, 1, (short)1);
    ItemMeta v12 = v1.getItemMeta();
    v12.setDisplayName("§c§lMINIYT");
    List<String> lore3 = new ArrayList();
    lore3.add("§fPara tornar-se §c§lMINIYT§f, é necessário possuir");
    lore3.add("");
    lore3.add("§4- §f50 vizualizacoes no video do servidor");
    lore3.add("§fA tag tem duração de §67 DIAS §fproduza videos para renova-lá");
    lore3.add("");
    lore3.add("§fApos isso requisitar sua tag no §3§lDISCORD");
    v12.setLore(lore3);
    v1.setItemMeta(v12);
    
    
    warps.setItem(11, lava);
    warps.setItem(15, v1);
    warps.setItem(13, fps);
    
    
    
    p.openInventory(warps);
  }
 
  {
}
	return false;
}
}