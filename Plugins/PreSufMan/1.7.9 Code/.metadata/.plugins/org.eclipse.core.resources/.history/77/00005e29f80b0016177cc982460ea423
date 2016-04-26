package me.presufmanddl;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
public class PreSufMan extends JavaPlugin {
	public String thedefaultpre = getConfig().getString("DefaultPrefix");
	public String thedefaultsuf = getConfig().getString("DefaultSuffix");
	public String ccicon = getConfig().getString("ChatColorIcon");
	public boolean predefault = getConfig().getBoolean("PrefixHasDefault");
	public boolean sufdefault = getConfig().getBoolean("SuffixHasDefault");
	public String message;
	public String rawMessage;
	public String pre;
	public String suf;
	public String playerName;
	public Player player;
	public String pre0;
	public String pre1;
	public String pre2;
	public String pre3;
	public String pre4;
	public String pre5;
	public String pre6;
	public String pre7;
	public String pre8;
	public String pre9;
	public String suf0;
	public String suf1;
	public String suf2;
	public String suf3;
	public String suf4;
	public String suf5;
	public String suf6;
	public String suf7;
	public String suf8;
	public String suf9;
	public String getStr(String str) {
		return getConfig().getString(str);
	}
	@Override
	public void onEnable() {
		pre0 = getStr("Prefix0");
		pre1 = getStr("Prefix1");
		pre2 = getStr("Prefix2");
		pre3 = getStr("Prefix3");
		pre4 = getStr("Prefix4");
		pre5 = getStr("Prefix5");
		pre6 = getStr("Prefix6");
		pre7 = getStr("Prefix7");
		pre8 = getStr("Prefix8");
		pre9 = getStr("Prefix9");
		suf0 = getStr("Suffix0");
		suf1 = getStr("Suffix1");
		suf2 = getStr("Suffix2");
		suf3 = getStr("Suffix3");
		suf4 = getStr("Suffix4");
		suf5 = getStr("Suffix5");
		suf6 = getStr("Suffix6");
		suf7 = getStr("Suffix7");
		suf8 = getStr("Suffix8");
		suf9 = getStr("Suffix9");
		new PermListener(this);
		PluginManager pm = getServer().getPluginManager();
		pm.addPermission(Permissions.getNode("psm.prefix.set.0"));
		pm.addPermission(Permissions.getNode("psm.prefix.set.1"));
		pm.addPermission(Permissions.getNode("psm.prefix.set.2"));
		pm.addPermission(Permissions.getNode("psm.prefix.set.3"));
		pm.addPermission(Permissions.getNode("psm.prefix.set.4"));
		pm.addPermission(Permissions.getNode("psm.prefix.set.5"));
		pm.addPermission(Permissions.getNode("psm.prefix.set.6"));
		pm.addPermission(Permissions.getNode("psm.prefix.set.7"));
		pm.addPermission(Permissions.getNode("psm.prefix.set.8"));
		pm.addPermission(Permissions.getNode("psm.prefix.set.9"));
		pm.addPermission(Permissions.getNode("psm.suffix.set.0"));
		pm.addPermission(Permissions.getNode("psm.suffix.set.1"));
		pm.addPermission(Permissions.getNode("psm.suffix.set.2"));
		pm.addPermission(Permissions.getNode("psm.suffix.set.3"));
		pm.addPermission(Permissions.getNode("psm.suffix.set.4"));
		pm.addPermission(Permissions.getNode("psm.suffix.set.5"));
		pm.addPermission(Permissions.getNode("psm.suffix.set.6"));
		pm.addPermission(Permissions.getNode("psm.suffix.set.7"));
		pm.addPermission(Permissions.getNode("psm.suffix.set.8"));
		pm.addPermission(Permissions.getNode("psm.suffix.set.9"));
		pm.addPermission(Permissions.getNode("psm.suffix.help"));
		pm.addPermission(Permissions.getNode("psm.prefix.help"));
		pm.addPermission(Permissions.getNode("psm.suffix.list"));
		pm.addPermission(Permissions.getNode("psm.prefix.list"));
		pm.addPermission(Permissions.getNode("psm.chat"));
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();
		pre = null;
		suf = null;
		thedefaultpre = getConfig().getString("Prefix" + thedefaultpre);
		thedefaultsuf = getConfig().getString("Suffix" + thedefaultsuf);
		if (predefault) {
			pre = thedefaultpre;
		} else {
			pre = "&f";
		}
		if (sufdefault) {
			suf = thedefaultsuf;
		} else {
			suf = "&f";
		}
		getServer().getPluginManager().registerEvents(new Listener() {
			@EventHandler
			public void playerChat(AsyncPlayerChatEvent e) {
				if (true != false) {
					player = e.getPlayer();
					rawMessage = e.getMessage();
					pre = pre.replaceAll(ccicon, "§");
					suf = suf.replaceAll(ccicon, "§");
					String display = pre + player.toString().substring(17).replace("}", "") + suf;
					display = display.replaceAll(ccicon, "§");
					player.setDisplayName(display);
					System.out.println("If you don't have config file #4, please delete yours to regenerate it.");
					int blockDistance = 300000000;
					org.bukkit.Location playerLocation = e.getPlayer().getLocation();
					if (!player.hasPermission("psm.chat")) {
						rawMessage = rawMessage.replaceAll("§", ccicon);
					} else {
						rawMessage = rawMessage.replaceAll(ccicon, "§");
					}
					for (Player pl : e.getRecipients()) {
						if (pl.getLocation().distance(playerLocation) <= blockDistance) {
							message = getStr("MessageLayout");
							message = message.replaceAll(ccicon, "§");
							message = message.replaceAll("%n", display);
							message = message.replaceAll("%m", rawMessage);
							pl.sendMessage(message);
						}
					}
					e.getRecipients().clear();
				}
			}
		}, this);
	}
	@Override
	public void onDisable() {	
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("prefix") && sender instanceof Player) {	
			player = (Player) sender;
			playerName = player.getName();
			int length = args.length;
			if(length == 0) {
				player.sendMessage(ChatColor.RED + "Try /prefix help");
			} else if (length == 1) {
				if (args[0].equalsIgnoreCase("help")) {
					if (player.hasPermission("psm.prefix.help")) {
						player.sendMessage(ChatColor.GOLD + "/prefix help - Pulls up the help menu");
						player.sendMessage(ChatColor.GOLD + "/prefix set # - Lets you set your prefix");
						player.sendMessage(ChatColor.GOLD + "/prefix list - List your possible prefixes");
						player.sendMessage(ChatColor.GOLD + "/prefix off - Turns off your current prefix");
					} else {
						player.sendMessage(ChatColor.RED + "Not enough permissions.");
					}
				} else if (args[0].equalsIgnoreCase("off")) {
					pre = ccicon + "f";
					player.sendMessage(ChatColor.GREEN + "Prefix turned off.");
				} else if (args[0].equalsIgnoreCase("list")) {
					if (player.hasPermission("psm.prefix.list")) {
						if (player.hasPermission("psm.prefix.set.0")) {
							player.sendMessage(ChatColor.GOLD + "Prefix 0: " + pre0.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.prefix.set.1")) {
							player.sendMessage(ChatColor.GOLD + "Prefix 1: " + pre1.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.prefix.set.2")) {
							player.sendMessage(ChatColor.GOLD + "Prefix 2: " + pre2.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.prefix.set.3")) {
							player.sendMessage(ChatColor.GOLD + "Prefix 3: " + pre3.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.prefix.set.4")) {
							player.sendMessage(ChatColor.GOLD + "Prefix 4: " + pre4.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.prefix.set.5")) {
							player.sendMessage(ChatColor.GOLD + "Prefix 5: " + pre5.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.prefix.set.6")) {
							player.sendMessage(ChatColor.GOLD + "Prefix 6: " + pre6.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.prefix.set.7")) {
							player.sendMessage(ChatColor.GOLD + "Prefix 7: " + pre7.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.prefix.set.8")) {
							player.sendMessage(ChatColor.GOLD + "Prefix 8: " + pre8.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.prefix.set.9")) {
							player.sendMessage(ChatColor.GOLD + "Prefix 9: " + pre9.replaceAll(ccicon, "§"));
						}
					} else {
						player.sendMessage(ChatColor.RED + "Not enough permissions.");
					}
				}
			} else if (length == 2) {
				if (args[0].equalsIgnoreCase("set")) {
					if (args[1].equalsIgnoreCase("0")) {
						if (player.hasPermission("psm.prefix.set.0")) {
							pre = pre0;
							player.sendMessage(ChatColor.GREEN + "Prefix updated to 0: " + ChatColor.RESET + pre.replaceAll(ccicon, "§"));
						} else {
							player.sendMessage(ChatColor.RED + "Not enough permissions.");
						}
					} else if (args[1].equalsIgnoreCase("1")) {
						if (player.hasPermission("psm.prefix.set.1")) {
							pre = pre1;
							player.sendMessage(ChatColor.GREEN + "Prefix updated to 1: " + ChatColor.RESET + pre.replaceAll(ccicon, "§"));
							} else {
								player.sendMessage(ChatColor.RED + "Not enough permissions.");
							}
						}  else if (args[1].equalsIgnoreCase("2")) {
						if (player.hasPermission("psm.prefix.set.2")) {
							pre = pre2;
							player.sendMessage(ChatColor.GREEN + "Prefix updated to 2: " + ChatColor.RESET + pre.replaceAll(ccicon, "§"));
							} else {
								player.sendMessage(ChatColor.RED + "Not enough permissions.");
							}
						} else if (args[1].equalsIgnoreCase("3")) {
						if (player.hasPermission("psm.prefix.set.3")) {
							pre = pre3;
							player.sendMessage(ChatColor.GREEN + "Prefix updated to 3: " + ChatColor.RESET + pre.replaceAll(ccicon, "§"));
							} else {
								player.sendMessage(ChatColor.RED + "Not enough permissions.");
							}
						} else if (args[1].equalsIgnoreCase("4")) {
						if (player.hasPermission("psm.prefix.set.4")) {
							pre = pre4;
							player.sendMessage(ChatColor.GREEN + "Prefix updated to 4: " + ChatColor.RESET + pre.replaceAll(ccicon, "§"));
							} else {
								player.sendMessage(ChatColor.RED + "Not enough permissions.");
							}
						} else if (args[1].equalsIgnoreCase("5")) {
						if (player.hasPermission("psm.prefix.set.5")) {
							pre = pre5;
							player.sendMessage(ChatColor.GREEN + "Prefix updated to 5: " + ChatColor.RESET + pre.replaceAll(ccicon, "§"));
							} else {
								player.sendMessage(ChatColor.RED + "Not enough permissions.");
							}
						} else if (args[1].equalsIgnoreCase("6")) {
						if (player.hasPermission("psm.prefix.set.6")) {
							pre = pre6;
							player.sendMessage(ChatColor.GREEN + "Prefix updated to 6: " + ChatColor.RESET + pre.replaceAll(ccicon, "§"));
							} else {
								player.sendMessage(ChatColor.RED + "Not enough permissions.");
							}
						} else if (args[1].equalsIgnoreCase("7")) {
						if (player.hasPermission("psm.prefix.set.7")) {
							pre = pre7;
							player.sendMessage(ChatColor.GREEN + "Prefix updated to 7: " + ChatColor.RESET + pre.replaceAll(ccicon, "§"));
							} else {
								player.sendMessage(ChatColor.RED + "Not enough permissions.");
							}
						} else if (args[1].equalsIgnoreCase("8")) {
						if (player.hasPermission("psm.prefix.set.8")) {
							pre = pre8;
							player.sendMessage(ChatColor.GREEN + "Prefix updated to 8: " + ChatColor.RESET + pre.replaceAll(ccicon, "§"));
							} else {
								player.sendMessage(ChatColor.RED + "Not enough permissions.");
							}
						} else if (args[1].equalsIgnoreCase("9")) {
						if (player.hasPermission("psm.prefix.set.9")) {
							pre = pre9;
							player.sendMessage(ChatColor.GREEN + "Prefix updated to 9: " + ChatColor.RESET + pre.replaceAll(ccicon, "§"));
						} else {
							player.sendMessage(ChatColor.RED + "Not enough permissions.");
						}
					}
				}
			} else if (length > 2) {
				player.sendMessage(ChatColor.RED + "Too many arguments.");
			}
		}
		if (cmd.getName().equalsIgnoreCase("suffix") && sender instanceof Player) {		
			player = (Player) sender;
			playerName = player.getName();
			int length = args.length;
			if(length == 0) {
				player.sendMessage(ChatColor.RED + "Try /suffix help");
			} else if (length == 1) {
				if (args[0].equalsIgnoreCase("help")) {
					if (player.hasPermission("psm.suffix.help")) {
						player.sendMessage(ChatColor.GOLD + "/suffix help - Pulls up the help menu");
						player.sendMessage(ChatColor.GOLD + "/suffix set # - Lets you set your suffix");
						player.sendMessage(ChatColor.GOLD + "/suffix list - List your possible suffixes");
						player.sendMessage(ChatColor.GOLD + "/suffix off - Turns off your current suffix");
					} else {
						player.sendMessage(ChatColor.RED + "Not enough permissions.");
					}
				} else if (args[0].equalsIgnoreCase("off")) {
					suf = ccicon + "f";
					player.sendMessage(ChatColor.GREEN + "Suffix turned off.");
				} else if (args[0].equalsIgnoreCase("list")) {
					if (player.hasPermission("psm.suffix.list")) {
						if (player.hasPermission("psm.suffix.set.0")) {
							player.sendMessage(ChatColor.GOLD + "Suffix 0: " + suf0.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.suffix.set.1")) {
							player.sendMessage(ChatColor.GOLD + "Suffix 1: " + suf1.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.suffix.set.2")) {
							player.sendMessage(ChatColor.GOLD + "Suffix 2: " + suf2.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.suffix.set.3")) {
							player.sendMessage(ChatColor.GOLD + "Suffix 3: " + suf3.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.suffix.set.4")) {
							player.sendMessage(ChatColor.GOLD + "Suffix 4: " + suf4.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.suffix.set.5")) {
							player.sendMessage(ChatColor.GOLD + "Suffix 5: " + suf5.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.suffix.set.6")) {
							player.sendMessage(ChatColor.GOLD + "Suffix 6: " + suf6.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.suffix.set.7")) {
							player.sendMessage(ChatColor.GOLD + "Suffix 7: " + suf7.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.suffix.set.8")) {
							player.sendMessage(ChatColor.GOLD + "Suffix 8: " + suf8.replaceAll(ccicon, "§"));
						}
						if (player.hasPermission("psm.suffix.set.9")) {
							player.sendMessage(ChatColor.GOLD + "Suffix 9: " + suf9.replaceAll(ccicon, "§"));
						}
					} else {
						player.sendMessage(ChatColor.RED + "Not enough permissions.");
					}
				}
			} else if (length == 2) {
				if (args[0].equalsIgnoreCase("set")) {
					if (args[1].equalsIgnoreCase("0")) {
						if (player.hasPermission("psm.suffix.set.0")) {
							suf = suf0;
							player.sendMessage(ChatColor.GREEN + "Suffix updated to 0: " + ChatColor.RESET + suf.replaceAll(ccicon, "§"));
						} else {
							player.sendMessage(ChatColor.RED + "Not enough permissions.");
						}
					} else if (args[1].equalsIgnoreCase("1")) {
						if (player.hasPermission("psm.suffix.set.1")) {
							suf = suf1;
							player.sendMessage(ChatColor.GREEN + "Suffix updated to 1: " + ChatColor.RESET + suf.replaceAll(ccicon, "§"));
							} else {
								player.sendMessage(ChatColor.RED + "Not enough permissions.");
							}
						}  else if (args[1].equalsIgnoreCase("2")) {
						if (player.hasPermission("psm.suffix.set.2")) {
							suf = suf2;
							player.sendMessage(ChatColor.GREEN + "Suffix updated to 2: " + ChatColor.RESET + suf.replaceAll(ccicon, "§"));
							} else {
								player.sendMessage(ChatColor.RED + "Not enough permissions.");
							}
						} else if (args[1].equalsIgnoreCase("3")) {
						if (player.hasPermission("psm.suffix.set.3")) {
							suf = suf3;
							player.sendMessage(ChatColor.GREEN + "Suffix updated to 3: " + ChatColor.RESET + suf.replaceAll(ccicon, "§"));
							} else {
								player.sendMessage(ChatColor.RED + "Not enough permissions.");
							}
						} else if (args[1].equalsIgnoreCase("4")) {
						if (player.hasPermission("psm.suffix.set.4")) {
							suf = suf4;
							player.sendMessage(ChatColor.GREEN + "Suffix updated to 4: " + ChatColor.RESET + suf.replaceAll(ccicon, "§"));
							} else {
								player.sendMessage(ChatColor.RED + "Not enough permissions.");
							}
						} else if (args[1].equalsIgnoreCase("5")) {
						if (player.hasPermission("psm.suffix.set.5")) {
							suf = suf5;
							player.sendMessage(ChatColor.GREEN + "Suffix updated to 5: " + ChatColor.RESET + suf.replaceAll(ccicon, "§"));
							} else {
								player.sendMessage(ChatColor.RED + "Not enough permissions.");
							}
						} else if (args[1].equalsIgnoreCase("6")) {
						if (player.hasPermission("psm.suffix.set.6")) {
							suf = suf6;
							player.sendMessage(ChatColor.GREEN + "Suffix updated to 6: " + ChatColor.RESET + suf.replaceAll(ccicon, "§"));
							} else {
								player.sendMessage(ChatColor.RED + "Not enough permissions.");
							}
						} else if (args[1].equalsIgnoreCase("7")) {
						if (player.hasPermission("psm.suffix.set.7")) {
							suf = suf7;
							player.sendMessage(ChatColor.GREEN + "Suffix updated to 7: " + ChatColor.RESET + suf.replaceAll(ccicon, "§"));
							} else {
								player.sendMessage(ChatColor.RED + "Not enough permissions.");
							}
						} else if (args[1].equalsIgnoreCase("8")) {
						if (player.hasPermission("psm.suffix.set.8")) {
							suf = suf8;
							player.sendMessage(ChatColor.GREEN + "Suffix updated to 8: " + ChatColor.RESET + suf.replaceAll(ccicon, "§"));
							} else {
								player.sendMessage(ChatColor.RED + "Not enough permissions.");
							}
						} else if (args[1].equalsIgnoreCase("9")) {
						if (player.hasPermission("psm.suffix.set.9")) {
							suf = suf9;
							player.sendMessage(ChatColor.GREEN + "Suffix updated to 9: " + ChatColor.RESET + suf.replaceAll(ccicon, "§"));
						} else {
							player.sendMessage(ChatColor.RED + "Not enough permissions.");
						}
					}
				}
			} else if (length > 2) {
				player.sendMessage(ChatColor.RED + "Too many arguments.");
			}			
		}	
		return false;
	}
}